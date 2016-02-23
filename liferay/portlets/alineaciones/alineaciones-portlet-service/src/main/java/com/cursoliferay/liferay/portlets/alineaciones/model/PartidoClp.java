package com.cursoliferay.liferay.portlets.alineaciones.model;

import com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;

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


public class PartidoClp extends BaseModelImpl<Partido> implements Partido {
    private String _uuid;
    private long _partidoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private Date _fecha;
    private BaseModel<?> _partidoRemoteModel;
    private Class<?> _clpSerializerClass = com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer.class;

    public PartidoClp() {
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
    public long getPrimaryKey() {
        return _partidoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPartidoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _partidoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_partidoRemoteModel, uuid);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setPartidoId", long.class);

                method.invoke(_partidoRemoteModel, partidoId);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_partidoRemoteModel, groupId);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_partidoRemoteModel, companyId);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_partidoRemoteModel, userId);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_partidoRemoteModel, userName);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_partidoRemoteModel, createDate);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_partidoRemoteModel, modifiedDate);
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

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_partidoRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFecha() {
        return _fecha;
    }

    @Override
    public void setFecha(Date fecha) {
        _fecha = fecha;

        if (_partidoRemoteModel != null) {
            try {
                Class<?> clazz = _partidoRemoteModel.getClass();

                Method method = clazz.getMethod("setFecha", Date.class);

                method.invoke(_partidoRemoteModel, fecha);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Partido.class.getName()));
    }

    public BaseModel<?> getPartidoRemoteModel() {
        return _partidoRemoteModel;
    }

    public void setPartidoRemoteModel(BaseModel<?> partidoRemoteModel) {
        _partidoRemoteModel = partidoRemoteModel;
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

        Class<?> remoteModelClass = _partidoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_partidoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PartidoLocalServiceUtil.addPartido(this);
        } else {
            PartidoLocalServiceUtil.updatePartido(this);
        }
    }

    @Override
    public Partido toEscapedModel() {
        return (Partido) ProxyUtil.newProxyInstance(Partido.class.getClassLoader(),
            new Class[] { Partido.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PartidoClp clone = new PartidoClp();

        clone.setUuid(getUuid());
        clone.setPartidoId(getPartidoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setNombre(getNombre());
        clone.setFecha(getFecha());

        return clone;
    }

    @Override
    public int compareTo(Partido partido) {
        int value = 0;

        value = getNombre().compareTo(partido.getNombre());

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

        if (!(obj instanceof PartidoClp)) {
            return false;
        }

        PartidoClp partido = (PartidoClp) obj;

        long primaryKey = partido.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
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
        sb.append(", fecha=");
        sb.append(getFecha());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append(
            "com.cursoliferay.liferay.portlets.alineaciones.model.Partido");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
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
            "<column><column-name>fecha</column-name><column-value><![CDATA[");
        sb.append(getFecha());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
