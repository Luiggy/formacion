package com.cursoliferay.liferay.portlets.loadtest.util;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.deploy.hot.BaseHotDeployListener;
import com.liferay.portal.kernel.deploy.hot.HotDeployEvent;
import com.liferay.portal.kernel.deploy.hot.HotDeployException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class LoadTestListener extends BaseHotDeployListener {

    @Override
    public void invokeDeploy(HotDeployEvent event) throws HotDeployException {
        System.out.println("#### This is a Hot Deploy Event ####");

        try {
            Company company = CompanyLocalServiceUtil.getCompanyByWebId("loadtest");

            if (company!=null) //La instancia ya existe
                return;
        } catch (PortalException | SystemException e) {}

        try {
            Company company = CompanyLocalServiceUtil.addCompany("loadtest", "test-www.curso-liferay.com", "curso-liferay.com", "default", false, 0, true);

            User defaultUser = UserLocalServiceUtil.getDefaultUser(company.getCompanyId());

            Group guestGroup = GroupLocalServiceUtil.getGroup(company.getCompanyId(), GroupConstants.GUEST);


            ServiceContext serviceContext = new ServiceContext();
            serviceContext.setCompanyId(company.getCompanyId());
            serviceContext.setScopeGroupId(guestGroup.getGroupId());

            User user = null;
            for (int i=0; i<10; i++) {

                user = UserLocalServiceUtil.addUser(
                        defaultUser.getUserId(),
                        company.getCompanyId(),
                        false,
                        "Passw0rd",
                        "Passw0rd",
                        true,
                        null,
                        i + "@test.com",
                        0,
                        null,
                        company.getLocale(),
                        String.valueOf(i),
                        String.valueOf(i),
                        String.valueOf(i),
                        0,
                        0,
                        true,
                        1,
                        1,
                        1990,
                        "User test",
                        null,
                        null,
                        null,
                        null,
                        false,
                        serviceContext);

                UserLocalServiceUtil.updateStatus(user.getUserId(), WorkflowConstants.STATUS_APPROVED, new ServiceContext());


            }

            Date now = Calendar.getInstance().getTime();
            Partido partido;
            for (int i = 0; i<10; i++) {
                partido = PartidoLocalServiceUtil.createPartido(CounterLocalServiceUtil.increment(Partido.class.getName()));
                partido.setCompanyId(company.getCompanyId());
                partido.setGroupId(guestGroup.getGroupId());
                partido.setUserId(defaultUser.getUserId());
                partido.setUserName(defaultUser.getScreenName());
                partido.setCreateDate(now);
                partido.setModifiedDate(now);
                partido.setNombre("Partido de prueba " + i);
                partido.setFecha(now);

                PartidoLocalServiceUtil.addPartido(partido);

            }
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void invokeUndeploy(HotDeployEvent event) throws HotDeployException {
      System.out.println("#### This is a Hot UnDeploy Event ####");

        try {
            Company company = CompanyLocalServiceUtil.getCompanyByWebId("loadtest");

            List<Partido> partidos = PartidoLocalServiceUtil.getPartidos(-1,-1);

            for (Partido partido: partidos) {
                PartidoLocalServiceUtil.deletePartido(partido);
            }

            //CompanyLocalServiceUtil.deleteCompany(company.getCompanyId());
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (PortalException e) {
            e.printStackTrace();
        }

    }
}








/*
DynamicQuery query = DynamicQueryFactoryUtil.forClass(Partido.class);
query.add(PropertyFactoryUtil.forName("companyId").eq(company.getCompanyId()));
query.setProjection(ProjectionFactoryUtil.projectionList()
        .add(ProjectionFactoryUtil.count("companyId")));

PartidoLocalServiceUtil.dynamicQueryCount(query);

System.out.println("Numoer: " + PartidoLocalServiceUtil.dynamicQueryCount(query));
*/
