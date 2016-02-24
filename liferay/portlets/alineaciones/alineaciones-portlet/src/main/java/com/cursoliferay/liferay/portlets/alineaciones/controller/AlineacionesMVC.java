package com.cursoliferay.liferay.portlets.alineaciones.controller;

import com.cursoliferay.liferay.portlets.alineaciones.model.Jugador;
import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.Date;
//mas


public class AlineacionesMVC extends MVCPortlet {

    public void addPartido(ActionRequest actionRequest, ActionResponse actionResponse) {

        _log.info("addPartido");

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        String nombre = ParamUtil.getString(actionRequest, "nombre");

        try {
            Partido partido = PartidoLocalServiceUtil.createPartido(CounterLocalServiceUtil.increment(Partido.class.getName()));
            partido.setNombre(nombre);

            partido.setCompanyId(themeDisplay.getCompanyId());
            partido.setGroupId(themeDisplay.getScopeGroupId());
            partido.setUserId(themeDisplay.getUserId());
            partido.setUserName(themeDisplay.getUser().getScreenName());
            partido.setCreateDate(new Date());
            partido.setModifiedDate(new Date());

            _log.trace("Nombre: " + nombre);


            PartidoLocalServiceUtil.addPartido(partido);

            _log.debug("Añadido partido con nombre: " + partido.getNombre());

        } catch (SystemException e) {
            _log.error(e);
        }
    }

    public void addJugador(ActionRequest actionRequest, ActionResponse actionResponse) {

        _log.info("addJugador");

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        String nombre = ParamUtil.getString(actionRequest, "nombre");
        String dni = ParamUtil.getString(actionRequest, "dni");
        boolean titular = ParamUtil.getBoolean(actionRequest, "titular");
        long partidoId = ParamUtil.getLong(actionRequest, "partidoId");

        try {
            Jugador jugador = JugadorLocalServiceUtil.createJugador(CounterLocalServiceUtil.increment(Jugador.class.getName()));
            jugador.setNombre(nombre);
            jugador.setDni(dni);
            jugador.setTitular(titular);
            jugador.setPartidoId(partidoId);

            jugador.setCompanyId(themeDisplay.getCompanyId());
            jugador.setGroupId(themeDisplay.getScopeGroupId());
            jugador.setUserId(themeDisplay.getUserId());
            jugador.setUserName(themeDisplay.getUser().getScreenName());
            jugador.setCreateDate(new Date());
            jugador.setModifiedDate(new Date());

            _log.trace("Nombre: " + nombre);


            JugadorLocalServiceUtil.addJugador(jugador);

            _log.debug("Añadido jugador con nombre: " + jugador.getNombre());

        } catch (SystemException e) {
            _log.error(e);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(AlineacionesMVC.class);
}
