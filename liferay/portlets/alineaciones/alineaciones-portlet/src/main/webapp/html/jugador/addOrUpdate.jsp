<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.model.Jugador" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
    long jugadorId = ParamUtil.getLong(request, "jugadorId", 0);

    PortletURL myActionURL = renderResponse.createActionURL();
    myActionURL.setWindowState(LiferayWindowState.MAXIMIZED);
    myActionURL.setParameter("javax.portlet.action", "addJugador");

    Jugador jugador = null;
    if (jugadorId >0) {
        jugador = JugadorLocalServiceUtil.getJugador(jugadorId);

        myActionURL.setParameter("javax.portlet.action", "updateJugador");
    }
%>

<h3><liferay-ui:message key="Jugadors" /></h3>

<%
    if (SessionErrors.keySet(renderRequest).size()>0) {
        out.write("<div class=\"alert alert-error\">");
        for (String s : SessionErrors.keySet(renderRequest)) {
            out.write(LanguageUtil.get(locale, s, s));
            out.write("<br />");
        }
        out.write("</div>");
    }
%>

<aui:form action="<%= myActionURL %>" method="post" name="Jugadorfm">

    <aui:model-context model="<%= Jugador.class %>" bean="<%= jugador %>"/>

    <liferay-ui:panel defaultState="open" extended="<%= false %>" id="jugadorPanel" persistState="<%= false %>" title="fields">
        <aui:fieldset>
            <aui:input name="jugadorId" type="hidden"/>

            <div class="row-fluid">
                <div class="span4">
                    <aui:input name="nombre" label="nombre">
                        <aui:validator name="required"/>
                        <aui:validator name="maxLength">75</aui:validator>
                    </aui:input>
                </div>
                <div class="span4">
                    <aui:input name="dni" label="dni">
                    </aui:input>
                </div>
                <div class="span4">
                    <aui:input name="titular" label="titular">
                    </aui:input>
                </div>
            </div>
        </aui:fieldset>
    </liferay-ui:panel>

    <aui:button-row>
        <aui:button name="submit" type="submit" value="save"/>
    </aui:button-row>
</aui:form>