package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PartidoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PartidoLocalService
 * @generated
 */
public class PartidoLocalServiceWrapper implements PartidoLocalService,
    ServiceWrapper<PartidoLocalService> {
    private PartidoLocalService _partidoLocalService;

    public PartidoLocalServiceWrapper(PartidoLocalService partidoLocalService) {
        _partidoLocalService = partidoLocalService;
    }

    /**
    * Adds the partido to the database. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido addPartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.addPartido(partido);
    }

    /**
    * Creates a new partido with the primary key. Does not add the partido to the database.
    *
    * @param partidoId the primary key for the new partido
    * @return the new partido
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido createPartido(
        long partidoId) {
        return _partidoLocalService.createPartido(partidoId);
    }

    /**
    * Deletes the partido with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partidoId the primary key of the partido
    * @return the partido that was removed
    * @throws PortalException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido deletePartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.deletePartido(partidoId);
    }

    /**
    * Deletes the partido from the database. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido deletePartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.deletePartido(partido);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _partidoLocalService.dynamicQuery();
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
        return _partidoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _partidoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _partidoLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _partidoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _partidoLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.fetchPartido(partidoId);
    }

    /**
    * Returns the partido with the matching UUID and company.
    *
    * @param uuid the partido's UUID
    * @param companyId the primary key of the company
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartidoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.fetchPartidoByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the partido matching the UUID and group.
    *
    * @param uuid the partido's UUID
    * @param groupId the primary key of the group
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartidoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.fetchPartidoByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the partido with the primary key.
    *
    * @param partidoId the primary key of the partido
    * @return the partido
    * @throws PortalException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPartido(partidoId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the partido with the matching UUID and company.
    *
    * @param uuid the partido's UUID
    * @param companyId the primary key of the company
    * @return the matching partido
    * @throws PortalException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartidoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPartidoByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the partido matching the UUID and group.
    *
    * @param uuid the partido's UUID
    * @param groupId the primary key of the group
    * @return the matching partido
    * @throws PortalException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartidoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPartidoByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the partidos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @return the range of partidos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> getPartidos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPartidos(start, end);
    }

    /**
    * Returns the number of partidos.
    *
    * @return the number of partidos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPartidosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.getPartidosCount();
    }

    /**
    * Updates the partido in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido updatePartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partidoLocalService.updatePartido(partido);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _partidoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _partidoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _partidoLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PartidoLocalService getWrappedPartidoLocalService() {
        return _partidoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPartidoLocalService(
        PartidoLocalService partidoLocalService) {
        _partidoLocalService = partidoLocalService;
    }

    @Override
    public PartidoLocalService getWrappedService() {
        return _partidoLocalService;
    }

    @Override
    public void setWrappedService(PartidoLocalService partidoLocalService) {
        _partidoLocalService = partidoLocalService;
    }
}
