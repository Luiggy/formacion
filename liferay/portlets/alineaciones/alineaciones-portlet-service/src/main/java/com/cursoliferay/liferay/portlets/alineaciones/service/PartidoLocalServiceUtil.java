package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Partido. This utility wraps
 * {@link com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PartidoLocalService
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.base.PartidoLocalServiceBaseImpl
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoLocalServiceImpl
 * @generated
 */
public class PartidoLocalServiceUtil {
    private static PartidoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the partido to the database. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido addPartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPartido(partido);
    }

    /**
    * Creates a new partido with the primary key. Does not add the partido to the database.
    *
    * @param partidoId the primary key for the new partido
    * @return the new partido
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido createPartido(
        long partidoId) {
        return getService().createPartido(partidoId);
    }

    /**
    * Deletes the partido with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partidoId the primary key of the partido
    * @return the partido that was removed
    * @throws PortalException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido deletePartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePartido(partidoId);
    }

    /**
    * Deletes the partido from the database. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido deletePartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePartido(partido);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPartido(partidoId);
    }

    /**
    * Returns the partido with the matching UUID and company.
    *
    * @param uuid the partido's UUID
    * @param companyId the primary key of the company
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartidoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPartidoByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the partido matching the UUID and group.
    *
    * @param uuid the partido's UUID
    * @param groupId the primary key of the group
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchPartidoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPartidoByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the partido with the primary key.
    *
    * @param partidoId the primary key of the partido
    * @return the partido
    * @throws PortalException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartido(
        long partidoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPartido(partidoId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartidoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPartidoByUuidAndCompanyId(uuid, companyId);
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
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido getPartidoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPartidoByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> getPartidos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPartidos(start, end);
    }

    /**
    * Returns the number of partidos.
    *
    * @return the number of partidos
    * @throws SystemException if a system exception occurred
    */
    public static int getPartidosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPartidosCount();
    }

    /**
    * Updates the partido in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param partido the partido
    * @return the partido that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido updatePartido(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePartido(partido);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static PartidoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PartidoLocalService.class.getName());

            if (invokableLocalService instanceof PartidoLocalService) {
                _service = (PartidoLocalService) invokableLocalService;
            } else {
                _service = new PartidoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PartidoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PartidoLocalService service) {
    }
}
