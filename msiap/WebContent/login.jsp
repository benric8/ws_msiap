<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{login.page1}" id="page1">
			<ui:html binding="#{login.html1}" id="html1">
			<ui:head binding="#{login.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Inicio de sesion">
				<ui:link binding="#{login.link1}" id="link1"
					url="/resources/stylesheet.css">
					<f:verbatim>
						<script language="javascript"
							src="${pageContext.request.contextPath}/resources/xp_progress.js" />
						<script language="javascript"
							src="${pageContext.request.contextPath}/javascript/login.js" />
					</f:verbatim>
				</ui:link>
			</ui:head>
			<ui:body binding="#{login.body1}" focus="form1:txtUsuario" id="body1"
				style="background-color: #FFFFFF; -rave-layout: grid">
				<script language="javascript">
                                var bar1= createBar(300,15,'white',1,'black','red',85,7,3,"");
                                bar1.hideBar();
                                function send(){
                                    bar1.showBar();
                                    return true;
                                }
                </script>
				<ui:form binding="#{login.form1}" id="form1">
					<table style="height: 600px; width: 776px" align="center"
						cellpadding="1px" cellspacing="0px" border="0" bgcolor="#EDEDEE">
						<tr>
							<td
								style="height: 42px; width: 100%; background-repeat: no-repeat"
								colspan="5"
								background="${pageContext.request.contextPath}/images/cabecera-MSIAP.gif">
							</td>
						</tr>
						<tr>
							<td rowspan="9"
								style="background-repeat: no-repeat; width:409px; height:100%"
								background="${pageContext.request.contextPath}/images/portada-MSIAP_02.gif">
							</td>
							<td style="height: 20px"></td>
							<td></td>
							<td style="font-weight: bold; color: #770303; font-size: 14px; text-align: right; font-family: sans-serif;"><h:outputText value="#{SessionBean1.version}"/></td>
							<td></td>
						</tr>
						<tr style="height: 120px">
							<td style="width: 15px"></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 75px">
							<td style="width: 15px"></td>
							<td style="width: 161px"></td>
							<td style="width: 161px; text-align: left"><h:graphicImage
								height="60" id="image1" rendered="#{login.renderCaptcha}"
								style="z-index:800" value="/Captcha.jpg" width="149" /></td>
							<td style="width: 30px"></td>
						</tr>
						<tr style="height: 27px">
							<td style="width: 15px"></td>
							<td style="width: 161px; text-align: right"><h:outputText
								rendered="#{login.renderCaptcha}"
								style="color: #000000; font-weight: bold"
								value="Ingrese texto en la imagen:" /></td>
							<td style="width: 161px; text-align: left;"><h:inputText
								binding="#{login.textField1}" id="textField1" tabindex="1"
								style="width: 144px;" required="true"
								rendered="#{login.renderCaptcha}" maxlength="7"/></td>
							<td style="width: 30px"></td>
						</tr>
						<tr style="height: 27px">
							<td style="width: 15px"></td>
							<td style="width: 161px; text-align: right"><h:outputText
								binding="#{login.outputText2}" id="outputText2"
								style="font-weight: bold; color: #000000" value="Usuario:" /></td>
							<td style="width: 161px; text-align: left"><h:inputText
								binding="#{login.txtUsuario}" id="txtUsuario" maxlength="20"
								required="true" style="width: 144px" tabindex="2"
								validator="#{login.txtUsuario_validate}" /></td>
							<td style="width: 30px"></td>
						</tr>
						<tr style="height: 27px">
							<td style="width: 15px"></td>
							<td style="width: 161px; text-align: right"><h:outputText
								binding="#{login.outputText3}" id="outputText3"
								style="font-weight: bold; color: #000000" value="Contraseña:" /></td>
							<td style="width: 161px; text-align: left"><h:inputSecret
								binding="#{login.secContrasenha}" id="secContrasenha"
								maxlength="15" required="true" style="width: 144px" tabindex="3"/></td>
							<td style="width: 30px"></td>
						</tr>
						<tr style="height: 27px">
							<td style="width: 15px"></td>
							<td style="width: 161px"></td>
							<td style="width: 161px; text-align: center"><ui:button
								action="#{login.btnIngresar_action}" onClick="return send();"
								mini="false"
								style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 10px; font-style: normal;	height:21px;  width: 72px"
								tabIndex="4" text="Ingresar..." /></td>
							<td style="width: 30px"></td>
						</tr>
						<tr style="height: 3px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 60px">
							<td colspan="3" style="width: 342px; text-align: center">
							<div style="width: 342px"><h:messages
								binding="#{login.messageList1}" errorClass="errorMessage"
								fatalClass="fatalMessage" id="messageList1"
								infoClass="infoMessage"
								style="color: #770303; height: 48px; width: 338px"
								warnClass="warnMessage" /></div>
							</td>
							<td></td>
						</tr>
					</table>

					<ui:link binding="#{login.link2}" id="link2" />
				</ui:form>
				<!-- inicio erodriguezbu -->
				<ui:form id="recoveryForm">
					<table style="height: 40px; width: 776px" align="center"
							cellpadding="0px" cellspacing="0px" border="0" bgcolor="#EDEDEE">
						<tr align="right" style="height: 27px">
							<td style="font-weight: bold!importand;">
							<h:commandLink value="¿Olvidó su contraseña?" style="font-style: italic;font-size:14px;" 
								action="pages/forgotUsername?faces-redirect=true" />
							</td>
						</tr>
					</table>
				</ui:form>
				<br/>
				<br/>
				<br/>
				<!-- fin erodriguezbu -->
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
