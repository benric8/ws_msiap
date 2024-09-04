<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{auditoria.page1}" id="page1">
			<ui:html binding="#{auditoria.html1}" id="html1">
			<ui:head binding="#{auditoria.head1}" id="head1" title="#{SessionBean1.nombreApp} - Auditoria">
				<ui:link binding="#{auditoria.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
			</ui:head>
			<ui:body binding="#{auditoria.body1}" id="body1"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">
				<ui:form binding="#{auditoria.form1}" id="form1">
					<table style="height:100%" width="776px" align="center"
						cellpadding="0px" cellspacing="0px">
						<tr>
							<td colspan="3"><f:subview id="header">
								<div><jsp:directive.include file="header.jspf" /></div>
							</f:subview></td>
						</tr>
						<tr style="height: 15px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td><ui:button action="#{auditoria.btnVolver_action}"
								binding="#{auditoria.btnVolver}" id="btnVolver" mini="true"
								text="Volver"/></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 15px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td valign="top">
								<ui:table augmentTitle="false"
								binding="#{auditoria.tbMovimientos}" id="tbMovimientos" style="display:block"
								title="Detalles de auditoria. Solicitud Nro #{SessionBean1.solicitudExterna.CODG_CERTI_EXTERNO}"
								>
								<ui:tableRowGroup binding="#{auditoria.tableRowGroup1}"
									groupToggleButton="true" headerText="Procesos"
									id="tableRowGroup1" rows="4"
									sourceData="#{SessionBean1.registrosAuditoriaExterna}"
									sourceVar="currentRow">
									<ui:tableColumn binding="#{auditoria.tableColumn1}"
										headerText="#" id="tableColumn1" sort="CODG_CORRELATIVO"
										style="width:20px" width="23">
										<ui:staticText binding="#{auditoria.staticText1}"
											id="staticText1"
											text="#{currentRow.value['CODG_CORRELATIVO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn3}"
										headerText="Usuario" id="tableColumn3" sort="CODG_USUAR"
										style="width:100px" width="100">
										<ui:staticText binding="#{auditoria.staticText3}"
											id="staticText3" text="#{currentRow.value['CODG_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn2}"
										headerText="Fecha" id="tableColumn2" sort="FECH_ACCION"
										style="width:100px" width="101">
										<ui:staticText binding="#{auditoria.staticText2}"
											converter="#{auditoria.dateTimeConverter1}" id="staticText2"
											text="#{currentRow.value['FECH_ACCION']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn4}"
										headerText="Acción" id="tableColumn4" sort="DESC_ACCION"
										style="width:160px" width="161">
										<ui:staticText binding="#{auditoria.staticText4}"
											id="staticText4" text="#{currentRow.value['DESC_ACCION']}" />
									</ui:tableColumn>
								</ui:tableRowGroup>
								<!-- erodriguezbu -->
								<br/>
								</ui:table>
								<ui:table augmentTitle="false" binding="#{auditoria.tbMovimientos2}" id="tbMovimientos2" style="display:block">
								<ui:tableRowGroup binding="#{auditoria.tableRowGroup2}"
									groupToggleButton="true"
									headerText="Registros incluidos en la solicitud"
									id="tableRowGroup2" rows="6"
									sourceData="#{SessionBean1.estadoSolicitudes}"
									sourceVar="currentRow2" >
									<ui:tableColumn binding="#{auditoria.tableColumn9}"
										headerText="#" id="tableColumn9" sort="NOM3_SOLIC"
										style="width:20px" >
										<ui:staticText binding="#{auditoria.staticText9}"
											id="staticText9" text="#{currentRow2.tableRow.rowId + 1}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn6}"
										headerText="APE. PATERNO" id="tableColumn6"
										sort="APLL_PATER_SOLIC" style="width:100px">
										<ui:staticText binding="#{auditoria.staticText6}"
											id="staticText6"
											text="#{currentRow2.value['APLL_PATER_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn5}"
										headerText="APE. MATERNO" id="tableColumn5"
										sort="APLL_MATER_SOLIC" style="width:100px">
										<ui:staticText binding="#{auditoria.stApeMaterno}"
											id="stApeMaterno"
											text="#{currentRow2.value['APLL_MATER_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn7}"
										headerText="NOMBRES" id="tableColumn7" sort="NOM1_SOLIC"
										style="width:160px">
										<ui:staticText binding="#{auditoria.staticText7}"
											id="staticText7"
											text="#{currentRow2.value['NOM1_SOLIC']} #{currentRow2.value['NOM2_SOLIC']} #{currentRow2.value['NOM3_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{auditoria.tableColumn10}"
										headerText="ESTADO SOLICITUD" id="tableColumn10"
										sort="DESC_ESTADO_SOLICITUD" width="105">
										<ui:staticText binding="#{auditoria.staticText10}"
											id="staticText10"
											text="#{currentRow2.value['DESC_ESTADO_SOLICITUD']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{auditoria.tableColumn11}" id="tableColumn11"
										width="50">
										<ui:button action="#{auditoria.btnSeguimiento_action}"
											binding="#{auditoria.btnSeguimiento}" id="btnSeguimiento"
											mini="true" text="Seguimiento" />
									</ui:tableColumn>
								</ui:tableRowGroup>
							</ui:table></td>
							<td style="width: 3px"></td>
							<td style="width: 234px" valign="top">
							<table cellpadding="0px" cellspacing="1px">
								<tr>
									<td><ui:staticText binding="#{auditoria.staticText11}"
										escape="false" id="staticText11"
										text="&lt;b&gt;SEGUIMIENTO:&lt;/b&gt;" /></td>
								</tr>
								<tr>

									<td style="width: 234px; height: 168px; background-color: rgb(204, 204, 204); vertical-align: top;">
									<ui:textArea binding="#{auditoria.taSeguimiento}" readOnly="true"  id="taSeguimiento"
										style="background-color: rgb(204, 204, 204); height: 168px; width: 192px"/></td>
								</tr>
								<tr>
									<td><ui:staticText binding="#{auditoria.staticText8}"
										escape="false" id="staticText8"
										style="height: 24px; width: 234px"
										text="&lt;b&gt;FORMATO:&lt;/b&gt;&lt;br/&gt;&#xa;Fecha y hora, usuario, Estado&lt;br/&gt;&lt;br/&gt;&#xa;&lt;b&gt;LEYENDA:&lt;br/&gt;&#xa;REG&lt;/b&gt;: Registrado&lt;br/&gt;&#xa;&lt;b&gt;AUT&lt;/b&gt;: Autorizado para impresión&lt;br/&gt;&#xa;&lt;b&gt;DES&lt;/b&gt;: Descarte realizado&lt;br/&gt;&#xa;&lt;b&gt;IMP&lt;/b&gt;: Impreso&#xa;" />
									</td>
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
