package com.cursoliferay.liferay.portlets.alineaciones.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Jugador}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Jugador
 * @generated
 */
public class JugadorWrapper implements Jugador, ModelWrapper<Jugador> {
    private Jugador _jugador;

    public JugadorWrapper(Jugador jugador) {
        _jugador = jugador;
    }

    @Override
    public Class<?> getModelClass() {
        return Jugador.class;
    }

    @Override
    public String getModelClassName() {
        return Jugador.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("jugadorId", getJugadorId());
        attributes.put("partidoId", getPartidoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("nombre", getNombre());
        attributes.put("dni", getDni());
        attributes.put("titular", getTitular());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long jugadorId = (Long) attributes.get("jugadorId");

        if (jugadorId != null) {
            setJugadorId(jugadorId);
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

        String dni = (String) attributes.get("dni");

        if (dni != null) {
            setDni(dni);
        }

        Boolean titular = (Boolean) attributes.get("titular");

        if (titular != null) {
            setTitular(titular);
        }
    }

    /**
    * Returns the primary key of this jugador.
    *
    * @return the primary key of this jugador
    */
    @Override
    public long getPrimaryKey() {
        return _jugador.getPrimaryKey();
    }

    /**
    * Sets the primary key of this jugador.
    *
    * @param primaryKey the primary key of this jugador
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _jugador.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this jugador.
    *
    * @return the uuid of this jugador
    */
    @Override
    public java.lang.String getUuid() {
        return _jugador.getUuid();
    }

    /**
    * Sets the uuid of this jugador.
    *
    * @param uuid the uuid of this jugador
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _jugador.setUuid(uuid);
    }

    /**
    * Returns the jugador ID of this jugador.
    *
    * @return the jugador ID of this jugador
    */
    @Override
    public long getJugadorId() {
        return _jugador.getJugadorId();
    }

    /**
    * Sets the jugador ID of this jugador.
    *
    * @param jugadorId the jugador ID of this jugador
    */
    @Override
    public void setJugadorId(long jugadorId) {
        _jugador.setJugadorId(jugadorId);
    }

    /**
    * Returns the partido ID of this jugador.
    *
    * @return the partido ID of this jugador
    */
    @Override
    public long getPartidoId() {
        return _jugador.getPartidoId();
    }

    /**
    * Sets the partido ID of this jugador.
    *
    * @param partidoId the partido ID of this jugador
    */
    @Override
    public void setPartidoId(long partidoId) {
        _jugador.setPartidoId(partidoId);
    }

    /**
    * Returns the group ID of this jugador.
    *
    * @return the group ID of this jugador
    */
    @Override
    public long getGroupId() {
        return _jugador.getGroupId();
    }

    /**
    * Sets the group ID of this jugador.
    *
    * @param groupId the group ID of this jugador
    */
    @Override
    public void setGroupId(long groupId) {
        _jugador.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this jugador.
    *
    * @return the company ID of this jugador
    */
    @Override
    public long getCompanyId() {
        return _jugador.getCompanyId();
    }

    /**
    * Sets the company ID of this jugador.
    *
    * @param companyId the company ID of this jugador
    */
    @Override
    public void setCompanyId(long companyId) {
        _jugador.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this jugador.
    *
    * @return the user ID of this jugador
    */
    @Override
    public long getUserId() {
        return _jugador.getUserId();
    }

    /**
    * Sets the user ID of this jugador.
    *
    * @param userId the user ID of this jugador
    */
    @Override
    public void setUserId(long userId) {
        _jugador.setUserId(userId);
    }

    /**
    * Returns the user uuid of this jugador.
    *
    * @return the user uuid of this jugador
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jugador.getUserUuid();
    }

    /**
    * Sets the user uuid of this jugador.
    *
    * @param userUuid the user uuid of this jugador
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _jugador.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this jugador.
    *
    * @return the user name of this jugador
    */
    @Override
    public java.lang.String getUserName() {
        return _jugador.getUserName();
    }

    /**
    * Sets the user name of this jugador.
    *
    * @param userName the user name of this jugador
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _jugador.setUserName(userName);
    }

    /**
    * Returns the create date of this jugador.
    *
    * @return the create date of this jugador
    */
    @Override
    public java.util.Date getCreateDate() {
        return _jugador.getCreateDate();
    }

    /**
    * Sets the create date of this jugador.
    *
    * @param createDate the create date of this jugador
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _jugador.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this jugador.
    *
    * @return the modified date of this jugador
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _jugador.getModifiedDate();
    }

    /**
    * Sets the modified date of this jugador.
    *
    * @param modifiedDate the modified date of this jugador
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _jugador.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the nombre of this jugador.
    *
    * @return the nombre of this jugador
    */
    @Override
    public java.lang.String getNombre() {
        return _jugador.getNombre();
    }

    /**
    * Sets the nombre of this jugador.
    *
    * @param nombre the nombre of this jugador
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _jugador.setNombre(nombre);
    }

    /**
    * Returns the dni of this jugador.
    *
    * @return the dni of this jugador
    */
    @Override
    public java.lang.String getDni() {
        return _jugador.getDni();
    }

    /**
    * Sets the dni of this jugador.
    *
    * @param dni the dni of this jugador
    */
    @Override
    public void setDni(java.lang.String dni) {
        _jugador.setDni(dni);
    }

    /**
    * Returns the titular of this jugador.
    *
    * @return the titular of this jugador
    */
    @Override
    public boolean getTitular() {
        return _jugador.getTitular();
    }

    /**
    * Returns <code>true</code> if this jugador is titular.
    *
    * @return <code>true</code> if this jugador is titular; <code>false</code> otherwise
    */
    @Override
    public boolean isTitular() {
        return _jugador.isTitular();
    }

    /**
    * Sets whether this jugador is titular.
    *
    * @param titular the titular of this jugador
    */
    @Override
    public void setTitular(boolean titular) {
        _jugador.setTitular(titular);
    }

    @Override
    public boolean isNew() {
        return _jugador.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _jugador.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _jugador.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _jugador.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _jugador.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _jugador.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _jugador.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _jugador.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _jugador.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _jugador.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _jugador.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new JugadorWrapper((Jugador) _jugador.clone());
    }

    @Override
    public int compareTo(Jugador jugador) {
        return _jugador.compareTo(jugador);
    }

    @Override
    public int hashCode() {
        return _jugador.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Jugador> toCacheModel() {
        return _jugador.toCacheModel();
    }

    @Override
    public Jugador toEscapedModel() {
        return new JugadorWrapper(_jugador.toEscapedModel());
    }

    @Override
    public Jugador toUnescapedModel() {
        return new JugadorWrapper(_jugador.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _jugador.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _jugador.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _jugador.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof JugadorWrapper)) {
            return false;
        }

        JugadorWrapper jugadorWrapper = (JugadorWrapper) obj;

        if (Validator.equals(_jugador, jugadorWrapper._jugador)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _jugador.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Jugador getWrappedJugador() {
        return _jugador;
    }

    @Override
    public Jugador getWrappedModel() {
        return _jugador;
    }

    @Override
    public void resetOriginalValues() {
        _jugador.resetOriginalValues();
    }
}
