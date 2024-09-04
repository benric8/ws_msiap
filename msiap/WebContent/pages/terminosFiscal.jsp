<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
<html>
<f:loadBundle basename="uif.Bundle" var="msg" />
		<head>
		<title>Aceptación de términos y condiciones</title>
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
					<td width="100%" valign="middle" style="font:Verdana; font-size: 12px; padding: 10px;">
 			    		<f:view>
 			    		<br/>
 			    		<h:messages showSummary="true" showDetail="false" style="color: red"/>
 			    		<h:form id="recordarCredencialesForm">
							<!-- Inicio términos -->
<div style="text-align:center;font-weight:bold">TÉRMINOS LEGALES Y CONDICIONES DE ACCESO AL MODULO DE SOLICITUD DE ANTECEDENTES PENALES - MSIAP</div>
<p>
<br/>Estimado usuario: <STRONG><h:outputText value="#{terminos.nombres}"/></STRONG><br/><br/>
Los presentes términos legales y condiciones de uso tienen carácter obligatorio, por lo que el USUARIO que haya realizado su solicitud
 para el Acceso al MSIAP acepta su contenido y se obliga a cumplir con los términos y obligaciones de uso descritos a continuación.<br/>
 Si el Usuario no estuviera de acuerdo con estos términos legales deberá comunicarlo antes de usar el servicio.</p>
					
<p><STRONG>CONOCIMIENTO Y ACEPTACION DE LOS TERMINOS DEL SERVICIO</STRONG><br/></p>
<p>
Me encuentro debidamente informado(a) que al haber solicitado  una cuenta de Usuario y Contraseña que me permite acceder al <STRONG>"Módulo de Solicitudes de Antecedentes 
Penales – MSIAP"</STRONG>, sistema informático del Registro Nacional de Condenas del RENAJU, podré realizar consultas sobre antecedentes penales, información de carácter reservado; 
<h:outputText value=" a mérito del \"CONVENIO DE COOPERACION INTERINSTITUCIONAL PARA PROMOVER LA INTEROPERABILIDAD DE LOS SISTEMAS DE INFORMACIÓN ENTRE EL PODER JUDICIAL Y EL MINISTERIO PÚBLICO\", 
suscrito el 15 de Noviembre 2016 y  creado por RESOLUCIÓN ADMINISTRATIVA N° 140-2016-CE-PJ, publicada el 22 de Diciembre del 2016; " rendered="#{ terminos.renderFiscal }"/>
<h:outputText value=" por lo que " rendered="#{ !terminos.renderFiscal }"/> 
asumo la responsabilidad que pueda derivar por el mal 
uso de dicha información, la cual se encuentra protegida por la Ley de Protección de Datos Personales, Ley N° 27933, velando por el uso correcto y considerando que genera
responsabilidades  significativas para la institución en caso de ser  mal utilizada.					
</p>
<p><STRONG>BASE LEGAL</STRONG></p>
<ol>
<li>Constitución Política del Perú.</li>
<li>Resolución Administrativa de la Presidencia del Poder Judicial N° 148-2010-P-PJ, que aprueba la Política de Seguridad de la Información del Poder Judicial.</li>
<li>Resolución Administrativa N°140-2011-CE-PJ, que aprueba el Plan General de Seguridad de la Información.</li>
<li>Ley N° 29733 "Ley de Protección de Datos Personales".</li>
<li>Resolución Administrativa N° 003-2012-P-CE-PJ, que aprueba el Reglamento del Registro Nacional Judicial.</li>
</ol>
<p><STRONG>OBLIGACIONES Y COMPROMISOS</STRONG></p>
<ol>
<li>No acceder con mi usuario y clave a una computadora diferente a la asignada por su Institución.</li>
<li>No realizar capturas a las consultas que realizo al sistema informático con mi usuario -todo tipo- y/o exponer información -Impresión de la pantalla, foto celular/Tablet/cámara digital y/o otra forma.</li>
<li>No compartir la cuenta de usuario y contraseña que me han asignado, con personas no autorizadas.</li>
<li>No incurrir en tráfico / venta / comercialización de datos o información del Poder Judicial a personas no autorizadas.</li>
<li>No permitir acceso a la información, por parte de un tercero no autorizado al proporcionarle intencionalmente o por descuido las credenciales de acceso (usuario y contraseña).</li>
<li>Utilizar la información para los fines que el Convenio lo especifica y no incurrir en divulgación premeditada o accidental de la información accedida a personas ajenas</li>
</ol> 
<p><STRONG>RESPONSABILIDADES</STRONG></p>
<ol>
<li>Afectar negativamente al Poder Judicial en su función de administración de justicia.</li>
<li>Afectar la privacidad de las personas cuyos datos o información resulten expuestos.</li>
<li>Exposición de datos o información violando la Ley de Protección de Datos y su Reglamento.</li>
<li>Realizar consultas de nombres que no tiene vinculación en la investigación o trámites propios de la Institución.</li>
</ol>
<p><STRONG>DECLARACIÓN</STRONG></p>
<p>Comprendo las implicancias que pueden generar en caso de que se concrete el incumplimiento de las obligaciones y/o compromisos, y  me comprometo a notificar inmediatamente al REGISTRO NACIONAL DE CONDENAS del RENAJU,  de cualquier uso no autorizado de mi cuenta.</p>
<p>Por mi cargo y funciones designados asumo la responsabilidad penal, civil y administrativa, por los perjuicios, económicos, administrativos, legales, interrupción de los procesos, seguridad de la información, deterioro de la imagen institucional y otras, que se generen como consecuencia de incurrir en incumplimiento de las obligaciones y/o compromisos señalados,  que afecten al Poder Judicial,  Registro Nacional Judicial de la Gerencia de Servicios Judiciales y Recaudación y a las personas cuyas sentencias registramos.</p>
<p>Asimismo, me comprometo al monitoreo de los datos de mi cuenta y revisar diariamente/periódicamente la información que se lleve a cabo con el usuario de mi cuenta y me comprometo a solicitar la desactivación de mi usuario y contraseña en caso culmine mi designación
 como Magistrado, Fiscal, Usuario interno y/o externo en el cargo que me designaron y por el cual me dieron acceso al MSIAP.</p>
<p/>
<p style="text-align:right;"><h:outputText value="#{terminos.fecha}"/></p>
<!-- Fin términos -->
<div style="text-align: center; margin: 25px 50px;">
	<h:commandButton action="#{terminos.enviar}" value="Acepto" 
		style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-style: normal;	height:21px;  width: 80px"/>&nbsp;
		<h:commandButton action="#{SessionBean1.killSession}" value="No acepto" immediate="true"
		style="font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-style: normal;	height:21px;  width: 80px"/>
</div>
				    	</h:form>
			    		</f:view>
					</td>
				</tr>
			</tbody>
			</table>
		</td>
	</tr>
</tbody>
</table>
</body>
		
</html>