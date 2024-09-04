<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{admReportes.page1}" id="page1">
			<ui:html binding="#{admReportes.html1}" id="html1">
			<ui:head binding="#{admReportes.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Reportes">
				<ui:link binding="#{admReportes.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/funcionesJavascript.js" />
			</ui:head>
			<ui:body binding="#{admReportes.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{admReportes.form1}" id="form1">

					<table style="height:100%; width: 776px" align="center"
						cellpadding="0px" cellspacing="0px">
						<tr>
							<td colspan="2"><f:subview id="header">
								<div><jsp:directive.include file="header.jspf" /></div>
							</f:subview></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2"><ui:staticText
								binding="#{admReportes.staticText1}" id="staticText1"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; REPORTES" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>

						</tr>
						<tr>
							<td colspan="2" valign="top">
							<fieldset style="width: 500px; height: 220px; align: center"><legend><ui:label
								binding="#{admReportes.label1}" id="label1" text="FILTRAR POR: " /></legend>

							<table cellpadding="0px" cellspacing="0px" border="0px">
								<tr style="height: 10px">
									<td colspan="4"></td>
								</tr>
								<tr style="height: 30px">
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label11}" id="label11" text="Reporte:" /></td>
									<td colspan="3"><ui:dropDown id="ddReporte"
										binding="#{admReportes.ddReporte}" 
										items="#{admReportes.ddReporteDefaultOptions.options}"
										style="width: 360px" onChange="seleccionReporte(this);" /></td>
								</tr>
								<tr style="height: 30px">
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label8}" id="label8" text="Estado:" /></td>
									<td style="width: 155px"><ui:dropDown
										binding="#{admReportes.ddEstado}" id="ddEstado"
										items="#{SessionBean1.estadosSolicitud.options['CODG_ESTADO,DESC_ESTADO']}"
										style="width: 144px" /></td>
									<td style="width: 72px"><ui:label
										binding="#{admReportes.lblUsuario}" id="lblUsuario"
										text="Usuario:" /></td>
									<td style="width: 155px"><ui:dropDown
										binding="#{admReportes.ddUsuarios}" id="ddUsuarios"
										items="#{SessionBean1.usuarios.options['CODG_USUAR,APELLIDOSNOMBRES']}"
										style="width: 144px" /></td>
								</tr>
								<tr style="height: 30px">
									<td colspan="4"><ui:label binding="#{admReportes.label10}"
										id="label10" text="Rango de fecha de registro:" /></td>
								</tr>

								<tr style="height: 30px;" id="idFecha">
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label4}" id="label4" text="Desde:" /></td>
									<td style="width: 155px"><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admReportes.calDesde}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calDesde"
										validator="#{admReportes.calDesde_validate}"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label5}" id="label5" text="Hasta:" /></td>
									<td style="width: 155px"><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admReportes.calHasta}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calHasta"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
								</tr>
								<tr style="height: 30px; display: none;" id="idAnno">
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label20}" id="label20" text="Año:" /></td>
									<td><ui:dropDown binding="#{admReportes.ddAnno}"
										id="ddAnno" items="#{admReportes.ddAnnoOptions.options}"
										style="width: 144px" /></td>
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label21}" id="label21" text="Mes:" /></td>
									<td><ui:dropDown binding="#{admReportes.ddMes}" id="ddMes"
										items="#{admReportes.ddMesOptions.options}"
										style="width: 144px" /></td>
								</tr>
								<tr style="height: 30px">
									<td style="width: 72px"><ui:label
										binding="#{admReportes.label2}" id="label2" text="Formato:" /></td>
									<td colspan="3"><ui:dropDown
										binding="#{admReportes.ddFormato}" id="ddFormato"
										items="#{admReportes.ddFormatoDefaultOptions.options}"
										style="width: 144px" /></td>
								</tr>
								<tr style="height: 30px">
									<td style="width: 72px"></td>
									<td style="width: 155px" align="right"><ui:button
										action="#{admReportes.btnGenerarReporte_action}"
										binding="#{admReportes.btnGenerarReporte}"
										id="btnGenerarReporte" mini="true" style="width: 144px"
										text="Generar Reporte..." /></td>
									<td style="width: 72px" align="left"><ui:button
										action="#{admReportes.btnVolver_action}"
										binding="#{admReportes.btnVolver}" id="btnVolver" mini="true"
										style="width: 71px" text="Volver" /></td>
									<td style="width: 155px"></td>
								</tr>
								<tr style="height: 5px">
									<td colspan="4"></td>
								</tr>
								<tr style="height: 20px">
									<td colspan="4"><h:messages
										binding="#{admReportes.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										id="messageList1" infoClass="infoMessage"
										style="height: 22px; width: 502px" warnClass="warnMessage" /></td>
								</tr>
							</table>
							</fieldset>
							</td>
						</tr>
					</table>
				</ui:form>
			</ui:body>
			<script type="text/javascript">                        
                        function seleccionReporte(tipoReporte){

                        		if(tipoReporte.value==5){
	                       			 document.getElementById("idFecha").style.display = "none";
	                       			 document.getElementById("idAnno").style.display = "";
                        		}else{
	                       			 document.getElementById("idAnno").style.display = "none";
	                       			 document.getElementById("idFecha").style.display = "";

                        		}                       		
                        		
                        }

                        
            </script>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
