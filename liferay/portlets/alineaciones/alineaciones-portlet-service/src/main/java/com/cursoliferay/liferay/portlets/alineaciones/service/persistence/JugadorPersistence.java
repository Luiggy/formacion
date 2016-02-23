package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the jugador service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JugadorPersistenceImpl
 * @see JugadorUtil
 * @generated
 */
public interface JugadorPersistence extends BasePersistence<Jugador> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link JugadorUtil} to access the jugador persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the jugadors where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last jugador in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByUuid_PrevAndNext(
        long jugadorId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the jugadors where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of jugadors where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the jugador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the jugador where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the jugador that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of jugadors where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the jugadors where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last jugador in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByUuid_C_PrevAndNext(
        long jugadorId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the jugadors where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of jugadors where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @return the matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findByC_P(
        long companyId, long partidoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByC_P_First(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByC_P_First(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByC_P_Last(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last jugador in the ordered set where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByC_P_Last(
        long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador[] findByC_P_PrevAndNext(
        long jugadorId, long companyId, long partidoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the jugadors where companyId = &#63; and partidoId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByC_P(long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of jugadors where companyId = &#63; and partidoId = &#63;.
    *
    * @param companyId the company ID
    * @param partidoId the partido ID
    * @return the number of matching jugadors
    * @throws SystemException if a system exception occurred
    */
    public int countByC_P(long companyId, long partidoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the jugador in the entity cache if it is enabled.
    *
    * @param jugador the jugador
    */
    public void cacheResult(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador);

    /**
    * Caches the jugadors in the entity cache if it is enabled.
    *
    * @param jugadors the jugadors
    */
    public void cacheResult(
        java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> jugadors);

    /**
    * Creates a new jugador with the primary key. Does not add the jugador to the database.
    *
    * @param jugadorId the primary key for the new jugador
    * @return the new jugador
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador create(
        long jugadorId);

    /**
    * Removes the jugador with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador that was removed
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador remove(
        long jugadorId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador updateImpl(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the jugador with the primary key or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException} if it could not be found.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador
    * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador findByPrimaryKey(
        long jugadorId)
        throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the jugador with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jugadorId the primary key of the jugador
    * @return the jugador, or <code>null</code> if a jugador with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.alineaciones.model.Jugador fetchByPrimaryKey(
        long jugadorId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the jugadors.
    *
    * @return the jugadors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.cursoliferay.liferay.portlets.alineaciones.model.Jugador> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the jugadors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of jugadors.
    *
    * @return the number of jugadors
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
