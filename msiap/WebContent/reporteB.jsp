<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{reporteB.page1}" id="page1">
            <ui:html binding="#{reporteB.html1}" id="html1">
                <ui:head binding="#{reporteB.head1}" id="head1">
                    <ui:link binding="#{reporteB.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{reporteB.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{reporteB.form1}" id="form1">
                        <ui:staticText binding="#{reporteB.staticText1}" id="staticText1" style="position: absolute; left: 48px; top: 24px" text="#{reporteB.resultado}"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
