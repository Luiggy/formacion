package com.cursoliferay.liferay.portlets.alineaciones.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cursoliferay.liferay.portlets.alineaciones.service.http.PartidoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.http.PartidoServiceSoap
 * @generated
 */
public class PartidoSoap implements Serializable {
    private String _uuid;
    private long _partidoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private Date _fecha;

    public PartidoSoap() {
    }

    public static PartidoSoap toSoapModel(Partido model) {
        PartidoSoap soapModel = new PartidoSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPartidoId(model.getPartidoId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setNombre(model.getNombre());
        soapModel.setFecha(model.getFecha());

        return soapModel;
    }

    public static PartidoSoap[] toSoapModels(Partido[] models) {
        PartidoSoap[] soapModels = new PartidoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PartidoSoap[][] toSoapModels(Partido[][] models) {
        PartidoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PartidoSoap[models.length][models[0].length];
        } else {
            soapModels = new PartidoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PartidoSoap[] toSoapModels(List<Partido> models) {
        List<PartidoSoap> soapModels = new ArrayList<PartidoSoap>(models.size());

        for (Partido model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PartidoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _partidoId;
    }

    public void setPrimaryKey(long pk) {
        setPartidoId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPartidoId() {
        return _partidoId;
    }

    public void setPartidoId(long partidoId) {
        _partidoId = partidoId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    public Date getFecha() {
        return _fecha;
    }

    public void setFecha(Date fecha) {
        _fecha = fecha;
    }
}
