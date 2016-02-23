package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JugadorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JugadorLocalService
 * @generated
 */
public class JugadorLocalServiceWrapper implements JugadorLocalService,
    ServiceWrapper<JugadorLocalService> {
    private JugadorLocalService _jugadorLocalService;

    public JugadorLocalServiceWrapper(JugadorLocalService jugadorLocalService) {
        _jugadorLocalService = jugadorLocalService;
    }

    /**
    * Adds the jugador to the database. Also notifies the appropriate model listeners.
    *
    * @param jugador the jugador
    * @return the jugador that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador addJugador(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.addJugador(jugador);
    }

    /**
    * Creates a new jugador with the primary key. Does not add the jugador to the database.
    *
    * @param jugadorId the primary key for the new jugador
    * @return the new jugador
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador createJugador(
        long jugadorId) {
        return _jugadorLocalService.createJugador(jugadorId);
    }

    /**
    * Deletes the jugador with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador that was removed
    * @throws PortalException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador deleteJugador(
        long jugadorId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.deleteJugador(jugadorId);
    }

    /**
    * Deletes the jugador from the database. Also notifies the appropriate model listeners.
    *
    * @param jugador the jugador
    * @return the jugador that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador deleteJugador(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.deleteJugador(jugador);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _jugadorLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchJugador(
        long jugadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.fetchJugador(jugadorId);
    }

    /**
    * Returns the jugador with the matching UUID and company.
    *
    * @param uuid the jugador's UUID
    * @param companyId the primary key of the company
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchJugadorByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.fetchJugadorByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the jugador matching the UUID and group.
    *
    * @param uuid the jugador's UUID
    * @param groupId the primary key of the group
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchJugadorByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.fetchJugadorByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the jugador with the primary key.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador
    * @throws PortalException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador getJugador(
        long jugadorId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getJugador(jugadorId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the jugador with the matching UUID and company.
    *
    * @param uuid the jugador's UUID
    * @param companyId the primary key of the company
    * @return the matching jugador
    * @throws PortalException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador getJugadorByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getJugadorByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the jugador matching the UUID and group.
    *
    * @param uuid the jugador's UUID
    * @param groupId the primary key of the group
    * @return the matching jugador
    * @throws PortalException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador getJugadorByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getJugadorByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the jugadors.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @return the range of jugadors
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> getJugadors(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getJugadors(start, end);
    }

    /**
    * Returns the number of jugadors.
    *
    * @return the number of jugadors
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getJugadorsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.getJugadorsCount();
    }

    /**
    * Updates the jugador in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param jugador the jugador
    * @return the jugador that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador updateJugador(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugadorLocalService.updateJugador(jugador);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _jugadorLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _jugadorLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _jugadorLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public JugadorLocalService getWrappedJugadorLocalService() {
        return _jugadorLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedJugadorLocalService(
        JugadorLocalService jugadorLocalService) {
        _jugadorLocalService = jugadorLocalService;
    }

    @Override
    public JugadorLocalService getWrappedService() {
        return _jugadorLocalService;
    }

    @Override
    public void setWrappedService(JugadorLocalService jugadorLocalService) {
        _jugadorLocalService = jugadorLocalService;
    }
}
