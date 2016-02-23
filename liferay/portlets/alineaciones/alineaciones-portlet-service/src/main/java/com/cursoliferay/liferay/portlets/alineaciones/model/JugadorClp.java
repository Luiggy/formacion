package com.cursoliferay.liferay.portlets.alineaciones.model;

import com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class JugadorClp extends BaseModelImpl<Jugador> implements Jugador {
    private String _uuid;
    private long _jugadorId;
    private long _partidoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private String _dni;
    private boolean _titular;
    private BaseModel<?> _jugadorRemoteModel;
    private Class<?> _clpSerializerClass = com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.class;

    public JugadorClp() {
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
    public long getPrimaryKey() {
        return _jugadorId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setJugadorId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _jugadorId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_jugadorRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getJugadorId() {
        return _jugadorId;
    }

    @Override
    public void setJugadorId(long jugadorId) {
        _jugadorId = jugadorId;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setJugadorId", long.class);

                method.invoke(_jugadorRemoteModel, jugadorId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPartidoId() {
        return _partidoId;
    }

    @Override
    public void setPartidoId(long partidoId) {
        _partidoId = partidoId;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setPartidoId", long.class);

                method.invoke(_jugadorRemoteModel, partidoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_jugadorRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_jugadorRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_jugadorRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_jugadorRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_jugadorRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_jugadorRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombre() {
        return _nombre;
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_jugadorRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDni() {
        return _dni;
    }

    @Override
    public void setDni(String dni) {
        _dni = dni;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setDni", String.class);

                method.invoke(_jugadorRemoteModel, dni);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getTitular() {
        return _titular;
    }

    @Override
    public boolean isTitular() {
        return _titular;
    }

    @Override
    public void setTitular(boolean titular) {
        _titular = titular;

        if (_jugadorRemoteModel != null) {
            try {
                Class<?> clazz = _jugadorRemoteModel.getClass();

                Method method = clazz.getMethod("setTitular", boolean.class);

                method.invoke(_jugadorRemoteModel, titular);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Jugador.class.getName()));
    }

    public BaseModel<?> getJugadorRemoteModel() {
        return _jugadorRemoteModel;
    }

    public void setJugadorRemoteModel(BaseModel<?> jugadorRemoteModel) {
        _jugadorRemoteModel = jugadorRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _jugadorRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_jugadorRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            JugadorLocalServiceUtil.addJugador(this);
        } else {
            JugadorLocalServiceUtil.updateJugador(this);
        }
    }

    @Override
    public Jugador toEscapedModel() {
        return (Jugador) ProxyUtil.newProxyInstance(Jugador.class.getClassLoader(),
            new Class[] { Jugador.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        JugadorClp clone = new JugadorClp();

        clone.setUuid(getUuid());
        clone.setJugadorId(getJugadorId());
        clone.setPartidoId(getPartidoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setNombre(getNombre());
        clone.setDni(getDni());
        clone.setTitular(getTitular());

        return clone;
    }

    @Override
    public int compareTo(Jugador jugador) {
        int value = 0;

        value = getNombre().compareTo(jugador.getNombre());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof JugadorClp)) {
            return false;
        }

        JugadorClp jugador = (JugadorClp) obj;

        long primaryKey = jugador.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", jugadorId=");
        sb.append(getJugadorId());
        sb.append(", partidoId=");
        sb.append(getPartidoId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", dni=");
        sb.append(getDni());
        sb.append(", titular=");
        sb.append(getTitular());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append(
            "com.cursoliferay.liferay.portlets.alineaciones.model.Jugador");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>jugadorId</column-name><column-value><![CDATA[");
        sb.append(getJugadorId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partidoId</column-name><column-value><![CDATA[");
        sb.append(getPartidoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dni</column-name><column-value><![CDATA[");
        sb.append(getDni());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titular</column-name><column-value><![CDATA[");
        sb.append(getTitular());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
