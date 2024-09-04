<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jstl/core_rt"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page import="javax.faces.context.FacesContext" />
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<!-- jsp:useBean id="SessionBean1" class="uif.SessionBean1"></jsp:useBean-->
	<f:view>
		<ui:page binding="#{buscarSolicitudes.page1}" id="page1">
			<ui:html binding="#{buscarSolicitudes.html1}" id="html1">
			<ui:head binding="#{buscarSolicitudes.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Inicio">
				<ui:link binding="#{buscarSolicitudes.link1}" id="link1" url="/resources/stylesheet.css" />
				<ui:link binding="#{buscarSolicitudes.link2}" id="link2" url="/resources/caja.css" />
				<ui:script id="script1"	url="/resources/SpryEffects.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js"/>
				<ui:script id="script3" url="/resources/funcionesJavascript.js"/>
				<script language="javascript" src="${pageContext.request.contextPath}/resources/xp_progress.js">
				var revision=0;
				</script> 
			</ui:head>
			
			<ui:body binding="#{buscarSolicitudes.body1}" id="body1"
				style="background-color: #fcfbfb; -rave-layout: grid" onLoad="document.getElementById('WindowLoad').style.display='none'">

				<script language="javascript">
					var wind = 0;
					function wind_display(){
						console.debug("wind_display()...");
						return "";
					}
					function copiar() {
						var valor = document.getElementById('form1:txtNroOficio').value;
						var campo = valor.split("-");
						var campo1 = completar(campo[0]);
						var campo2 = campo[1];
						var campo3 = campo[2];
						var resultado = '';
						if(campo1!=null) resultado=campo1;
						if(campo2!=null) resultado=campo1+'-'+campo2;
						if(campo3!=null) resultado=campo1+'-'+campo2+'-'+campo3;
						document.getElementById('form1:txtNroOficio').value = resultado; 
					}
					function completar(num){
						var numtmp = num;
						var largo = numtmp.length;
						if(largo==5){
							return numtmp;
						}else{
							var faltas=5-largo;
							var total='';
							if(faltas==1) total='0'+numtmp;
							if(faltas==2) total='00'+numtmp;
							if(faltas==3) total='000'+numtmp;
							if(faltas==4) total='0000'+numtmp;
							return total;
						}
					}
				</script>
				
				<ui:form binding="#{buscarSolicitudes.form1}" id="form1">
					<table style="height: 100%; width: 776px" align="center" cellpadding="0px" cellspacing="0px">
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
							<td colspan="2">
							<ui:staticText binding="#{buscarSolicitudes.staticText6}" id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8" text="&gt; BUSCADOR DE SOLICITUDES" />
							</td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2">

							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 23px">
									<td style="width: 140px">
										<ui:label binding="#{buscarSolicitudes.lblTipoBusqueda}" id="lblTipoBusqueda1" text="Tipo de busqueda:" /></td>
									<td style="width: 70px">
										<ui:button action="#{buscarSolicitudes.btnExterna_action}" binding="#{buscarSolicitudes.btnExterna}" 
											id="btnExterna" text="Externa" style="#{buscarSolicitudes.colorExterna}" />
									</td>
									<td style="width: 70px">
										<ui:button action="#{buscarSolicitudes.btnInterna_action}" binding="#{buscarSolicitudes.btnInterna}" 
											id="btnInterna" text="Interna" style="#{buscarSolicitudes.colorInterna}" />
									</td>
									<td style="width: 90px"></td>
									<td style="width: 70px"></td>
									<td style="width: 150px"></td>
								</tr>
								<tr style="height: 20px">
									<td colspan="6"></td>
								</tr>
							</table>

							<fieldset style="width: 680px; align: center">
							<legend>
							<ui:label binding="#{buscarSolicitudes.label1}" id="label1" text=" FILTRAR ESTADO DE LAS SOLICITUDES POR: " />
							</legend>
						<c:if test="${SessionBean1.tipoBusqueda=='E'}">
							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="6"></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.lblEntidad}" id="lblEntidad" text="Entidad:" /></td>
									<td colspan="5">
										<h:selectOneMenu id="ddEntidad" value="#{buscarSolicitudes.codEntidad}" >
											<f:selectItems binding="#{buscarSolicitudes.selectItemsEntidad}" id="selectItemsEntidad"
												value="#{SessionBean1.entidadExternas.options['CODG_ENTIDAD_EXTERNA,DESC_ENTIDAD_EXTERNA']}" />
										</h:selectOneMenu></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label8}" id="label8" text="Estado:" /></td>
									<td colspan="2">
										<h:selectOneMenu id="ddEstado" value="#{buscarSolicitudes.codEstado}" tabindex="2">
											<f:selectItems binding="#{buscarSolicitudes.selectItemsEstados}" id="selectItemsEstados"
												value="#{SessionBean1.estadosSolicitud.options['CODG_ESTADO,DESC_ESTADO']}" />
										</h:selectOneMenu>
									</td>
									<td style="width: 20px"></td>
									<td colspan="2">
										<ui:label binding="#{buscarSolicitudes.label9}" id="label9" text="Apellidos y nombres del verificado:" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"></td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label3}" id="label3" text="Paterno:" /></td>
									<td style="width: 150px">
										<ui:textField binding="#{buscarSolicitudes.txtPaterno}" id="txtPaterno" maxLength="14" tabIndex="5"
										validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label2}" id="label2" text="Fecha:" /></td>
									<td style="width: 140px">
										<ui:label binding="#{buscarSolicitudes.label4}" id="label4" text="Desde:" /></td>
									<td style="width: 140px">
										<ui:label binding="#{buscarSolicitudes.label5}" id="label5" text="Hasta:" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label6}" id="label6" text="Materno:" /></td>
									<td style="width: 150px">
										<ui:textField binding="#{buscarSolicitudes.txtMaterno}" id="txtMaterno"
										maxLength="14" tabIndex="6" validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{buscarSolicitudes.calDesde}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calDesde" tabIndex="3"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{buscarSolicitudes.calHasta}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calHasta" tabIndex="4"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"><ui:label
										binding="#{buscarSolicitudes.label7}" id="label7" text="Nombres:" /></td>
									<td style="width: 150px"><ui:textField
										binding="#{buscarSolicitudes.txtNombres}" id="txtNombres"
										maxLength="14" tabIndex="7"
										validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label11}" id="label11" text="Numero de Oficio:" /></td>
									<td style="width: 140px">
										<ui:textField binding="#{buscarSolicitudes.txtNroOficio}" id="txtNroOficio" 
											maxLength="12" toolTip="XXXXX-AAAA-(A|B)" /></td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label10}" id="label10" text="Numero de Solicitud:" /></td>
									<td style="width: 150px">
										<ui:textField binding="#{buscarSolicitudes.txtNroSolicitud}" id="txtNroSolicitud" maxLength="12" /></td>
									
								</tr>	
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px">XXXXX-AAAA-(A|B) <br/> Por ej. 00190-2017-A</td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"></td>
									<td style="width: 150px"></td>
								</tr>								
								<tr style="height: 30px" valign="middle" align="center">
									<td colspan="5" valign="middle">
										<h:messages id="messageList1" binding="#{buscarSolicitudes.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage" infoClass="infoMessage" warnClass="warnMessage" /></td>
									<td style="width: 150px" align="right">
										<ui:button action="#{buscarSolicitudes.btnBuscar_action}" binding="#{buscarSolicitudes.btnBuscar}" 
										id="btnBuscar1" tabIndex="8" text="Buscar" /></td>
								</tr>
							</table>
						</c:if>
						<c:if test="${SessionBean1.tipoBusqueda=='I'}">
							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="6"></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label8}" id="label28" text="Estado:" /></td>
									<td colspan="2">
										<h:selectOneMenu id="ddEstadoSolicitud" value = "#{buscarSolicitudes.codEstadoSolicitud}">
											<f:selectItem itemValue = "%" itemLabel = "TODOS LOS ESTADOS" /> 
								            <f:selectItem itemValue = "1" itemLabel = "Por imprimir" /> 
								            <f:selectItem itemValue = "2" itemLabel = "Impreso" /> 
								            <f:selectItem itemValue = "3" itemLabel = "Observado" /> 
								         </h:selectOneMenu>  
									</td>
									<td style="width: 20px"></td>
									<td colspan="2">
										<ui:label binding="#{buscarSolicitudes.label9}" id="label29" text="Apellidos y nombres del verificado:" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"></td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label3}" id="label23" text="Paterno:" /></td>
									<td style="width: 150px">
										<ui:textField binding="#{buscarSolicitudes.txtPaterno}" id="txtPaterno2" maxLength="14" tabIndex="5"
										validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label2}" id="label22" text="Fecha:" /></td>
									<td style="width: 140px">
										<ui:label binding="#{buscarSolicitudes.label4}" id="label24" text="Desde:" /></td>
									<td style="width: 140px">
										<ui:label binding="#{buscarSolicitudes.label5}" id="label25" text="Hasta:" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label6}" id="label26" text="Materno:" /></td>
									<td style="width: 150px">
										<ui:textField binding="#{buscarSolicitudes.txtMaterno}" id="txtMaterno2"
										maxLength="14" tabIndex="6" validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{buscarSolicitudes.calDesde}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calDesde2" tabIndex="3"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{buscarSolicitudes.calHasta}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calHasta2" tabIndex="4"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"><ui:label
										binding="#{buscarSolicitudes.label7}" id="label27" text="Nombres:" /></td>
									<td style="width: 150px"><ui:textField
										binding="#{buscarSolicitudes.txtNombres}" id="txtNombres2"
										maxLength="14" tabIndex="7"
										validator="#{buscarSolicitudes.txtNombres_validate}" /></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px">
										<ui:label binding="#{buscarSolicitudes.label12}" id="label12" text="Numero de Certificado:" /></td>
									<td style="width: 140px">
										<ui:textField binding="#{buscarSolicitudes.txtNroCertificado}" id="txtNroCertificado" maxLength="12" /></td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"></td>
									<td style="width: 150px"></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"></td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"></td>
									<td style="width: 150px"></td>
								</tr>								
								<tr style="height: 30px" valign="middle" align="center">
									<td colspan="5" valign="middle">
										<h:messages id="messageList2" binding="#{buscarSolicitudes.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage" infoClass="infoMessage" warnClass="warnMessage" /></td>
									<td style="width: 150px" align="right">
										<ui:button action="#{buscarSolicitudes.btnBuscar_action}" binding="#{buscarSolicitudes.btnBuscar}" 
										id="btnBuscar2" tabIndex="8" text="Buscar" /></td>
								</tr>
							</table>
						</c:if>

							</fieldset>
							</td>
						</tr>
						<tr style="height: 10px">
							<td colspan="2"></td>
						</tr>
					</table>
				<c:if test="${SessionBean1.tipoBusqueda=='E'}">
					<table style="height: 100%; width: 776px" align="center" cellpadding="0px" cellspacing="0px">
						<tr style="height: 100%">
							<td style="width: 90%" valign="top">
							<ui:table augmentTitle="false" binding="#{buscarSolicitudes.table1}" clearSortButton="true" id="table1" 
								paginateButton="true" paginationControls="true" style="height: 100px; width: 776px;display:block;" 
								title="Estado de las Solicitudes" >
								<ui:tableRowGroup binding="#{buscarSolicitudes.tableRowGroup1}" 
									emptyDataMsg="No se han encontrado registros" id="tableRowGroup1" rows="10"
									sourceData="#{SessionBean1.solicitudesExternas}" sourceVar="currentRow">
									<ui:tableColumn align="right"
										binding="#{buscarSolicitudes.tableColumnNroSolicit}"
										headerText="Nro.Solicitud" id="tableColumnNroSolicit"
										style="#{buscarSolicitudes.columnStyle}" width="100px">
										<ui:staticText binding="#{buscarSolicitudes.staticText8}"
											id="staticText8"
											style="text-align: right; #{buscarSolicitudes.color}"
											text="#{currentRow.value['CODG_CERTI_EXTERNO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn2}"
										headerText="Registrador" id="tableColumn2" sort="CODG_USUAR"
										style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText4}"
											id="staticText4" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['CODG_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn3}"
										headerText="Estado" id="tableColumn3" sort="CODG_ESTADO"
										style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText3}"
											id="staticText3" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['DESC_ESTADO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn7}"
										headerText="Fech.Envio" id="tableColumn7" sort="FECH_ENVIO"
										style="#{buscarSolicitudes.columnStyle}">
										<c:if test="#{currentRow.value['FECH_ENVIO'] != null}">
											<fmt:formatDate pattern="dd/MM/yyyy"
												value="#{currentRow.value['FECH_ENVIO']}" />
										</c:if>
										<ui:staticText binding="#{buscarSolicitudes.staticText7}"
											converter="#{buscarSolicitudes.dateTimeConverter1}"
											id="staticText7" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['FECH_ENVIO']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{buscarSolicitudes.tableColumn5}"
										headerText="Reg. Atendidos" id="tableColumn5"
										sort="NUM_REGISTROS_ATENDIDOS"
										style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText2}"
											id="staticText2" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['NUM_REGISTROS_ATENDIDOS']} de #{currentRow.value['NUM_REGISTROS_ATENDIDOS']+currentRow.value['NUM_REGISTROS_POR_ATENDER']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn11}"
										headerText="Oficio A" id="tableColumn11"
										sort="v_OFI_RESPUESTA_A" style="#{buscarSolicitudes.columnStyle}">
										<ui:button action="#{buscarSolicitudes.btnVerA_action}"
											binding="#{buscarSolicitudes.btnVerA}" id="btnVerA" mini="true"
											rendered="#{buscarSolicitudes.renderedOficioA}"
											text="#{currentRow.value['v_OFI_RESPUESTA_A']}">
										</ui:button>
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn12}"
										headerText="Oficio B" id="tableColumn12"
										sort="v_OFI_RESPUESTA_B" style="#{buscarSolicitudes.columnStyle}">
										<ui:button action="#{buscarSolicitudes.btnVerB_action}"
											binding="#{buscarSolicitudes.btnVerB}" id="btnVerB" mini="true"
											rendered="#{buscarSolicitudes.renderedOficioB}"
											text="#{currentRow.value['v_OFI_RESPUESTA_B']}">
										</ui:button>
									</ui:tableColumn>
								</ui:tableRowGroup>
							</ui:table>
							</td>
							<td valign="top">
							</td>
						</tr>
					</table>
				</c:if>
				<c:if test="${SessionBean1.tipoBusqueda=='I'}">
					<table style="height: 100%; width: 776px" align="center" cellpadding="0px" cellspacing="0px">
						<tr style="height: 100%">
							<td style="width: 90%" valign="top">
							<ui:table cellPadding="0" cellSpacing="0" augmentTitle="false"
								binding="#{buscarSolicitudes.table2}" clearSortButton="true"
								id="table2" paginateButton="true" paginationControls="true"
								style="height: 100px; width: 776px;display:block;" title="Lista de Solicitudes" >
								<ui:tableRowGroup binding="#{buscarSolicitudes.tableRowGroup2}"
									emptyDataMsg="No se han encontrado registros" id="tableRowGroup2" rows="10"
									sourceData="#{SessionBean1.solicitudInterna}" sourceVar="currentRow">
									<ui:tableColumn align="right" visible="false" binding="#{buscarSolicitudes.tableColumnCodCerti}"
										headerText="" id="tableColumnCodCerti" style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText20}"
											id="staticText20" style="text-align: right; #{buscarSolicitudes.color}"
											text="#{currentRow.value['CODG_CERTI']}" />
									</ui:tableColumn>
									<ui:tableColumn align="right" binding="#{buscarSolicitudes.tableColumnNroCerti}"
										headerText="Nro.Certi" id="tableColumnNroCerti" width="60px"
										style="#{buscarSolicitudes.columnStyle}" >
										<ui:staticText binding="#{buscarSolicitudes.staticText21}"
											id="staticText21" style="text-align: right; #{buscarSolicitudes.color}"
											text="#{currentRow.value['NUME_CERTI']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center" binding="#{buscarSolicitudes.tableColumn24}"
										headerText="Magistrado/Sec" id="tableColumn24" sort="NOMB_JUZGA_SOLIC" width="180px"
										style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText24}"
											id="staticText24" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['NOMB_JUZGA_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center" binding="#{buscarSolicitudes.tableColumn26}"
										headerText="Estado" id="tableColumn26" sort="CODG_ESTADO_SOLICITUD" width="80px"
										style="#{buscarSolicitudes.columnStyle}">
										<ui:staticText binding="#{buscarSolicitudes.staticText26}"
											id="staticText26" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['ESTADO_SOLICITUD_SIMPLE']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn25}"
										headerText="Fech.Envio" id="tableColumn25" sort="FECH_DIGIT_SOLIC" width="100px"
										style="#{buscarSolicitudes.columnStyle}" >
										<c:if test="#{currentRow.value['FECH_DIGIT_SOLIC'] != null}">
											<fmt:formatDate pattern="dd/MM/yyyy" value="#{currentRow.value['FECH_DIGIT_SOLIC']}" />
										</c:if>
										<ui:staticText binding="#{buscarSolicitudes.staticText25}"
											converter="#{buscarSolicitudes.dateTimeConverter1}"
											id="staticText25" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['FECH_DIGIT_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn22}"
										headerText="Verificado" id="tableColumn22" sort="NOMBRECOMPLETO" width="180px" 
										style="#{buscarSolicitudes.columnStyle}" >
										<ui:staticText binding="#{buscarSolicitudes.staticText22}"
											id="staticText22" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['NOMBRECOMPLETO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn23}"
										headerText="Nro.Expediente" id="tableColumn23" sort="NUME_EXPED_SOLIC" width="100px"
										style="#{buscarSolicitudes.columnStyle}" >
										<ui:staticText binding="#{buscarSolicitudes.staticText23}"
											id="staticText23" style="#{buscarSolicitudes.color}"
											text="#{currentRow.value['NUME_EXPED_SOLIC']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{buscarSolicitudes.tableColumn27}" headerText="Certificado" id="tableColumn27" 
										width="18px" style="#{buscarSolicitudes.columnStyle}">
										<ui:button action="#{buscarSolicitudes.btnVerC_action}"
											binding="#{buscarSolicitudes.btnVerC}" id="btnVerC" mini="true" 
											imageURL="/images/print.png" toolTip="Impresión de Certificado" />
									</ui:tableColumn>

								</ui:tableRowGroup>
							</ui:table>
							</td>
							<td valign="top">
							</td>
						</tr>
					</table>
				</c:if>	
					
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
