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
		<ui:page binding="#{admSolicitudes.page1}" id="page1">
			<ui:html binding="#{admSolicitudes.html1}" id="html1">
			<ui:head binding="#{admSolicitudes.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Inicio">
				<ui:link binding="#{admSolicitudes.link1}" id="link1" url="/resources/stylesheet.css" />
				<ui:link binding="#{admSolicitudes.link2}" id="link2" url="/resources/caja.css" />
				<ui:script binding="#{admSolicitudes.script1}" id="script1"	url="/resources/SpryEffects.js" />
				<ui:script id="script2" url="/resources/moduleScripts.js"/>
				<ui:script id="script3" url="/resources/funcionesJavascript.js"/>
				<script language="javascript" src="${pageContext.request.contextPath}/resources/xp_progress.js">
				var revision=0;
				</script> 
			</ui:head>
			
			<ui:body binding="#{admSolicitudes.body1}" id="body1"
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
				
				<ui:form binding="#{admSolicitudes.form1}" id="form1">
					<table style="height: 100%; width: 776px" align="center"
						cellpadding="0px" cellspacing="0px">
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
								binding="#{admSolicitudes.staticText6}" id="staticText6"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; INICIO" /></td>
						</tr>
						<tr style="height: 10px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2">
							<fieldset style="width: 680px; align: center"><legend><ui:label
								binding="#{admSolicitudes.label1}" id="label"
								text=" FILTRAR ESTADO DE LAS SOLICITUDES POR:  " /></legend>

							<table cellpadding="0px" cellspacing="0px">
								<tr style="height: 20px">
									<td colspan="6"></td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.lblUsuario}" id="lblUsuario"
										text="Usuario:" /></td>
									<td colspan="2"><ui:dropDown
										binding="#{admSolicitudes.ddUsuarios}" id="ddUsuarios"
										items="#{SessionBean1.usuarios.options['CODG_USUAR,APELLIDOSNOMBRES']}"
										tabIndex="1" /></td>
									<td style="width: 20px"></td>
									<td colspan="2"><ui:label
										binding="#{admSolicitudes.label9}" id="label9"
										text="Apellidos y nombres del verificado:" /></td>

								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label8}" id="label8" text="Estado:" /></td>
									<td colspan="2"><ui:dropDown
										binding="#{admSolicitudes.ddEstado}" id="ddEstado"
										items="#{SessionBean1.estadosSolicitud.options['CODG_ESTADO,DESC_ESTADO']}"
										tabIndex="2" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label3}" id="label3" text="Paterno:" /></td>
									<td style="width: 150px"><ui:textField
										binding="#{admSolicitudes.txtPaterno}" id="txtPaterno"
										maxLength="14" tabIndex="5"
										validator="#{admSolicitudes.txtNombres_validate}"
										valueChangeListener="#{admSolicitudes.txtPaterno_processValueChange}" />
									</td>
								</tr>
								<tr style="height: 23px">
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label2}" id="label2" text="Fecha:" /></td>
									<td style="width: 140px"><ui:label
										binding="#{admSolicitudes.label4}" id="label4" text="Desde:" /></td>
									<td style="width: 140px"><ui:label
										binding="#{admSolicitudes.label5}" id="label5" text="Hasta:" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label6}" id="label6" text="Materno:" /></td>
									<td style="width: 150px"><ui:textField
										binding="#{admSolicitudes.txtMaterno}" id="txtMaterno"
										maxLength="14" tabIndex="6"
										validator="#{admSolicitudes.txtNombres_validate}" /></td>
								</tr>

								<tr style="height: 23px">
									<td style="width: 70px"></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admSolicitudes.calDesde}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calDesde" tabIndex="3"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);"
										validator="#{admSolicitudes.calDesde_validate}" /></td>
									<td style="width: 140px"><ui:calendar
										dateFormatPatternHelp="dd/mm/aaaa"
										binding="#{admSolicitudes.calHasta}" columns="10"
										dateFormatPattern="dd/MM/yyyy" id="calHasta" tabIndex="4"
										onClick="seleccionRango(this);"
										onBlur="return validarFecha(this);"
										onKeyPress="return formatearFecha(this,event);" /></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label7}" id="label7" text="Nombres:" /></td>
									<td style="width: 150px"><ui:textField
										binding="#{admSolicitudes.txtNombres}" id="txtNombres"
										maxLength="14" tabIndex="7"
										validator="#{admSolicitudes.txtNombres_validate}" /></td>
								</tr>
								
								<tr style="height: 23px">
									<td style="width: 70px"><ui:label
										binding="#{admSolicitudes.label11}" id="label11" text="Numero de Oficio:" /></td>
									<td style="width: 140px">
										<ui:textField binding="#{admSolicitudes.txtNroOficio}" 
											id="txtNroOficio" maxLength="12" onBlur="return copiar();" 
											toolTip="XXXXX-AAAA-(A|B)"  />
									</td>
									<td style="width: 140px"></td>
									<td style="width: 20px"></td>
									<td style="width: 70px"></td>
									<td style="width: 150px"></td>
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
									<td colspan="6" valign="middle"><h:messages
										binding="#{admSolicitudes.messageList1}"
										errorClass="errorMessage" fatalClass="fatalMessage"
										id="messageList1" infoClass="infoMessage"
										warnClass="warnMessage" /></td>
								</tr>
								<tr style="height: 23px">
									<td colspan="6" align="right"><ui:button
										action="#{admSolicitudes.button2_action}"
										binding="#{admSolicitudes.button2}" id="button2" mini="true"
										tabIndex="8" text="Filtrar" /></td>
								</tr>
								<tr>
								<td colspan="6" align="center">
								<div style="z-index: 30">
								<script language="javascript">
									var bar1= createBar(300,15,'white',1,'black','red',85,7,3,"");
									bar1.hideBar();
								</script>
							</div>
								</td>
								</tr>
							</table>
							</fieldset>
							</td>
						</tr>

						<tr style="height: 10px">
							<td colspan="2"></td>
						</tr>
						<tr style="height: 100%">
							<td style="width: 90%" valign="top"><ui:table
								augmentTitle="false" binding="#{admSolicitudes.table1}"
								clearSortButton="true" id="table1" paginateButton="true"
								paginationControls="true"
								style="height: 100px; width: 100%;display:block;"
								title="Estado de las Solicitudes" width="776px">
								<ui:tableRowGroup binding="#{admSolicitudes.tableRowGroup1}"
									emptyDataMsg="No se han encontrado registros"
									id="tableRowGroup1" rows="10"
									sourceData="#{SessionBean1.solicitudesExternas}"
									sourceVar="currentRow">
									<ui:tableColumn align="right"
										binding="#{admSolicitudes.tableColumnNroSolicit}"
										headerText="SOLI. NRO." id="tableColumnNroSolicit"
										style="#{admSolicitudes.columnStyle}" width="100px">
										<ui:staticText binding="#{admSolicitudes.staticText8}"
											id="staticText8"
											style="text-align: right; #{admSolicitudes.color}"
											text="#{currentRow.value['CODG_CERTI_EXTERNO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudes.tableColumn2}"
										headerText="USUARIO" id="tableColumn2" sort="CODG_USUAR"
										style="#{admSolicitudes.columnStyle}">
										<ui:staticText binding="#{admSolicitudes.staticText4}"
											id="staticText4" style="#{admSolicitudes.color}"
											text="#{currentRow.value['CODG_USUAR']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudes.tableColumn3}"
										headerText="ESTADO" id="tableColumn3" sort="CODG_ESTADO"
										style="#{admSolicitudes.columnStyle}">
										<ui:staticText binding="#{admSolicitudes.staticText3}"
											id="staticText3" style="#{admSolicitudes.color}"
											text="#{currentRow.value['DESC_ESTADO']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudes.tableColumn7}"
										headerText="FECH. ENVIO" id="tableColumn7" sort="FECH_ENVIO"
										style="#{admSolicitudes.columnStyle}">
										<c:if test="#{currentRow.value['FECH_ENVIO'] != null}">
											<fmt:formatDate pattern="dd/MM/yyyy"
												value="#{currentRow.value['FECH_ENVIO']}" />
										</c:if>
										<ui:staticText binding="#{admSolicitudes.staticText7}"
											converter="#{admSolicitudes.dateTimeConverter1}"
											id="staticText7" style="#{admSolicitudes.color}"
											text="#{currentRow.value['FECH_ENVIO']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{admSolicitudes.tableColumn5}"
										headerText="REG. ATEND." id="tableColumn5"
										sort="NUM_REGISTROS_ATENDIDOS"
										style="#{admSolicitudes.columnStyle}">
										<ui:staticText binding="#{admSolicitudes.staticText2}"
											id="staticText2" style="#{admSolicitudes.color}"
											text="#{currentRow.value['NUM_REGISTROS_ATENDIDOS']} de #{currentRow.value['NUM_REGISTROS_ATENDIDOS']+currentRow.value['NUM_REGISTROS_POR_ATENDER']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudes.tableColumn11}"
										headerText="IMP. OFIC. A" id="tableColumn11"
										sort="v_OFI_RESPUESTA_A" style="#{admSolicitudes.columnStyle}">
										<!-- onClick="bar1.showBar(); document.getElementById('WindowLoad').style.display='block'" -->
										<ui:button action="#{admSolicitudes.btnVerA_action}"
											binding="#{admSolicitudes.btnVerA}" id="btnVerA" mini="true"
											rendered="#{admSolicitudes.renderedOficioA}"
											text="#{currentRow.value['v_OFI_RESPUESTA_A']}">
										</ui:button>
									</ui:tableColumn>
									<ui:tableColumn binding="#{admSolicitudes.tableColumn12}"
										headerText="IMP. OFIC. B" id="tableColumn12"
										sort="v_OFI_RESPUESTA_B" style="#{admSolicitudes.columnStyle}">
										<!-- onClick="document.getElementById('WindowLoad').style.display='block'; bar1.showBar();" -->
										<ui:button action="#{admSolicitudes.btnVerB_action}"
											binding="#{admSolicitudes.btnVerB}" id="btnVerB" mini="true"
											rendered="#{admSolicitudes.renderedOficioB}"
											text="#{currentRow.value['v_OFI_RESPUESTA_B']}">
										</ui:button>
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{admSolicitudes.tableColumn1}" headerText="VER REG."
										id="tableColumn1" style="#{admSolicitudes.columnStyle}"
										width="50px">
										<ui:button action="#{admSolicitudes.btnRegistro_action}"
											binding="#{admSolicitudes.btnRegistro}" id="btnRegistro"
											mini="true" text="&gt;" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{admSolicitudes.tableColumn4}"
										headerText="VER AUDI." id="tableColumn4"
										style="#{admSolicitudes.columnStyle}" width="50px">
										<ui:button action="#{admSolicitudes.btnAuditoria_action}"
											binding="#{admSolicitudes.btnAuditoria}" id="btnAuditoria"
											mini="true" text="&gt;&gt;" />
									</ui:tableColumn>
								</ui:tableRowGroup>
							</ui:table></td>
							<td valign="top"><h:panelGroup
								binding="#{admSolicitudes.groupPanel1}" id="groupPanel1"
								style="border-width: 1px; border-style: solid; padding: 3px; background-color: rgb(242, 243, 242); display: block; visibility: hidden; width: 214px">
								<ui:staticText binding="#{admSolicitudes.staticText1}"
									escape="false" id="staticText1" text="Registros:" />
							</h:panelGroup></td>
						</tr>
					</table>
				</ui:form>
				<div id="WindowLoad" />
				<ui:label rendered="#{SessionBean1.parametroEntero>100}" id="lbl1">
				</ui:label>
				<div id="WindowLoad" />
			</ui:body>
			<script type="text/javascript">
				destinationElement = document.getElementById('form1:groupPanel1');
				if (destinationElement != null){
				    var registros = new Spry.Effect.Fade('form1:groupPanel1',{duration: 5000,from: 0, to: 100,toggle: false});
				    registros.start();
				}
			</script>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
