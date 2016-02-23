package com.cursoliferay.liferay.portlets.alineaciones.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Partido service. Represents a row in the &quot;alineaciones_Partido&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Partido
 * @see com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoImpl
 * @see com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoModelImpl
 * @generated
 */
public interface PartidoModel extends BaseModel<Partido>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a partido model instance should use the {@link Partido} interface instead.
     */

    /**
     * Returns the primary key of this partido.
     *
     * @return the primary key of this partido
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this partido.
     *
     * @param primaryKey the primary key of this partido
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this partido.
     *
     * @return the uuid of this partido
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this partido.
     *
     * @param uuid the uuid of this partido
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the partido ID of this partido.
     *
     * @return the partido ID of this partido
     */
    public long getPartidoId();

    /**
     * Sets the partido ID of this partido.
     *
     * @param partidoId the partido ID of this partido
     */
    public void setPartidoId(long partidoId);

    /**
     * Returns the group ID of this partido.
     *
     * @return the group ID of this partido
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this partido.
     *
     * @param groupId the group ID of this partido
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this partido.
     *
     * @return the company ID of this partido
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this partido.
     *
     * @param companyId the company ID of this partido
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this partido.
     *
     * @return the user ID of this partido
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this partido.
     *
     * @param userId the user ID of this partido
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this partido.
     *
     * @return the user uuid of this partido
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this partido.
     *
     * @param userUuid the user uuid of this partido
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this partido.
     *
     * @return the user name of this partido
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this partido.
     *
     * @param userName the user name of this partido
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this partido.
     *
     * @return the create date of this partido
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this partido.
     *
     * @param createDate the create date of this partido
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this partido.
     *
     * @return the modified date of this partido
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this partido.
     *
     * @param modifiedDate the modified date of this partido
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the nombre of this partido.
     *
     * @return the nombre of this partido
     */
    @AutoEscape
    public String getNombre();

    /**
     * Sets the nombre of this partido.
     *
     * @param nombre the nombre of this partido
     */
    public void setNombre(String nombre);

    /**
     * Returns the fecha of this partido.
     *
     * @return the fecha of this partido
     */
    public Date getFecha();

    /**
     * Sets the fecha of this partido.
     *
     * @param fecha the fecha of this partido
     */
    public void setFecha(Date fecha);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Partido partido);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Partido> toCacheModel();

    @Override
    public Partido toEscapedModel();

    @Override
    public Partido toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}