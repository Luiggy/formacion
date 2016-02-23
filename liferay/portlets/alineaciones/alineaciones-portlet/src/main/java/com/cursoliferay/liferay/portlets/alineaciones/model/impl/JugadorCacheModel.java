package com.cursoliferay.liferay.portlets.alineaciones.model.impl;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Jugador in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Jugador
 * @generated
 */
public class JugadorCacheModel implements CacheModel<Jugador>, Externalizable {
    public String uuid;
    public long jugadorId;
    public long partidoId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String nombre;
    public String dni;
    public boolean titular;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", jugadorId=");
        sb.append(jugadorId);
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
        sb.append(", dni=");
        sb.append(dni);
        sb.append(", titular=");
        sb.append(titular);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Jugador toEntityModel() {
        JugadorImpl jugadorImpl = new JugadorImpl();

        if (uuid == null) {
            jugadorImpl.setUuid(StringPool.BLANK);
        } else {
            jugadorImpl.setUuid(uuid);
        }

        jugadorImpl.setJugadorId(jugadorId);
        jugadorImpl.setPartidoId(partidoId);
        jugadorImpl.setGroupId(groupId);
        jugadorImpl.setCompanyId(companyId);
        jugadorImpl.setUserId(userId);

        if (userName == null) {
            jugadorImpl.setUserName(StringPool.BLANK);
        } else {
            jugadorImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            jugadorImpl.setCreateDate(null);
        } else {
            jugadorImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            jugadorImpl.setModifiedDate(null);
        } else {
            jugadorImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (nombre == null) {
            jugadorImpl.setNombre(StringPool.BLANK);
        } else {
            jugadorImpl.setNombre(nombre);
        }

        if (dni == null) {
            jugadorImpl.setDni(StringPool.BLANK);
        } else {
            jugadorImpl.setDni(dni);
        }

        jugadorImpl.setTitular(titular);

        jugadorImpl.resetOriginalValues();

        return jugadorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        jugadorId = objectInput.readLong();
        partidoId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        nombre = objectInput.readUTF();
        dni = objectInput.readUTF();
        titular = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(jugadorId);
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

        if (dni == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dni);
        }

        objectOutput.writeBoolean(titular);
    }
}
