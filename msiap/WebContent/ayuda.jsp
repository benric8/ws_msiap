<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{ayuda.page1}" id="page1">
			<ui:html binding="#{ayuda.html1}" id="html1">
			<ui:head binding="#{ayuda.head1}" id="head1" title="#{SessionBean1.nombreApp} - Ayuda">
				<ui:link binding="#{ayuda.link1}" id="link1"
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
			<ui:body binding="#{ayuda.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{ayuda.form1}" id="form1">
					<f:subview id="header">
						<table style="height:100%; width: 776px" align="center"
							cellpadding="0px" cellspacing="0px">
							<tr>
								<td colspan="4">
								<div><jsp:directive.include file="header.jspf" /></div>
								</td>
							</tr>
							<tr style="height: 10px">
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>


								<div id="accordion">

								<h3 class="toggler atStart"><b>1. Visión global y
								funcional de la aplicación</b></h3>
								<div class="element atStart">Debido a la necesidad de
								atender de manera oportuna y eficiente las solicitudes de
								información de Antecedentes Penales de las diferentes
								instituciones con las que el PJ Interactúa se implementa esta
								aplicación que permite reducir dramáticamente los recursos
								involucrados en el proceso de brindar información de
								Antecedentes penales, basado generalmente en la virtualización
								del flujo de documentos y la estandarización y mejora de los
								procesos del Registro Nacional de Condenas del Poder Judicial.<br />
								El proceso de solicitud de antecedentes penales se muestra en el
								diagrama siguiente:<br />
								<br />

								<span style="font-size:9px">Imágen 1. Diagrama de flujo</span><br />
								<img alt=""
									src="${pageContext.request.contextPath}/resources/images/help/1_msiap_flujo.jpg"
									width="740" height="295" /><br />

								</div>

								<h3 class="toggler atStart"><b>2. Características
								Principales</b></h3>
								<div class="element atStart">
								<ul>
									<li>A través de una sola solicitud permite obtener
									información de multiples personas</li>
									<li>Contiene reportes de auditoría</li>
									<li>Permite realizar seguimiento a las solicitudes en
									trámite</li>
								</ul>

								</div>

								<h3 class="toggler atStart"><b>3. Requerimientos del
								Sistema</b></h3>
								<div class="element atStart">
								<ul>
									<li><b>Software</b><br />
									<br />
									<ol>
										<li>Navegador Web</li>
										<li>Visualizador de archivos pdf</li>
										<li>Windows 7 o superior; en distribuciones de linux
										debería funcionar si es que se instala un visualizador de pdf
										que pueda abrir el archivo de respuesta</li>
									</ol>
									</li>
								</ul>
								<ul>
									<li><b>Hardware</b><br />
									<br />
									<ol>
										<li>Como mínimo 256 MB de RAM, pero debería funcionar en
										cualquier máquina que soporte el correcto funcionamiento del
										software anteriormente descrito</li>
									</ol>
									</li>
								</ul>
								</div>

								<h3 class="toggler atStart"><b>4. Descripción del área
								de trabajo</b></h3>
								<div class="element atStart">Luego de ingresar al sistema
								con nuestro usuario y contraseña de acceso podemos observar la
								siguiente pantalla:<br />
								<br />
								<span style="font-size:9px">Imágen 2. Area de trabajo</span><br />
								<img style="border:1px solid gray"
									src="${pageContext.request.contextPath}/resources/images/help/2_area_de_trabajo_1_pequenha.gif" /><br />
								<br />
								En esta imágen se resaltan 4 areas:
								<ol>
									<li>Menú de opciones[General*]. Desde este menu uste puede
									acceder a las diferentes opciones de la apicación</li>
									<li>Usuario del sistema y posición actual[General*]</li>
									<li>Opciones de filtro. Permiten filtrar las solicitudes
									realizadas por distintos criterios</li>
									<li>Estado de las solicitudes. desde aca se puede ver un
									breve resumen de las solicitudes ya realizadas y ejecutar
									algunas operaciones sobre ellas</li>
								</ol>


								</div>


								<h3 class="toggler atStart"><b>5. Pasos para realizar
								una solicitud</b></h3>
								<div class="element atStart">Siga los siguientes pasos:<br />
								<br />
								<ol>
									<li>Desde el menu de opciones elegir la opción [INGRESAR
									SOLICITUD]<br />
									<br />
									</li>
									<li>Al ingresar a la pantalla notará que el listado
									"Personas" no se encuentra el nombre de persona alguna, para
									agregar nombres de personas a la lista de la solicitud de un
									click en el botón "Añadir registro".<br />
									<br />
									<span style="font-size: 9px;">Imágen 3. Pantalla
									ingresar Solicitud</span><br />
									<img
										src="${pageContext.request.contextPath}/resources/images/help/3_ingresar_solicitud_1_pequenha.gif"
										style="border: 1px solid gray;" /><br />
									<br />
									</li>
									<li>Aparece el formulario de ingreso de personas, en esta
									pantalla se registraran los datos de la(s) persona(s) de las
									que se desea obtener información de sus antecedentes penales,
									la calidad de los datos es vital para una respuesta del
									Registro Nacional de Condenas exacta y oportuna. Despues de
									ingresados los datos se procede a presionar el botón grabar
									(como se resalta en la imágen), la pantalla se limpiará y
									aparecerá un mensaje de almacenamiento exitoso; permitiendo
									ingresar los datos de mas personas, al terminar de ingresar las
									personas necesarias presione el botón volver. Si se equivoca no
									se preocupe todavía puede modificar la información antes de
									enviar la solicitud utilizando el boton[Modificar] desde la
									siguiente pantalla <br />
									<br />
									<span style="font-size: 9px;">Imágen 4. Pantalla de
									ingreso de registro</span><br />
									<img
										src="${pageContext.request.contextPath}/resources/images/help/4_formulario_unitario_1_pequenha.gif"
										style="border: 1px solid gray;" /><br />
									<br />
									</li>
									<li>Si esta seguro que los datos de la o las personas
									registradas son correctos presione el boton enviar, se muestra
									un mensaje de alerta advirtiendo que despues esta acción no se
									podrá modificar la información enviada<br />
									<br />
									<span style="font-size: 9px;">Imágen 5. Pantalla
									[INGRESAR SOLICITUD]</span><br />
									<img
										src="${pageContext.request.contextPath}/resources/images/help/5_ingresar_solicitud_2_pequenha.gif"
										style="border: 1px solid gray;" /><br />
									<br />
									</li>
									<li>despues de enviada la solicitud de atención, aparece
									la pantalla de inicio con un mensaje indicando el envio exitoso
									de su solicitud(1) y en el listado <b>estado de las
									solicitudes</b> se muestra las ultimas solicitudes enviadas al
									Registro Nacional de Condenas(2) de acuerdo a lo indicado en el
									área de filtros filtros<br />
									<br />
									<span style="font-size: 9px;">Imágen 6. Pantalla
									[INICIO]</span><br />
									<img
										src="${pageContext.request.contextPath}/resources/images/help/6_area_de_trabajo_2_pequenha.gif"
										style="border: 1px solid gray;" /><br />
									<br />
									A continuación explicamos el significado de cada una de estas
									columnas:
									<ul>
										<li><b>Nro. de solicitud.</b> El número generado por el
										sistema para la solicitud enviada (este número en correlativo
										para todas las entidades conectadas al sistemas, así que no
										debería sorprendernos que mientras se acoplen mas entidades al
										sistema los números para una sola entidad den saltos y al
										parecer pierdan la correlatividad)</li>
										<li><b>Usuario.</b> Usuario que envío la solicitud (solo
										aparece a las personas con el rol de supervisor)</li>
										<li><b>Estado.</b> Existen 3 estados posibles: Solicitud
										Atendida, Por Atender y Atendida parcialmente(cuando se ha
										enviado una respuesta del RNC con algunos de los nombres
										solicitados, pero algunos estan pendientes; Al explicar las
										columnas OFICIO A y OFICIO B se dara cuenta de la relación
										existente entre el estado y los oficios de respuesta que el
										RNC envía).</li>
										<li><b>Fecha Envío.</b> Fecha en la que se realizó el
										envío</li>
										<li><b>Registros Atendidos.</b> Cantidad de registros
										atendidos por solicitud que mostramos de la forma x/n (donde <b>x</b>
										es el número de nombres de personas registradas y evaluadas
										por el RNC hasta la fecha y hora de consulta y <b>n</b> es el
										total de nombres de personas registradas en la solicitud)</li>
										<li><b>Imprimir Oficio A. </b> Oficio de respuesta A del
										RNC. Este columna muestra con un botón en dos casos:
										<ol>
											<li>Cuando todos los nombres de personas incluídas en la
											solicitud "no han salido observados para descarte de
											homonimia" (personas que no tienen registrados antecendetes
											penales), en ese caso se genera una única respuesta del RNC
											que es el oficio A</li>
											<li>Cuando existe un grupo de nombres de personas
											incluídas en la solicitud que han salido "observadas para
											descartes de homonimias" y otros que no, en este caso se
											generaran dos repuestas el oficio A(contendra el resultado de
											los no observados) y el oficio B (contendrá el estado de los
											que han sido observados: algunos registran antecedentes
											penales y otros no).</li>
										</ol>
										</li>
										<li><b>Imprimir Oficio B. </b> Oficio de respuesta B del
										RNC. Se da Cuando todos o parte de los nombres de personas
										incluídas en la solicitud "han sido observados para descarte
										de homonimia" al presionar el botón de la columna se mostrará
										el oficio B de respuesta(contendrá el estado de los que han
										sido observados: algunos registran antecedentes penales y
										otros no).</li>
										<li><b>Ver registros. </b> Permite revisar los nombres de
										las personas incluidos en la solicitud y el estado actual por
										cada una de ellas.</li>
										<li><b>Ver auditoría. </b> Permite ver las acciones
										realizadas sobre esta solicitud por los usuarios en el Sistema
										tanto en la entidad que lo solicito como en el Registro
										Nacional de Condenas(por contener varias funciones será
										explicada en otro apartado de esta ayuda)</li>
									</ul>
									<br />
									<br />
									</li>
									<li>Presionando los botones en la columna "Imprimir Oficio
									A" o "Imprimir Oficio B" (de acuerdo al tipo de respuesta,
									explicado en el paso 5) usted puede leer e imprimir la
									respuesta del RNC con los resultados de su consulta<br />
									<br />
									<span style="font-size: 9px;">Imágen 7. Pantalla
									[IMPRIMIR OFICIO]</span><br />
									<img
										src="${pageContext.request.contextPath}/resources/images/help/7_oficio_a_1.gif"
										style="border: 1px solid gray;" /><br />
									<br />
									</li>
								</ol>

								<br />
								</div>


								<h3 class="toggler atStart"><b>6. Auditoría</b></h3>
								<div class="element atStart">Para acceder a las opciones
								de auditoría es necesario dar un click en el botón de auditoría
								que se encuentra en la columna del mismo nombre dentro del
								listado "Estado de las Solicitudes" del Menú [INICIO].<br />
								<br />
								<span style="font-size: 9px;">Imágen 8. Pantalla
								[AUDITORIA]</span><br />
								<img
									src="${pageContext.request.contextPath}/resources/images/help/8_auditoria_1_pequenha.gif"
									style="border: 1px solid gray;" /><br />
								<br />
								Como podra ver en este caso tenemos 3 áreas de la pantalla de
								auditoría que resaltar:
								<ol>
									<li><b>Procesos.</b> En esta parte indicamos las acciones
									que realizaron los usuarios del sistema contra determinada
									solicitud</li>
									<li><b>Registros incluídos en la solicitud.</b> Por Cada
									nombre de persona incluído en la solicitud se mostrará su
									estado actual</li>
									<li><b>Seguimiento.</b> Al dar click en el botón
									"Seguimiento" que esta úbicado al costado del nombre de las
									personas solicitadas, se puede ver las operaciones que se han
									realizado en el Registro Nacional de Condenas al procesar la
									información de la persona en cuestion</li>
								</ol>
								</div>
								<h3 class="toggler atStart"><b>7. Reportes</b></h3>
								<div class="element atStart">Al dar click en la opción
								[REPORTES] del menú de opciones, usted puede generar reportes
								con los mismos filtros que tiene a su disposición en la pantalla
								[INICIO].<br />
								<br />
								<span style="font-size: 9px;">Imágen 9. Pantalla
								[REPORTES]</span><br />
								<img
									src="${pageContext.request.contextPath}/resources/images/help/9_reportes_1_pequenho.gif"
									style="border: 1px solid gray;" /><br />
								<br />
								De estas opciones hay que destacar la de Reporte (en esta se
								elige uno de los tipos de reportes existentes) y Formato
								(permite generar el reporte en HTML o PDF), al terminar de
								elegir los filtros, reporte y formato, procedemos a hacer click
								y nos genera un reporte para visualizar o imprimir</div>
								<h3 class="toggler atStart"><b>8. Cambio de contraseña</b></h3>
								<div class="element atStart">La pantalla de cambio de
								contraseña permite modificar la contraseña, la primera vez que
								ingrese al sistema es recomendable que cambie su contraseña.
								Ingrese su contraseña actual, posteriormente la nueva contraseña
								que desea utilizar y finalmente la nueva contraseña<br />
								<br />
								<span style="font-size: 9px;">Imágen 10. Pantalla [CAMBIO
								DE CONTRASEÑA]</span><br />
								<img
									src="${pageContext.request.contextPath}/resources/images/help/10_cambio_contra1.gif"
									style="border: 1px solid gray;" /><br />
								<br />
								</div>
								</div>
								</td>
							</tr>
						</table>
					</f:subview>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
