package com.cursoliferay.liferay.portlets.loadtest.util;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
import java.util.Locale;


public class AddPortletDataAction extends SimpleAction {

    @Override
    public void run(String[] strings) throws ActionException {
/*
        try {
            Company company = CompanyLocalServiceUtil.addCompany("loadtest", "test-www.curso-liferay.com", "curso-liferay.com", "default", false, 0, true);

            User defaultUser = UserLocalServiceUtil.getDefaultUser(company.getCompanyId());

            Group guestGroup = GroupLocalServiceUtil.getGroup(company.getCompanyId(), GroupConstants.GUEST);


            ServiceContext serviceContext = new ServiceContext();
            serviceContext.setCompanyId(company.getCompanyId());
            serviceContext.setScopeGroupId(guestGroup.getGroupId());

            for (int i=0; i<10; i++) {

                UserLocalServiceUtil.addUser(
                        defaultUser.getUserId(),
                        company.getCompanyId(),
                        true,
                        null,
                        null,
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
                        0,
                        1,
                        1990,
                        "User test",
                        null,
                        null,
                        null,
                        null,
                        false,
                        serviceContext);
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

                System.out.println("ok");
            }
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }
*/
    }
}
