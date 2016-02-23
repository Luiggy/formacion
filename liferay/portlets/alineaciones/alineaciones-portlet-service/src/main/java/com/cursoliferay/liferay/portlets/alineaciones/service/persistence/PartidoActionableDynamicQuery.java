package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PartidoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PartidoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PartidoLocalServiceUtil.getService());
        setClass(Partido.class);

        setClassLoader(com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("partidoId");
    }
}
