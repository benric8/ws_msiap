<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:fn="http://java.sun.com/jsp/jstl/functions"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{ingSolicitudSimple.page1}" id="page1">
			<ui:html binding="#{ingSolicitudSimple.html1}" id="html1">
			<ui:head binding="#{ingSolicitudSimple.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Ingreso de Solicitud">
				<ui:link binding="#{ingSolicitudSimple.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/jsval.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/javascript/inSolicitudSimple.js" />
				<ui:script id="script4" url="/resources/funcionesJavascript.js" />
			</ui:head>
			<!-- onLoad="initValidation()" -->
			<ui:body binding="#{ingSolicitudSimple.body1}" id="body1"
				onLoad="validarDocumentoOnLoad()"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">

				<ui:form binding="#{ingSolicitudSimple.form1}" id="form1">
			
					<table style="height: 100%; width: 776px" align="center"
						cellpadding="0px" cellspacing="0px">

						<tr>
							<td colspan="4"><f:subview id="header">
									<div><jsp:directive.include file="header.jspf" /></div>
								</f:subview></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
						<td>
							<ui:hiddenField id="modificar" value="#{ingSolicitudMultiple.modificar}"></ui:hiddenField>
						</td>
						</tr>
						<tr>
							<td colspan="4" valign="top">
								<table border="0px" cellpadding="0px" cellspacing="0px" style="width: 776px">

									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText20}"
												id="outputText20" value="(*)Motivo:" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudSimple.ddMotivo}" id="ddMotivo"
												required="true" style="width: 190px" tabindex="1"
												value="#{SessionBean1.solicitudUnitaria.MOTI_SOLIC}">
												<f:selectItems
													binding="#{ingSolicitudSimple.dropdown10SelectItems}"
													id="dropdown10SelectItems"
													value="#{SessionBean1.motivos.options['codigo_del_motivo,descripcion']}" />
											</h:selectOneMenu></td>
										<td style="width: 30px;" />
										<td valign="top" colspan="2" rowspan="6" style="padding-left: 100px;">
											
										</td>
									</tr>

									<!--Inicio  -->

									<tr style="height: 30px">
										<td colspan="3" style="font-weight: bold;">Datos del
											documento que autoriza la consulta</td>
									</tr>
									<tr>
										<td><ui:staticText
												text="#{ingSolicitudSimple.lblTipoTramite}" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudSimple.ddTipoDocumentoAut}"
												id="ddTipoTramite" required="true" style="width: 190px"
												tabindex="3"
												value="#{ingSolicitudSimple.idTipoDocumentoAutorizacion}">
												<f:selectItems
													binding="#{ingSolicitudSimple.dropdown1SelectAutItems}"
													value="#{ingSolicitudSimple.tiposDocumentoAut}" />
											</h:selectOneMenu></td>
										<td style="width: 30px;" />
										<td colspan="2"><h:message errorClass="errorMessage"
												fatalClass="fatalMessage" for="ddTipoTramite"
												id="inlineMessage15" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
									</tr>

									<tr>
										<td style="padding-top: 5px;"><ui:staticText
												text="#{ingSolicitudSimple.lblNroTramite}" /></td>
										<td style="padding-top: 5px;"><h:inputText
												binding="#{ingSolicitudSimple.txtNroTramite}" disabled="#{ingSolicitudSimple.disableOtroTramite}"
												id="txtNroTramite" maxlength="40" required="#{ingSolicitudSimple.datosTramiteObligatorio}"
												value="#{SessionBean1.solicitudUnitaria.NUME_EXPED_SOLIC}"
												style="width: 190px" tabindex="4" /></td>
										<td style="width: 30px;" />
									</tr>
									<tr>
										<td />
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage11}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNroTramite" id="inlineMessage11"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>


									<tr>
										<td style="padding-top: 5px;"><ui:staticText
												text="#{ingSolicitudSimple.lblDescripcionMotivo}" /></td>
										<td style="padding-top: 5px;"><ui:textArea
												binding="#{ingSolicitudSimple.txtDescripcionMotivo}" disabled="#{ingSolicitudSimple.disableOtroTramite}"
												id="txtDescripcionMotivo" style="width: 190px" tabIndex="5"
												maxLength="200" required="#{ingSolicitudSimple.datosTramiteObligatorioDesc}"
												text="#{SessionBean1.solicitudUnitaria.DES_DELITO}"/></td>
										<td/>
									</tr>
									<tr>
										<td />
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage13}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtDescripcionMotivo" id="inlineMessage13"
												infoClass="infoMessage" warnClass="warnMessage" /></td>
									</tr>

									<!-- FIN -->

									<tr style="height: 30px">
										<td style="font-weight: bold;" colspan="3">Datos de la
											Persona</td>
									</tr>

									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText8}" id="outputText8"
												value="(*)Tipo de documento:" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudSimple.ddTipoDocumento}"
												id="ddTipoDocumento" required="true" style="width: 190px"
												tabindex="6" onchange="validarDocumentoF2();"
												value="#{SessionBean1.solicitudUnitaria.DOCU_IDENT_SOLIC}">
												<f:selectItem itemLabel="--- Seleccione ---" itemValue="-1" />
												<f:selectItems
													binding="#{ingSolicitudSimple.dropdown1SelectItems}"
													id="dropdown1SelectItems"
													value="#{SessionBean1.tiposDocumentoIdentidad.options['codigo_tipo_documento,descripcion']}" />
											</h:selectOneMenu></td>
										<td style="width: 30px;" />
										<td>(*)Nro. de Documento:</td>
										<td><h:inputText alt="Número de documento de Identidad"
												binding="#{ingSolicitudSimple.txtNumrIdentidad}"
												id="txtNumrIdentidad" maxlength="20" required="true"
												style="width: 190px" tabindex="7"
												validator="#{ingSolicitudSimple.txtNumrIdentidad_validate}"
												onchange="validarDocumento();"
												value="#{SessionBean1.solicitudUnitaria.NUME_IDENT_SOLIC}" />
										</td>
									</tr>
									<tr>
										<td ></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage1}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="ddTipoDocumento" id="inlineMessage1"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage2}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNumrIdentidad" id="inlineMessage2"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>

									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText3}" id="outputText3"
												value="Apellido Paterno:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudSimple.txtApellidoPaterno}"
												id="txtApellidoPaterno" maxlength="30" style="width: 190px"
												tabindex="8"
												validator="#{ingSolicitudSimple.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.APLL_PATER_SOLIC}" /></td>
										<td style="width: 30px;" />
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText4}" id="outputText4"
												value="Apellido Materno:" /></td>
										<td><h:inputText
												binding="#{ingSolicitudSimple.txtApellidoMaterno}"
												id="txtApellidoMaterno" maxlength="30" style="width: 190px"
												tabindex="9"
												validator="#{ingSolicitudSimple.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.APLL_MATER_SOLIC}" /></td>
									</tr>

									<tr>
										<td ></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage3}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtApellidoPaterno" id="inlineMessage3"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage4}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtApellidoMaterno" id="inlineMessage4"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>


									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText5}" id="outputText5"
												value="(*)Nombre 1:" /></td>
										<td><h:inputText
												binding="#{ingSolicitudSimple.txtNombre1}" id="txtNombre1"
												maxlength="30" required="true" style="width: 190px"
												tabindex="10"
												validator="#{ingSolicitudSimple.txtNombre_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM1_SOLIC}" /></td>
										<td style="width: 30px;" />
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText6}" id="outputText6"
												value="Nombre 2:" /></td>
										<td><h:inputText
												binding="#{ingSolicitudSimple.txtNombre2}" id="txtNombre2"
												maxlength="30" style="width: 190px" tabindex="11"
												validator="#{ingSolicitudSimple.txtNombre_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM2_SOLIC}" /></td>
									</tr>
									<tr>
										<td ></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage5}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre1" id="inlineMessage5" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage6}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre2" id="inlineMessage6" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText7}" id="outputText7"
												value="Nombre 3:" /></td>
										<td><h:inputText
												binding="#{ingSolicitudSimple.txtNombre3}" id="txtNombre3"
												maxlength="30" style="width: 190px" tabindex="12"
												validator="#{ingSolicitudSimple.txtNombre_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM3_SOLIC}" /></td>
										<td colspan="3"><h:message
												binding="#{ingSolicitudSimple.inlineMessage7}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre3" id="inlineMessage7" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
										<td />
									</tr>
									<tr style="height: 10px">
										<td colspan="5"></td>
									</tr>
									<tr style="height: 23px">
										<td colspan="5" style="font-weight: bold;">
											<h:outputText binding="#{ingSolicitudSimple.outputText9}" id="outputText9" value="Datos de  Nacimiento:" />
										</td>
									</tr>
									<tr style="height: 23px">						
										<td align="left" colspan="5">
											<h:outputText value="Nacido en el extrajero"/>
											<h:selectBooleanCheckbox id="nacidoEnElExtrajero" binding="#{ingSolicitudSimple.checkNacidoEnExtrajero}"
												value="#{SessionBean1.solicitudUnitaria.flagNacidoExterior}" valueChangeListener="#{ingSolicitudSimple.nacidoEnExtranjero}" onchange="submit()" immediate="true"/>
										</td>
									</tr>
									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText10}"
												id="outputText10" value="(*)Lugar de nacimiento:" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudSimple.ddLugar}" id="ddLugar"
												required="true" style="width: 190px" tabindex="13"
												value="#{SessionBean1.solicitudUnitaria.x_CODG_LUGAR_NAC}" rendered="#{!ingSolicitudSimple.verTxtLugarNacimiento}">
												<f:selectItem itemLabel="--- Seleccione ---" itemValue="-1" />
												<f:selectItems
													binding="#{ingSolicitudSimple.dropdown2SelectItems}"
													id="dropdown2SelectItems"
													value="#{SessionBean1.departamentos}" />
											</h:selectOneMenu>
											<h:inputText alt="Ingrese lugar de nacimiento" rendered="#{ingSolicitudSimple.verTxtLugarNacimiento}"
												id="txtLugarNacimiento" maxlength="50" required="true" style="width: 190px" binding="#{ingSolicitudSimple.txtLugarNacimiento}"
												tabindex="13" value="#{SessionBean1.solicitudUnitaria.lugarNacimiento}" />
										</td>
										<td style="width: 30px;" />
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText11}"
												id="outputText11" value="(*)Fecha:" /></td>
										<td><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
												binding="#{ingSolicitudSimple.calFechNacimiento}"
												dateFormatPattern="dd/MM/yyyy" id="calFechNacimiento"
												tabIndex="14" columns="10" required="false"
												selectedDate="#{SessionBean1.solicitudUnitaria.FECH_NACIM_SOLIC}"
												onClick="seleccionRango(this);"
												onBlur="return validarFecha(this);"
												onKeyPress="return formatearFecha(this,event);" /></td>
									</tr>
									<tr>
										<td ></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage8}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="ddLugar" id="inlineMessage8" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" />
											<h:message
												binding="#{ingSolicitudSimple.inlineMessage14}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtLugarNacimiento" id="inlineMessage14" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" />
										</td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage12}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="calFechNacimiento" id="inlineMessage12"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 23px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText12}"
												id="outputText12" value="(**)Nombre Padre:" /></td>
										<td><h:inputText alt="Nombre Padre"
												binding="#{ingSolicitudSimple.txtNomPadre}" id="txtNomPadre"
												maxlength="30" required="true" style="width: 190px"
												tabindex="15"
												validator="#{ingSolicitudSimple.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM_PADRE}" /></td>
										<td style="width: 30px;" />
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText13}"
												id="outputText13" value="(**)Nombre Madre:" /></td>
										<td><h:inputText alt="Nombre Madre"
												binding="#{ingSolicitudSimple.txtNomMadre}" id="txtNomMadre"
												maxlength="30" required="true" style="width: 190px"
												tabindex="16"
												validator="#{ingSolicitudSimple.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM_MADRE}" /></td>
									</tr>

									<tr>
										<td ></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage9}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNomPadre" id="inlineMessage9"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudSimple.inlineMessage10}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNomMadre" id="inlineMessage10"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 35px">
										<td ><h:outputText
												binding="#{ingSolicitudSimple.outputText14}"
												id="outputText14" value="Observaciones:" /></td>
										<td colspan="4"><ui:textArea maxLength="250"
												binding="#{ingSolicitudSimple.txtObservacion}"
												id="txtObservacion" style="width: 480px" tabIndex="17"
												text="#{SessionBean1.solicitudUnitaria.OBSERVACION}" /></td>
									</tr>
									<tr>
										<td colspan="5"><h:message
												binding="#{ingSolicitudSimple.inlineMessage90}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtObservacion" id="inlineMessage90"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 25px">
										<td colspan="4"><h:outputText
												binding="#{ingSolicitudSimple.outputText1}" id="outputText1"
												value="(*)Campos Obligatorios" /></td>
										<td align="left"><ui:button
												action="#{ingSolicitudSimple.btnCancelar_action}"
												binding="#{ingSolicitudSimple.btnCancelar}" id="btnCancelar"
												immediate="true" mini="true" style="width: 58px"
												tabIndex="19" text="Volver" /> <ui:button
												action="#{ingSolicitudSimple.btnGrabar_action}"
												binding="#{ingSolicitudSimple.btnGrabar}" id="btnGrabar"
												mini="true" onClick="return validateAll();"
												style="width: 57px" tabIndex="18" text="Grabar" /> <ui:button
												action="#{ingSolicitudSimple.btnValidarDocumento}"
												binding="#{ingSolicitudSimple.btnValidarDocumento}"
												id="btnValidarDocumento" mini="true" style="display:none;"
												immediate="true" /></td>
									</tr>
									<tr style="height: 23px">
										<td colspan="4"><h:outputText
												binding="#{ingSolicitudSimple.outputText2}" id="outputText2"
												value="(**) Si se desconoce esta información especificar SE DESCONOCE" /></td>
										<td align="right"><ui:staticText
												binding="#{ingSolicitudSimple.staticText1}" id="staticText1"
												style="text-align: right"
												text="#{ingSolicitudSimple.numRegistros} registro(s)" /></td>
									</tr>
									<tr style="height: 5px">
										<td colspan="5"></td>
									</tr>
									
									<tr style="height: 10px" align="center">
										<td colspan="5"><ui:staticText
												style="color: rgb(153, 0, 0); font-size: 13px; font-weight: bold; z-index: 8;background-color: yellow;"
												text="#{ingSolicitudSimple.mensajeValidaExistenciaSolicitud}" /></td>
									</tr>
									
									<tr style="height: 23px">
										<td colspan="5" align="center"><h:messages
												binding="#{ingSolicitudSimple.messageList1}" 
												errorClass="errorMessage" fatalClass="fatalMessage"
												globalOnly="true" id="messageList1" infoClass="infoMessage"
												warnClass="warnMessage" /></td>
									</tr>
									
									<tr>
										<td colspan="5"></td>
									</tr>
									<tr>

										<td colspan="5"><ui:table augmentTitle="false"
												rendered="#{ingSolicitudSimple.numRegistros > 0}"
												width="600" binding="#{ingSolicitudMultiple.table1}"
												id="table11" title="Personas registradas"
												style="display:block;border: none;background:transparent">
												<ui:tableRowGroup
													binding="#{ingSolicitudMultiple.tableRowGroup1}"
													emptyDataMsg="No se han encontrado registros"
													id="tableRowGroup11" rows="10"
													sourceData="#{SessionBean1.solicitudesUnitarias}"
													sourceVar="currentRow">
													<ui:tableColumn align="right" style="width:5px;"
														binding="#{ingSolicitudMultiple.tableColumn1}"
														headerText="Item" id="tableColumn1">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText1}"
															id="staticText1" text="#{currentRow.tableRow.rowId + 1}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn30}"
														headerText="MOTIVO" id="tableColumn30" style="width:80px">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText30}"
															id="staticText30" text="#{currentRow.value['motivo']}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn3}"
														headerText="AP.PATERNO" id="tableColumn3"
														style="width:80px" sort="APLL_PATER_SOLIC">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText3}"
															id="staticText3"
															text="#{currentRow.value['APLL_PATER_SOLIC']}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn2}"
														headerText="AP.MATERNO" id="tableColumn2"
														style="width:80px" sort="APLL_MATER_SOLIC">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText2}"
															id="staticText2"
															text="#{currentRow.value['APLL_MATER_SOLIC']}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn4}"
														style="width:100px" headerText="NOMBRES" id="tableColumn4"
														sort="NOM1_SOLIC">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText4}"
															id="staticText4"
															text="#{currentRow.value['NOM1_SOLIC']} #{currentRow.value['NOM2_SOLIC']} #{currentRow.value['NOM3_SOLIC']}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn7}"
														style="width:100px" headerText="NOM.MADRE"
														id="tableColumn7">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText7}"
															id="staticText7" text="#{currentRow.value['NOM_MADRE']}" />
													</ui:tableColumn>
													<ui:tableColumn
														binding="#{ingSolicitudMultiple.tableColumn8}"
														style="width:100px;" headerText="NOM.PADRE"
														id="tableColumn8">
														<ui:staticText
															binding="#{ingSolicitudMultiple.staticText8}"
															id="staticText8" text="#{currentRow.value['NOM_PADRE']}" />
													</ui:tableColumn>
												</ui:tableRowGroup>
											</ui:table></td>

									</tr>
								</table>
							</td>
						</tr>
					</table>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
