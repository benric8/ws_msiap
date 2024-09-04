<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{admAyuda.page1}" id="page1">
			<ui:html binding="#{admAyuda.html1}" id="html1">
			<ui:head binding="#{admAyuda.head1}" id="head1" title="#{SessionBean1.nombreApp} - Ayuda">
				<ui:link binding="#{admAyuda.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<style type="text/css">
                        .toggler {
                                color: #222;
                                margin: 0;
                                padding: 2px 5px;
                                background: #eee;
                                border-bottom: 1px solid #ddd;
                                border-right: 1px solid #ddd;
                                border-top: 1px solid #f5f5f5;
                                border-left: 1px solid #f5f5f5;
                                font-size: 11px;
                                font-weight: normal;
                                font-family: 'Andale Mono', sans-serif;
                        }
                        .element {

                        }
                        .element p {
                                margin: 0;
                                padding: 4px;
                        }
                        .float-right {
                                padding:10px 20px;
                                float:right;
                        }
                        blockquote {
                                text-style:italic;
                                padding:5px 0 5px 30px;
                        }
                    </style>
				<ui:script id="script2" url="/resources/moduleScripts.js" />
				<ui:script url="/resources/mood/mootools-release-1.11.js" />

				<script type="text/javascript">
           			 	
             window.addEvent('domready', function() {

                    var accordion = new Accordion('h3.atStart', 'div.atStart', {
                    opacity: false,
                    onActive: function(toggler, element){
                            toggler.setStyle('color', '#ff3300');
                    },

                    onBackground: function(toggler, element){
                            toggler.setStyle('color', '#222');
                    }
                    }, $('accordion'));
            });
            
            
             function cAmbiaOver(imagen)
   				{
   				//alert("holas5: "+imagen);
			      document.getElementById(imagen).src="/msiap/resources/images/help/boton-manual-msiap_Capa-0-o.gif";      
   				}
   
		   function cAmbiaOut(imagen)
   				{
   				   				//alert("holas6: "+imagen);
			      document.getElementById(imagen).src="/msiap/resources/images/help/boton-manual-msiap_Capa-0-o.gif";
			   }
            
          
            
            
       </script>
			</ui:head>
			<ui:body binding="#{admAyuda.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{admAyuda.form1}" id="form1">
					<f:subview id="header">
						<table style="height:100%; width: 776px" align="center"
							cellpadding="0px" cellspacing="0px">
							<tr>
								<td colspan="4">
								<div><jsp:directive.include file="header.jspf" /></div>
								</td>
							</tr>
							<tr style="height: 70px">
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr style="height: 100px" align="center">
								<td width="25px"></td>
								<td align="center"><ui:imageHyperlink action="ayuda"  
									onMouseOver="javascript:cAmbiaOver(this.id);" onMouseOut="javascript:cAmbiaOut(this.id);"
									id="ihAdmAyuda" width="279" height="99" border="0"
									alt="Ayuda en Formato html"
									imageURL="/resources/images/help/boton-manual-msiap_Capa-0.gif"
									immediate="true" url="/faces/ayuda.jsp" /></td>
								<td width="20px"></td>
								<!-- <td align="center"><ui:imageHyperlink action="ayudaVideo"
									id="ihAdmAyudaVideo" width="279" height="99" border="0"
									alt="Ayuda en Formato Video"
									imageURL="/resources/images/help/boton-msiap_Capa-0.gif"
									immediate="true" url="/faces/ayudaVideo.jsp" /></td>-->

							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
							</tr>

						</table>
					</f:subview>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
