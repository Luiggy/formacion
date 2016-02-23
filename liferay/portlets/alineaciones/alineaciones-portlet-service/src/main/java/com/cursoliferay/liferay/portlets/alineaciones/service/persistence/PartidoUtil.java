package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the partido service. This utility wraps {@link PartidoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartidoPersistence
 * @see PartidoPersistenceImpl
 * @generated
 */
public class PartidoUtil {
    private static PartidoPersistence _persistence;

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
    public static void clearCache(Partido partido) {
        getPersistence().clearCache(partido);
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
    public static List<Partido> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Partido> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Partido> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Partido update(Partido partido) throws SystemException {
        return getPersistence().update(partido);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Partido update(Partido partido, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(partido, serviceContext);
    }

    /**
    * Returns all the partidos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the partidos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @return the range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the partidos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the partidos before and after the current partido in the ordered set where uuid = &#63;.
    *
    * @param partidoId the primary key of the current partido
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByUuid_PrevAndNext(
        long partidoId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(partidoId, uuid, orderByComparator);
    }

    /**
    * Removes all the partidos where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of partidos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the partido where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the partido that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of partidos where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the partidos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the partidos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @return the range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the partidos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the partidos before and after the current partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param partidoId the primary key of the current partido
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByUuid_C_PrevAndNext(
        long partidoId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(partidoId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the partidos where uuid = &#63; and companyId = &#63; from the database.
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
    * Returns the number of partidos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the partidos where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

    /**
    * Returns a range of all the partidos where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @return the range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

    /**
    * Returns an ordered range of all the partidos where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the partidos before and after the current partido in the ordered set where companyId = &#63;.
    *
    * @param partidoId the primary key of the current partido
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByCompanyId_PrevAndNext(
        long partidoId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(partidoId, companyId,
            orderByComparator);
    }

    /**
    * Removes all the partidos where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Returns the number of partidos where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Caches the partido in the entity cache if it is enabled.
    *
    * @param partido the partido
    */
    public static void cacheResult(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido) {
        getPersistence().cacheResult(partido);
    }

    /**
    * Caches the partidos in the entity cache if it is enabled.
    *
    * @param partidos the partidos
    */
    public static void cacheResult(
        java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> partidos) {
        getPersistence().cacheResult(partidos);
    }

    /**
    * Creates a new partido with the primary key. Does not add the partido to the database.
    *
    * @param partidoId the primary key for the new partido
    * @return the new partido
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido create(
        long partidoId) {
        return getPersistence().create(partidoId);
    }

    /**
    * Removes the partido with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partidoId the primary key of the partido
    * @return the partido that was removed
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido remove(
        long partidoId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(partidoId);
    }

    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido updateImpl(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(partido);
    }

    /**
    * Returns the partido with the primary key or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException} if it could not be found.
    *
    * @param partidoId the primary key of the partido
    * @return the partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByPrimaryKey(
        long partidoId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(partidoId);
    }

    /**
    * Returns the partido with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param partidoId the primary key of the partido
    * @return the partido, or <code>null</code> if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByPrimaryKey(
        long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(partidoId);
    }

    /**
    * Returns all the partidos.
    *
    * @return the partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the partidos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of partidos
    * @param end the upper bound of the range of partidos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of partidos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the partidos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of partidos.
    *
    * @return the number of partidos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PartidoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PartidoPersistence) PortletBeanLocatorUtil.locate(com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.getServletContextName(),
                    PartidoPersistence.class.getName());

            ReferenceRegistry.registerReference(PartidoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PartidoPersistence persistence) {
    }
}
