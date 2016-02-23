package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JugadorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JugadorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JugadorLocalServiceUtil.getService());
        setClass(Jugador.class);

        setClassLoader(com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("jugadorId");
    }
}
