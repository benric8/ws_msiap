<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{inicio.page1}" id="page1">
            <ui:html binding="#{inicio.html1}" id="html1">
                <ui:head binding="#{inicio.head1}" id="head1">
                    <ui:link binding="#{inicio.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{inicio.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{inicio.form1}" id="form1">
                        <ui:button action="#{inicio.button1_action}" binding="#{inicio.button1}" id="button1" style="position: absolute; left: 216px; top: 96px" text="Button"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
