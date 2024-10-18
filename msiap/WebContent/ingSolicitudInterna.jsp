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
		<ui:page binding="#{ingSolicitudInterna.page1}" id="page1">
			<ui:html binding="#{ingSolicitudInterna.html1}" id="html1">
			<ui:head binding="#{ingSolicitudInterna.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Ingreso de Solicitud">
				<ui:link binding="#{ingSolicitudInterna.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/jsval.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/javascript/inSolicitudSimple.js" />
				<ui:script id="script4" url="/resources/funcionesJavascript.js" />
				<ui:script id="script5" url="/resources/xp_progress.js" />
			</ui:head>
			<ui:body binding="#{ingSolicitudInterna.body1}" id="body1"
				onLoad="#{ingSolicitudInterna.onloadFunction}"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">

				<script language="javascript">
					function send() {

						var retorno = confirm("¿Está seguro de enviar esta solicitud al Registro Nacional de Condenas?,\nDespués de esta acción no se podrá modificar la información enviada.");
					    if (retorno){
					    	
					    	var eleman = document.getElementById('btnGrabar');
					    	eleman.setAttribute("disabled", true);
					        bar1.showBar();
					       
					    } else {
					    	var eleman = document.getElementById('btnGrabar');
					    	eleman.setAttribute("disabled", true);
					        bar1.hideBar();
					    }
				    return retorno;
					}
                </script>

				<ui:form binding="#{ingSolicitudInterna.form1}" id="form1">
					<table style="height: 100%; width: 776px" align="center"
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
									binding="#{ingSolicitudInterna.staticText9}" id="staticText9"
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
								<table border="0px" cellpadding="0px" cellspacing="0px" style="width: 776px">
									<c:if
										test="${SessionBean1.solicitudUnitaria.FLAG_MANT ne 'NEW'}">
										<c:if test="${SessionBean1.usuario.COD_PERFIL ne '40'}">
											<tr style="height: 23px">
												<td>Distrito Judicial:</td>
												<td><ui:staticText id="stDistritoJudicial"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.solicitudUnitaria.distritoJudicial.DESC_DISTRITO_JUDICIAL}" /></td>
												<td style="width: 10px;" />
												<td>Instancia:</td>
												<td><ui:staticText id="stJuzgado"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.solicitudUnitaria.DESC_JUZGA_SOLIC }" /></td>
											</tr>
											<tr style="height: 23px">
												<td>Lugar:</td>
												<td><ui:staticText id="stDepartamento"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.solicitudUnitaria.departamento.DESC_LUGAR}" /></td>
												<td style="width: 10px;" />
												<td>Magistrado / Sec.:</td>
												<td><ui:staticText id="stUsuario"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.solicitudUnitaria.NOMB_JUZGA_SOLIC}" /></td>
											</tr>
										</c:if>
										<c:if test="${SessionBean1.usuario.COD_PERFIL eq '40'}">
											<tr style="height: 23px">
												<td>Institución:</td>
												<td colspan="4"><ui:staticText id="stDistritoJudicial"
														style="background-color:#E1E1E1; padding:4px"
														text="MINISTERIO PÚBLICO - FISCALÍA DE LA NACIÓN" /></td>
											</tr>
											<tr style="height: 23px">
												<td>Fiscal:</td>
												<td colspan="4"><ui:staticText id="stUsuario"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.solicitudUnitaria.NOMB_JUZGA_SOLIC}" /></td>
											</tr>
										</c:if>
									</c:if>

									<c:if
										test="${SessionBean1.solicitudUnitaria.FLAG_MANT eq 'NEW'}">
										<c:if test="${SessionBean1.usuario.COD_PERFIL ne '40'}">
											<tr style="height: 23px">
												<td>Distrito Judicial:</td>
												<td><ui:staticText id="stDistritoJudicial"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.distritoJudicialUser}" /></td>
												<td style="width: 10px;" />
												<td>Instancia:</td>
												<td><ui:staticText id="stJuzgado"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.juzgadoUser}" /></td>
											</tr>
											<tr style="height: 23px">
												<td>Lugar:</td>
												<td><ui:staticText id="stDepartamento"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.departamentoUser}" /></td>
												<td style="width: 10px;" />
												<td>Magistrado / Sec.:</td>
												<td><ui:staticText id="stUsuario"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.usuario.NOMB_USUAR} #{SessionBean1.usuario.APLL_USUAR}" /></td>
											</tr>
										</c:if>
										<c:if test="${SessionBean1.usuario.COD_PERFIL eq '40'}">
											<tr style="height: 23px">
												<td>Institución:</td>
												<td colspan="4"><ui:staticText id="stDistritoJudicial"
														style="background-color:#E1E1E1; padding:4px"
														text="MINISTERIO PÚBLICO - FISCALÍA DE LA NACIÓN" /></td>
											</tr>
											<tr style="height: 23px">
												<td>Magistrado / Sec.:</td>
												<td colspan="4"><ui:staticText id="stUsuario"
														style="background-color:#E1E1E1; padding:4px"
														text="#{SessionBean1.usuario.NOMB_USUAR} #{SessionBean1.usuario.APLL_USUAR}" /></td>
											</tr>
										</c:if>
									</c:if>

									<tr style="height: 23px">
										<td colspan="5"><h:messages
												binding="#{ingSolicitudInterna.messageList1}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												globalOnly="true" id="messageList1" infoClass="infoMessage"
												warnClass="warnMessage" /></td>
									</tr>

									<tr>
										<td colspan="5"><hr /></td>
									</tr>
									<tr style="height: 30px">
										<td colspan="3" style="font-weight: bold;">Datos del documento que autoriza la consulta</td>
										<td colspan="2" rowspan="8" style="padding-left: 80px;">
											
										</td>
									</tr>
									<tr>
										<td><ui:staticText text="(*)Tipo" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudInterna.ddTipoDocumentoAut}"
												id="ddTipoDocumentoAut" required="true" style="width: 190px"
												tabindex="1"
												validator="#{ingSolicitudInterna.ddTipoDocumentoAut_validate}"
												value="#{ingSolicitudInterna.idTipoDocumentoAutorizacion}">
												<f:selectItems
													binding="#{ingSolicitudInterna.dropdown1SelectAutItems}"
													value="#{ingSolicitudInterna.tiposDocumentoAut}" />
											</h:selectOneMenu></td>
										<td style="width: 10px;" />
									</tr>
									<tr>
										<td />
										<td colspan="2"><h:message errorClass="errorMessage"
												fatalClass="fatalMessage" for="ddTipoDocumentoAut"
												id="inlineMessage14" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
									</tr>
									<tr>
										<td style="padding-top: 5px;"><ui:staticText
												text="#{ingSolicitudInterna.lblNroExpediente}" /></td>
										<td style="padding-top: 5px;"><h:inputText
												binding="#{ingSolicitudInterna.txtNroExpediente}"
												value="#{SessionBean1.solicitudUnitaria.NUME_EXPED_SOLIC}"
												id="txtNroExpediente" maxlength="30" 
												style="width: 190px" tabindex="2"
												/></td>
										<td style="width: 10px;" />
									</tr>
									<tr>
										<td />
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage11}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNroExpediente" id="inlineMessage11"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr>
										<td style="padding-top: 5px;"><ui:staticText
												text="#{ingSolicitudInterna.lblDelito}" /></td>
										<td style="padding-top: 5px;"><ui:textArea
												binding="#{ingSolicitudInterna.txtDelito}" id="txtDelito"
												style="width: 190px" tabIndex="3" maxLength="200"
												text="#{SessionBean1.solicitudUnitaria.DES_DELITO}"
												/></td>
									</tr>
									<tr>
										<td />
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage13}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtDelito" id="inlineMessage13" infoClass="infoMessage"
												warnClass="warnMessage" /></td>
									</tr>
									<!-- Fin -->

									<tr style="height: 30px">
										<td style="font-weight: bold;" colspan="3">Datos de la
											Persona</td>
									</tr>
									<tr style="height: 23px">
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText8}"
												id="outputText8" value="(*)Tipo de documento:" /></td>
										<td><h:selectOneMenu
												binding="#{ingSolicitudInterna.ddTipoDocumento}"
												id="ddTipoDocumento" required="true" style="width: 190px"
												onchange="validarDocumentoF2();" tabindex="4"
												validator="#{ingSolicitudInterna.ddTipoDocumento_validate}"
												value="#{SessionBean1.solicitudUnitaria.DOCU_IDENT_SOLIC}">
												<f:selectItem itemLabel="--- Seleccione ---" itemValue="-1" />
												<f:selectItems
													binding="#{ingSolicitudInterna.dropdown1SelectItems}"
													id="dropdown1SelectItems"
													value="#{SessionBean1.tiposDocumentoIdentidad.options['codigo_tipo_documento,descripcion']}" />
											</h:selectOneMenu></td>
										<td style="width: 10px;" />
										<td style="width: 123px">(*)Nro. de Documento:</td>
										<td style="width: 182px"><h:inputText
												alt="Número de documento de Identidad"
												binding="#{ingSolicitudInterna.txtNumrIdentidad}"
												id="txtNumrIdentidad" maxlength="20" style="width: 190px"
												tabindex="5"
												validator="#{ingSolicitudInterna.txtNumrIdentidad_validate}"
												onchange="validarDocumentoF2();"
												value="#{SessionBean1.solicitudUnitaria.NUME_IDENT_SOLIC}" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage1}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="ddTipoDocumento" id="inlineMessage1"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage2}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNumrIdentidad" id="inlineMessage2"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 23px">
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText3}"
												id="outputText3" value="(*)Apellido Paterno:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudInterna.txtApellidoPaterno}"
												id="txtApellidoPaterno" maxlength="50" style="width: 190px"
												tabindex="6"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.APLL_PATER_SOLIC}" /></td>
										<td style="width: 10px;" />
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText4}"
												id="outputText4" value="(*)Apellido Materno:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudInterna.txtApellidoMaterno}"
												id="txtApellidoMaterno" maxlength="50" style="width: 190px"
												tabindex="7"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.APLL_MATER_SOLIC}" /></td>
									</tr>
									<tr>
										<td style="width: 123px;"></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage3}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtApellidoPaterno" id="inlineMessage3"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
										<td />
										<td><h:message
												binding="#{ingSolicitudInterna.inlineMessage4}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtApellidoMaterno" id="inlineMessage4"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 23px">
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText5}"
												id="outputText5" value="(*)Nombre 1:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudInterna.txtNombre1}" id="txtNombre1"
												maxlength="50" required="true" style="width: 190px"
												tabindex="8"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM1_SOLIC}" /></td>
										<td style="width: 10px;" />
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText6}"
												id="outputText6" value="Nombre 2:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudInterna.txtNombre2}" id="txtNombre2"
												maxlength="50" style="width: 190px" tabindex="9"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM2_SOLIC}" /></td>

									</tr>
									<tr>
										<td style="width: 123px"></td>
										<td colspan="2"><h:message
												binding="#{ingSolicitudInterna.inlineMessage5}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre1" id="inlineMessage5" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
										<td />
										<td><h:message
												binding="#{ingSolicitudInterna.inlineMessage6}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre2" id="inlineMessage6" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 23px">
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText7}"
												id="outputText7" value="Nombre 3:" /></td>
										<td style="width: 182px"><h:inputText
												binding="#{ingSolicitudInterna.txtNombre3}" id="txtNombre3"
												maxlength="50" style="width: 190px" tabindex="10"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}"
												value="#{SessionBean1.solicitudUnitaria.NOM3_SOLIC}" /></td>
										<td colspan="3"><h:message
												binding="#{ingSolicitudInterna.inlineMessage7}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtNombre3" id="inlineMessage7" infoClass="infoMessage"
												showDetail="false" showSummary="true"
												warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 10px">
										<td colspan="5"></td>
									</tr>
									
									<tr style="height: 35px">
										<td style="width: 123px"><h:outputText
												binding="#{ingSolicitudInterna.outputText14}"
												id="outputText14" value="Observaciones:" /></td>
										<td colspan="4"><ui:textArea
												binding="#{ingSolicitudInterna.txtObservacion}"
												maxLength="250" id="txtObservacion" style="width: 480px"
												tabIndex="15"
												text="#{SessionBean1.solicitudUnitaria.OBSERVACION}"
												validator="#{ingSolicitudInterna.txtApellidoPaterno_validate}" /></td>
									</tr>
									<tr>
										<td colspan="5"><h:message
												binding="#{ingSolicitudInterna.inlineMessage90}"
												errorClass="errorMessage" fatalClass="fatalMessage"
												for="txtObservacion" id="inlineMessage90"
												infoClass="infoMessage" showDetail="false"
												showSummary="true" warnClass="warnMessage" /></td>
									</tr>
									<tr style="height: 30px">
										<td colspan="5" align="center"><c:if
												test="${SessionBean1.solicitudUnitaria.FLAG_MANT ne 'DET'}">
												<ui:button action="#{ingSolicitudInterna.btnGrabar_action}"
													binding="#{ingSolicitudInterna.btnGrabar}" id="btnGrabar"
													mini="true" onClick="return send();"  style="width: 57px"
													tabIndex="16" text="Guardar" />
													
											</c:if> <ui:button
												action="#{ingSolicitudInterna.btnCancelar_action}"
												binding="#{ingSolicitudInterna.btnCancelar}"
												id="btnCancelar" immediate="true" mini="true"
												style="width: 58px" tabIndex="17" text="Cancelar" /> <ui:button
												action="#{ingSolicitudInterna.btnValidarDocumento_action}"
												binding="#{ingSolicitudInterna.btnValidarDocumento}"
												id="btnValidarDocumento" mini="true" style="display:none;"
												immediate="true" /></td>
									</tr>

									<tr style="height: 15px">
										<td colspan="5" align="center">
											<div style="z-index: 30">
												<script language="javascript">
									var bar1= createBar(300,15,'white',1,'black','red',85,7,3,"");
                            			bar1.hideBar();
	                        	</script>
											</div>
										</td>
									</tr>

									<tr style="height: 10px" align="center">
										<td colspan="5"><ui:staticText
												style="color: rgb(153, 0, 0); font-size: 13px; font-weight: bold; z-index: 8;background-color: yellow;"
												text="#{ingSolicitudInterna.mensajeValidaExistenciaSolicitud}" /></td>
									</tr>


									<tr style="height: 25px" align="center">
										<td colspan="5"><h:outputText
												binding="#{ingSolicitudInterna.outputText1}"
												id="outputText1" value="(*)Campos Obligatorios" /></td>
									</tr>

									<tr style="height: 10px" align="center">
										<td colspan="5"><ui:staticText
												style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
												text="La precisión de la información en el certificado, está directamete ligada a los datos declarados en la solicitud." /></td>
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