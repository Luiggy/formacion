package com.cursoliferay.liferay.portlets.alineaciones.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cursoliferay.liferay.portlets.alineaciones.service.http.JugadorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.http.JugadorServiceSoap
 * @generated
 */
public class JugadorSoap implements Serializable {
    private String _uuid;
    private long _jugadorId;
    private long _partidoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private String _dni;
    private boolean _titular;

    public JugadorSoap() {
    }

    public static JugadorSoap toSoapModel(Jugador model) {
        JugadorSoap soapModel = new JugadorSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setJugadorId(model.getJugadorId());
        soapModel.setPartidoId(model.getPartidoId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setNombre(model.getNombre());
        soapModel.setDni(model.getDni());
        soapModel.setTitular(model.getTitular());

        return soapModel;
    }

    public static JugadorSoap[] toSoapModels(Jugador[] models) {
        JugadorSoap[] soapModels = new JugadorSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static JugadorSoap[][] toSoapModels(Jugador[][] models) {
        JugadorSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new JugadorSoap[models.length][models[0].length];
        } else {
            soapModels = new JugadorSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static JugadorSoap[] toSoapModels(List<Jugador> models) {
        List<JugadorSoap> soapModels = new ArrayList<JugadorSoap>(models.size());

        for (Jugador model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new JugadorSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _jugadorId;
    }

    public void setPrimaryKey(long pk) {
        setJugadorId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getJugadorId() {
        return _jugadorId;
    }

    public void setJugadorId(long jugadorId) {
        _jugadorId = jugadorId;
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

    public String getDni() {
        return _dni;
    }

    public void setDni(String dni) {
        _dni = dni;
    }

    public boolean getTitular() {
        return _titular;
    }

    public boolean isTitular() {
        return _titular;
    }

    public void setTitular(boolean titular) {
        _titular = titular;
    }
}
