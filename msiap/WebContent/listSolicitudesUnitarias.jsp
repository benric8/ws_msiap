<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{listSolicitudesUnitarias.page1}" id="page1">
            <ui:html binding="#{listSolicitudesUnitarias.html1}" id="html1">
                <ui:head binding="#{listSolicitudesUnitarias.head1}" id="head1">
                    <ui:link binding="#{listSolicitudesUnitarias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{listSolicitudesUnitarias.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{listSolicitudesUnitarias.form1}" id="form1">
                        <ui:table augmentTitle="false" binding="#{listSolicitudesUnitarias.table1}" id="table1"
                            style="left: 24px; top: 144px; position: absolute; width: 743px;display:block" title="Registros" width="743">
                            <ui:tableRowGroup binding="#{listSolicitudesUnitarias.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{SessionBean1.estadoSolicitudes}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn1}" headerText="CODIGO" id="tableColumn1" sort="CODG_CERTI">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText1}" id="staticText1" text="#{currentRow.value['CODG_CERTI']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn2}" headerText="NOMBRE 1" id="tableColumn2" sort="NOM1_SOLIC">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText2}" id="staticText2" text="#{currentRow.value['NOM1_SOLIC']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn3}" headerText="NOMBRE 2" id="tableColumn3" sort="NOM2_SOLIC">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText3}" id="staticText3" text="#{currentRow.value['NOM2_SOLIC']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn4}" headerText="NOMBRE 3" id="tableColumn4" sort="NOM3_SOLIC">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText4}" id="staticText4" text="#{currentRow.value['NOM3_SOLIC']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn5}" headerText="APELLIDO PATERNO" id="tableColumn5" sort="APLL_PATER_SOLIC">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText5}" id="staticText5" text="#{currentRow.value['APLL_PATER_SOLIC']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn6}" headerText="APELLIDO MATERNO" id="tableColumn6" sort="APLL_MATER_SOLIC">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText6}" id="staticText6" text="#{currentRow.value['APLL_MATER_SOLIC']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn7}" headerText="ESTADO SOLICITUD" id="tableColumn7" sort="DESC_ESTADO_SOLICITUD">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText7}" id="staticText7" text="#{currentRow.value['DESC_ESTADO_SOLICITUD']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn8}" headerText="F. REGISTRO" id="tableColumn8" sort="FECH_REGISTRO">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText8}" id="staticText8" text="#{currentRow.value['FECH_REGISTRO']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn9}" headerText="ESTADO IMPRESION" id="tableColumn9" sort="DESC_ESTADO_IMPRESION">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText9}" id="staticText9" text="#{currentRow.value['DESC_ESTADO_IMPRESION']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{listSolicitudesUnitarias.tableColumn10}" headerText="NRP. IMPRESIONES" id="tableColumn10" sort="NUMR_IMPRESION">
                                    <ui:staticText binding="#{listSolicitudesUnitarias.staticText10}" id="staticText10" text="#{currentRow.value['NUMR_IMPRESION']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <h:outputText binding="#{listSolicitudesUnitarias.outputText1}" id="outputText1"
                            style="font-size: 14px; left: 24px; top: 48px; position: absolute" value="Registro Nacional de Condenas - Módulo de Solicitudes de Verificación de Antecedentes Penales"/>
                        <h:outputText binding="#{listSolicitudesUnitarias.outputText2}" id="outputText2"
                            style="font-size: 24px; font-weight: bold; left: 24px; top: 12px; position: absolute" value="Listado de Solicitudes"/>
                        <ui:button action="retroceder" binding="#{listSolicitudesUnitarias.btnVolver}" id="btnVolver"
                            style="left: 23px; top: 96px; position: absolute" text="Volver"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
