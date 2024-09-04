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
		<ui:page binding="#{admReporteInterno.page1}" id="page1">
			<ui:html binding="#{admReporteInterno.html1}" id="html1">
			<ui:head binding="#{admReporteInterno.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Reportes">
				<ui:link binding="#{admReporteInterno.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/funcionesJavascript.js" />
			</ui:head>
			<ui:body binding="#{admReporteInterno.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{admReporteInterno.form1}" id="form1">

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
								binding="#{admReporteInterno.staticText1}" id="staticText1"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; REPORTES" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>

						</tr>
						<tr>
							<td colspan="2" valign="top">
							<fieldset style="width: 760px; height: 250px; align: center"><legend><ui:label
								binding="#{admReporteInterno.label1}" id="label1" text="FILTRAR POR: " /></legend>

							<table cellpadding="0px" cellspacing="0px" border="0px">
								<tr style="height: 10px">
									<td colspan="4"></td>
								</tr>
								<tr style="height: 30px">
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.label11}" id="label11" text="Reporte:" /></td>
									<td colspan="3"><ui:dropDown id="ddReporte" 
										binding="#{admReporteInterno.ddReporte}" 
										items="#{admReporteInterno.ddReporteDefaultOptions.options}"
										style="width: 360px" tabIndex="1"/></td>
								</tr>
								<tr>
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.lblDistritoJudicial}" id="lblDistritoJudicial"
										text="Distrito Judicial:" /></td>
									<td style="width: 155px" colspan="3"><h:selectOneMenu onchange="submit()"
										valueChangeListener="#{admReporteInterno.valorCombo}"
										binding="#{admReporteInterno.ddDistritoJudicial}"
										id="ddDistritoJudicial" required="true" tabindex="2">
										<f:selectItems binding="#{admReporteInterno.dropdown11SelectItems}"
											id="dropdown11SelectItems"
											value="#{SessionBean1.distritoJudicialInterno.options['CODG_DISTRITO_JUDICIAL,DESC_DISTRITO_JUDICIAL']}" />
									</h:selectOneMenu>
									</td>
								</tr>
								
								<tr>
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.lblUsuario}" id="lblUsuario"
										text="Usuario:" /></td>
									<td style="width: 155px" colspan="3"><ui:dropDown
										binding="#{admReporteInterno.ddUsuarios}" id="ddUsuarios"
										items="#{SessionBean1.usuarioDistritoJudicial.options['CODG_USUAR,APELLIDOSNOMBRES']}"
										style="width: 200px" tabIndex="3" />
									</td>
								</tr>
								
								<tr >
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.label8}" id="label8" text="Estado:" /></td>
									<td colspan="3"><ui:dropDown
										binding="#{admReporteInterno.ddEstado}" id="ddEstado"
										items="#{SessionBean1.estadoSolicitudTotal.options['CODG_ESTADO,DESC_ESTADO']}"
										style="width: 200px" tabIndex="4" /></td>

								</tr>
								<tr style="height: 30px">
									<td colspan="4"><ui:label binding="#{admReporteInterno.label10}"
										id="label10" text="Rango de fecha de registro:" /></td>
								</tr>

								<tr style="height: 30px;" id="idFecha">
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.label4}" id="label4" text="Desde:" /></td>
									<td style="width: 155px"><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admReporteInterno.calDesde}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calDesde"
										validator="#{admReporteInterno.calDesde_validate}"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" tabIndex="5"/></td>
									<td style="width: 72px"><ui:label
										binding="#{admReporteInterno.label5}" id="label5" text="Hasta:" /></td>
									<td style="width: 210px"><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admReporteInterno.calHasta}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calHasta"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" tabIndex="6" /></td>
								</tr>
								
								<!-- tr>
									<td style="width: 110px"><ui:label
										binding="#{admReporteInterno.label2}" id="label2" text="Formato:" /></td>
									<td colspan="3"><ui:dropDown  
										binding="#{admReporteInterno.ddFormato}" id="ddFormato"
										items="#{admReporteInterno.ddFormatoDefaultOptions.options}"
										style="width: 144px" tabIndex="7" /></td>
								</tr-->
								<c:if test="${SessionBean1.usuario.COD_PERFIL!='25'}">
								<tr style="height: 23px">
									<td colspan="4">									
									<table>
										<tr>
											<td><h:selectBooleanCheckbox tabindex="8" id="checkPenImp"
												binding="#{admReporteInterno.checkPenImp}">Pendiente de Impresión</h:selectBooleanCheckbox></td>
											<td style="width: 20px"></td>
											<td><h:selectBooleanCheckbox tabindex="9" id="checkImp"
												binding="#{admReporteInterno.checkImp}">Impresos</h:selectBooleanCheckbox></td>
											<td style="width: 20px"></td>
											<td><h:selectBooleanCheckbox tabindex="10" id="checkObs"
												binding="#{admReporteInterno.checkObs}">Observados</h:selectBooleanCheckbox></td>

										</tr>
									</table>									
									</td>
								</tr>
								</c:if>
								<tr style="height: 30px">
									<td style="width: 110px"></td>
									<td style="width: 155px" align="right"><ui:button
										action="#{admReporteInterno.btnGenerarReporte_action}"
										binding="#{admReporteInterno.btnGenerarReporte}"
										id="btnGenerarReporte" mini="true" style="width: 144px"
										text="Generar Reporte..." tabIndex="13" /></td>
									<td style="width: 72px" align="left"><ui:button
										action="#{admReporteInterno.btnVolver_action}"
										binding="#{admReporteInterno.btnVolver}" id="btnVolver" mini="true"
										style="width: 71px" tabIndex="14" text="Volver" /></td>
									<td style="width: 210px"></td>
								</tr>
								<tr style="height: 20px">
									<td colspan="4"></td>
								</tr>
								<tr style="height: 20px">
									<td colspan="4"><h:messages
										binding="#{admReporteInterno.messageList1}"
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
		
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
