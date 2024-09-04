<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jstl/core_rt"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{admSolicitudInterna.page1}" id="page1">
			<ui:html binding="#{admSolicitudInterna.html1}" id="html1">
			<ui:head binding="#{admSolicitudInterna.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Inicio">
				<ui:link binding="#{admSolicitudInterna.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script binding="#{admSolicitudInterna.script1}" id="script1"
					url="/resources/SpryEffects.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/resources/funcionesJavascript.js" />

			</ui:head>
			<ui:body binding="#{admSolicitudInterna.body1}" id="body1"
				style="background-color: #fcfbfb; -rave-layout: grid">
				<ui:form binding="#{admSolicitudInterna.form1}" id="form1">
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
								binding="#{admSolicitudInterna.staticText6}" id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; INICIO" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2">
							<fieldset style="width: 685px; align: center"><legend><ui:label
								binding="#{admSolicitudInterna.label1}" id="label"
								text=" Buscar Solicitudes por:  " /></legend>

							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="7"></td>
								</tr>
								
								<c:if test="${SessionBean1.usuario.COD_PERFIL eq'30'}">
									<tr style="height: 23px">
										<td style="width:  120px"><ui:label
											id="lblDistritoJudicial" text="Usuario" /></td>
										<td style="width: 10px">:</td>
										<td style="width: 250px"><ui:dropDown
											binding="#{admSolicitudInterna.ddUsuarios}" id="ddUsuarios"
											items="#{SessionBean1.usuarioDistritoJudicial.options['CODG_USUAR,APELLIDOSNOMBRES']}"
											style="width: 200px" tabIndex="2" /></td>
										<td style="width: 25px"></td>
										<td style="width: 120px"></td>
										<td style="width: 10px"></td>
										<td style="width: 150px"></td>
									</tr>
								</c:if>
								
								<c:if test="${SessionBean1.usuario.COD_PERFIL eq'25'}">
									<tr style="height: 23px">
										<td style="width:  120px"><ui:label
											id="lblDistritoJudicial" text="Distrito Jud." /></td>
										<td style="width: 10px">:</td>
										<td style="width: 250px"><h:selectOneMenu
											onchange="submit()"
											valueChangeListener="#{admSolicitudInterna.valorCombo}"
											binding="#{admSolicitudInterna.ddDistritoJudicial}"
											id="ddDistritoJudicial" required="true" tabindex="1">
											<f:selectItems 
												binding="#{admSolicitudInterna.dropdown11SelectItems}"
												id="dropdown11SelectItems"
												value="#{SessionBean1.distritoJudicialInterno.options['CODG_DISTRITO_JUDICIAL,DESC_DISTRITO_JUDICIAL']}" />
										</h:selectOneMenu></td>
										<td style="width: 25px"></td>
										<td style="width: 120px"><ui:label id="lblUsuario"
											text="Usuario" /></td>
										<td style="width: 10px">:</td>
										<td style="width: 150px"><ui:dropDown
											binding="#{admSolicitudInterna.ddUsuarios}" id="ddUsuarios"
											items="#{SessionBean1.usuarioDistritoJudicial.options['CODG_USUAR,APELLIDOSNOMBRES']}"
											style="width: 200px" tabIndex="2" /></td>
									</tr>
								</c:if>

								<tr style="height: 23px">
									<td style="width:  120px"><ui:label
										binding="#{admSolicitudInterna.label3}" id="label3"
										text="Apellido Paterno" /></td>
									<td style="width: 10px">:</td>
									<td style="width: 250px"><ui:textField
										binding="#{admSolicitudInterna.txtPaterno}" id="txtPaterno"
										maxLength="50" tabIndex="3"
										validator="#{admSolicitudInterna.txtNombres_validate}" /></td>
									<td style="width: 25px"></td>
									<td style="width: 120px"><ui:label
										binding="#{admSolicitudInterna.label9}" id="label9"
										text="Nro. de Certificado" /></td>
									<td style="width: 10px">:</td>
									<td style="width: 150px"><ui:textField
										binding="#{admSolicitudInterna.txtNroSolicitud}"
										id="txtNroSolicitud" tabIndex="6" maxLength="14" /></td>
								</tr>

								<tr valign="middle" align="center">
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{admSolicitudInterna.messageList2}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtPaterno" id="messageList2" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{admSolicitudInterna.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNroSolicitud" id="messageList1"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>

								</tr>


								<tr style="height: 23px">
									<td style="width:  120px"><ui:label
										binding="#{admSolicitudInterna.label6}" id="label6"
										text="Apellido Materno" /></td>
									<td style="width:  10px">:</td>
									<td style="width:  250px"><ui:textField
										binding="#{admSolicitudInterna.txtMaterno}" id="txtMaterno"
										maxLength="50" tabIndex="4"
										validator="#{admSolicitudInterna.txtNombres_validate}" /></td>
									<td style="width: 25px"></td>
									<td style="width:  120px"><ui:label
										binding="#{admSolicitudInterna.label8}" id="label8"
										text="Nro. doc. autoriza" /></td>
									<td style="width:  10px">:</td>
									<td style="width:  150px"><ui:textField
										binding="#{admSolicitudInterna.txtNroExpdiente}"
										id="txtNroExpdiente" maxLength="30" tabIndex="7" /></td>
								</tr>

								<tr valign="middle" align="center">
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{admSolicitudInterna.messageList3}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtMaterno" id="messageList3" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{admSolicitudInterna.messageList4}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNroExpdiente" id="messageList4"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>

								</tr>

								<tr style="height: 23px">
									<td style="width:  120px"><ui:label
										binding="#{admSolicitudInterna.label7}" id="label7"
										text="Nombres " /></td>
									<td style="width:  10px">:</td>
									<td style="width:  250px"><ui:textField
										binding="#{admSolicitudInterna.txtNombres}" id="txtNombres"
										maxLength="50" tabIndex="5"
										validator="#{admSolicitudInterna.txtNombres_validate}" /></td>
									<td style="width: 25px"></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>

								<tr valign="middle" align="center">
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{admSolicitudInterna.messageList5}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNombres" id="messageList5" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>

								</tr>

								<tr style="height: 23px">
									<td style="width:  120px"><ui:label
										binding="#{admSolicitudInterna.label2}" id="label2"
										text="Fecha " /></td>
									<td style="width:  10px">:</td>
									<td colspan="4">
									<table>
										<tr>
											<td><ui:label binding="#{admSolicitudInterna.label4}"
												id="label4" text="Desde:" /></td>
											<td style="width: 10px"></td>
											<td><ui:label binding="#{admSolicitudInterna.label5}"
												id="label5" text="Hasta:" /></td>
										</tr>
										<tr>
											<td><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
												binding="#{admSolicitudInterna.calDesde}" columns="10"
												dateFormatPattern="dd/MM/yyyy" id="calDesde" tabIndex="8"
												onClick="seleccionRango(this);"
												onBlur="return validarFecha(this);"
												onKeyPress="return formatearFecha(this,event);"
												validator="#{admSolicitudInterna.calDesde_validate}" /></td>
											<td style="width: 10px"></td>
											<td><ui:calendar dateFormatPatternHelp="dd/mm/aaaa" binding="#{admSolicitudInterna.calHasta}" columns="10"
												dateFormatPattern="dd/MM/yyyy" id="calHasta" tabIndex="9"
												onClick="seleccionRango(this);"	onBlur="return validarFecha(this);"
												onKeyPress="return formatearFecha(this,event);" /></td>
										</tr>

									</table>
									</td>
								</tr>
								<tr style="height: 10px">
									<td colspan="7"></td>
								</tr>

								<tr style="height: 23px">
									<td colspan="7">
									<table>
										<tr>
											<td><h:selectBooleanCheckbox tabindex="10"
												binding="#{admSolicitudInterna.checkPenImp}">Pendiente de Impresión</h:selectBooleanCheckbox></td>
											<td style="width: 20px"></td>
											<td><h:selectBooleanCheckbox tabindex="11"
												binding="#{admSolicitudInterna.checkImp}">Impresos</h:selectBooleanCheckbox></td>
											<td style="width: 20px"></td>
											<td><h:selectBooleanCheckbox tabindex="12"
												binding="#{admSolicitudInterna.checkObs}">Observados</h:selectBooleanCheckbox></td>
											<td style="width: 200px" align="right"><ui:button
												action="#{admSolicitudInterna.buscar_action}"
												binding="#{admSolicitudInterna.button2}" id="button2"
												mini="true" tabIndex="13" text="Buscar" /></td>
											<td align="right"><ui:button
												action="#{admSolicitudInterna.btnNuevo_action}"
												binding="#{admSolicitudInterna.btnNuevo}" id="btnNuevo"
												mini="true" tabIndex="14" text="Nuevo" /></td>

										</tr>
									</table>
									</td>
								</tr>
							</table>
							</fieldset>
							</td>
						</tr>
						<tr style="height: 30px" valign="middle" align="center">
							<td colspan="2" valign="middle"><h:messages
								binding="#{admSolicitudInterna.messageList6}"
								errorClass="errorMessage" fatalClass="fatalMessage"
								id="messageList6" infoClass="infoMessage"
								warnClass="warnMessage" /></td>
						</tr>

						<tr style="height: 10px">
							<td colspan="2"></td>
						</tr>
						<tr style="height: 100%">
							<td style="width: 90%" valign="top"><ui:table
								cellPadding="0" cellSpacing="0" augmentTitle="false"
								binding="#{admSolicitudInterna.table1}" clearSortButton="true"
								id="table1" paginateButton="true" paginationControls="true"
								style="height: 100px; width: 776px;display:block;"
								title="Lista de Solicitudes" width="776px">
								<ui:tableRowGroup
									binding="#{admSolicitudInterna.tableRowGroup1}"
									emptyDataMsg="No se han encontrado registros"
									id="tableRowGroup1" rows="10"
									sourceData="#{SessionBean1.solicitudInterna}"
									sourceVar="currentRow">
									<ui:tableColumn align="right" visible="false"
										binding="#{admSolicitudInterna.tableColumnCodCerti}"
										headerText="" id="tableColumnCodCerti"
										style="#{admSolicitudInterna.columnStyle}">
										<ui:staticText binding="#{admSolicitudInterna.staticText10}"
											id="staticText10"
											style="text-align: right; #{admSolicitudInterna.color}"
											text="#{currentRow.value['CODG_CERTI']}" />
									</ui:tableColumn>
									<ui:tableColumn align="right"
										binding="#{admSolicitudInterna.tableColumnNroSolicit}"
										headerText="Nro.Certi" id="tableColumnNroSolicit"
										style="#{admSolicitudInterna.columnStyle}" width="60px">
										<ui:staticText binding="#{admSolicitudInterna.staticText8}"
											id="staticText8"
											style="text-align: right; #{admSolicitudInterna.color}"
											text="#{currentRow.value['NUME_CERTI']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudInterna.tableColumn2}"
										headerText="Apellidos y Nombres" id="tableColumn2"
										sort="NOMBRECOMPLETO"
										style="#{admSolicitudInterna.columnStyle}" width="180px">
										<ui:staticText binding="#{admSolicitudInterna.staticText4}"
											id="staticText4" style="#{admSolicitudInterna.color}"
											text="#{currentRow.value['NOMBRECOMPLETO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudInterna.tableColumn3}"
										headerText="Nº.Exp." id="tableColumn3"
										sort="NUME_EXPED_SOLIC"
										style="#{admSolicitudInterna.columnStyle}" width="100px">
										<ui:staticText binding="#{admSolicitudInterna.staticText3}"
											id="staticText3" style="#{admSolicitudInterna.color}"
											text="#{currentRow.value['NUME_EXPED_SOLIC']}" />
									</ui:tableColumn>
									<c:if test="${SessionBean1.usuario.COD_PERFIL ne'20'}">
										<ui:tableColumn align="center"
											binding="#{admSolicitudInterna.tableColumn5}"
											headerText="Magistrado/Sec" id="tableColumn5"
											sort="NOMB_JUZGA_SOLIC" width="180px"
											style="#{admSolicitudInterna.columnStyle}">
											<ui:staticText binding="#{admSolicitudInterna.staticText2}"
												id="staticText2" style="#{admSolicitudInterna.color}"
												text="#{currentRow.value['NOMB_JUZGA_SOLIC']}" />
										</ui:tableColumn>
									</c:if>
									<ui:tableColumn binding="#{admSolicitudInterna.tableColumn7}"
										headerText="Fech.Envio" id="tableColumn7"
										sort="FECH_DIGIT_SOLIC"
										style="#{admSolicitudInterna.columnStyle}" width="100px">
										<c:if test="#{currentRow.value['FECH_DIGIT_SOLIC'] != null}">
											<fmt:formatDate pattern="dd/MM/yyyy"
												value="#{currentRow.value['FECH_DIGIT_SOLIC']}" />
										</c:if>
										<ui:staticText binding="#{admSolicitudInterna.staticText7}"
											converter="#{admSolicitudInterna.dateTimeConverter1}"
											id="staticText7" style="#{admSolicitudInterna.color}"
											text="#{currentRow.value['FECH_DIGIT_SOLIC']}" />
									</ui:tableColumn>

									<ui:tableColumn align="center"
										binding="#{admSolicitudInterna.tableColumn6}"
										headerText="Estado" id="tableColumn6"
										sort="CODG_ESTADO_SOLICITUD" width="80px"
										style="#{admSolicitudInterna.columnStyle}">
										<ui:staticText binding="#{admSolicitudInterna.staticText5}"
											id="staticText5" style="#{admSolicitudInterna.color}"
											text="#{currentRow.value['ESTADO_SOLICITUD_SIMPLE']}" />
									</ui:tableColumn>

									<ui:tableColumn binding="#{admSolicitudInterna.tableColumn11}"
										headerText="" id="tableColumn11" width="18px"
										style="#{admSolicitudInterna.columnStyle}">
										<ui:button action="#{admSolicitudInterna.btnImpVer_action}"
											binding="#{admSolicitudInterna.btnVerA}" id="btnVerA"
											mini="true" imageURL="/images/pre_print_view.png"
											toolTip="Vista Previa de Impresión" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudInterna.tableColumn12}"
										headerText="" id="tableColumn12" width="18px"
										style="#{admSolicitudInterna.columnStyle}">
										<ui:button action="#{admSolicitudInterna.btnImp_action}"
											binding="#{admSolicitudInterna.btnVerB}" id="btnVerB"
											mini="true" imageURL="/images/print.png"
											toolTip="Impresión de Certificado" />
									</ui:tableColumn>
									<c:if test="${SessionBean1.usuario.COD_PERFIL ne '40'}">
									<ui:tableColumn align="center"
										binding="#{admSolicitudInterna.tableColumn1}" headerText=""
										id="tableColumn1" style="#{admSolicitudInterna.columnStyle}"
										width="18px">
										<ui:button
											action="#{admSolicitudInterna.btnVerDetalle_action}"
											binding="#{admSolicitudInterna.btnVerDetalle}"
											id="btnVerDetalle" mini="true"
											imageURL="/images/pre_view.png"
											toolTip="Visualización de la Solicitud Ingresada" />
									</ui:tableColumn>
									</c:if>
									<ui:tableColumn align="center"
										binding="#{admSolicitudInterna.tableColumn4}" headerText=""
										id="tableColumn4" style="#{admSolicitudInterna.columnStyle}"
										width="18px">
										<ui:button action="#{admSolicitudInterna.btnAuditoria_action}"
											binding="#{admSolicitudInterna.btnAuditoria}"
											id="btnAuditoria" mini="true"
											imageURL="/images/audit.png"
											toolTip="Visualización del Seguimiento de la Solicitud" />
									</ui:tableColumn>
								</ui:tableRowGroup>
							</ui:table></td>
						</tr>
					</table>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
