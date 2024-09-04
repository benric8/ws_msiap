<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{ingSolicitudMultiple_1.page1}" id="page1">
            <ui:html binding="#{ingSolicitudMultiple_1.html1}" id="html1">
                <ui:head binding="#{ingSolicitudMultiple_1.head1}" id="head1">
                    <ui:link binding="#{ingSolicitudMultiple_1.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{ingSolicitudMultiple_1.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{ingSolicitudMultiple_1.form1}" id="form1">
                        <h:inputText binding="#{ingSolicitudMultiple_1.textField1}" id="textField1" readonly="true" style="left: 120px; top: 96px; position: absolute; width: 144px"/>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText1}" id="outputText1" style="left: 24px; top: 96px; position: absolute" value="Código:"/>
                        <h:selectOneMenu binding="#{ingSolicitudMultiple_1.dropdown1}" id="dropdown1" style="left: 120px; top: 120px; position: absolute; width: 336px">
                            <f:selectItems binding="#{ingSolicitudMultiple_1.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{ingSolicitudMultiple_1.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText2}" id="outputText2" style="left: 24px; top: 120px; position: absolute" value="(*)Motivo:"/>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText3}" id="outputText3"
                            style="font-size: 14px; left: 24px; top: 53px; position: absolute" value="Registro Nacional de Condenas - Módulo de Solicitudes de Verificación de Antecedentes Penales"/>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText4}" id="outputText4"
                            style="font-size: 24px; font-weight: bold; left: 24px; top: 24px; position: absolute" value="Ingreso de solicitud. (Principal)"/>
                        <h:inputText binding="#{ingSolicitudMultiple_1.textField2}" id="textField2" style="left: 120px; top: 144px; position: absolute; width: 624px"/>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText5}" id="outputText5" style="left: 24px; top: 144px; position: absolute" value="(*)Referencia:"/>
                        <h:commandButton action="#{ingSolicitudMultiple_1.button1_action}" binding="#{ingSolicitudMultiple_1.button1}" id="button1"
                            style="left: 120px; top: 384px; position: absolute" value="Añadir registro..."/>
                        <h:commandButton action="#{ingSolicitudMultiple_1.button2_action}" binding="#{ingSolicitudMultiple_1.button2}" id="button2"
                            style="left: 240px; top: 384px; position: absolute" value="Enviar Solicitud..."/>
                        <h:dataTable binding="#{ingSolicitudMultiple_1.dataTable1}" headerClass="list-header" id="dataTable1"
                            rowClasses="list-row-even,list-row-odd" rows="20" style="left: 120px; top: 216px; position: absolute" title="Registro de Nombres:"
                            value="#{ingSolicitudMultiple_1.dataTable1Model}" var="currentRow" width="624">
                            <h:column binding="#{ingSolicitudMultiple_1.column3}" id="column3">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText10}" id="outputText10" value="#{currentRow['APLL_PATER_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText11}" id="outputText11" value="Ape. Paterno"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{ingSolicitudMultiple_1.column4}" id="column4">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText12}" id="outputText12" value="#{currentRow['APLL_MATER_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText13}" id="outputText13" value="Ape. Materno"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{ingSolicitudMultiple_1.column5}" id="column5">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText14}" id="outputText14" value="#{currentRow['NOM1_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText15}" id="outputText15" value="Nombre 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{ingSolicitudMultiple_1.column6}" id="column6">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText16}" id="outputText16" value="#{currentRow['NOM2_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText17}" id="outputText17" value="Nombre 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{ingSolicitudMultiple_1.column7}" id="column7">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText18}" id="outputText18" value="#{currentRow['NOM3_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText19}" id="outputText19" value="Nombre 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{ingSolicitudMultiple_1.column25}" id="column25">
                                <h:outputText binding="#{ingSolicitudMultiple_1.outputText54}" id="outputText54" value="#{currentRow['INDC_PROCE_SOLIC']}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{ingSolicitudMultiple_1.outputText55}" id="outputText55" value="Estado"/>
                                </f:facet>
                            </h:column>
                            <f:facet name="header"/>
                            <f:facet name="footer"/>
                            <f:facet name="header"/>
                            <f:facet name="footer"/>
                            <f:facet name="header">
                                <h:panelGroup binding="#{ingSolicitudMultiple_1.groupPanel1}" id="groupPanel1" style="display: block; text-align: left" styleClass="list-paging-header">
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_firstPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1HeaderFirstButton}" id="dataTable1HeaderFirstButton"
                                        image="resources/paging_first.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_previousPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1HeaderPreviousButton}" id="dataTable1HeaderPreviousButton"
                                        image="resources/paging_previous.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_nextPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1HeaderNextButton}" id="dataTable1HeaderNextButton"
                                        image="resources/paging_next.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_lastPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1HeaderLastButton}" id="dataTable1HeaderLastButton"
                                        image="resources/paging_last.gif" immediate="true"/>
                                </h:panelGroup>
                            </f:facet>
                            <f:facet name="footer">
                                <h:panelGroup binding="#{ingSolicitudMultiple_1.groupPanel2}" id="groupPanel2" style="display: block; text-align: left" styleClass="list-paging-footer">
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_firstPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1FooterFirstButton}" id="dataTable1FooterFirstButton"
                                        image="resources/paging_first.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_previousPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1FooterPreviousButton}" id="dataTable1FooterPreviousButton"
                                        image="resources/paging_previous.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_nextPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1FooterNextButton}" id="dataTable1FooterNextButton"
                                        image="resources/paging_next.gif" immediate="true"/>
                                    <h:commandButton action="#{ingSolicitudMultiple_1.dataTable1_lastPageAction}"
                                        binding="#{ingSolicitudMultiple_1.dataTable1FooterLastButton}" id="dataTable1FooterLastButton"
                                        image="resources/paging_last.gif" immediate="true"/>
                                </h:panelGroup>
                            </f:facet>
                        </h:dataTable>
                        <h:outputText binding="#{ingSolicitudMultiple_1.outputText6}" id="outputText6"
                            style="font-size: 12px; font-weight: bold; left: 120px; top: 192px; position: absolute" value="Registros:"/>
                        <h:messages binding="#{ingSolicitudMultiple_1.messageList1}" errorClass="errorMessage" fatalClass="fatalMessage" id="messageList1"
                            infoClass="infoMessage" style="height: 40px; left: 120px; top: 432px; position: absolute; width: 598px" warnClass="warnMessage"/>
                        <ui:hyperlink binding="#{ingSolicitudMultiple_1.hyperlink1}" id="hyperlink1" style="position: absolute; left: 480px; top: 24px" text="Cambiar Contraseña"/>
                        <ui:hyperlink binding="#{ingSolicitudMultiple_1.hyperlink2}" id="hyperlink2"
                            style="height: 24px; left: 624px; top: 24px; position: absolute; width: 96px" text="Cerrar Sesion"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
