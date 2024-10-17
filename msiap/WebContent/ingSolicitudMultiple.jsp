<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{ingSolicitudMultiple.page1}" id="page1">
		<ui:html binding="#{ingSolicitudMultiple.html1}" id="html1">
		<ui:head binding="#{ingSolicitudMultiple.head1}" id="head1"
		title="#{SessionBean1.nombreApp} - Ingreso de Solicitud">
		<ui:link binding="#{ingSolicitudMultiple.link1}" id="link1" url="/resources/stylesheet.css" />
		<ui:link binding="#{ingSolicitudMultiple.link2}" id="link2" url="/resources/caja.css" />
		<ui:script id="script2" url="/resources/moduleScripts.js" />
		<script language="javascript" src="${pageContext.request.contextPath}/resources/xp_progress.js" />
		<script language="javascript">
			function enviar() {
		    var retorno = confirm("¿Está seguro de enviar estas solicitudes al Registro Nacional de Condenas?\n\nDespués de esta acción no se podrá hacer modificaciones a la información enviada.");
		    var btnEnviar = document.getElementById('form1:btnEnviarSolicitud');
		    if (retorno){
	        sjwuic_button_setDisabled(true);
  	  	} else {
    	    sjwuic_button_setDisabled(false);
    		}
    		var alto = 0;
				var ancho = 0;
				//obtenemos el ancho y alto de la ventana de nuestro navegador, compatible con todos los navegadores
				if (window.innerWidth == undefined) ancho = window.screen.width;
				else ancho = window.innerWidth;
				if (window.innerHeight == undefined) alto = window.screen.height;
				else alto = window.innerHeight;
				
				//operación necesaria para centrar el div que muestra el mensaje
				var heightdivsito = alto/2
				alert(heightdivsito)
    		return retorno;
			}
			
		</script>
			</ui:head>
			<ui:body binding="#{ingSolicitudMultiple.body1}" id="body1"
				style="background-color: rgb(252, 251, 251); -rave-layout: grid">
				<script language="javascript">
				function send() {
			    var retorno = confirm("¿Está seguro de enviar estas solicitudes al Registro Nacional de Condenas?\n\nDespués de esta acción no se podrá hacer modificaciones a la información enviada.");
			    if (retorno){
		        bar1.showBar();
//		        bar2.showBar();
			    } else {
		        bar1.hideBar();
//		        bar2.hideBar();
						document.getElementById('WindowLoad').style.display='none';
		  	  }
		    	return retorno;
				}
				var petiHTTP;
				function ini_HTTP(){
					if(window.XMLHttpRequest)
						petiHTTP = new XMLHttpRequest();
					else
						petiHTTP = new ActiveXObject("Microsoft.XMLHTTP")
				}
				function procesar_btnEnviarSolicitud_action(){
					ini_HTTP();
					petiHTTP.onreadystatechange = rst_pag;
					petiHTTP.open('POST', 'procesarEnviarSolicitud', true);
					petiHTTP.send(null);
				}
				function pagGris(){
					
				}
				function rst_pag(){
					if(petiHTTP.readyState == 4) {
						if(petiHTTP.status == 200) {
							alert(petiHTTP.responseText);
						}
					}
				}
				</script>
				<ui:form binding="#{ingSolicitudMultiple.form1}" id="form1">

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
								binding="#{ingSolicitudMultiple.staticText9}" id="staticText9"
								style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; INGRESAR SOLICITUD" /></td>
						</tr>
						<tr style="height: 5px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 10px">
							<td colspan="4"><h:messages
								binding="#{ingSolicitudMultiple.messageList1}"
								errorClass="errorMessage" fatalClass="fatalMessage"
								globalOnly="true" id="messageList1" infoClass="infoMessage"
								style="width: 600px" warnClass="warnMessage" /></td>
						</tr>
						<tr style="height: 10px">
							<td><h:outputText
								binding="#{ingSolicitudMultiple.outputText5}" id="outputText5"
								rendered="#{ingSolicitudMultiple.renderedReferencia}"
								value="(*)Referencia:" /></td>
							<td><h:inputText
								binding="#{ingSolicitudMultiple.txtReferencia}"
								id="txtReferencia" maxlength="200"
								rendered="#{ingSolicitudMultiple.renderedReferencia}"
								required="true" tabindex="2"
								value="#{SessionBean1.solicitudExterna.DESC_REFERENCIA}" /></td>
							<td colspan="2"><ui:message
								binding="#{ingSolicitudMultiple.message3}" for="txtReferencia"
								id="message3" showDetail="false" showSummary="true" /></td>
						</tr>
						<tr>
							<td style="width: 100px" align="left"><ui:button
								action="#{ingSolicitudMultiple.btnAnhadir_action}"
								binding="#{ingSolicitudMultiple.btnAnhadir}" id="btnAnhadir"
								mini="true" style="width: 100px; z-index: 10" tabIndex="3"
								text="Añadir registro..." /></td>
								<!-- onClick="procesar_btnEnviarSolicitud_action()" -->
							<td style="width: 100px" align="left"><ui:button
								action="#{ingSolicitudMultiple.btnEnviarSolicitud_action}"
								binding="#{ingSolicitudMultiple.btnEnviarSolicitud}"
								id="btnEnviarSolicitud" mini="true"
								onClick="document.getElementById('WindowLoad').style.display='block'; return send();"
								style="width: 100px; z-index: 10" tabIndex="4"
								text="Enviar solicitud..."/></td>
							<td style="width: 100px" align="left"><ui:button
								action="#{ingSolicitudMultiple.btnVolver_action}"
								binding="#{ingSolicitudMultiple.btnVolver}" id="btnVolver"
								immediate="true" mini="true" onClick="enviar();"
								style="width: 100px; z-index: 10" tabIndex="5"
								text="Cancelar envio" /></td>
							<td style="width: 476px"></td>
						</tr>
						<tr style="height: 5px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 15px">
							<td colspan="4" align="center">
							<div style="z-index: 30">
								<script language="javascript">
									var bar1= createBar(300,15,'white',1,'black','red',85,7,3,"");
									bar1.hideBar();
									//var bar2 =document.getElementById('WindowLoad');
									//bar2.hideBar=function(){
										//this.bar2.style.visibility="hidden";
									//}
									//bar2.showBar=function(){
										//this.bar2.style.visibility="visible";
									//}
									//bar2.hideBar();
								</script>
							</div>
							</td>
						</tr>
						<tr style="height: 5px">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 100%">
							<td colspan="4" valign="top"><ui:table augmentTitle="false"
								width="770px" binding="#{ingSolicitudMultiple.table1}"
								id="table1" title="Personas" style="display:block; border:none; background:transparent;">
								<ui:tableRowGroup
									binding="#{ingSolicitudMultiple.tableRowGroup1}"
									emptyDataMsg="No se han encontrado registros"
									id="tableRowGroup1" rows="10"
									sourceData="#{SessionBean1.solicitudesUnitarias}"
									sourceVar="currentRow">
									<ui:tableColumn align="right" style="width:5px"
										binding="#{ingSolicitudMultiple.tableColumn1}" headerText="Item"
										id="tableColumn1" sort="CODG_CERTI">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText1}"
											id="staticText1" text="#{currentRow.tableRow.rowId + 1}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn30}"
										headerText="MOTIVO" id="tableColumn30" style="width:10px"
										sort="motivo">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText30}"
											id="staticText30" text="#{currentRow.value['motivo']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn3}"
										headerText="AP.PATERNO" id="tableColumn3" style="width:10px"
										sort="APLL_PATER_SOLIC">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText3}"
											id="staticText3"
											text="#{ingSolicitudMultiple.ofuscarDatos(currentRow.value['APLL_PATER_SOLIC'])}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn2}"
										headerText="AP.MATERNO" id="tableColumn2" style="width:10px"
										sort="APLL_MATER_SOLIC">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText2}"
											id="staticText2"
											text="#{ingSolicitudMultiple.ofuscarDatos(currentRow.value['APLL_MATER_SOLIC'])}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn4}"
										style="width:10px" headerText="NOMBRES" id="tableColumn4"
										sort="NOM1_SOLIC">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText4}"
											id="staticText4"
											text="#{ingSolicitudMultiple.ofuscarDatos(currentRow.value['NOM1_SOLIC'])} #{ingSolicitudMultiple.ofuscarDatos(currentRow.value['NOM2_SOLIC'])} #{ingSolicitudMultiple.ofuscarDatos(currentRow.value['NOM3_SOLIC'])}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn7}"
										style="width:10px" headerText="NOM.MADRE" id="tableColumn7"
										sort="NOM_MADRE">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText7}"
											id="staticText7" text="#{currentRow.value['NOM_MADRE']}" />
									</ui:tableColumn>
									<ui:tableColumn binding="#{ingSolicitudMultiple.tableColumn8}"
										style="width:10px" headerText="NOM.PADRE" id="tableColumn8"
										sort="NOM_PADRE">
										<ui:staticText binding="#{ingSolicitudMultiple.staticText8}"
											id="staticText8" text="#{currentRow.value['NOM_PADRE']}" />
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{ingSolicitudMultiple.tableColumn9}"
										headerText="Editar" id="tableColumn9"
										style="color: #993300; width:65px">
										<ui:button
											action="#{ingSolicitudMultiple.btnModificar_action}"
											binding="#{ingSolicitudMultiple.btnModificar}"
											id="btnModificar" mini="true" text="Modificar"
											style="width:60px" >
											</ui:button>
									</ui:tableColumn>
									<ui:tableColumn align="center"
										binding="#{ingSolicitudMultiple.tableColumn10}"
										headerText="Eliminar" id="tableColumn10"
										style="color: #993300; width:65px">
										<ui:button action="#{ingSolicitudMultiple.button3_action}"
											binding="#{ingSolicitudMultiple.button3}" id="button3"
											style="width:60px" mini="true"
											onClick="return confirm(&quot;¿Esta seguro que desea eliminar este registro?,\ndespues de realizar esta acción no podra recuperar la información&quot;)"
											text="Eliminar" />
									</ui:tableColumn>
								</ui:tableRowGroup>
							</ui:table></td>
						</tr>
					</table>

				</ui:form>
				<div id="WindowLoad"/>
				<div id="bloquea"
					style="color: aqua; display: none; width: 100%; height: 100%; overflo w: hidden; z-index: 10000"></div>
			</ui:body>
			</ui:html>
			
		</ui:page>
	</f:view>
</jsp:root>