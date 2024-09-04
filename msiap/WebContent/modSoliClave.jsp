<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{modSoliClave.page1}" id="page1">
			<ui:html binding="#{modSoliClave.html1}" id="html1">
			<ui:head binding="#{modSoliClave.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Inicio de sesion">
				<ui:link binding="#{modSoliClave.link1}" id="link1"
					url="/resources/stylesheet.css">					
				</ui:link>
			</ui:head>
			<ui:body binding="#{modSoliClave.body1}" focus="form1:txtUsuario" id="body1"
				style="background-color: #FFFFFF; -rave-layout: grid">
			
				<ui:form binding="#{modSoliClave.form1}" id="form1">
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
								text="&gt; Modificar Solicitud" /></td>
						</tr>

						<tr>
							<td colspan="2">

							<table>
								<tr style="height: 27px">

									<td style="width: 161px; text-align: right"><h:outputText
										binding="#{modSoliClave.outputText2}" id="outputText2"
										style="font-weight: bold; color: #000000" value="Usuario:" /></td>
									<td style="width: 161px; text-align: left"><h:inputText
										binding="#{modSoliClave.txtUsuario}" id="txtUsuario" maxlength="20"
										required="true" style="width: 144px" tabindex="1"
										validator="#{modSoliClave.txtUsuario_validate}" /></td>

								</tr>
								<tr style="height: 27px">

									<td style="width: 161px; text-align: right"><h:outputText
										binding="#{modSoliClave.outputText3}" id="outputText3"
										style="font-weight: bold; color: #000000" value="Contraseña:" /></td>
									<td style="width: 161px; text-align: left"><h:inputSecret
										binding="#{modSoliClave.secContrasenha}" id="secContrasenha"
										maxlength="20" required="true" style="width: 144px"
										tabindex="2" validator="#{modSoliClave.secContrasenha_validate}" /></td>

								</tr>
								<tr style="height: 27px">

									<td style="width: 161px"></td>
									<td style="width: 161px; text-align: center"><ui:button
										action="#{modSoliClave.btnModificar_action}" 
										mini="false"
										style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 10px; font-style: normal;	height:21px;  width: 72px"
										tabIndex="3" text="Ingresar..." /></td>
									<td style="width: 161px">
									<ui:button action="#{ingSolicitudInterna.btnCancelar_action}"
										binding="#{ingSolicitudInterna.btnCancelar}" id="btnCancelar"
										immediate="true" mini="true" style="width: 58px" tabIndex="16"
										text="Cancelar" />
									</td>


								</tr>
								<tr style="height: 3px">

									<td></td>
									<td></td>
								</tr>
								<tr style="height: 60px">
									<td colspan="2" style="width: 342px; text-align: center">
									<div style="width: 342px"><h:messages
										binding="#{modSoliClave.messageList1}" errorClass="errorMessage"
										fatalClass="fatalMessage" id="messageList1"
										infoClass="infoMessage"
										style="color: #770303; height: 48px; width: 338px"
										warnClass="warnMessage" /></div>
									</td>

								</tr>
							</table>
							</td>
						</tr>
					</table>

					<ui:link binding="#{modSoliClave.link2}" id="link2" />

				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
