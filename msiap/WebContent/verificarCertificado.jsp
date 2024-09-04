<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:fn="http://java.sun.com/jsp/jstl/functions"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
	<ui:page binding="#{verificarCertificado.page1}" id="page1">
		<ui:html binding="#{verificarCertificado.html1}" id="html1">
		<ui:head binding="#{verificarCertificado.head1}" id="head1"
			title="#{SessionBean1.nombreApp} - Inicio">
			<ui:link binding="#{verificarCertificado.link1}" id="link1"
				url="/resources/stylesheet.css" />
			<ui:script binding="#{verificarCertificado.script1}" id="script1"
				url="/resources/SpryEffects.js" />
			<ui:script id="script2" url="/resources/moduleScripts.js" />
			<ui:script id="script3" url="/resources/funcionesJavascript.js" />
		</ui:head>
			<ui:body binding="#{verificarCertificado.body1}" id="body1" onLoad="validarCertificadoLoad()"
				style="background-color: #fcfbfb; -rave-layout: grid">
				<ui:form binding="#{verificarCertificado.form1}" id="form1">
					<table style="height:100%; width: 776px" align="center"	cellpadding="0px" cellspacing="0px">
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
								binding="#{verificarCertificado.staticText6}" id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; BUSCAR CERTIFICADO" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2">
							<fieldset style="width: 685px; align: center"><legend><ui:label
								binding="#{verificarCertificado.label1}" id="label1"
								text=" Datos del certificado a buscar:  " /></legend>

							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="10"></td>
								</tr>
								
								<tr>
									<td style="width: 120px"><ui:label
										binding="#{verificarCertificado.label2}" id="label2"
										text="Nro Certificado: " /></td>
									<td style="width: 100px"><ui:textField
										binding="#{verificarCertificado.txtNroSolicitud}" required="true"
										id="txtNroSolicitud" tabIndex="1" maxLength="14" style="width: 100px;"/></td>
									<td style="width: 20px"></td>
									<td style="width:  80px"><ui:label
										binding="#{verificarCertificado.label3}" id="label3"
										text="Año (yyyy): "/></td>
									<td style="width: 80px"><ui:textField
										binding="#{verificarCertificado.txtAnio}" required="true" toolTip="Año de presentación de la solicitud."
										id="txtAnio" tabIndex="2" maxLength="4" style="width: 70px;"/></td>
									<td style="width: 20px"></td>
									<td style="width:  80px"><ui:label
										binding="#{verificarCertificado.label4}" id="label4"
										text="Mes (mm): " /></td>
									<td style="width: 80px"><ui:textField
										binding="#{verificarCertificado.txtMes}" required="true" toolTip="Mes de presentación de la solicitud."
										id="txtMes" tabIndex="3" maxLength="2" style="width: 70px;"/></td>
									<td style="width: 80px" align="right">
											<ui:button action="#{verificarCertificado.btnVerCertificado}"
												binding="#{verificarCertificado.button2}" id="button2"
												mini="true" tabIndex="4" text="Buscar" /></td>
									<td align="right">
											<ui:button action="#{verificarCertificado.btnNuevo_action}"
												binding="#{verificarCertificado.btnNuevo}" id="btnNuevo"
												mini="true" tabIndex="5" text="Limpiar" immediate="true"/></td>
								</tr>

								<tr valign="middle" align="center">
									<td></td>
									<td valign="middle"><h:message
										binding="#{verificarCertificado.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtNroSolicitud" id="messageList1"
										infoClass="infoMessage" showDetail="false" showSummary="true"
										warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{verificarCertificado.messageList2}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtAnio" id="messageList2" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
									<td valign="middle"><h:message
										binding="#{verificarCertificado.messageList3}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										for="txtMes" id="messageList3" infoClass="infoMessage"
										showDetail="false" showSummary="true" warnClass="warnMessage" /></td>
									<td></td>
									<td></td>
								</tr>

								<tr style="height: 10px">
									<td colspan="10"></td>
								</tr>
							</table>
							</fieldset>
							</td>
						</tr>
						<tr style="height: 20px" valign="middle" align="center">
							<td colspan="2" valign="middle"><h:messages
								binding="#{verificarCertificado.messageList4}"
								errorClass="errorMessage" fatalClass="fatalMessage"
								id="messageList4" infoClass="infoMessage"
								warnClass="warnMessage" /></td>
						</tr>
						<tr>
							<td>
							<div style="border: solid 1px; border-color: rgb(125,125,125); padding: 5px; width: 776px; 
								display:none;" align="center" id="divCertificado">
							<table style="height:100%; width: 750px; font-family: Arial; "
								width="750px" align="center" cellpadding="0px" cellspacing="0px">
								<tr>
									<td width="135px" style="width: 135px; padding: 0px" align="center"><img
										src="${pageContext.request.contextPath}/images/logopj.png"></img></td>
									<td width="640px" align="center" style="padding: 0px; width: 640px"><img
										src="${pageContext.request.contextPath}/images/header-rep.gif"></img></td>

								</tr>
								<tr align="left">
									<td colspan="2" align="left" style="font-family: Arial; font-size: 8px">REGISTRO
									NACIONAL DE CONDENAS</td>
								</tr>
								<tr>
									<td align="center">
									<div style="border: solid 1px rgb(125,125,125);padding: 0px !important;font-size: 11px !important;">
									NRO. DE CERTIFICADO</div>
									</td>
									<td></td>
								</tr>
								<tr style="font-family: Arial;font-size: 9px" align="center">
									<td>
									<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
										value="${verificarCertificado.solicitudReporte.nume_certi}"></c:out></div>
									</td>
									<td>Carece de validez sin el refrendo del magistrado operador</td>
								</tr>

								<tr style="height: 5px">
									<td colspan="2"></td>
								</tr>
								<tr>
									<td colspan="2">
									<div
										style="border: solid 2px rgb(125,125,125);padding: 5px; width: 750px">
									<table>
										<tr  align="left">
											<td>
											<c:if test="${verificarCertificado.solicitudReporte.tipo_solic eq '03'}">
													ORG. JURISDICCIONAL SOLICITANTE
											</c:if>
											<c:if test="${verificarCertificado.solicitudReporte.tipo_solic ne '03'}">
												INSTITUCIÓN SOLICITANTE
											</c:if>
											</td>
											<td colspan="3" align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${verificarCertificado.solicitudReporte.desc_juzga_solic}"></c:out></div>
											</td>
										</tr>
										<tr  align="left">
											<td>MAGISTRADO/FISCAL/SEC.</td>
											<td style="width: 380px"  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${verificarCertificado.solicitudReporte.nomb_juzga_solic}"></c:out></div>
											</td>
											<td>EXP.</td>
											<td>
											<div
												style="border:solid 1px rgb(125,125,125);padding: 5px;width: 100px"><c:out
												value="${verificarCertificado.solicitudReporte.nume_exped_solic}"></c:out></div>
											</td>
										</tr>
									</table>
									</div>
									</td>
								</tr>
								<tr style="height: 5px">
									<td colspan="2"></td>
								</tr>
								<tr>
									<td colspan="2">
									<div
										style="border: solid 2px rgb(125,125,125);padding: 5px;width: 750px">
									<table>
										<tr  align="left">
											<td style="font-weight: bold;">SE CERTIFICA QUE:</td>
											<td colspan="2"></td>
										</tr>
										<tr  align="left">
											<td>APELLIDO PATERNO</td>
											<td>APELLIDO MATERNO</td>
											<td>NOMBRE(S)</td>
										</tr>
										<tr>
											<td  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${verificarCertificado.solicitudReporte.apll_pater_solic}"></c:out></div>
											</td>
											<td  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${verificarCertificado.solicitudReporte.apll_mater_solic}"></c:out></div>
											</td>
											<td  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;">
											<c:if test="${verificarCertificado.solicitudReporte.nom1_solic != null}">
												<c:out value="${verificarCertificado.solicitudReporte.nom1_solic}"/>
											</c:if>
											<c:if test="${verificarCertificado.solicitudReporte.nom2_solic != null}">
												<c:out value=" ${verificarCertificado.solicitudReporte.nom2_solic}"/>
											</c:if>
											<c:if test="${verificarCertificado.solicitudReporte.nom3_solic != null}">
												<c:out value=" ${verificarCertificado.solicitudReporte.nom3_solic}"/>
											</c:if>
											<c:if test="${verificarCertificado.solicitudReporte.nom4_solic != null}">
												<c:out value=" ${verificarCertificado.solicitudReporte.nom4_solic}"/>
											</c:if>
											<c:if test="${verificarCertificado.solicitudReporte.nom5_solic != null}">
												<c:out value=" ${verificarCertificado.solicitudReporte.nom5_solic}"/>
											</c:if>
											</div>
											</td>
										</tr>
										<tr  align="left">
											<td style="font-weight: bold;">GENERALES DE LEY</td>
											<td colspan="2"></td>
										</tr>

										<tr  align="left">
											<td colspan="3">
											<div
												style="border: solid 2px rgb(125,125,125);padding: 5px;width: 730px">
											<table>
												<tr  align="left">
													<td style="width: 210px">DOCUMENTO DE IDENTIDAD</td>
													<td style="width: 210px">LUGAR DE NACIMIENTO</td>
													<td style="width: 210px">FECHA DE NACIMIENTO</td>
												</tr>
												<tr  align="left">
													<td  align="left">
													<div style="border: solid 1px rgb(125,125,125);padding: 5px;">
														<c:if test="${verificarCertificado.solicitudReporte.doc_abreviatura != null}">
															<c:out value=" ${verificarCertificado.solicitudReporte.doc_abreviatura} "/>
														</c:if>
														<c:out value="${verificarCertificado.solicitudReporte.nume_ident_solic}"/>
													</div>
														
													</td>
													<td  align="left">
														<div style="border: solid 1px rgb(125,125,125);padding: 5px;">															
															<c:if test="${'1' eq verificarCertificado.solicitudReporte.flagNacidoExterior}">
																<c:out value=" ${verificarCertificado.solicitudReporte.lugarNacimiento} "/>
															</c:if>
															<c:if test="${'1' ne verificarCertificado.solicitudReporte.flagNacidoExterior}">
																<c:out value="${verificarCertificado.solicitudReporte.dep_descripcion}"></c:out>
															</c:if>
														</div>
													</td>
													<td align="left">
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;">
													<c:if
														test="${verificarCertificado.solicitudReporte.fech_nacim_solic != null}">
														<fmt:formatDate pattern="dd/MM/yyyy"
															value="${verificarCertificado.solicitudReporte.fech_nacim_solic}" />
													</c:if></div>
													</td>
												</tr>
												<tr  align="left">
													<td>NOMBRE DEL PADRE</td>
													<td>NOMBRE DE LA MADRE</td>
													<td></td>
												</tr>
												<tr  align="left">
													<td  align="left">
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
														value="${verificarCertificado.solicitudReporte.nom_padre}"></c:out></div>
													</td>
													<td  align="left">
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
														value="${verificarCertificado.solicitudReporte.nom_madre}"></c:out></div>
													</td>
													<td></td>
												</tr>
											</table>
											</div>
											</td>
										</tr>
									</table>
									</div>
									</td>
								</tr>


								<tr style="height: 10px">
									<td colspan="2"></td>
								</tr>
								<tr>
									<td colspan="2"
										style="font-family: Arial; font-size: 12px; text-align: center;font-weight: bold;">
									<c:if
										test="${empty verificarCertificado.solicitudReporte.boletinAntecedentes}">
											NO REGISTRA ANTECEDENTES PENALES											
									</c:if> <c:if
										test="${not empty verificarCertificado.solicitudReporte.boletinAntecedentes}">
											SI REGISTRA ANTECEDENTES PENALES
									</c:if></td>
								</tr>

								<tr style="height: 10px">
									<td colspan="2"></td>
								</tr>
								<tr>
									<td colspan="2">
									<table style="font-family: Arial; font-size: 9px;">
										<c:if
											test="${not empty verificarCertificado.solicitudReporte.boletinAntecedentes}">
											<tr>
												<td colspan="8">
												<hr />
												</td>
											</tr>
											<tr
												style="font-family: Arial Black;font-size: 9px;font-weight: bold">
												<td></td>
												<td style="font-family: Arial;font-size: 9px;">FECHNACI</td>
												<td style="font-family: Arial;font-size: 9px;">ORG.
												JURISD. QUE SENTENCIÓ</td>
												<td style="font-family: Arial;font-size: 9px;">Nº EXP.</td>
												<td style="font-family: Arial;font-size: 9px;">FECHA</td>
												<td style="font-family: Arial;font-size: 9px; width: 150px" width="150px">DELITO(S)</td>
												<td style="font-family: Arial;font-size: 9px;">TIEMPO DE
												PENA</td>
												<td style="font-family: Arial; font-size: 9px;">TIPO DE
												PENA</td>
											</tr>
											<tr>
												<td colspan="8">
												<hr />
												</td>
											</tr>
										</c:if>

										<c:set var="num" value="0" />
										<c:forEach items="${verificarCertificado.solicitudReporte.boletinAntecedentes}" var="obj">
											<c:set var="num" value="${num+1}" />
											<tr align="left" style="font-family: Arial;font-size: 9px;">
												<td
													style="font-family: Arial;font-size: 9px;font-weight: bold">${num}.</td>
												<td style="font-family: Arial;font-size: 9px;">
												<c:if test="${fn:length(obj.fech_nacim_boletn) == 8}" >
													${fn:substring(obj.fech_nacim_boletn,6,8)}/${fn:substring(obj.fech_nacim_boletn,4,6)}/${fn:substring(obj.fech_nacim_boletn,0,4)}
												</c:if>
												</td>
												<td style="font-family: Arial;font-size: 9px;">
													<c:if test="${obj.numr_insta_boletn != null}">
														<c:out value="${obj.numr_insta_boletn}° "/>
													</c:if>
													<c:if test="${obj.instancia_boletin != null}">
														<c:out value="${obj.instancia_boletin}"/>
													</c:if>
													<c:if test="${obj.lugar_boletin != null}">
														<c:out value=" de ${obj.lugar_boletin}"/>
													</c:if>
												</td>
												<td style="font-family: Arial;font-size: 9px;">${obj.nume_expte_boletn}</td>
												<td style="font-family: Arial;font-size: 9px;">
												<c:if test="${fn:length(obj.fech_pronu_boletn) == 8}" >											  
													${fn:substring(obj.fech_pronu_boletn,6,8)}/${fn:substring(obj.fech_pronu_boletn,4,6)}/${fn:substring(obj.fech_pronu_boletn,0,4)}
												</c:if>
												</td>
												<td style="font-family: Arial;font-size: 9px;">
													<c:if test="${obj.delito1 != null}"><c:out value="${obj.delito1}"/></c:if>
													<c:if test="${obj.delito2 != null}"> / <c:out value="${obj.delito2}"/></c:if>
													<c:if test="${obj.delito3 != null}"> / <c:out value="${obj.delito3}"/></c:if>
													<c:if test="${obj.delito4 != null}"> / <c:out value="${obj.delito4}"/></c:if>
													<c:if test="${obj.delito5 != null}"> / <c:out value="${obj.delito5}"/></c:if>
												</td>
												<td style="font-family: Arial;font-size: 9px;">
												<c:choose>
													<c:when test="${obj.anno_pena_boletn != null}">${obj.anno_pena_boletn}-</c:when> 
													<c:otherwise>0-</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${obj.mess_pena_boletn != null}">${obj.mess_pena_boletn}-</c:when> 
													<c:otherwise>0-</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${obj.diaa_pena_boletn != null}">${obj.diaa_pena_boletn}</c:when> 
													<c:otherwise>0</c:otherwise>
												</c:choose>
												<c:if test="${obj.fech_inici_conden != null}">
													Desde <fmt:formatDate pattern="dd/MM/yyyy" value="${obj.fech_inici_conden}" />
												</c:if> 
												<c:if test="${obj.fech_fin_conden != null}"> 
													a <fmt:formatDate pattern="dd/MM/yyyy" value="${obj.fech_fin_conden}" />
												</c:if> 
												</td>
												
												<td style="font-family: Arial; font-size: 9px;">${obj.desc_pena}</td>

												<c:if test="${not empty obj.otrosDelitos}">
													<tr align="right">
														<td colspan="8">
														<table> 
															<tr align="left">
																<td style="font-family: Arial;font-size: 7px;"><i><u>Delito(s) Adicional(es)</u></i></td>
																</tr>															
															<c:forEach items="${obj.otrosDelitos}" var="delitos">
																<tr align="left">
																	<td style="font-family: Arial; font-size: 9px;">${delitos.desc_delit}</td>
																</tr>
															</c:forEach>
														</table>
														</td>
													</tr>
												</c:if>
											</tr>
										</c:forEach>
										<!-- vencidos -->
										<tr style="height: 20px">
											<td colspan="2"></td>
										</tr>
										<c:if
											test="${not empty verificarCertificado.solicitudReporte.boletinRehabilitados}">
											<tr>
												<td colspan="8"
													style="color: gray; font-family: Arial; font-size: 12px; text-align: center; font-weight: bold;">
												INFORMACIÓN HISTÓRICA DE CONDENAS CANCELADAS</td>
											</tr>
											<c:if test="${empty verificarCertificado.solicitudReporte.boletinAntecedentes}">
											<tr>
												<td colspan="8">
												<hr />
												</td>
											</tr>
											<tr
												style="font-family: Arial Black; font-size: 9px; font-weight: bold">
												<td></td>
												<td style="font-family: Arial; font-size: 9px;">FECHNACI</td>
												<td style="font-family: Arial; font-size: 9px;">ORG.
												JURISD. QUE SENTENCIÓ</td>
												<td style="font-family: Arial; font-size: 9px;">Nº EXP.</td>
												<td style="font-family: Arial; font-size: 9px;">FECHA</td>
												<td style="font-family: Arial; font-size: 9px; width: 150px"
													width="150px">DELITO(S)</td>
												<td style="font-family: Arial; font-size: 9px;">TIEMPO
												DE PENA</td>
												<td style="font-family: Arial; font-size: 9px;">TIPO DE
												PENA</td>
											</tr>
											<tr>
												<td colspan="8">
												<hr />
												</td>
											</tr>
											</c:if>	
										</c:if>
										<tr>
											<c:set var="num" value="0" />
											<c:forEach items="${verificarCertificado.solicitudReporte.boletinRehabilitados}" var="obj">
													<c:set var="num" value="${num+1}" />
													<tr align="left"
														style="font-family: Arial; font-size: 9px;">
														<td
															style="font-family: Arial; font-size: 9px; font-weight: bold">${num}.</td>
														<td style="font-family: Arial; font-size: 9px;">
														<c:if test="${fn:length(obj.fech_nacim_boletn) == 8}" >											  
															${fn:substring(obj.fech_nacim_boletn,6,8)}/${fn:substring(obj.fech_nacim_boletn,4,6)}/${fn:substring(obj.fech_nacim_boletn,0,4)}
														</c:if>
														</td>
														<td style="font-family: Arial; font-size: 9px;">
														<c:if test="${obj.numr_insta_boletn != null}">
															<c:out value="${obj.numr_insta_boletn}° "/>
														</c:if>
														<c:if test="${obj.instancia_boletin != null}">
															<c:out value="${obj.instancia_boletin}"/>
														</c:if>
														<c:if test="${obj.lugar_boletin != null}">
															<c:out value=" de ${obj.lugar_boletin}"/>
														</c:if>
														</td>
														<td style="font-family: Arial; font-size: 9px;">${obj.nume_expte_boletn}</td>
														<td style="font-family: Arial; font-size: 9px;">
														<c:if test="${fn:length(obj.fech_pronu_boletn) == 8}" >											  
															${fn:substring(obj.fech_pronu_boletn,6,8)}/${fn:substring(obj.fech_pronu_boletn,4,6)}/${fn:substring(obj.fech_pronu_boletn,0,4)}
														</c:if>
														</td>
														<td style="font-family: Arial; font-size: 9px;">
														<c:if test="${obj.delito1 != null}"><c:out value="${obj.delito1}"/></c:if>
														<c:if test="${obj.delito2 != null}"> / <c:out value="${obj.delito2}"/></c:if>
														<c:if test="${obj.delito3 != null}"> / <c:out value="${obj.delito3}"/></c:if>
														<c:if test="${obj.delito4 != null}"> / <c:out value="${obj.delito4}"/></c:if>
														<c:if test="${obj.delito5 != null}"> / <c:out value="${obj.delito5}"/></c:if>
														</td>
													<td style="font-family: Arial;font-size: 9px;"><c:choose>
													<c:when test="${obj.anno_pena_boletn != null}">${obj.anno_pena_boletn}-</c:when> 
														<c:otherwise>0-</c:otherwise>
													</c:choose>
													<c:choose>
														<c:when test="${obj.mess_pena_boletn != null}">${obj.mess_pena_boletn}-</c:when> 
														<c:otherwise>0-</c:otherwise>
													</c:choose>
													<c:choose>
														<c:when test="${obj.diaa_pena_boletn != null}">${obj.diaa_pena_boletn}</c:when> 
														<c:otherwise>0</c:otherwise>
													</c:choose>
													<c:if test="${obj.fech_inici_conden != null}">
														Desde <fmt:formatDate pattern="dd/MM/yyyy" value="${obj.fech_inici_conden}" />
													</c:if> 
													<c:if test="${obj.fech_fin_conden != null}"> 
														a <fmt:formatDate pattern="dd/MM/yyyy" value="${obj.fech_fin_conden}" />
													</c:if> 
													</td>
													<td style="font-family: Arial; font-size: 9px;">${obj.desc_pena}</td>

														<c:if test="${not empty obj.otrosDelitos}">
															<tr align="right">
																<td colspan="8">
																<table> 
																	<tr align="left">
																		<td style="font-family: Arial; font-size: 7px;"><i><u>Delitos
																		Adicionales</u></i></td>
																	</tr>
																<c:forEach items="${obj.otrosDelitos}"	var="delitos">
																	<tr align="left">
																		<td style="font-family: Arial;font-size: 9px;">${delitos.desc_delit}</td>
																	</tr>																
																</c:forEach>
																</table>
															</td>
													</tr>
												</c:if>
												<c:if test="${not empty obj.numr_boletn_rehab}">
													<tr  align="left">
														<td colspan="2"></td>
														<td colspan="6" style="font-family: Arial; font-size: 9px;">
														CANCELADO - 
														<c:if test="${obj.numr_insta_rehab != null}">
															<c:out value="${obj.numr_insta_rehab}° "/>
														</c:if>
														<c:if test="${obj.instancia_rehab != null}">
															<c:out value="${obj.instancia_rehab}"/>
														</c:if>
														<c:if test="${obj.lugar_rehab != null}">
															<c:out value=" de ${obj.lugar_rehab}"/>
														</c:if>
														. Fecha: 
														<c:if test="${fn:length(obj.fech_rehab) == 8}" >
															${fn:substring(obj.fech_rehab,6,8)}/${fn:substring(obj.fech_rehab,4,6)}/${fn:substring(obj.fech_rehab,0,4)}
														</c:if>
														</td>
													</tr>
												</c:if>										
											</tr>
										</c:forEach>
										</tr>
									</table>
									</td>
								</tr>
								<tr style="height: 15px">
									<td colspan="2"></td>
								</tr>

								<tr>
									<td colspan="2" align="left">
									<div style="border: solid 2px rgb(125,125,125);padding: 5px;width: 750px;padding-top: 50px">
									RÚBRICA O CERTIFICACIÓN DEL MAGISTRADO</div>
									</td>
								</tr>
								<tr style="height: 10px">
									<td colspan="2"></td>
								</tr>
								<tr>
									<td colspan="2" align="center"><img height="30px"
										src="${pageContext.request.contextPath}/images/EXGRAT.png"></img></td>
								</tr>
								<tr>
									<td colspan="2">
									<table border="0px" cellpadding="0px" cellspacing="0px">
										<tr>
											<td style="width: 100px"></td>
											<td rowspan="5"
												style="font-family: Arial;font-size: 9px;width: 420px"
												align="center"><img width="170px" height="81px" style="width:170px ;height: 81px"
												src="${pageContext.request.contextPath}/images/${fn:trim(verificarCertificado.solicitudReporte.sol_firma_codigo)}.jpg"></img><br/>
											${verificarCertificado.solicitudReporte.sol_firma_nombre}<br/>
											${verificarCertificado.solicitudReporte.sol_firma_sumilla}<br/>
											GERENCIA GENERAL - PODER JUDICIAL</td>
											<td style="width: 120px;"></td>
											<td style="width: 120px;"></td>
										</tr>
										<tr>
											<td></td>
											<td colspan="2" align="right">
											<table>
												<tr>
													<td style="font-family: Arial;font-size: 9px;"
														align="right">Fecha Solicitud:</td>
													<td>
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;font-family: Arial;font-size: 9px">
													<c:if
														test="${verificarCertificado.solicitudReporte.fech_digit_solic != null}">
														<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss a"
															value="${verificarCertificado.solicitudReporte.fech_digit_solic}" />
													</c:if></div>
													</td>
												</tr>
												<tr>
													<td style="font-family: Arial;font-size: 9px;"
														align="right">Fecha Impresión:</td>
													<td>
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px; font-family: Arial;font-size: 9px">
														<c:if
														test="${verificarCertificado.solicitudReporte.fech_impresion != null}">
														<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss a"
															value="${verificarCertificado.solicitudReporte.fech_impresion}" />
													</c:if></div>
													</td>
												</tr>

											</table>

											</td>


										</tr>
										<tr>
											<td></td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<td></td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<td></td>
											<td></td>
											<td></td>
										</tr>

										<tr>
											<td>Pagina 1 de 1</td>
											<td></td>

											<td colspan="2" align="right">Operador: <c:out
												value=" ${verificarCertificado.solicitudReporte.codg_usuar}"></c:out></td>
										</tr>
										<tr>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
										</tr>

									</table>
									</td>
								</tr>

							</table>
							</div>
							</td>
						</tr>
					</table>
				</ui:form>
			</ui:body>
			<script type="text/javascript">                        
		    function validarCertificadoLoad(){
		    	var varDisplay = '<c:out value="${verificarCertificado.displayCertificado}"/>';
		    	document.getElementById("divCertificado").style.display = varDisplay;
		    }                        
            </script>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>