<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
<html>
<f:loadBundle basename="uif.Bundle" var="msg" />
		<head>
		<title>Recuperar credenciales</title>
		<style type="text/css">
			body {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 14px;
			}
			.header {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 18px;
			}
			.bottom {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 9px;
				  text-align: center;
				  vertical-align: middle;
				  color: #8E969D;
			}
		</style>
		</head>

<body bgcolor="#ffffff">
<table style="border:1px solid #CAD6E0"  align="center" cellpadding="0" cellspacing="0" border="0" width="776">
<tbody>

	<tr>
		<td class="header" height="42" align="center" valign="middle" width="100%" bgcolor="#E4EBEB">
				<IMG alt="" src="/msiap/images/cabecera-MSIAP.gif" />
		</td>
	</tr>
	<tr>
		<td height="1" width="100%" bgcolor="#CAD6E0"></td>
	</tr>	

	<tr>
		<td width="100%"  colspan="2">
			<table width="100%" style="height:150px" align="left" cellpadding="0" cellspacing="0" border="0">
			<tbody>
				<tr>
					<td align="center" width="100%" valign="middle">
 			    		<f:view>
 			    		<br/>
 			    		<br/>
 			    		<h:messages showSummary="true" showDetail="false" style="color: red"/>
 			    		<h:form id="recordarCredencialesForm">
 			    			<h:commandLink action="cerrarSesion" immediate="true">
								<div style="float:right; margin:0 20px 0 0; text-align:center;">
									<h:graphicImage value="/resources/images/home.png" width="42" height="42" styleClass="btninicio"/>
								</div>
							</h:commandLink>
							<h:panelGrid id="panel" columns="2" border="0" cellpadding="10" cellspacing="1"
								rendered="#{ !recovery.renderEnviarMail }">
							    <h:outputText value=" "/>
							    <h:graphicImage value="/Captcha.jpg" width="165"/>
							    
							    <h:outputText value="#{msg['form.recuperaClave.captcha']} "/>
						    	<h:inputText value="#{recovery.textoCaptcha}" maxlength="7" required="true"
						    	requiredMessage="Ingrese código captcha"/>
						    	
						    	<h:outputText value="#{msg['form.recuperaClave.txtUsuario']} "/>
						    	<h:inputText value="#{recovery.txtUsuario}" maxlength="10" required="true"
						    	validator="#{recovery.txtUsuario_validate}" requiredMessage="Ingrese usuario"/>
									
								<h:outputText value="#{msg['form.recuperaclave.email']} "/>
						    	<h:inputText value="#{recovery.email}" required="true" maxlength="100"
						    	requiredMessage="Ingrese correo electrónico"/>
							</h:panelGrid>
							
							<div style="text-align: center; margin: 25px 50px;">
						 		<h:commandButton action="#{recovery.enviar}" value="Enviar" rendered="#{ !recovery.renderEnviarMail }" 
						 		style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-style: normal;	height:21px;  width: 72px"/>&nbsp;
						 		<h:commandButton action="cerrarSesion" value="Regresar" immediate="true"
						 		style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-style: normal;	height:21px;  width: 72px"/>
						 	</div> 
						 	<br/>
						 	<p>
								<span style="color: #8A0808;" >
									<h:outputText id="idTexto"  value="#{msg['form.recuperaclave.message.sucess']}" 
										rendered="#{ recovery.renderEnviarMail }" />
								</span>
							</p>
				    	</h:form>
 			    		</f:view>
					</td>
				</tr>
				<tr>
					<td style="font:Verdana; font-size: 12px; padding: 10px;" >
					<p><STRONG>T&eacute;rminos y condiciones:</STRONG> El usuario debe de encontrarse activo. El correo electr&oacute;nico que declare
					debe coincidir con el correo se&ntilde;alado en su perfil de usuario, el cual debe ser un correo de uso corporativo. Validada la solicitud
					 de nueva contrase&ntilde;a, se enviar&aacute; un enlace de acceso a su correo institucional en el cual le permitir&aacute; declarar una 
					 contrase&ntilde;a personal para acceder al MSIAP.</p>
					 <br/>
					</td>
				</tr>
			</tbody>
			</table>
		</td>
	</tr>	
	
	<tr>
		<td colspan="2"  valign="bottom" height="1" width="100%" bgcolor="#CAD6E0"></td>
	</tr>
</tbody>
</table>
</body>
		
</html>