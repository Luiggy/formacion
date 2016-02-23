package com.cursoliferay.liferay.portlets.alineaciones.service.persistence;

import com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException;
import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;
import com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorImpl;
import com.cursoliferay.liferay.portlets.alineaciones.model.impl.JugadorModelImpl;
import com.cursoliferay.liferay.portlets.alineaciones.service.persistence.JugadorPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the jugador service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JugadorPersistence
 * @see JugadorUtil
 * @generated
 */
public class JugadorPersistenceImpl extends BasePersistenceImpl<Jugador>
    implements JugadorPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link JugadorUtil} to access the jugador persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = JugadorImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            JugadorModelImpl.UUID_COLUMN_BITMASK |
            JugadorModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "jugador.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "jugador.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(jugador.uuid IS NULL OR jugador.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            JugadorModelImpl.UUID_COLUMN_BITMASK |
            JugadorModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "jugador.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "jugador.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(jugador.uuid IS NULL OR jugador.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "jugador.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            JugadorModelImpl.UUID_COLUMN_BITMASK |
            JugadorModelImpl.COMPANYID_COLUMN_BITMASK |
            JugadorModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "jugador.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "jugador.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(jugador.uuid IS NULL OR jugador.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "jugador.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_P",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, JugadorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_P",
            new String[] { Long.class.getName(), Long.class.getName() },
            JugadorModelImpl.COMPANYID_COLUMN_BITMASK |
            JugadorModelImpl.PARTIDOID_COLUMN_BITMASK |
            JugadorModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_C_P = new FinderPath(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_P",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_C_P_COMPANYID_2 = "jugador.companyId = ? AND ";
    private static final String _FINDER_COLUMN_C_P_PARTIDOID_2 = "jugador.partidoId = ?";
    private static final String _SQL_SELECT_JUGADOR = "SELECT jugador FROM Jugador jugador";
    private static final String _SQL_SELECT_JUGADOR_WHERE = "SELECT jugador FROM Jugador jugador WHERE ";
    private static final String _SQL_COUNT_JUGADOR = "SELECT COUNT(jugador) FROM Jugador jugador";
    private static final String _SQL_COUNT_JUGADOR_WHERE = "SELECT COUNT(jugador) FROM Jugador jugador WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "jugador.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Jugador exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Jugador exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(JugadorPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Jugador _nullJugador = new JugadorImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Jugador> toCacheModel() {
                return _nullJugadorCacheModel;
            }
        };

    private static CacheModel<Jugador> _nullJugadorCacheModel = new CacheModel<Jugador>() {
            @Override
            public Jugador toEntityModel() {
                return _nullJugador;
            }
        };

    public JugadorPersistenceImpl() {
        setModelClass(Jugador.class);
    }

    /**
     * Returns all the jugadors where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Jugador> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Jugador> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<Jugador> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Jugador> list = (List<Jugador>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Jugador jugador : list) {
                if (!Validator.equals(uuid, jugador.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(JugadorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Jugador>(list);
                } else {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Jugador findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByUuid_First(uuid, orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
    }

    /**
     * Returns the first jugador in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching jugador, or <code>null</code> if a matching jugador could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Jugador> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByUuid_Last(uuid, orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
    }

    /**
     * Returns the last jugador in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching jugador, or <code>null</code> if a matching jugador could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Jugador> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador[] findByUuid_PrevAndNext(long jugadorId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = findByPrimaryKey(jugadorId);

        Session session = null;

        try {
            session = openSession();

            Jugador[] array = new JugadorImpl[3];

            array[0] = getByUuid_PrevAndNext(session, jugador, uuid,
                    orderByComparator, true);

            array[1] = jugador;

            array[2] = getByUuid_PrevAndNext(session, jugador, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Jugador getByUuid_PrevAndNext(Session session, Jugador jugador,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_JUGADOR_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(JugadorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(jugador);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Jugador> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the jugadors where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Jugador jugador : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(jugador);
        }
    }

    /**
     * Returns the number of jugadors where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public Jugador findByUUID_G(String uuid, long groupId)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByUUID_G(uuid, groupId);

        if (jugador == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchJugadorException(msg.toString());
        }

        return jugador;
    }

    /**
     * Returns the jugador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching jugador, or <code>null</code> if a matching jugador could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
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
    @Override
    public Jugador fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Jugador) {
            Jugador jugador = (Jugador) result;

            if (!Validator.equals(uuid, jugador.getUuid()) ||
                    (groupId != jugador.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Jugador> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Jugador jugador = list.get(0);

                    result = jugador;

                    cacheResult(jugador);

                    if ((jugador.getUuid() == null) ||
                            !jugador.getUuid().equals(uuid) ||
                            (jugador.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, jugador);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Jugador) result;
        }
    }

    /**
     * Removes the jugador where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the jugador that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador removeByUUID_G(String uuid, long groupId)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = findByUUID_G(uuid, groupId);

        return remove(jugador);
    }

    /**
     * Returns the number of jugadors where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the jugadors where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Jugador> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Jugador> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
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
    @Override
    public List<Jugador> findByUuid_C(String uuid, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Jugador> list = (List<Jugador>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Jugador jugador : list) {
                if (!Validator.equals(uuid, jugador.getUuid()) ||
                        (companyId != jugador.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(JugadorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Jugador>(list);
                } else {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Jugador findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
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
    @Override
    public Jugador fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Jugador> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
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
    @Override
    public Jugador fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Jugador> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador[] findByUuid_C_PrevAndNext(long jugadorId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = findByPrimaryKey(jugadorId);

        Session session = null;

        try {
            session = openSession();

            Jugador[] array = new JugadorImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, jugador, uuid,
                    companyId, orderByComparator, true);

            array[1] = jugador;

            array[2] = getByUuid_C_PrevAndNext(session, jugador, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Jugador getByUuid_C_PrevAndNext(Session session, Jugador jugador,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_JUGADOR_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(JugadorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(jugador);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Jugador> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the jugadors where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Jugador jugador : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(jugador);
        }
    }

    /**
     * Returns the number of jugadors where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_JUGADOR_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the jugadors where companyId = &#63; and partidoId = &#63;.
     *
     * @param companyId the company ID
     * @param partidoId the partido ID
     * @return the matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Jugador> findByC_P(long companyId, long partidoId)
        throws SystemException {
        return findByC_P(companyId, partidoId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Jugador> findByC_P(long companyId, long partidoId, int start,
        int end) throws SystemException {
        return findByC_P(companyId, partidoId, start, end, null);
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
    @Override
    public List<Jugador> findByC_P(long companyId, long partidoId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P;
            finderArgs = new Object[] { companyId, partidoId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P;
            finderArgs = new Object[] {
                    companyId, partidoId,
                    
                    start, end, orderByComparator
                };
        }

        List<Jugador> list = (List<Jugador>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Jugador jugador : list) {
                if ((companyId != jugador.getCompanyId()) ||
                        (partidoId != jugador.getPartidoId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_JUGADOR_WHERE);

            query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

            query.append(_FINDER_COLUMN_C_P_PARTIDOID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(JugadorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                qPos.add(partidoId);

                if (!pagination) {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Jugador>(list);
                } else {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Jugador findByC_P_First(long companyId, long partidoId,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByC_P_First(companyId, partidoId,
                orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(", partidoId=");
        msg.append(partidoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
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
    @Override
    public Jugador fetchByC_P_First(long companyId, long partidoId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Jugador> list = findByC_P(companyId, partidoId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador findByC_P_Last(long companyId, long partidoId,
        OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByC_P_Last(companyId, partidoId,
                orderByComparator);

        if (jugador != null) {
            return jugador;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(", partidoId=");
        msg.append(partidoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchJugadorException(msg.toString());
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
    @Override
    public Jugador fetchByC_P_Last(long companyId, long partidoId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByC_P(companyId, partidoId);

        if (count == 0) {
            return null;
        }

        List<Jugador> list = findByC_P(companyId, partidoId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Jugador[] findByC_P_PrevAndNext(long jugadorId, long companyId,
        long partidoId, OrderByComparator orderByComparator)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = findByPrimaryKey(jugadorId);

        Session session = null;

        try {
            session = openSession();

            Jugador[] array = new JugadorImpl[3];

            array[0] = getByC_P_PrevAndNext(session, jugador, companyId,
                    partidoId, orderByComparator, true);

            array[1] = jugador;

            array[2] = getByC_P_PrevAndNext(session, jugador, companyId,
                    partidoId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Jugador getByC_P_PrevAndNext(Session session, Jugador jugador,
        long companyId, long partidoId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_JUGADOR_WHERE);

        query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

        query.append(_FINDER_COLUMN_C_P_PARTIDOID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(JugadorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        qPos.add(partidoId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(jugador);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Jugador> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the jugadors where companyId = &#63; and partidoId = &#63; from the database.
     *
     * @param companyId the company ID
     * @param partidoId the partido ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByC_P(long companyId, long partidoId)
        throws SystemException {
        for (Jugador jugador : findByC_P(companyId, partidoId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(jugador);
        }
    }

    /**
     * Returns the number of jugadors where companyId = &#63; and partidoId = &#63;.
     *
     * @param companyId the company ID
     * @param partidoId the partido ID
     * @return the number of matching jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByC_P(long companyId, long partidoId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_C_P;

        Object[] finderArgs = new Object[] { companyId, partidoId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_JUGADOR_WHERE);

            query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

            query.append(_FINDER_COLUMN_C_P_PARTIDOID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                qPos.add(partidoId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the jugador in the entity cache if it is enabled.
     *
     * @param jugador the jugador
     */
    @Override
    public void cacheResult(Jugador jugador) {
        EntityCacheUtil.putResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorImpl.class, jugador.getPrimaryKey(), jugador);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { jugador.getUuid(), jugador.getGroupId() }, jugador);

        jugador.resetOriginalValues();
    }

    /**
     * Caches the jugadors in the entity cache if it is enabled.
     *
     * @param jugadors the jugadors
     */
    @Override
    public void cacheResult(List<Jugador> jugadors) {
        for (Jugador jugador : jugadors) {
            if (EntityCacheUtil.getResult(
                        JugadorModelImpl.ENTITY_CACHE_ENABLED,
                        JugadorImpl.class, jugador.getPrimaryKey()) == null) {
                cacheResult(jugador);
            } else {
                jugador.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all jugadors.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(JugadorImpl.class.getName());
        }

        EntityCacheUtil.clearCache(JugadorImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the jugador.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Jugador jugador) {
        EntityCacheUtil.removeResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorImpl.class, jugador.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(jugador);
    }

    @Override
    public void clearCache(List<Jugador> jugadors) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Jugador jugador : jugadors) {
            EntityCacheUtil.removeResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
                JugadorImpl.class, jugador.getPrimaryKey());

            clearUniqueFindersCache(jugador);
        }
    }

    protected void cacheUniqueFindersCache(Jugador jugador) {
        if (jugador.isNew()) {
            Object[] args = new Object[] { jugador.getUuid(), jugador.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, jugador);
        } else {
            JugadorModelImpl jugadorModelImpl = (JugadorModelImpl) jugador;

            if ((jugadorModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        jugador.getUuid(), jugador.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    jugador);
            }
        }
    }

    protected void clearUniqueFindersCache(Jugador jugador) {
        JugadorModelImpl jugadorModelImpl = (JugadorModelImpl) jugador;

        Object[] args = new Object[] { jugador.getUuid(), jugador.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((jugadorModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    jugadorModelImpl.getOriginalUuid(),
                    jugadorModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new jugador with the primary key. Does not add the jugador to the database.
     *
     * @param jugadorId the primary key for the new jugador
     * @return the new jugador
     */
    @Override
    public Jugador create(long jugadorId) {
        Jugador jugador = new JugadorImpl();

        jugador.setNew(true);
        jugador.setPrimaryKey(jugadorId);

        String uuid = PortalUUIDUtil.generate();

        jugador.setUuid(uuid);

        return jugador;
    }

    /**
     * Removes the jugador with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param jugadorId the primary key of the jugador
     * @return the jugador that was removed
     * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador remove(long jugadorId)
        throws NoSuchJugadorException, SystemException {
        return remove((Serializable) jugadorId);
    }

    /**
     * Removes the jugador with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the jugador
     * @return the jugador that was removed
     * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador remove(Serializable primaryKey)
        throws NoSuchJugadorException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Jugador jugador = (Jugador) session.get(JugadorImpl.class,
                    primaryKey);

            if (jugador == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchJugadorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(jugador);
        } catch (NoSuchJugadorException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Jugador removeImpl(Jugador jugador) throws SystemException {
        jugador = toUnwrappedModel(jugador);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(jugador)) {
                jugador = (Jugador) session.get(JugadorImpl.class,
                        jugador.getPrimaryKeyObj());
            }

            if (jugador != null) {
                session.delete(jugador);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (jugador != null) {
            clearCache(jugador);
        }

        return jugador;
    }

    @Override
    public Jugador updateImpl(
        com.cursoliferay.liferay.portlets.alineaciones.model.Jugador jugador)
        throws SystemException {
        jugador = toUnwrappedModel(jugador);

        boolean isNew = jugador.isNew();

        JugadorModelImpl jugadorModelImpl = (JugadorModelImpl) jugador;

        if (Validator.isNull(jugador.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            jugador.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (jugador.isNew()) {
                session.save(jugador);

                jugador.setNew(false);
            } else {
                session.merge(jugador);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !JugadorModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((jugadorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { jugadorModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { jugadorModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((jugadorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        jugadorModelImpl.getOriginalUuid(),
                        jugadorModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        jugadorModelImpl.getUuid(),
                        jugadorModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((jugadorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        jugadorModelImpl.getOriginalCompanyId(),
                        jugadorModelImpl.getOriginalPartidoId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_P, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P,
                    args);

                args = new Object[] {
                        jugadorModelImpl.getCompanyId(),
                        jugadorModelImpl.getPartidoId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_P, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P,
                    args);
            }
        }

        EntityCacheUtil.putResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
            JugadorImpl.class, jugador.getPrimaryKey(), jugador);

        clearUniqueFindersCache(jugador);
        cacheUniqueFindersCache(jugador);

        return jugador;
    }

    protected Jugador toUnwrappedModel(Jugador jugador) {
        if (jugador instanceof JugadorImpl) {
            return jugador;
        }

        JugadorImpl jugadorImpl = new JugadorImpl();

        jugadorImpl.setNew(jugador.isNew());
        jugadorImpl.setPrimaryKey(jugador.getPrimaryKey());

        jugadorImpl.setUuid(jugador.getUuid());
        jugadorImpl.setJugadorId(jugador.getJugadorId());
        jugadorImpl.setPartidoId(jugador.getPartidoId());
        jugadorImpl.setGroupId(jugador.getGroupId());
        jugadorImpl.setCompanyId(jugador.getCompanyId());
        jugadorImpl.setUserId(jugador.getUserId());
        jugadorImpl.setUserName(jugador.getUserName());
        jugadorImpl.setCreateDate(jugador.getCreateDate());
        jugadorImpl.setModifiedDate(jugador.getModifiedDate());
        jugadorImpl.setNombre(jugador.getNombre());
        jugadorImpl.setDni(jugador.getDni());
        jugadorImpl.setTitular(jugador.isTitular());

        return jugadorImpl;
    }

    /**
     * Returns the jugador with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the jugador
     * @return the jugador
     * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador findByPrimaryKey(Serializable primaryKey)
        throws NoSuchJugadorException, SystemException {
        Jugador jugador = fetchByPrimaryKey(primaryKey);

        if (jugador == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchJugadorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return jugador;
    }

    /**
     * Returns the jugador with the primary key or throws a {@link com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException} if it could not be found.
     *
     * @param jugadorId the primary key of the jugador
     * @return the jugador
     * @throws com.cursoliferay.liferay.portlets.alineaciones.NoSuchJugadorException if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador findByPrimaryKey(long jugadorId)
        throws NoSuchJugadorException, SystemException {
        return findByPrimaryKey((Serializable) jugadorId);
    }

    /**
     * Returns the jugador with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the jugador
     * @return the jugador, or <code>null</code> if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Jugador jugador = (Jugador) EntityCacheUtil.getResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
                JugadorImpl.class, primaryKey);

        if (jugador == _nullJugador) {
            return null;
        }

        if (jugador == null) {
            Session session = null;

            try {
                session = openSession();

                jugador = (Jugador) session.get(JugadorImpl.class, primaryKey);

                if (jugador != null) {
                    cacheResult(jugador);
                } else {
                    EntityCacheUtil.putResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
                        JugadorImpl.class, primaryKey, _nullJugador);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(JugadorModelImpl.ENTITY_CACHE_ENABLED,
                    JugadorImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return jugador;
    }

    /**
     * Returns the jugador with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param jugadorId the primary key of the jugador
     * @return the jugador, or <code>null</code> if a jugador with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Jugador fetchByPrimaryKey(long jugadorId) throws SystemException {
        return fetchByPrimaryKey((Serializable) jugadorId);
    }

    /**
     * Returns all the jugadors.
     *
     * @return the jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Jugador> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Jugador> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Jugador> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Jugador> list = (List<Jugador>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_JUGADOR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_JUGADOR;

                if (pagination) {
                    sql = sql.concat(JugadorModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Jugador>(list);
                } else {
                    list = (List<Jugador>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the jugadors from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Jugador jugador : findAll()) {
            remove(jugador);
        }
    }

    /**
     * Returns the number of jugadors.
     *
     * @return the number of jugadors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_JUGADOR);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the jugador persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.cursoliferay.liferay.portlets.alineaciones.model.Jugador")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Jugador>> listenersList = new ArrayList<ModelListener<Jugador>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Jugador>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(JugadorImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
