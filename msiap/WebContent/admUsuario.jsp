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
		<ui:page binding="#{admUsuario.page1}" id="page1">
			<ui:html binding="#{admUsuario.html1}" id="html1">
			<ui:head binding="#{admUsuario.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Administración de Usuario">
				<ui:link binding="#{admUsuario.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script binding="#{admUsuario.script1}" id="script1"
					url="/resources/SpryEffects.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/resources/funcionesJavascript.js" />
			</ui:head>
			<ui:body binding="#{admUsuario.body1}" id="body1"
				style="background-color: #fcfbfb; -rave-layout: grid">
				<ui:form binding="#{admUsuario.form1}" id="form1">
					<table style="height:100%; width: 776px" align="center"
						cellpadding= "0px" cellspacing="0px">
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
							<td colspan="2"><ui:staticText		 id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; USUARIO" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>

						<tr style="height: 10px">
							<td colspan="2">
							<fieldset style="width: 760px; align: center"><legend>
							<ui:label binding="#{admUsuario.label1}" id="label1"
								text=" FILTRO DE USUARIOS " /></legend>
							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="6"></td>
								</tr>
								<tr style="height: 18px">
									<td><ui:label binding="#{admUsuario.label3}" id="label3"
										text="Nombres:" /></td>
									<td><ui:textField binding="#{admUsuario.txtNombres}"
										id="Nombres" maxLength="14" tabIndex="1"
										validator="#{admUsuario.txtNombres_validate}" /></td>
									<td style="width: 15px"></td>
									<td><ui:label binding="#{admUsuario.label8}" id="label8"
										text="Entidad Externa:" /></td>
									<td colspan="2"><ui:dropDown
										binding="#{admUsuario.ddEntidadExterna}" id="ddEntidadExterna"
										items="#{SessionBean1.entidadExternas.options['CODG_ENTIDAD_EXTERNA,DESC_ENTIDAD_EXTERNA']}"
										tabIndex="3" style="width:300px;"/></td>
								</tr>
								<tr style="height: 10px" valign="middle" align="left">
									<td></td>
									<td colspan="5"><h:message
										binding="#{admUsuario.messageList1}" errorClass="errorMessage"
										fatalClass="fatalMessage" for="Nombres" id="messageList1"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 18px">
									<td><ui:label binding="#{admUsuario.label4}" id="label4"
										text="Apellidos:" /></td>
									<td><ui:textField binding="#{admUsuario.txtApellidos}"
										id="Apellidos" maxLength="14" tabIndex="2"
										validator="#{admUsuario.txtNombres_validate}" /></td>
									<td style="width: 15px"></td>
									<td><ui:label binding="#{admUsuario.label5}" id="label5"
										text="Perfil:" /></td>
									<td colspan="2"><ui:dropDown
										binding="#{admUsuario.ddPerfil}" id="ddPerfil"
										items="#{admUsuario.ddPerfilDefaultOptions.options}"
										tabIndex="4" /></td>
								</tr>
								<tr style="height: 28px">
									<td><ui:label binding="#{admUsuario.lblDistritoJudicial}"
										id="lblDistritoJudicial" text="Distrito Judicial:" /></td>
									<td colspan="5"><h:selectOneMenu
										binding="#{admUsuario.ddDistritoJudicial}"
										id="ddDistritoJudicial" required="true" tabindex="5">
										<f:selectItems binding="#{admUsuario.dropdown11SelectItems}"
											id="dropdown11SelectItems"
											value="#{SessionBean1.distritoJudicialInterno.options['CODG_DISTRITO_JUDICIAL,DESC_DISTRITO_JUDICIAL']}" />
									</h:selectOneMenu></td>

								</tr>

								<tr style="height: 15px" valign="middle" align="left">
									<td></td>
									<td colspan="5"><h:message
										binding="#{admUsuario.messageList2}" errorClass="errorMessage"
										fatalClass="fatalMessage" for="Apellidos" id="messageList2"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 23px">
									<td colspan="6" align="right"><ui:button
										action="#{admUsuario.filtrar_action}"
										binding="#{admUsuario.cmdFiltrar}" id="cmdFiltrar" mini="true"
										tabIndex="6" text="Filtrar" /> <ui:button
										action="#{admUsuario.nuevo_action}"
										binding="#{admUsuario.cmdNuevo}" id="cmdNuevo" mini="true"
										tabIndex="7" text="Nuevo" /></td>
								</tr>
							</table>
							</fieldset>
							</td>
						</tr>
						<tr style="height: 10px">
							<td colspan="2"></td>
						</tr>
						<tr style="height: 100%">
							<td colspan="2" style="width: 90%" valign="top"><ui:table
								augmentTitle="false" binding="#{admUsuario.table1}"
								clearSortButton="true" id="table1" paginateButton="true"
								paginationControls="true" style="height: 100px; width: 100%;display:block;"
								title="Lista de Usuario" width="776px">
								<ui:tableRowGroup binding="#{admUsuario.tableRowGroup1}"
									emptyDataMsg="No se han encontrado registros"
									id="tableRowGroup1" rows="10"
									sourceData="#{SessionBean1.consultaUsuario}"
									sourceVar="currentRow">
									<ui:tableColumn align="right"
										binding="#{admUsuario.tableColumnCodUsuario}"
										headerText="COD. USUARIO" id="tableColumnCodUsuario"
										style="#{admUsuario.columnStyle}" width="100px">
										<ui:staticText binding="#{admUsuario.staticText8}"
											id="staticText8"
											style="text-align: right; #{admUsuario.color}"
											text="#{currentRow.value['CODG_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn2}"
										headerText="NOMBRE USUARIO" id="tableColumn2"
										sort="NOMB_USUAR" style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText4}"
											id="staticText4" style="#{admUsuario.color}"
											text="#{currentRow.value['NOMB_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn3}"
										headerText="APELLIDO USUARIO" id="tableColumn3"
										sort="APLL_USUAR" style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText3}"
											id="staticText3" style="#{admUsuario.color}"
											text="#{currentRow.value['APLL_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn9}"
										headerText="ENTIDAD EXTERNA" id="tableColumn9"
										sort="DESC_ENTIDAD_EXTERNA" style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText9}"
											id="staticText9" style="#{admUsuario.color}"
											text="#{currentRow.value['DESC_ENTIDAD_EXTERNA']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn13}"
										headerText="DISTRITO JUDICIAL" id="tableColumn13"
										sort="DESC_DISTRITO_JUDICIAL"
										style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText13}"
											id="staticText13" style="#{admUsuario.color}"
											text="#{currentRow.value['DESC_DISTRITO_JUDICIAL']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn14}"
										headerText="ORG.JURISDICCIONAL" id="tableColumn14" sort="DESC_JUZGAD"
										style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText14}"
											id="staticText14" style="#{admUsuario.color}"
											text="#{currentRow.value['DESC_JUZGAD']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn10}"
										headerText="PERFIL" id="tableColumn10" sort="x_perfil"
										style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText10}"
											id="staticText10" style="#{admUsuario.color}"
											text="#{currentRow.value['x_perfil']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admUsuario.tableColumn11}"
										headerText="ESTADO" id="tableColumn11" sort="ESTD_USUAR"
										style="#{admUsuario.columnStyle}">
										<ui:staticText binding="#{admUsuario.staticText11}"
											id="staticText11" style="#{admUsuario.color}"
											text="#{currentRow.value['ESTD_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{admUsuario.tableColumn12}" headerText=""
										id="tableColumn12" style="#{admUsuario.columnStyle}"
										width="50px">
										<ui:button action="#{admUsuario.btnModificar_action}"
											binding="#{admUsuario.btnModificar}" id="btnModificar"
											mini="true" text="Modificar" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{admUsuario.tableColumn15}" headerText=""
										id="tableColumn15" style="#{admUsuario.columnStyle}"
										width="50px">
										<ui:button action="#{admUsuario.btnAuditar_action}"
											binding="#{admUsuario.btnAuditar}" id="btnAuditar"
											mini="true" text="Auditar" />
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
