package com.cursoliferay.liferay.portlets.alineaciones.service.base;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalService;
import com.cursoliferay.liferay.portlets.alineaciones.service.persistence.JugadorPersistence;
import com.cursoliferay.liferay.portlets.alineaciones.service.persistence.PartidoPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the partido local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoLocalServiceImpl
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil
 * @generated
 */
public abstract class PartidoLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements PartidoLocalService, IdentifiableBean {
    @BeanReference(type = com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalService.class)
    protected com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalService jugadorLocalService;
    @BeanReference(type = com.cursoliferay.liferay.portlets.alineaciones.service.JugadorService.class)
    protected com.cursoliferay.liferay.portlets.alineaciones.service.JugadorService jugadorService;
    @BeanReference(type = JugadorPersistence.class)
    protected JugadorPersistence jugadorPersistence;
    @BeanReference(type = com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalService.class)
    protected com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalService partidoLocalService;
    @BeanReference(type = com.cursoliferay.liferay.portlets.alineaciones.service.PartidoService.class)
    protected com.cursoliferay.liferay.portlets.alineaciones.service.PartidoService partidoService;
    @BeanReference(type = PartidoPersistence.class)
    protected PartidoPersistence partidoPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PartidoLocalServiceClpInvoker _clpInvoker = new PartidoLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil} to access the partido local service.
     */

    /**
     * Adds the partido to the database. Also notifies the appropriate model listeners.
     *
     * @param partido the partido
     * @return the partido that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Partido addPartido(Partido partido) throws SystemException {
        partido.setNew(true);

        return partidoPersistence.update(partido);
    }

    /**
     * Creates a new partido with the primary key. Does not add the partido to the database.
     *
     * @param partidoId the primary key for the new partido
     * @return the new partido
     */
    @Override
    public Partido createPartido(long partidoId) {
        return partidoPersistence.create(partidoId);
    }

    /**
     * Deletes the partido with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param partidoId the primary key of the partido
     * @return the partido that was removed
     * @throws PortalException if a partido with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Partido deletePartido(long partidoId)
        throws PortalException, SystemException {
        return partidoPersistence.remove(partidoId);
    }

    /**
     * Deletes the partido from the database. Also notifies the appropriate model listeners.
     *
     * @param partido the partido
     * @return the partido that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Partido deletePartido(Partido partido) throws SystemException {
        return partidoPersistence.remove(partido);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Partido.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return partidoPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return partidoPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return partidoPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return partidoPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return partidoPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Partido fetchPartido(long partidoId) throws SystemException {
        return partidoPersistence.fetchByPrimaryKey(partidoId);
    }

    /**
     * Returns the partido with the matching UUID and company.
     *
     * @param uuid the partido's UUID
     * @param  companyId the primary key of the company
     * @return the matching partido, or <code>null</code> if a matching partido could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partido fetchPartidoByUuidAndCompanyId(String uuid, long companyId)
        throws SystemException {
        return partidoPersistence.fetchByUuid_C_First(uuid, companyId, null);
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
    public Partido fetchPartidoByUuidAndGroupId(String uuid, long groupId)
        throws SystemException {
        return partidoPersistence.fetchByUUID_G(uuid, groupId);
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
    public Partido getPartido(long partidoId)
        throws PortalException, SystemException {
        return partidoPersistence.findByPrimaryKey(partidoId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return partidoPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns the partido with the matching UUID and company.
     *
     * @param uuid the partido's UUID
     * @param  companyId the primary key of the company
     * @return the matching partido
     * @throws PortalException if a matching partido could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Partido getPartidoByUuidAndCompanyId(String uuid, long companyId)
        throws PortalException, SystemException {
        return partidoPersistence.findByUuid_C_First(uuid, companyId, null);
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
    public Partido getPartidoByUuidAndGroupId(String uuid, long groupId)
        throws PortalException, SystemException {
        return partidoPersistence.findByUUID_G(uuid, groupId);
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
    public List<Partido> getPartidos(int start, int end)
        throws SystemException {
        return partidoPersistence.findAll(start, end);
    }

    /**
     * Returns the number of partidos.
     *
     * @return the number of partidos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPartidosCount() throws SystemException {
        return partidoPersistence.countAll();
    }

    /**
     * Updates the partido in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param partido the partido
     * @return the partido that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Partido updatePartido(Partido partido) throws SystemException {
        return partidoPersistence.update(partido);
    }

    /**
     * Returns the jugador local service.
     *
     * @return the jugador local service
     */
    public com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalService getJugadorLocalService() {
        return jugadorLocalService;
    }

    /**
     * Sets the jugador local service.
     *
     * @param jugadorLocalService the jugador local service
     */
    public void setJugadorLocalService(
        com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalService jugadorLocalService) {
        this.jugadorLocalService = jugadorLocalService;
    }

    /**
     * Returns the jugador remote service.
     *
     * @return the jugador remote service
     */
    public com.cursoliferay.liferay.portlets.alineaciones.service.JugadorService getJugadorService() {
        return jugadorService;
    }

    /**
     * Sets the jugador remote service.
     *
     * @param jugadorService the jugador remote service
     */
    public void setJugadorService(
        com.cursoliferay.liferay.portlets.alineaciones.service.JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    /**
     * Returns the jugador persistence.
     *
     * @return the jugador persistence
     */
    public JugadorPersistence getJugadorPersistence() {
        return jugadorPersistence;
    }

    /**
     * Sets the jugador persistence.
     *
     * @param jugadorPersistence the jugador persistence
     */
    public void setJugadorPersistence(JugadorPersistence jugadorPersistence) {
        this.jugadorPersistence = jugadorPersistence;
    }

    /**
     * Returns the partido local service.
     *
     * @return the partido local service
     */
    public com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalService getPartidoLocalService() {
        return partidoLocalService;
    }

    /**
     * Sets the partido local service.
     *
     * @param partidoLocalService the partido local service
     */
    public void setPartidoLocalService(
        com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalService partidoLocalService) {
        this.partidoLocalService = partidoLocalService;
    }

    /**
     * Returns the partido remote service.
     *
     * @return the partido remote service
     */
    public com.cursoliferay.liferay.portlets.alineaciones.service.PartidoService getPartidoService() {
        return partidoService;
    }

    /**
     * Sets the partido remote service.
     *
     * @param partidoService the partido remote service
     */
    public void setPartidoService(
        com.cursoliferay.liferay.portlets.alineaciones.service.PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    /**
     * Returns the partido persistence.
     *
     * @return the partido persistence
     */
    public PartidoPersistence getPartidoPersistence() {
        return partidoPersistence;
    }

    /**
     * Sets the partido persistence.
     *
     * @param partidoPersistence the partido persistence
     */
    public void setPartidoPersistence(PartidoPersistence partidoPersistence) {
        this.partidoPersistence = partidoPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.cursoliferay.liferay.portlets.alineaciones.model.Partido",
            partidoLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.cursoliferay.liferay.portlets.alineaciones.model.Partido");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Partido.class;
    }

    protected String getModelClassName() {
        return Partido.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = partidoPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}