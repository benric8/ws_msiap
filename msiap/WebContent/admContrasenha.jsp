<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{admContrasenha.page1}" id="page1">
			<ui:html binding="#{admContrasenha.html1}" id="html1">
			<ui:head binding="#{admContrasenha.head1}" id="head1" title="#{SessionBean1.nombreApp} - Cambio de Contraseña">
				<ui:link binding="#{admContrasenha.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
			</ui:head>
			<ui:body binding="#{admContrasenha.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{admContrasenha.form1}" id="form1">

					<table style="height:100%; width: 776px" align="center"
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
							<td colspan="4"><ui:staticText
								binding="#{admContrasenha.staticText1}" id="staticText1"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; CAMBIAR CONTRASEÑA" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="4" valign="top">
							<table cellspacing="1px" border="0px">
								<tr>
									<td style="width: 140px"><h:outputText
										binding="#{admContrasenha.outputText4}" id="outputText4"
										value="Contraseña Actual:" /></td>
									<td style="width: 210px"><ui:passwordField
										binding="#{admContrasenha.txtContrasenhaActual}" columns="14"
										id="txtContrasenhaActual" maxLength="15" required="true"
										tabIndex="1"
										validator="#{admContrasenha.txtContrasenhaActual_validate}" /></td>
									<td colspan="2"><h:message
										binding="#{admContrasenha.inlineMessage1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtContrasenhaActual" id="inlineMessage1"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /> <h:messages
										binding="#{admContrasenha.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										globalOnly="true" id="messageList1" infoClass="infoMessage"
										warnClass="warnMessage" /></td>
								</tr>
								<tr>
									<td style="width: 140px"><h:outputText
										binding="#{admContrasenha.outputText5}" id="outputText5"
										value="Nueva Contraseña:" /></td>
									<td style="width: 210px"><ui:passwordField
										binding="#{admContrasenha.txtNuevaContrasenha}" columns="14"
										id="txtNuevaContrasenha" maxLength="15" required="true"
										tabIndex="2"
										validator="#{admContrasenha.txtContrasenhaNueva_validate}" /></td>
									<td colspan="2"><h:message
										binding="#{admContrasenha.inlineMessage2}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNuevaContrasenha" id="inlineMessage2"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>

								</tr>
								<tr>
									<td style="width: 140px"><h:outputText
										binding="#{admContrasenha.outputText6}" id="outputText6"
										value="Confirmar Contraseña:" /></td>
									<td style="width: 210px"><ui:passwordField
										binding="#{admContrasenha.txtConfirmacionContrasenha}"
										columns="14" id="txtConfirmacionContrasenha" maxLength="15"
										required="true" tabIndex="3"
										validator="#{admContrasenha.txtContrasenhaNueva_validate}" /></td>
									<td colspan="2"><h:message
										binding="#{admContrasenha.inlineMessage3}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtConfirmacionContrasenha" id="inlineMessage3"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<!-- <tr>
									<td style="width: 140px"><ui:label
										binding="#{admContrasenha.label1}" for="txtCorreoElectronico"
										id="label1" labelLevel="3" text="Correo Electrónico:" /></td>
									<td style="width: 210px"><ui:textField
										binding="#{admContrasenha.txtCorreoElectronico}"
										id="txtCorreoElectronico" maxLength="40" required="true"
										style="width: 192px" tabIndex="4"
										validator="#{admContrasenha.txtCorreoElectronico_validate}" />
									</td>
									<td colspan="2"><h:message
										binding="#{admContrasenha.inlineMessage4}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtCorreoElectronico" id="inlineMessage4"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>-->
								<tr><td colspan="3"/></tr>
								<tr>
									<td style="width: 140px"></td>
									<td align="right" style="width: 210px"><ui:button
										action="#{admContrasenha.btnCambiar_action}"
										binding="#{admContrasenha.btnCambiar}" id="btnCambiar"
										mini="true" style="width: 120px" tabIndex="5"
										text="Cambiar contraseña" /></td>
										<td></td>
										<td style="width: 346px" ></td>

								</tr>
								<tr style="height: 10px">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>

								<tr>
									<td colspan="4"><!-- ui:staticText
										binding="#{admContrasenha.staticText2}" id="staticText2"
										text="Nota: En caso de bloqueo de cuenta por intentos de acceso fallidos se enviará al correo electrónico indicado una nueva contraseña" /--></td>

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
