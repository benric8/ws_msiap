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
		<ui:page binding="#{visuaSolicitudInterna.page1}" id="page1">
			<ui:html binding="#{visuaSolicitudInterna.html1}" id="html1">
			<ui:head binding="#{visuaSolicitudInterna.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Ingreso de Solicitud">
				<ui:link binding="#{visuaSolicitudInterna.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/jsval.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/javascript/inSolicitudSimple.js" />
				<ui:script id="script4" url="/resources/funcionesJavascript.js" />
				<script language="javascript"
					src="${pageContext.request.contextPath}/resources/xp_progress.js" />

				<script language="javascript">                         
function enviar() {
    var retorno = confirm("¿Esta seguro de enviar estas solicitudes al Registro Nacional de Condenas?,\ndespues de esta acción no se podrá hacer modificaciones a la información enviada");
    var btnEnviar = document.getElementById('form1:btnEnviarSolicitud');
    if (retorno){
        sjwuic_button_setDisabled(true);
    } else {
        sjwuic_button_setDisabled(false);
    }
    return retorno;
}                            
            </script>

			</ui:head>
			<ui:body binding="#{visuaSolicitudInterna.body1}" id="body1" onLoad=""
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">

				<script language="javascript">
					function send() {

						var retorno = confirm("¿Esta seguro de enviar esta solicitud al Registro Nacional de Condenas?,\ndespues de esta acción no se podrá hacer más de una modificación a la información enviada");
					    if (retorno){
					        bar1.showBar();
					    } else {
					        bar1.hideBar();
					    }
				    return retorno;
					}
                </script>

				<ui:form binding="#{visuaSolicitudInterna.form1}" id="form1">
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
								binding="#{visuaSolicitudInterna.staticText9}" id="staticText9"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; Ingreso de Solicitud de Certificado Jurisdiccional" /></td>
						</tr>
						<tr style="height: 20px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>

						<tr>
							<td colspan="4" valign="top">
							<table border="0px" cellpadding="0px" cellspacing="0px" style="width: 776px" >
								<c:if test="${SessionBean1.solicitudVisual.FLAG_MANT ne 'NEW'}">
									<tr style="height: 23px">
										<td>Distrito Judicial:</td>
										<td><ui:staticText id="stDistritoJudicial"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.solicitudVisual.distritoJudicial.DESC_DISTRITO_JUDICIAL}" /></td>
										<td>Instancia:</td>
										<td colspan="2"><ui:staticText id="stJuzgado"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.solicitudVisual.DESC_JUZGA_SOLIC }" /></td>
										
									</tr>
									<tr style="height: 23px">
										<td>Lugar:</td>
										<td><ui:staticText id="stDepartamento"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.solicitudVisual.departamento.DESC_LUGAR}" /></td>
										<td>Magistrado / Sec.:</td>
										<td colspan="2"><ui:staticText id="stUsuario"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.solicitudVisual.NOMB_JUZGA_SOLIC}" /></td>

									</tr>
								</c:if>
								
								<c:if test="${SessionBean1.solicitudVisual.FLAG_MANT eq 'NEW'}">
									<tr style="height: 23px">
										<td>Distrito Judicial:</td>
										<td><ui:staticText id="stDistritoJudicial"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.distritoJudicialUser}" /></td>
										<td>Instancia:</td>
										<td colspan="2"><ui:staticText id="stJuzgado"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.juzgadoUser}" /></td>
									
									</tr>
									<tr style="height: 23px">
										<td>Lugar:</td>
										<td><ui:staticText id="stDepartamento"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.departamentoUser}" /></td>
										<td>Magistrado / Sec.:</td>
										<td colspan="2"><ui:staticText id="stUsuario"
											style="background-color:#E1E1E1; padding:4px"
											text="#{SessionBean1.usuario.NOMB_USUAR} #{SessionBean1.usuario.APLL_USUAR}" /></td>
										
									</tr>
								</c:if>
								


								<tr style="height: 23px">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>

								<tr>
									<td colspan="5">
									<hr />
									</td>
								</tr>

								<tr style="height: 30px">
									<td colspan="5" style="font-weight: bold;">Datos del
									Expediente</td>

								</tr>

								<tr>
									<td>(*)Nro. de Exp.</td>
									<td><h:inputText
										binding="#{visuaSolicitudInterna.txtNroExpediente}"
										id="txtNroExpediente" maxlength="10" required="true"
										tabindex="1"
										value="#{SessionBean1.solicitudVisual.NUME_EXPED_SOLIC}" /></td>
									<td>(*)Delitos y Articulos</td>
									<td colspan="2"><ui:textArea
										binding="#{visuaSolicitudInterna.txtDelito}" id="txtDelito"
										tabIndex="2" maxLength="200" required="true"
										text="#{SessionBean1.solicitudVisual.DES_DELITO}" /></td>

								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage11}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNroExpediente" id="inlineMessage11"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage13}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtDelito" id="inlineMessage13" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>

								</tr>



								<tr style="height: 30px">
									<td colspan="5" style="font-weight: bold;">Datos de la
									Persona</td>

								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText8}" id="outputText8"
										value="(*)Doc. Identidad:" /></td>
									<td colspan="2" style="width: 305px"><h:selectOneMenu
										binding="#{visuaSolicitudInterna.ddTipoDocumento}"
										id="ddTipoDocumento" required="true" style="width: 288px"
										tabindex="3"
										value="#{SessionBean1.solicitudVisual.DOCU_IDENT_SOLIC}">
										<f:selectItems
											binding="#{visuaSolicitudInterna.dropdown1SelectItems}"
											id="dropdown1SelectItems"
											value="#{SessionBean1.tiposDocumentoIdentidad.options['codigo_tipo_documento,descripcion']}" />
									</h:selectOneMenu></td>
									<td style="width: 182px"><h:inputText
										alt="Numero de documento de Identidad"
										binding="#{visuaSolicitudInterna.txtNumrIdentidad}"
										id="txtNumrIdentidad" maxlength="12" style="width: 168px"
										tabindex="4"
										validator="#{visuaSolicitudInterna.txtNumrIdentidad_validate}"
										value="#{SessionBean1.solicitudVisual.NUME_IDENT_SOLIC}" /></td>
									<td style="width: 166px"></td>

								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddTipoDocumento" id="inlineMessage1"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage2}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNumrIdentidad" id="inlineMessage2"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>


								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText3}" id="outputText3"
										value="(*)Apellido Paterno:" /></td>
									<td style="width: 182px"><h:inputText
										binding="#{visuaSolicitudInterna.txtApellidoPaterno}"
										id="txtApellidoPaterno" maxlength="50" style="width: 168px"
										tabindex="5"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.APLL_PATER_SOLIC}" /></td>
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText4}" id="outputText4"
										value="(*)Apellido Materno:" /></td>
									<td style="width: 182px"><h:inputText
										binding="#{visuaSolicitudInterna.txtApellidoMaterno}"
										id="txtApellidoMaterno" maxlength="50" style="width: 168px"
										tabindex="6"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.APLL_MATER_SOLIC}" /></td>
									<td style="width: 166px"></td>
								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage3}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtApellidoPaterno" id="inlineMessage3"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage4}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtApellidoMaterno" id="inlineMessage4"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText5}" id="outputText5"
										value="(*)Nombre 1:" /></td>
									<td style="width: 182px"><h:inputText
										binding="#{visuaSolicitudInterna.txtNombre1}" id="txtNombre1"
										maxlength="50" required="true" style="width: 168px"
										tabindex="7"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.NOM1_SOLIC}" /></td>
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText6}" id="outputText6"
										value="Nombre 2:" /></td>
									<td style="width: 182px"><h:inputText
										binding="#{visuaSolicitudInterna.txtNombre2}" id="txtNombre2"
										maxlength="50" style="width: 168px" tabindex="8"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.NOM2_SOLIC}" /></td>
									<td style="width: 166px"></td>

								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage5}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNombre1" id="inlineMessage5" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage6}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNombre2" id="inlineMessage6" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>

								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText7}" id="outputText7"
										value="Nombre 3:" /></td>
									<td style="width: 182px"><h:inputText
										binding="#{visuaSolicitudInterna.txtNombre3}" id="txtNombre3"
										maxlength="50" style="width: 168px" tabindex="9"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.NOM3_SOLIC}" /></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage7}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNombre3" id="inlineMessage7" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" />
									</td>
									<td style="width: 166px"></td>
								</tr>
								<tr style="height: 10px">
									<td colspan="5"></td>
								</tr>
								<tr style="height: 23px">
									<td colspan="5"><h:outputText style="font-weight: bold;"
										binding="#{visuaSolicitudInterna.outputText9}" id="outputText9"
										value="Datos de  Nacimiento:" /></td>
								</tr>
								<tr style="height: 10px">
									<td colspan="5"></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText10}"
										id="outputText10" value="(*)Lugar:" /></td>
									<td style="width: 182px"><h:selectOneMenu
										binding="#{visuaSolicitudInterna.ddLugar}" id="ddLugar"
										required="true" style="width: 168px" tabindex="10"
										value="#{SessionBean1.solicitudVisual.x_CODG_LUGAR_NAC}">
										<f:selectItems
											binding="#{visuaSolicitudInterna.dropdown2SelectItems}"
											id="dropdown2SelectItems"
											value="#{SessionBean1.departamentos}" />
									</h:selectOneMenu></td>
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText11}"
										id="outputText11" value="(*)Fecha:" /></td>
									<td style="width: 182px" colspan="2">
									<table>
										<tr>
											<td><ui:calendar dateFormatPatternHelp="dd/mm/aaaa"
												binding="#{visuaSolicitudInterna.calFechNacimiento}"
												dateFormatPattern="dd/MM/yyyy" id="calFechNacimiento"
												selectedDate="#{SessionBean1.solicitudVisual.FECH_NACIM_SOLIC}"
												tabIndex="11" columns="10" onClick="seleccionRango(this);"
												onBlur="return validarFecha(this);"
												onKeyPress="return formatearFecha(this,event);" /></td>
											<td><h:selectBooleanCheckbox
												binding="#{visuaSolicitudInterna.checkSinFech}"
												value="#{SessionBean1.solicitudVisual.flag_naci}">Sin Fecha</h:selectBooleanCheckbox></td>
										</tr>
									</table>
									</td>


								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage8}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddLugar" id="inlineMessage8" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>

									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage12}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="calFechNacimiento" id="inlineMessage12"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>

								</tr>
								<tr style="height: 23px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText12}"
										id="outputText12" value="(**)Nombre Padre:" /></td>
									<td style="width: 182px"><h:inputText alt="Nombre Padre"
										binding="#{visuaSolicitudInterna.txtNomPadre}" id="txtNomPadre"
										maxlength="45" required="true" style="width: 168px"
										tabindex="12"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.NOM_PADRE}" /></td>
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText13}"
										id="outputText13" value="(**)Nombre Madre:" /></td>
									<td style="width: 182px"><h:inputText alt="Nombre Madre"
										binding="#{visuaSolicitudInterna.txtNomMadre}" id="txtNomMadre"
										maxlength="45" required="true" style="width: 168px"
										tabindex="13"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}"
										value="#{SessionBean1.solicitudVisual.NOM_MADRE}" /></td>
									<td style="width: 166px"></td>

								</tr>
								<tr>
									<td style="width: 123px"></td>
									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage9}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNomPadre" id="inlineMessage9" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>

									<td colspan="2"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage10}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNomMadre" id="inlineMessage10" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>

								</tr>
								<tr style="height: 35px">
									<td style="width: 123px"><h:outputText
										binding="#{visuaSolicitudInterna.outputText14}"
										id="outputText14" value="Observaciones:" /></td>
									<td colspan="4"><ui:textArea
										binding="#{visuaSolicitudInterna.txtObservacion}"
										maxLength="250" id="txtObservacion" style="width: 480px"
										tabIndex="14"
										text="#{SessionBean1.solicitudVisual.OBSERVACION}"
										validator="#{visuaSolicitudInterna.txtApellidoPaterno_validate}" /></td>

								</tr>
								<tr>
									<td colspan="5"><h:message
										binding="#{visuaSolicitudInterna.inlineMessage90}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtObservacion" id="inlineMessage90"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 30px">
									<td colspan="5" align="center"><c:if
										test="${SessionBean1.solicitudVisual.FLAG_MANT ne 'DET'}">
										<ui:button action="#{visuaSolicitudInterna.btnGrabar_action}"
											binding="#{visuaSolicitudInterna.btnGrabar}" id="btnGrabar"
											mini="true" onClick="return send();" style="width: 57px"
											tabIndex="15" text="Guardar" />
									</c:if><ui:button action="#{visuaSolicitudInterna.btnCancelar_action}"
										binding="#{visuaSolicitudInterna.btnCancelar}" id="btnCancelar"
										immediate="true" mini="true" style="width: 58px" tabIndex="16"
										text="Cancelar" /></td>


								</tr>

								<tr style="height: 15px">
									<td colspan="5" align="center">
									<div style="z-index: 30"><script language="javascript">
									var bar1= createBar(300,15,'white',1,'black','red',85,7,3,"");
                            			bar1.hideBar();
	                        	</script></div>
									</td>
								</tr>

								<tr style="height: 25px" align="center">
									<td colspan="5"><h:outputText
										binding="#{visuaSolicitudInterna.outputText1}" id="outputText1"
										value="(*)Campos Obligatorios" /></td>
								</tr>
								<tr style="height: 23px" align="center">
									<td colspan="5"><h:outputText
										binding="#{visuaSolicitudInterna.outputText2}" id="outputText2"
										value="(**) Campos Obligatorios, si se desconoce esta información especificar se desconoce" /></td>

								</tr>
								<tr style="height: 10px" align="center">
									<td colspan="5"><ui:staticText
										style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
										text="La precisión de la información en el certificado, está directamete ligada a los datos declarados en la solicitud." /></td>
								</tr>
								<tr style="height: 23px">
									<td colspan="5" align="center"><h:messages
										binding="#{visuaSolicitudInterna.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										globalOnly="true" id="messageList1" infoClass="infoMessage"
										style="width: 478px" warnClass="warnMessage" /></td>
								</tr>
								<tr>
									<td colspan="5"></td>
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
