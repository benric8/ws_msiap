<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{ayudaVideo.page1}" id="page1">
			<ui:html binding="#{ayudaVideo.html1}" id="html1">
			<ui:head binding="#{ayudaVideo.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Ayuda">
				<ui:link binding="#{ayudaVideo.link1}" id="link1"
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
            
       
            
            
       </script>
			</ui:head>
			<ui:body binding="#{ayudaVideo.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{ayudaVideo.form1}" id="form1">
					<f:subview id="header">
						<table style="height:100%; width: 776px" align="center"
							cellpadding="0px" cellspacing="0px">
							<tr>
								<td colspan="4">
								<div><jsp:directive.include file="header.jspf" /></div>
								</td>
							</tr>
							<tr style="height: 20px">
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>

								<td colspan="4">

								<div>


								<h3 class="toggler atStart"><b
									style="font-style: italic; color: red;">1. Video de Inicio
								de Sesión</b></h3>


								<div>
									<embed type="application/x-mplayer2" autostart="0" loop="0" 
										src="${pageContext.request.contextPath}/resources/images/help/Login.wmv"
										name="objMediaPlayer" width="640px" height="480px" currentposition="30"> </embed> <br />
								<br />
								</div>


								<h3 class="toggler atStart"><b
									style="font-style: italic; color: red;">2. Video de Inicio</b></h3>




								<div>
									<EMBED TYPE="application/x-mplayer2" autostart="0" loop="0"
										SRC="${pageContext.request.contextPath}/resources/images/help/Inicio.wmv"
										NAME="objMediaPlayer" WIDTH="640px" currentposition="30"
										HEIGHT="480px"> </EMBED> <br />
								<br />
								</div>


								<h3 class="toggler atStart"><b
									style="font-style: italic; color: red;">3. Video de Ingreso
								de Solicitud</b></h3>



								<div>
									<EMBED TYPE="application/x-mplayer2" autostart="0" loop="0"
										SRC="${pageContext.request.contextPath}/resources/images/help/IngresoSolicitud.wmv"
										NAME="objMediaPlayer" WIDTH="640px" currentposition="30"
										HEIGHT="480px"> </EMBED> <br />
								<br />
								</div>

								<h3 class="toggler atStart"><b
									style="font-style: italic; color: red;">4. Video para la
								Generación de Reporte</b></h3>


								<div>
									<EMBED TYPE="application/x-mplayer2" autostart="0" loop="0"
										SRC="${pageContext.request.contextPath}/resources/images/help/Reporte.wmv"
										NAME="objMediaPlayer" WIDTH="640px" currentposition="30"
										HEIGHT="480px"> </EMBED>  <br />
								<br />
								</div>
								<h3 class="toggler atStart"><b
									style="font-style: italic; color: red;">5. Video para el
								cambio de Contraseña</b></h3>



								<div>
									<EMBED TYPE="application/x-mplayer2" autostart="0" loop="0"
										SRC="${pageContext.request.contextPath}/resources/images/help/CambiarContrasena.wmv"
										NAME="objMediaPlayer" WIDTH="640px" currentposition="30"
										HEIGHT="480px"> </EMBED>  <br />
								<br />
								</div>

								</div>
								</td>
							</tr>
							<tr>
								<td></td>
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
