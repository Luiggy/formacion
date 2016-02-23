package com.cursoliferay.liferay.portlets.alineaciones.model.impl;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Partido in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Partido
 * @generated
 */
public class PartidoCacheModel implements CacheModel<Partido>, Externalizable {
    public String uuid;
    public long partidoId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String nombre;
    public long fecha;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", partidoId=");
        sb.append(partidoId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", fecha=");
        sb.append(fecha);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Partido toEntityModel() {
        PartidoImpl partidoImpl = new PartidoImpl();

        if (uuid == null) {
            partidoImpl.setUuid(StringPool.BLANK);
        } else {
            partidoImpl.setUuid(uuid);
        }

        partidoImpl.setPartidoId(partidoId);
        partidoImpl.setGroupId(groupId);
        partidoImpl.setCompanyId(companyId);
        partidoImpl.setUserId(userId);

        if (userName == null) {
            partidoImpl.setUserName(StringPool.BLANK);
        } else {
            partidoImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            partidoImpl.setCreateDate(null);
        } else {
            partidoImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            partidoImpl.setModifiedDate(null);
        } else {
            partidoImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (nombre == null) {
            partidoImpl.setNombre(StringPool.BLANK);
        } else {
            partidoImpl.setNombre(nombre);
        }

        if (fecha == Long.MIN_VALUE) {
            partidoImpl.setFecha(null);
        } else {
            partidoImpl.setFecha(new Date(fecha));
        }

        partidoImpl.resetOriginalValues();

        return partidoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        partidoId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        nombre = objectInput.readUTF();
        fecha = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(partidoId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }

        objectOutput.writeLong(fecha);
    }
}
