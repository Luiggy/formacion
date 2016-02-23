package com.cursoliferay.liferay.portlets.alineaciones.controller;

import com.cursoliferay.liferay.portlets.alineaciones.model.Partido;
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
import java.util.Calendar;
import java.util.Date;

/**
 * Created by miguel on 23/2/16.
 */
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

    private static Log _log = LogFactoryUtil.getLog(AlineacionesMVC.class);
}
