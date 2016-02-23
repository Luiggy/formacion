<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.model.Partido" %>
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
    long partidoId = ParamUtil.getLong(request, "partidoId", 0);

    PortletURL myActionURL = renderResponse.createActionURL();
    myActionURL.setWindowState(LiferayWindowState.MAXIMIZED);
    myActionURL.setParameter("javax.portlet.action", "addPartido");

    Partido partido = null;
    if (partidoId >0) {
        partido = PartidoLocalServiceUtil.getPartido(partidoId);

        myActionURL.setParameter("javax.portlet.action", "updatePartido");
    }
%>

<h3><liferay-ui:message key="Partidos" /></h3>

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

<aui:form action="<%= myActionURL %>" method="post" name="Partidofm">

    <aui:model-context model="<%= Partido.class %>" bean="<%= partido %>"/>

    <liferay-ui:panel defaultState="open" extended="<%= false %>" id="partidoPanel" persistState="<%= false %>" title="fields">
        <aui:fieldset>
            <aui:input name="partidoId" type="hidden"/>

            <div class="row-fluid">
                <div class="span6">
                    <aui:input name="nombre" label="nombre">
                        <aui:validator name="required"/>
                        <aui:validator name="maxLength">75</aui:validator>
                    </aui:input>
                </div>
                <div class="span6">
                    <aui:input name="fecha" label="fecha">
                    </aui:input>
                </div>
            </div>
        </aui:fieldset>
    </liferay-ui:panel>

    <aui:button-row>
        <aui:button name="submit" type="submit" value="save"/>
    </aui:button-row>
</aui:form>