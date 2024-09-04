<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{auditarUsuario.page1}" id="page1">
		<ui:html binding="#{auditarUsuario.html1}" id="html1">
			<ui:head binding="#{auditarUsuario.head1}" id="head1" title="#{SessionBean1.nombreApp} - Auditoria">
				<ui:link binding="#{auditarUsuario.link1}" id="link1" url="/resources/stylesheet.css" />
				<ui:script id="script1" url="/resources/js/jquery-1.9.1.min.js" />
			</ui:head>
			<ui:body binding="#{auditarUsuario.body1}" id="body1"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">
				
				<ui:form binding="#{auditarUsuario.form1}" id="form1">
				
					<table style="height:100%" width="776px" align="center"
						cellpadding="0px" cellspacing="0px">
						<tr>
							<td colspan="3"><f:subview id="header">
								<div><jsp:directive.include file="header.jspf" /></div>
							</f:subview></td>
						</tr>
						<tr style="height: 15px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>
							<ui:button action="#{auditarUsuario.btnSeguimiento_action}"
								binding="#{auditarUsuario.btnSeguimiento}" id="btnSeguimiento"  
								mini="true" text="Volver"/>
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 15px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td valign="top" colspan="3">
								<ui:table id="tbMovimientos" binding="#{auditarUsuario.tbMovimientos}" title="Detalles de auditoria." 
									augmentTitle="false" style="display:block">
								<ui:tableRowGroup id="tableRowGroup1" binding="#{auditarUsuario.tableRowGroup1}" headerText="Auditoria"
									sourceData="#{SessionBean1.consultaAuditoriaUsuario}" sourceVar="currentRow" 
									rows="15" >
									
									<ui:tableColumn id="tableColumn1" binding="#{auditarUsuario.tableColumn1}"
										headerText="Fecha Auditoria" style="width:80px" width="80" >
										<ui:staticText id="staticText1" binding="#{auditarUsuario.staticText1}"
											text="#{currentRow.value['fecha_auditoria']}" converter="#{auditarUsuario.dateTimeConverter1}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn2" binding="#{auditarUsuario.tableColumn2}"
										headerText="Usuario" style="width:50px" width="50">
										<ui:staticText id="staticText2" binding="#{auditarUsuario.staticText2}"
											text="#{currentRow.value['c_usuario']}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn3" binding="#{auditarUsuario.tableColumn3}"
										headerText="Nombre Usuario" style="width:100px" width="100">
										<ui:staticText id="staticText3" binding="#{auditarUsuario.staticText3}"
											text="#{currentRow.value['nombre_usuario']}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn4" binding="#{auditarUsuario.tableColumn4}"
										headerText="Distrito Judicial" style="width:100px" width="100">
										<ui:staticText id="staticText4" binding="#{auditarUsuario.staticText4}"
											 text="#{currentRow.value['distrito_judicial']}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn5" binding="#{auditarUsuario.tableColumn5}"
										headerText="Accion" style="width:50px" width="50">
										<ui:staticText id="staticText5" binding="#{auditarUsuario.staticText5}"
											 text="#{currentRow.value['accion']}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn6" binding="#{auditarUsuario.tableColumn6}"
										headerText="Motivo" style="width:120px" width="120">
										<ui:staticText id="staticText6" binding="#{auditarUsuario.staticText6}"
											 text="#{currentRow.value['motivo']}" />
									</ui:tableColumn>	
									<ui:tableColumn id="tableColumn7" binding="#{auditarUsuario.tableColumn7}"
										headerText="Campo Modificado" style="width:70px" width="70">
										<ui:staticText id="staticText7" binding="#{auditarUsuario.staticText7}"
											 text="#{currentRow.value['campo_modificado']}" />
									</ui:tableColumn>
									<ui:tableColumn id="tableColumn8" binding="#{auditarUsuario.tableColumn8}"
										headerText="Valor Anterior" style="width:70px" width="70">
										<ui:staticText id="staticText8" binding="#{auditarUsuario.staticText8}"
											 text="#{currentRow.value['valor_anterior']}" />
									</ui:tableColumn>	
															
								</ui:tableRowGroup>
								</ui:table>
							</td>
						</tr>
					</table>
					
				</ui:form>
				
			</ui:body>
		</ui:html>
		</ui:page>
	</f:view>
	
	<script type="text/javascript">
    $(document).ready(function () {	
        $('#form1\\:tbMovimientos').each(function () {
            // Previous_TD holds the first instance of same td. Initially first TD=null.
            var Previous_TD01 = null;
            var Previous_TD02 = null;
            var Previous_TD03 = null;
            var Previous_TD04 = null;
            var Previous_TD05 = null;
            var Previous_TD06 = null;
            
            var i = 1;
            $("tbody",this).find('tr').each(function () {
                // find the correct td of the correct column
                // we are considering the table column 1, You can apply on any table column
                var Current_td01 = $(this).find('td:nth-child(1)');
                var Current_td02 = $(this).find('td:nth-child(2)');
                var Current_td03 = $(this).find('td:nth-child(3)');
                var Current_td04 = $(this).find('td:nth-child(4)');
                var Current_td05 = $(this).find('td:nth-child(5)');
                var Current_td06 = $(this).find('td:nth-child(6)');
                 
                if (Previous_TD01 == null) {
                    // for first row
                    Previous_TD01 = Current_td01;
                    Previous_TD02 = Current_td02;
                    Previous_TD03 = Current_td03;
                    Previous_TD04 = Current_td04;
                    Previous_TD05 = Current_td05;
                    Previous_TD06 = Current_td06;
                    i = 1;
                } else if (Current_td01.text() == Previous_TD01.text() &amp;&amp; Current_td02.text() == Previous_TD02.text() &amp;&amp;
                	Current_td01.text() == Previous_TD01.text() &amp;&amp; Current_td02.text() == Previous_TD02.text() &amp;&amp;
            		Current_td01.text() == Previous_TD01.text() &amp;&amp; Current_td02.text() == Previous_TD02.text()) {
            		// the current td is identical to the previous row td
                    // remove the current td
                    Current_td01.remove();
                    Current_td02.remove();
                    Current_td03.remove();
                    Current_td04.remove();
                    Current_td05.remove();
                    Current_td06.remove();
                    // increment the rowspan attribute of the first row td instance
                    Previous_TD01.attr('rowspan', i + 1);
                    Previous_TD02.attr('rowspan', i + 1);
                    Previous_TD03.attr('rowspan', i + 1);
                    Previous_TD04.attr('rowspan', i + 1);
                    Previous_TD05.attr('rowspan', i + 1);
                    Previous_TD06.attr('rowspan', i + 1);
                    i = i + 1;
                } else {
                    // means new value found in current td. So initialize counter variable i
                    Previous_TD01 = Current_td01;
                    Previous_TD02 = Current_td02;
                    Previous_TD03 = Current_td03;
                    Previous_TD04 = Current_td04;
                    Previous_TD05 = Current_td05;
                    Previous_TD06 = Current_td06;
                    i = 1;
                }
            });
        });		
    });
	</script>
</jsp:root>
