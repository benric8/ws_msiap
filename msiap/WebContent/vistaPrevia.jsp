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
		<ui:page binding="#{vistaPrevia.page1}" id="page1">
			<ui:html binding="#{vistaPrevia.html1}" id="html1">
			<ui:head binding="#{vistaPrevia.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Vista Previa de Impresion">

				<ui:script id="script2" url="/resources/moduleScripts.js" />
			</ui:head>
			<ui:body binding="#{vistaPrevia.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{vistaPrevia.form1}" id="form1">

					<table style="height:100%; width: 776px" align="center"
						width="776px" cellpadding="0px" cellspacing="0px">
						<tr>
							<td><f:subview id="header">
								<div><jsp:directive.include file="header.jspf" /></div>
							</f:subview></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
						</tr>
						<tr>
							<td align="left">
							<div style="position: absolute;z-index: 2;width: 578px; height: 578px; opacity: 0.15;filter:alpha(opacity=15)">
							<img style="width: 578px; height: 578px" src="${pageContext.request.contextPath}/images/VISPRE.gif"></img>
							</div>
							</td>
						</tr>
						<tr>
							<td>
							<div style="border: solid 1px; border-color: rgb(125,125,125); padding: 5lpx;width: 776px" align="center">
							<table style="height:100%; width: 750px; font-family: Arial; "
								width="750px" align="center" cellpadding="0px" cellspacing="0px">
								<tr>
									<td width="135px" style="width: 135px; padding: 0px" align="center"><img
										src="${pageContext.request.contextPath}/images/logopj.png"></img></td>
									<td width="640px" align="center" style="padding: 0px; width: 640px"><img
										src="${pageContext.request.contextPath}/images/header-rep.gif"></img></td>

								</tr>
								<tr align="left">
									<td colspan="2" align="left" style="font-family: Arial; font-size: 8px">REGISTRO NACIONAL DE CONDENAS</td>
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
										value="${SessionBean1.solicitudReporte.nume_certi}"></c:out></div>
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
												<c:if test="${SessionBean1.solicitudReporte.tipo_solic eq '03'}">
													ORG. JURISDICCIONAL SOLICITANTE
												</c:if>
												<c:if test="${SessionBean1.solicitudReporte.tipo_solic ne '03'}">
													INSTITUCIÓN SOLICITANTE
												</c:if>
											</td>
											<td colspan="3" align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${SessionBean1.solicitudReporte.desc_juzga_solic}"></c:out></div>
											</td>
										</tr>
										<tr  align="left">
											<td>MAGISTRADO / SEC.</td>
											<td style="width: 380px"  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${SessionBean1.solicitudReporte.nomb_juzga_solic}"></c:out></div>
											</td>
											<td>EXP.</td>
											<td>
											<div
												style="border:solid 1px rgb(125,125,125);padding: 5px;width: 100px"><c:out
												value="${SessionBean1.solicitudReporte.nume_exped_solic}"></c:out></div>
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
												value="${SessionBean1.solicitudReporte.apll_pater_solic}"></c:out></div>
											</td>
											<td  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
												value="${SessionBean1.solicitudReporte.apll_mater_solic}"></c:out></div>
											</td>
											<td  align="left">
											<div style="border: solid 1px rgb(125,125,125);padding: 5px;">
											<c:if test="${SessionBean1.solicitudReporte.nom1_solic != null}">
												<c:out value="${SessionBean1.solicitudReporte.nom1_solic}"/>
											</c:if>
											<c:if test="${SessionBean1.solicitudReporte.nom2_solic != null}">
												<c:out value=" ${SessionBean1.solicitudReporte.nom2_solic}"/>
											</c:if>
											<c:if test="${SessionBean1.solicitudReporte.nom3_solic != null}">
												<c:out value=" ${SessionBean1.solicitudReporte.nom3_solic}"/>
											</c:if>
											<c:if test="${SessionBean1.solicitudReporte.nom4_solic != null}">
												<c:out value=" ${SessionBean1.solicitudReporte.nom4_solic}"/>
											</c:if>
											<c:if test="${SessionBean1.solicitudReporte.nom5_solic != null}">
												<c:out value=" ${SessionBean1.solicitudReporte.nom5_solic}"/>
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
														<c:if test="${SessionBean1.solicitudReporte.doc_abreviatura != null}">
															<c:out value=" ${SessionBean1.solicitudReporte.doc_abreviatura} "/>
														</c:if>
														<c:out value="${SessionBean1.solicitudReporte.nume_ident_solic}"/>
													</div>
														
													</td>
													<td  align="left">
													<div style="border: solid 1px rgb(125,125,125);padding: 5px;">														
														<c:if test="${'1' eq SessionBean1.solicitudReporte.flagNacidoExterior}">
															<c:out value=" ${SessionBean1.solicitudReporte.lugarNacimiento} "/>
														</c:if>
														<c:if test="${'1' ne SessionBean1.solicitudReporte.flagNacidoExterior}">
															<c:out value="${SessionBean1.solicitudReporte.dep_descripcion}"></c:out>
														</c:if>
													</div>
													</td>
													<td align="left">
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;">
													<c:if
														test="${SessionBean1.solicitudReporte.fech_nacim_solic != null}">
														<fmt:formatDate pattern="dd/MM/yyyy"
															value="${SessionBean1.solicitudReporte.fech_nacim_solic}" />
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
														value="${SessionBean1.solicitudReporte.nom_padre}"></c:out></div>
													</td>
													<td  align="left">
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px;"><c:out
														value="${SessionBean1.solicitudReporte.nom_madre}"></c:out></div>
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
										test="${empty SessionBean1.solicitudReporte.boletinAntecedentes}">
											NO REGISTRA ANTECEDENTES PENALES											
									</c:if> <c:if
										test="${not empty SessionBean1.solicitudReporte.boletinAntecedentes}">
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
											test="${not empty SessionBean1.solicitudReporte.boletinAntecedentes}">
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
										<c:forEach items="${SessionBean1.solicitudReporte.boletinAntecedentes}" var="obj">
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
											test="${not empty SessionBean1.solicitudReporte.boletinRehabilitados}">
											<tr>
												<td colspan="8"
													style="color: gray; font-family: Arial; font-size: 12px; text-align: center; font-weight: bold;">
												INFORMACIÓN HISTÓRICA DE CONDENAS CANCELADAS</td>
											</tr>
											<c:if test="${empty SessionBean1.solicitudReporte.boletinAntecedentes}">
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
										<tr style="height: 10px">
											<td colspan="2"></td>
										</tr>
										<tr>
											<c:set var="num" value="0" />
											<c:forEach items="${SessionBean1.solicitudReporte.boletinRehabilitados}" var="obj">
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
								<tr style="height: 10px">
									<td colspan="2"></td>
								</tr>

								<tr>
									<td colspan="2" align="left">
									<div
										style="border: solid 2px rgb(125,125,125);padding: 5px;width: 750px;padding-top: 50px">
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
												src="${pageContext.request.contextPath}/images/${fn:trim(SessionBean1.solicitudReporte.sol_firma_codigo)}.jpg"></img><br/>
											${SessionBean1.solicitudReporte.sol_firma_nombre}<br/>
											${SessionBean1.solicitudReporte.sol_firma_sumilla}<br/>
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
														test="${SessionBean1.solicitudReporte.fech_digit_solic != null}">
														<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss a"
															value="${SessionBean1.solicitudReporte.fech_digit_solic}" />
													</c:if></div>
													</td>
												</tr>
												<tr>
													<td style="font-family: Arial;font-size: 9px;"
														align="right">Fecha Impresión:</td>
													<td>
													<div
														style="border: solid 1px rgb(125,125,125);padding: 5px; font-family: Arial;font-size: 9px">
														<jsp:useBean id="now" class="java.util.Date" />
														<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss a"	value="${now}" />
													</div>
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
												value=" ${SessionBean1.usuario.CODG_USUAR}"></c:out></td>
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
						<tr>
							<td></td>
						</tr>
					</table>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>