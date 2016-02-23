<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.service.PartidoLocalServiceUtil" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.model.impl.PartidoImpl" %>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.cursoliferay.liferay.portlets.alineaciones.service.JugadorLocalServiceUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<h3><liferay-ui:message key="Jugadores" /></h3>

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

<%
    String orderByCol = ParamUtil.getString(request, "orderByCol", "nombre");
    String orderByType = ParamUtil.getString(request, "orderByType", "asc");

    if (!"".equals(orderByCol) && !"".equals(orderByType)) {
        portletSession.setAttribute(renderResponse.getNamespace() + "sort-by-col", orderByCol);
        portletSession.setAttribute(renderResponse.getNamespace() + "sort-by-type", orderByType);
    } else {
        orderByCol = (String)portletSession.getAttribute(renderResponse.getNamespace() +  "sort-by-col");
        orderByType = (String)portletSession.getAttribute(renderResponse.getNamespace() +  "sort-by-type");
    }

    OrderByComparator comparator = OrderByComparatorFactoryUtil.create(PartidoImpl.TABLE_NAME, orderByCol, "asc".equals(orderByType));
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
    <liferay-portlet:param name="jspPage" value="/html/jugador/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%=iteratorURL %>" method="POST" name="jugadorForm">

    <liferay-ui:search-container iteratorURL="<%=iteratorURL%>" emptyResultsMessage="there-are-no-jugadores" delta="50" orderByCol="<%=orderByCol%>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>">

        <liferay-ui:search-container-results>
            <%
                total = JugadorLocalServiceUtil.getJugadorsCount();
                results = JugadorLocalServiceUtil.getJugadors(-1, -1);
                searchContainer.setTotal(total);
                searchContainer.setResults(results);
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row className="com.cursoliferay.liferay.portlets.alineaciones.model.Jugador" keyProperty="jugadorId" modelVar="jugador">

            <liferay-portlet:renderURL var="updateJugadorURL">
                <liferay-portlet:param name="jspPage" value="/html/jugador/addOrUpdate.jsp"/>
                <liferay-portlet:param name="jugadorId" value="<%=String.valueOf(jugador.getJugadorId())%>" />
            </liferay-portlet:renderURL>

            <liferay-ui:search-container-column-text name="nombre" property="nombre" orderable="true" />
            <liferay-ui:search-container-column-text name="dni" property="dni" orderable="true" />
            <liferay-ui:search-container-column-text name="titular" property="titular" orderable="true" />

            <liferay-ui:search-container-column-text name="actions">
                <liferay-ui:icon-menu>
                    <liferay-ui:icon image="edit" message="update-jugador" label="update-jugador" url="${updateJugadorURL}" />
                </liferay-ui:icon-menu>
            </liferay-ui:search-container-column-text>
        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator />
    </liferay-ui:search-container>

    <liferay-portlet:renderURL var="addJugadorURL">
        <liferay-portlet:param name="jspPage" value="/html/jugador/addOrUpdate.jsp"/>
    </liferay-portlet:renderURL>

    <aui:button-row>
        <aui:button name="addJugador" value="add-jugador" href="${addJugadorURL}"/>
    </aui:button-row>

</aui:form>