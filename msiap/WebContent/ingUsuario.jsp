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
		<ui:page binding="#{ingUsuario.page1}" id="page1">
			<ui:html binding="#{ingUsuario.html1}" id="html1">
			<ui:head binding="#{ingUsuario.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Ingreso de Usuario">
				<ui:link binding="#{ingUsuario.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script0" url="/javascript/inSolicitudSimple.js" />
				<ui:script id="script1" url="/resources/jsval.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script id="script3" url="/javascript/xmlhttp.js" />
				<ui:script id="script4" url="/resources/funcionesJavascript.js" />
			</ui:head>
			<ui:body binding="#{ingUsuario.body1}" id="body1"
				onLoad="validarDocumentoOnLoadF3()"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">

				<ui:form binding="#{ingUsuario.form1}" id="form1">
					<table style="height:100%; width: 776px" align="center"
						cellpadding="0px" cellspacing="0px">
						<tr>
							<td colspan="4"><f:subview id="header">
								<div><jsp:directive.include file="header.jspf" /></div>
							</f:subview></td>
						</tr>
						<tr style="height: 10px">
							<td colspan="4"></td>
							
						</tr>
						<tr>
							<td colspan="4"><ui:staticText id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; USUARIO" /></td>
						</tr>
						<tr style="height: 10px">
							<td colspan="4"></td>

						</tr>
						<tr>
							<td>
							<table border="0px" cellpadding="0px" cellspacing="0px">
								<c:if test="${SessionBean1.usuarioMant.FLAG_MANT ne 'MOD'}">
									<tr style="height: 23px">
										<td><h:outputText binding="#{ingUsuario.outputText13}"
											id="outputText13" value="Codigo Usuario:" /></td>
										<td><h:inputText required="true" 
											binding="#{ingUsuario.txtCodigoUsuario}"
											id="txtCodigoUsuario" tabindex="1" maxlength="10"
											validator="#{ingUsuario.Alfanumerico_validate}"
											value="#{SessionBean1.usuarioMant.CODG_USUAR}" /></td>
										<td colspan="3"><h:message
											binding="#{ingUsuario.inlineMessage1}"
											errorClass="errorMessage" fatalClass="fatalMessage"
											for="txtCodigoUsuario" id="inlineMessage1"
											infoClass="infoMessage" showDetail="false" showSummary="true"
											warnClass="warnMessage" /></td>
									</tr>
								</c:if>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText14}"
										id="outputText14" value="Contraseña:" /></td>
									<td>
										<h:inputSecret redisplay="true" binding="#{ingUsuario.txtContrasena}" 
										id="txtContrasena" maxlength="15" autocomplete="off"
										value="#{SessionBean1.usuarioMant.c_CLAVE}"
										tabindex="2" validator="#{ingUsuario.txtContrasenhaActual_validate}" />
									</td>
									<td colspan="3">
										<h:message
										binding="#{ingUsuario.inlineMessage2}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtContrasena" id="inlineMessage2"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" />
									</td>
								</tr>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText15}"
										id="outputText15" value="Confirmar Contraseña:" /></td>
									<td>
										<h:inputSecret redisplay="true" binding="#{ingUsuario.txtConfirmarContrasena}" 
										id="txtConfirmarContrasena" maxlength="15" autocomplete="off"
										value="#{SessionBean1.usuarioMant.COD_CLAVE}"
										tabindex="3" validator="#{ingUsuario.txtContrasenhaActual_validate}"/>
									</td>
									<td colspan="3">
										<h:message
										binding="#{ingUsuario.inlineMessage3}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtConfirmarContrasena" id="inlineMessage3"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr><td><hr width="20" align="left"/></td><td colspan="4"/></tr>
								<tr style="height: 23px">
									<td><h:outputText value="Tipo de Documento:" /></td>
									<td><h:selectOneMenu tabindex="4" binding="#{ingUsuario.ddTipoDocumento}" id="ddTipoDocumento"
										value="#{SessionBean1.usuarioMant.TIPO_DOC_IDENT}" required="true" onchange="validarDocumentoF3();">
											<f:selectItem itemLabel="-- SELECCIONE --" itemValue=""/>
											<f:selectItems value="#{ingUsuario.ddTipoDocumentoOptions.options}"/>
										</h:selectOneMenu>
									</td>
									<td/>
									<td><h:outputText value="Nro. de Documento" /></td>
									<td><h:inputText id="txtDocumento" tabindex="5" maxlength="15" onchange="validarDocumentoF3();"
										validator="#{ingUsuario.txtNumrIdentidad_validate}" required="true" 
										value="#{SessionBean1.usuarioMant.c_NUMDOCIDT}" binding="#{ingUsuario.txtDocumento}"/>
									</td>
								</tr>
								<tr>
									<td/>
									<td><h:message errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddTipoDocumento" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td/>
									<td><h:message errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtDocumento" infoClass="errorMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" />
									</td>
								</tr>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText1}"
										id="outputText1" value="Nombres:" /></td>
									<td><h:inputText binding="#{ingUsuario.txtNombres}" autocomplete="off"
										id="txtNombres" tabindex="6" maxlength="40" required="true"
										validator="#{ingUsuario.txtNombres_validate}"
										value="#{SessionBean1.usuarioMant.NOMB_USUAR}" /></td>
									<td/>
									<td><h:outputText binding="#{ingUsuario.outputText2}"
										id="outputText2" value="Apellidos:" /></td>
									<td><h:inputText binding="#{ingUsuario.txtApellidos}" autocomplete="off"
										id="txtApellidos" tabindex="7" maxlength="40" required="true"
										validator="#{ingUsuario.txtNombres_validate}"
										value="#{SessionBean1.usuarioMant.APLL_USUAR}" /></td>
								</tr>
								<tr>
									<td></td>
									<td><h:message binding="#{ingUsuario.inlineMessage4}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNombres" id="inlineMessage4" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td colspan="2"><h:message binding="#{ingUsuario.inlineMessage5}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtApellidos" id="inlineMessage5" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
								</tr>


								<tr style="height: 23px">
									<td><h:outputText value="Teléfono:" /></td>
									<td><h:inputText binding="#{ingUsuario.txtFono}"
										id="txtFono" maxlength="15" style="width: 192px" autocomplete="off"
										tabindex="8" value="#{SessionBean1.usuarioMant.NUMR_CELULAR}" /></td>
									<td/>
									<td><h:outputText binding="#{ingUsuario.outputText4}"
										id="outputText4" value="Correo:" /></td>
									<td ><h:inputText
										binding="#{ingUsuario.txtCorreoElectronico}" autocomplete="off"
										id="txtCorreoElectronico" maxlength="60" style="width: 192px"
										tabindex="9"
										validator="#{ingUsuario.txtCorreoElectronico_validate}"
										value="#{SessionBean1.usuarioMant.DESC_COREEO}" /></td>
								</tr>
								<tr>
									<td></td>
									<td colspan="2"><h:message 
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtFono" infoClass="errorMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td colspan="2"><h:message binding="#{ingUsuario.inlineMessage7}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtCorreoElectronico" id="inlineMessage7"
										infoClass="errorMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>
								<tr><td><hr width="20" align="left"/></td><td colspan="4"/></tr>
								<tr style="height: 23px">
									<td><h:outputText value="Módulo:" /></td>
									<td ><h:selectOneMenu validator="#{ingUsuario.comboGeneric_validate}"
										binding="#{ingUsuario.ddModulo}" id="ddModulo" required="true"
										tabindex="10" value="#{SessionBean1.usuarioMant.COD_APLICACION}">
										<f:selectItem itemLabel="-- SELECCIONE --" itemValue=""/>
										<f:selectItem itemLabel="MSIAP" itemValue="001"/>
										<f:selectItem itemLabel="MSIAP-MAGISTRADO" itemValue="002"/>
										</h:selectOneMenu></td>
									<td colspan="3"/>
								</tr>
								<tr>
									<td></td>									
									<td colspan="2"><h:message errorClass="errorMessage" fatalClass="fatalMessage"
											for="ddModulo" id="ddModuloMsgId"
											infoClass="infoMessage" showDetail="false" showSummary="true"
											warnClass="warnMessage"/></td>
									<td colspan="2"/>
								</tr>							 
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText11}"
										id="outputText11" value="Tipo de Usuario:" /></td>
									<td><h:selectOneMenu tabindex="11"
										binding="#{ingUsuario.ddTipoUsuario}" id="ddTipoUsuario"
										value="#{SessionBean1.usuarioMant.CODG_TIPO}">
										<f:selectItems binding="#{ingUsuario.dropdown12SelectItems}"
											id="dropdown12SelectItems"
											value="#{SessionBean1.tipoUsuario.options['CODG_TIPO,DESC_TIPO']}" />
									</h:selectOneMenu></td>
									<td/>
									<td><h:outputText binding="#{ingUsuario.outputText12}"
										id="outputText12" value="Perfil:" /></td>
									<td><h:selectOneMenu binding="#{ingUsuario.ddPerfil}" onchange="seleccionPerfil(this);"
										id="ddPerfil" required="true" tabindex="12"
										value="#{SessionBean1.usuarioMant.COD_PERFIL}">
										<f:selectItems value="#{ingUsuario.ddPerfilDefaultOptions.options}"/>										
									</h:selectOneMenu></td>
								</tr>
								<tr style="height: 23px" id="difMagistrado">
									<td><h:outputText binding="#{ingUsuario.outputText7}"
										id="outputText7" value="Distrito Judicial:" /></td>
									<td><h:selectOneMenu onchange="submit()" style="max-width:300px;"
										valueChangeListener="#{ingUsuario.valorCombo}"
										validator="#{ingUsuario.valorCombo_validate}"
										binding="#{ingUsuario.ddDistritoJudicial}"
										id="ddDistritoJudicial" required="true" tabindex="12"
										value="#{SessionBean1.usuarioMant.CODG_DISTRITO_JUDICIAL}">
										<f:selectItems binding="#{ingUsuario.dropdown11SelectItems}"
											id="dropdown11SelectItems"
											value="#{SessionBean1.distritoJudicial.options['CODG_DISTRITO_JUDICIAL,DESC_DISTRITO_JUDICIAL']}" />
									</h:selectOneMenu></td>
									<td/>
									<td><h:outputText binding="#{ingUsuario.outputText8}"
										id="outputText8" value="Entidad Externa:" /></td>
									<td>
										<h:selectOneMenu style="max-width:300px;"																
										binding="#{ingUsuario.ddEntidadExterna}"
										id="ddEntidadExterna" required="true" tabindex="13"
										value="#{SessionBean1.usuarioMant.CODG_ENTIDAD_EXTERNA}">
										<f:selectItems binding="#{ingUsuario.dropdown13SelectItems}"
											id="dropdown13SelectItems"
											value="#{SessionBean1.entidadExternasFilter.options['CODG_ENTIDAD_EXTERNA,DESC_ENTIDAD_EXTERNA']}" />
										</h:selectOneMenu>
									</td>
								</tr>
								<tr id="difMagistradoMsj">
									<td></td>
									<td><h:message binding="#{ingUsuario.inlineMessage9}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddDistritoJudicial" id="inlineMessage9"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td></td>
									<td  colspan="2"><h:message binding="#{ingUsuario.inlineMessage8}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddEntidadExterna" id="inlineMessage8"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
								</tr>								
								<tr style="height: 23px; display: none;" id="magistrado">
									<td><h:outputText binding="#{ingUsuario.outputText16}"
										id="outputText16" value="Distrito Judicial:" /></td>
									<td><h:selectOneMenu onchange="submit()" style="max-width:300px;"
										valueChangeListener="#{ingUsuario.valorComboInterno}"
										validator="#{ingUsuario.valorComboDJ_validate}"
										binding="#{ingUsuario.ddDistritoJudicialMagis}"
										id="ddDistritoJudicialMagis" required="true" tabindex="14"
										value="#{SessionBean1.usuarioMant.CODG_DISTRITO_JUDICIAL_MAG}">
											<f:selectItems binding="#{ingUsuario.dropdown15SelectItems}"
											id="dropdown15SelectItems"
											value="#{SessionBean1.distritoJudicialInterno.options['CODG_DISTRITO_JUDICIAL,DESC_DISTRITO_JUDICIAL']}" />
										</h:selectOneMenu></td>
									<td/>
									
									<td>Lugar:</td>
									<td><h:selectOneMenu																				
										binding="#{ingUsuario.ddLugar}"
										id="ddLugar" required="true" tabindex="15"
										value="#{SessionBean1.usuarioMant.CODG_LUGAR}">
										<f:selectItems binding="#{ingUsuario.dropdown16SelectItems}"
											id="dropdown16SelectItems"
											value="#{SessionBean1.departamentoFilter.options['CODG_LUGAR,DESC_LUGAR']}" />
										</h:selectOneMenu>									
									</td>
								</tr>
								<tr id="magistradoMsj" style="display: none;">
									<td></td>
									<td><h:message binding="#{ingUsuario.inlineMessage10}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddDistritoJudicialMagis" id="inlineMessage10"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td></td>
									<td  colspan="2"><h:message binding="#{ingUsuario.inlineMessage12}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="ddLugar" id="inlineMessage12"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>

								</tr>
							<tr style="height: 23px; display: none;" id="magistrado2">									
									<td><label for="txtNumJuzgado">Juzgado: </label></td>									
									<td colspan="2"><h:inputText binding="#{ingUsuario.txtNumJuzgado}" 
										id="txtNumJuzgado" tabindex="16" maxlength="3"   validator="#{ingUsuario.numerico_validate}" 
										size="4" value="#{SessionBean1.usuarioMant.NUME_JUZGA}" />
										<h:selectOneMenu																				
										binding="#{ingUsuario.ddJuzgado}"
										id="ddJuzgado" required="true" tabindex="17" value="#{SessionBean1.usuarioMant.CODG_JUZGAD}"
										style="max-width:300px;">
										<f:selectItems binding="#{ingUsuario.dropdown14SelectItems}"
											id="dropdown14SelectItems" 
											value="#{SessionBean1.juzgado.options['CODG_JUZGAD,DESC_JUZGAD']}" />
										</h:selectOneMenu>																		
									</td>
									<td colspan="2"/>
								</tr> 

								<tr id="magistradoMsj2" style="display: none;">
									<td></td>
									<td colspan="2"><h:message binding="#{ingUsuario.inlineMessage11}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNumJuzgado" id="inlineMessage11"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td/>
								</tr>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText3}"
										id="outputText3" value="Cargo:" /></td>
									<td><h:inputText binding="#{ingUsuario.txtTitulo}"
										id="txtTitulo" tabindex="18" maxlength="200"
										validator="#{ingUsuario.txtNombres_validate}" required="true"
										value="#{SessionBean1.usuarioMant.DESC_TITULO}" /></td>
									<td/>
									<td><h:outputText binding="#{ingUsuario.outputText9}"
										id="outputText9" value="Estado:" /></td>
									<td><h:selectOneMenu
										binding="#{ingUsuario.ddEstado}" id="ddEstado" required="true"
										tabindex="19" value="#{SessionBean1.usuarioMant.ESTD_USUAR}">
										<f:selectItem itemLabel="ACTIVO" itemValue="A" />
										<f:selectItem itemLabel="INACTIVO" itemValue="I" />
										</h:selectOneMenu>
									</td>
								</tr>
								<tr>
									<td></td>
									<td><h:message binding="#{ingUsuario.inlineMessage6}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtTitulo" id="inlineMessage6" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td colspan="3"/>
								</tr>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText10}"
										id="outputText10" value="Observación:"/></td>
									<td colspan="4"><ui:textArea maxLength="255"
										binding="#{ingUsuario.txtObservacion}" id="txtObservacion"
										style="width: 480px" tabIndex="20"
										text="#{SessionBean1.usuarioMant.DESC_OBSERVACIONES}"
										validator="#{ingUsuario.txtNombres_validate}"/></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr style="height: 3px"></tr>
								<tr style="height: 23px">
									<td><h:outputText binding="#{ingUsuario.outputText18}"
										id="outputText18" value="#{SessionBean1.usuarioMant.FLAG_MANT == 'NEW' ? 'Motivo de creación:' : 'Motivo de modificación:'}" /></td>
									<td colspan="4"><ui:textArea maxLength="255" required="true"
										binding="#{ingUsuario.txtMotivo}" id="txtMotivo"
										style="width: 480px" tabIndex="21"
										text="#{SessionBean1.usuarioMant.DESC_MOTIVO}"/></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td></td>
									<td><h:message binding="#{ingUsuario.inlineMessage14}"
									errorClass="errorMessage" fatalClass="fatalMessage"
									for="txtMotivo" id="inlineMessage14" infoClass="infoMessage"
									showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 23px">
									<td></td>
									<td colspan="4" align="center"><h:messages
										binding="#{ingUsuario.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										globalOnly="true" id="messageList1" infoClass="infoMessage"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 23px">
									<td colspan="5" align="center">
										<ui:button  action="#{ingUsuario.btnGrabar_action}"
										binding="#{ingUsuario.btnGrabar}" id="btnGrabar" mini="true"
										style="width: 57px" tabIndex="23" text="Grabar" />
										<ui:button action="#{ingUsuario.btnCancelar_action}"
										binding="#{ingUsuario.btnCancelar}" id="btnCancelar"
										immediate="true" mini="true" style="width: 58px" tabIndex="22"
										text="Volver" />
										<ui:button action="#{ingUsuario.btnValidarDocumento_action}" id="btnValidarDocumento" mini="true" 
										style="display:none;" immediate="true"/>
									</td>
								</tr>
							</table>
							</td>
						</tr>
					</table>
				</ui:form>
			
          
			</ui:body>
			
			<script type="text/javascript">                        
                        function seleccionPerfil(perfil){                      
								
                        		if(perfil.value==20 ||perfil.value==30){
                        			document.getElementById("difMagistrado").style.display = "none";
	                       			document.getElementById("difMagistradoMsj").style.display = "none";
	                       			document.getElementById("magistrado").style.display = "";
	                       			document.getElementById("magistradoMsj").style.display = "";
	                       			document.getElementById("magistrado2").style.display = "";
	                       			document.getElementById("magistradoMsj2").style.display = "";

	                       			 
                        		}else{
                        		 	document.getElementById("difMagistrado").style.display = "";
	                       			document.getElementById("difMagistradoMsj").style.display = "";
	                       			document.getElementById("magistrado").style.display = "none";
	                       			document.getElementById("magistrado2").style.display = "none";
	                       			document.getElementById("magistradoMsj").style.display = "none";
	                       			document.getElementById("magistradoMsj2").style.display = "none";
                        		}                       		
                        }
                        
                        seleccionPerfil(document.getElementById("form1:ddPerfil"));
                      
            </script>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
