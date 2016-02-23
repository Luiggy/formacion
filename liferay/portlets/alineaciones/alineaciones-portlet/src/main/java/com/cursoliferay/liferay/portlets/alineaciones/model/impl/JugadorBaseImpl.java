package com.cursoliferay.liferay.portlets.alineaciones.model.impl;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Jugador service. Represents a row in the &quot;alineaciones_Jugador&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JugadorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JugadorImpl
 * @see com.cursoliferay.liferay.portlets.alineaciones.model.Jugador
 * @generated
 */
public abstract class JugadorBaseImpl extends JugadorModelImpl
    implements Jugador {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a jugador model instance should use the {@link Jugador} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            JugadorLocalServiceUtil.addJugador(this);
        } else {
            JugadorLocalServiceUtil.updateJugador(this);
        }
    }
}