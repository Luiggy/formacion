package com.cursoliferay.liferay.portlets.loadtest.service.persistence;

import com.cursoliferay.liferay.portlets.loadtest.model.Foo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooPersistenceImpl
 * @see FooUtil
 * @generated
 */
public interface FooPersistence extends BasePersistence<Foo> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the foos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo[] findByUuid_PrevAndNext(
        long fooId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foos where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo where uuid = &#63; and groupId = &#63; or throws a {@link com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the foo where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the foo that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo[] findByUuid_C_PrevAndNext(
        long fooId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foos where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foos where field2 = &#63;.
    *
    * @param field2 the field2
    * @return the matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByField2(
        boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos where field2 = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param field2 the field2
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByField2(
        boolean field2, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos where field2 = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param field2 the field2
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findByField2(
        boolean field2, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByField2_First(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByField2_First(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByField2_Last(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo, or <code>null</code> if a matching foo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByField2_Last(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foos before and after the current foo in the ordered set where field2 = &#63;.
    *
    * @param fooId the primary key of the current foo
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo[] findByField2_PrevAndNext(
        long fooId, boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foos where field2 = &#63; from the database.
    *
    * @param field2 the field2
    * @throws SystemException if a system exception occurred
    */
    public void removeByField2(boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos where field2 = &#63;.
    *
    * @param field2 the field2
    * @return the number of matching foos
    * @throws SystemException if a system exception occurred
    */
    public int countByField2(boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the foo in the entity cache if it is enabled.
    *
    * @param foo the foo
    */
    public void cacheResult(
        com.cursoliferay.liferay.portlets.loadtest.model.Foo foo);

    /**
    * Caches the foos in the entity cache if it is enabled.
    *
    * @param foos the foos
    */
    public void cacheResult(
        java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> foos);

    /**
    * Creates a new foo with the primary key. Does not add the foo to the database.
    *
    * @param fooId the primary key for the new foo
    * @return the new foo
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo create(
        long fooId);

    /**
    * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fooId the primary key of the foo
    * @return the foo that was removed
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo remove(
        long fooId)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.cursoliferay.liferay.portlets.loadtest.model.Foo updateImpl(
        com.cursoliferay.liferay.portlets.loadtest.model.Foo foo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo with the primary key or throws a {@link com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException} if it could not be found.
    *
    * @param fooId the primary key of the foo
    * @return the foo
    * @throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo findByPrimaryKey(
        long fooId)
        throws com.cursoliferay.liferay.portlets.loadtest.NoSuchFooException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fooId the primary key of the foo
    * @return the foo, or <code>null</code> if a foo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.cursoliferay.liferay.portlets.loadtest.model.Foo fetchByPrimaryKey(
        long fooId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foos.
    *
    * @return the foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the foos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @return the range of foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the foos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cursoliferay.liferay.portlets.loadtest.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of foos
    * @param end the upper bound of the range of foos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of foos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.cursoliferay.liferay.portlets.loadtest.model.Foo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foos.
    *
    * @return the number of foos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
