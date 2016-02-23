package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the jugador service. This utility wraps {@link JugadorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JugadorPersistence
 * @see JugadorPersistenceImpl
 * @generated
 */
public class JugadorUtil {
    private static JugadorPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Jugador jugador) {
        getPersistence().clearCache(jugador);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Jugador> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Jugador> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Jugador> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Jugador update(Jugador jugador) throws SystemException {
        return getPersistence().update(jugador);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Jugador update(Jugador jugador, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(jugador, serviceContext);
    }

    /**
    * Returns all the jugadors where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the jugadors where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @return the range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the jugadors where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the jugadors before and after the current jugador in the ordered set where uuid = &#63;.
    *
    * @param jugadorId the primary key of the current jugador
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByUuid_PrevAndNext(
        long jugadorId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(jugadorId, uuid, orderByComparator);
    }

    /**
    * Removes all the jugadors where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of jugadors where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the jugador where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the jugador that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of jugadors where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the jugadors where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the jugadors where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @return the range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the jugadors where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the jugadors before and after the current jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param jugadorId the primary key of the current jugador
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByUuid_C_PrevAndNext(
        long jugadorId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(jugadorId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the jugadors where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of jugadors where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_P(companyId, partidoId);
    }

    /**
    * Returns a range of all the jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @return the range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_P(companyId, partidoId, start, end);
    }

    /**
    * Returns an ordered range of all the jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByC_P(companyId, partidoId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByC_P_First(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByC_P_First(companyId, partidoId, orderByComparator);
    }

    /**
    * Returns the first jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByC_P_First(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByC_P_First(companyId, partidoId, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByC_P_Last(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByC_P_Last(companyId, partidoId, orderByComparator);
    }

    /**
    * Returns the last jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByC_P_Last(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByC_P_Last(companyId, partidoId, orderByComparator);
    }

    /**
    * Returns the jugadors before and after the current jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param jugadorId the primary key of the current jugador
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByC_P_PrevAndNext(
        long jugadorId, long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByC_P_PrevAndNext(jugadorId, companyId, partidoId,
            orderByComparator);
    }

    /**
    * Removes all the jugadors where companyId = &#63; and partidoId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByC_P(long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByC_P(companyId, partidoId);
    }

    /**
    * Returns the number of jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public static int countByC_P(long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByC_P(companyId, partidoId);
    }

    /**
    * Caches the jugador in the entity cache if it is enabled.
    *
    * @param jugador the jugador
    */
    public static void cacheResult(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador) {
        getPersistence().cacheResult(jugador);
    }

    /**
    * Caches the jugadors in the entity cache if it is enabled.
    *
    * @param jugadors the jugadors
    */
    public static void cacheResult(
        java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> jugadors) {
        getPersistence().cacheResult(jugadors);
    }

    /**
    * Creates a new jugador with the primary key. Does not add the jugador to the database.
    *
    * @param jugadorId the primary key for the new jugador
    * @return the new jugador
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador create(
        long jugadorId) {
        return getPersistence().create(jugadorId);
    }

    /**
    * Removes the jugador with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador that was removed
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador remove(
        long jugadorId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(jugadorId);
    }

    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador updateImpl(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(jugador);
    }

    /**
    * Returns the jugador with the primary key or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException} if it could not be found.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByPrimaryKey(
        long jugadorId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(jugadorId);
    }

    /**
    * Returns the jugador with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador, or <code>null</code> if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByPrimaryKey(
        long jugadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(jugadorId);
    }

    /**
    * Returns all the jugadors.
    *
    * @return the jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the jugadors.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of jugadors
    * @param end the upper bound of the range of jugadors (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of jugadors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the jugadors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of jugadors.
    *
    * @return the number of jugadors
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static JugadorPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (JugadorPersistence) PortletBeanLocatorUtil.locate(com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.getServletContextName(),
                    JugadorPersistence.class.getName());

            ReferenceRegistry.registerReference(JugadorUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(JugadorPersistence persistence) {
    }
}
