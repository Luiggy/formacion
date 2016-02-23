package com.cursoliferay.liferay.portlets.alineaciones.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Partido}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Partido
 * @generated
 */
public class PartidoWrapper implements Partido, ModelWrapper<Partido> {
    private Partido _partido;

    public PartidoWrapper(Partido partido) {
        _partido = partido;
    }

    @Override
    public Class<?> getModelClass() {
        return Partido.class;
    }

    @Override
    public String getModelClassName() {
        return Partido.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("partidoId", getPartidoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("nombre", getNombre());
        attributes.put("fecha", getFecha());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long partidoId = (Long) attributes.get("partidoId");

        if (partidoId != null) {
            setPartidoId(partidoId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }

        Date fecha = (Date) attributes.get("fecha");

        if (fecha != null) {
            setFecha(fecha);
        }
    }

    /**
    * Returns the primary key of this partido.
    *
    * @return the primary key of this partido
    */
    @Override
    public long getPrimaryKey() {
        return _partido.getPrimaryKey();
    }

    /**
    * Sets the primary key of this partido.
    *
    * @param primaryKey the primary key of this partido
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _partido.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this partido.
    *
    * @return the uuid of this partido
    */
    @Override
    public java.lang.String getUuid() {
        return _partido.getUuid();
    }

    /**
    * Sets the uuid of this partido.
    *
    * @param uuid the uuid of this partido
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _partido.setUuid(uuid);
    }

    /**
    * Returns the partido ID of this partido.
    *
    * @return the partido ID of this partido
    */
    @Override
    public long getPartidoId() {
        return _partido.getPartidoId();
    }

    /**
    * Sets the partido ID of this partido.
    *
    * @param partidoId the partido ID of this partido
    */
    @Override
    public void setPartidoId(long partidoId) {
        _partido.setPartidoId(partidoId);
    }

    /**
    * Returns the group ID of this partido.
    *
    * @return the group ID of this partido
    */
    @Override
    public long getGroupId() {
        return _partido.getGroupId();
    }

    /**
    * Sets the group ID of this partido.
    *
    * @param groupId the group ID of this partido
    */
    @Override
    public void setGroupId(long groupId) {
        _partido.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this partido.
    *
    * @return the company ID of this partido
    */
    @Override
    public long getCompanyId() {
        return _partido.getCompanyId();
    }

    /**
    * Sets the company ID of this partido.
    *
    * @param companyId the company ID of this partido
    */
    @Override
    public void setCompanyId(long companyId) {
        _partido.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this partido.
    *
    * @return the user ID of this partido
    */
    @Override
    public long getUserId() {
        return _partido.getUserId();
    }

    /**
    * Sets the user ID of this partido.
    *
    * @param userId the user ID of this partido
    */
    @Override
    public void setUserId(long userId) {
        _partido.setUserId(userId);
    }

    /**
    * Returns the user uuid of this partido.
    *
    * @return the user uuid of this partido
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partido.getUserUuid();
    }

    /**
    * Sets the user uuid of this partido.
    *
    * @param userUuid the user uuid of this partido
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _partido.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this partido.
    *
    * @return the user name of this partido
    */
    @Override
    public java.lang.String getUserName() {
        return _partido.getUserName();
    }

    /**
    * Sets the user name of this partido.
    *
    * @param userName the user name of this partido
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _partido.setUserName(userName);
    }

    /**
    * Returns the create date of this partido.
    *
    * @return the create date of this partido
    */
    @Override
    public java.util.Date getCreateDate() {
        return _partido.getCreateDate();
    }

    /**
    * Sets the create date of this partido.
    *
    * @param createDate the create date of this partido
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _partido.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this partido.
    *
    * @return the modified date of this partido
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _partido.getModifiedDate();
    }

    /**
    * Sets the modified date of this partido.
    *
    * @param modifiedDate the modified date of this partido
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _partido.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the nombre of this partido.
    *
    * @return the nombre of this partido
    */
    @Override
    public java.lang.String getNombre() {
        return _partido.getNombre();
    }

    /**
    * Sets the nombre of this partido.
    *
    * @param nombre the nombre of this partido
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _partido.setNombre(nombre);
    }

    /**
    * Returns the fecha of this partido.
    *
    * @return the fecha of this partido
    */
    @Override
    public java.util.Date getFecha() {
        return _partido.getFecha();
    }

    /**
    * Sets the fecha of this partido.
    *
    * @param fecha the fecha of this partido
    */
    @Override
    public void setFecha(java.util.Date fecha) {
        _partido.setFecha(fecha);
    }

    @Override
    public boolean isNew() {
        return _partido.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _partido.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _partido.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _partido.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _partido.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _partido.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _partido.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _partido.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _partido.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _partido.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _partido.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PartidoWrapper((Partido) _partido.clone());
    }

    @Override
    public int compareTo(Partido partido) {
        return _partido.compareTo(partido);
    }

    @Override
    public int hashCode() {
        return _partido.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Partido> toCacheModel() {
        return _partido.toCacheModel();
    }

    @Override
    public Partido toEscapedModel() {
        return new PartidoWrapper(_partido.toEscapedModel());
    }

    @Override
    public Partido toUnescapedModel() {
        return new PartidoWrapper(_partido.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _partido.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _partido.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _partido.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PartidoWrapper)) {
            return false;
        }

        PartidoWrapper partidoWrapper = (PartidoWrapper) obj;

        if (Validator.equals(_partido, partidoWrapper._partido)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _partido.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Partido getWrappedPartido() {
        return _partido;
    }

    @Override
    public Partido getWrappedModel() {
        return _partido;
    }

    @Override
    public void resetOriginalValues() {
        _partido.resetOriginalValues();
    }
}
