package com.cursoliferay.liferay.portlets.loadtest.service.messaging;

import com.cursoliferay.liferay.portlets.loadtest.service.ClpSerializer;
import com.cursoliferay.liferay.portlets.loadtest.service.FooLocalServiceUtil;
import com.cursoliferay.liferay.portlets.loadtest.service.FooServiceUtil;

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
            FooLocalServiceUtil.clearService();

            FooServiceUtil.clearService();
        }
    }
}
