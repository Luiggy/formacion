package com.cursoliferay.liferay.portlets.alineaciones.service.messaging;

import com.cursoliferay.liferay.portlets.alineaciones.service.ClpSerializer;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil;
import com.cursoliferay.liferay.portlets.alineaciones.service.JugadorServiceUtil;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil;
import com.cursoliferay.liferay.portlets.alineaciones.service.PartidoServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            JugadorLocalServiceUtil.clearService();

            JugadorServiceUtil.clearService();
            PartidoLocalServiceUtil.clearService();

            PartidoServiceUtil.clearService();
        }
    }
}
