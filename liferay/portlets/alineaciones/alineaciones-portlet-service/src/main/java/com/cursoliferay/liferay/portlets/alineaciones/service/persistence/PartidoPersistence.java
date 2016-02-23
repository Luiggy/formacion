package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the partido service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartidoPersistenceImpl
 * @see PartidoUtil
 * @generated
 */
public interface PartidoPersistence extends BasePersistence<Partido> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PartidoUtil} to access the partido persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the partidos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last partido in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByUuid_PrevAndNext(
        long partidoId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the partidos where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partidos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partido where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the partido where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the partido that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partidos where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the partidos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last partido in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByUuid_C_PrevAndNext(
        long partidoId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the partidos where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partidos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the partidos where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching partidos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last partido in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching partido, or <code>null</code> if a matching partido could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido[] findByCompanyId_PrevAndNext(
        long partidoId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the partidos where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partidos where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching partidos
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the partido in the entity cache if it is enabled.
    *
    * @param partido the partido
    */
    public void cacheResult(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido);

    /**
    * Caches the partidos in the entity cache if it is enabled.
    *
    * @param partidos the partidos
    */
    public void cacheResult(
        java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> partidos);

    /**
    * Creates a new partido with the primary key. Does not add the partido to the database.
    *
    * @param partidoId the primary key for the new partido
    * @return the new partido
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido create(
        long partidoId);

    /**
    * Removes the partido with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partidoId the primary key of the partido
    * @return the partido that was removed
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido remove(
        long partidoId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido updateImpl(
        com.cursoliferay.liferay.portlets.alineaciones.model.Partido partido)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partido with the primary key or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException} if it could not be found.
    *
    * @param partidoId the primary key of the partido
    * @return the partido
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido findByPrimaryKey(
        long partidoId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchPartidoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partido with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param partidoId the primary key of the partido
    * @return the partido, or <code>null</code> if a partido with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Partido fetchByPrimaryKey(
        long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the partidos.
    *
    * @return the partidos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Partido> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the partidos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partidos.
    *
    * @return the number of partidos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
