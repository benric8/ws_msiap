<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

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
 			    		<h:form id="cambioClaveForm">
 			    			
 			    			<h:commandLink action="cerrarSesion">
								<div style="float:right; margin:0 20px 0 0; text-align:center;">
									<h:graphicImage value="/resources/images/home.png" width="42" height="42" styleClass="btninicio"/>
								</div>
							</h:commandLink>
							<h:panelGrid id="panel" columns="2" border="0"
							   cellpadding="10" cellspacing="1" rendered="#{ pwdChange.renderGuardar }">
							      <f:facet name="header">
							         <h:outputText value="#{msg['form.recuperaclave.title']}" />
							      </f:facet>
							      <h:outputLabel value="#{msg['form.recuperaclave.nuevaclave']}" />
							      <h:inputSecret value="#{pwdChange.clave1}" maxlength="15" required="true"
							       validator="#{pwdChange.txtContrasenhaActual_validate}"/>
							      <h:outputLabel value="#{msg['form.recuperaclave.repitaclave']}"/>
							      <h:inputSecret value="#{pwdChange.clave2}" maxlength="15" required="true"
							       validator="#{pwdChange.txtContrasenhaActual_validate}"/>
							</h:panelGrid>
							<h:panelGroup style="display:block; text-align:center">
								<br/>
								<h:commandButton action="#{pwdChange.guardar}" value="Aceptar" 
						 			rendered="#{ pwdChange.renderGuardar }"/>&nbsp;
						 		<h:commandButton action="cerrarSesion" value="Cancelar" immediate="true"/>
							</h:panelGroup>
				    	</h:form>
				    	<h:messages showSummary="true" showDetail="false" style="color: red"/>
 			    		</f:view>
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