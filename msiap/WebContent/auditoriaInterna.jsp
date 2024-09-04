<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{auditoriaInterna.page1}" id="page1">
			<ui:html binding="#{auditoriaInterna.html1}" id="html1">
			<ui:head binding="#{auditoriaInterna.head1}" id="head1"
				title="#{SessionBean1.nombreApp} - Auditoria">
				<ui:link binding="#{auditoriaInterna.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script id="script2" url="/resources/moduleScripts.js" />
			</ui:head>
			<ui:body binding="#{auditoriaInterna.body1}" id="body1"
				style="background-color: rgb(252, 251, 251);-rave-layout: grid">
				<ui:form binding="#{auditoriaInterna.form1}" id="form1">
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
							<td colspan="3">							
							<ui:staticText style="color: rgb(153, 0, 0); font-size: 10px; font-weight: bold; z-index: 8"
								text="&gt; AUDITORÍA" /></td>
						</tr>
						<tr style="height: 20px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td><ui:button action="#{auditoriaInterna.btnVolver_action}"
								binding="#{auditoriaInterna.btnVolver}" id="btnVolver"
								mini="true" text="Volver" /></td>
							<td></td>
							<td></td>
						</tr>
						<tr style="height: 30px">
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="3">
							<table border="0" cellpadding="0px" cellspacing="0px"
								style="font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px;">
								<tr style="background-color: #770303; color: #FFF; height: 25px; font-weight: bold">
									<td colspan="2" width="506px" style="width: 516px"><ui:staticText id="stUsuario"
										text="Detalles de auditoria. Solicitud Certificado Nro #{SessionBean1.solicitudUnitaria.NUME_CERTI}" /></td>
									<td style="width: 10px" width="10px"></td>
									<td  width="260px" style="width: 250px">Seguimiento:</td>
								</tr>
								<tr style="background-color:#ededed ">
									<td colspan="2" style="font-weight: bold;">Apellidos y Nombres:</td>
									<td></td>
									<td rowspan="6" style="width: 260px; height: 168px; background-color: rgb(204, 204, 204); vertical-align: top;"><ui:textArea
										binding="#{auditoriaInterna.taSeguimiento}"
										text="#{SessionBean1.solicitudUnitaria.DESC_FEC_USU_MODI}"
										readOnly="true" id="taSeguimiento"
										style="background-color: rgb(204, 204, 204); height: 168px; width: 250px" /></td>
								</tr>
								<tr>
									<td colspan="2"><ui:staticText
										binding="#{auditoriaInterna.staticText6}" id="staticText6"
										text="#{SessionBean1.solicitudUnitaria.NOMBRECOMPLETO}" /></td>
									<td></td>
								</tr>
								<tr style="font-weight: bold; background-color: #ededed">
									<td  height="23">Usuario que Registró: </td>
									<td>Fecha de Registro: </td>
									<td ></td>
								</tr>
								<tr>
									<td height="35"><ui:staticText
										binding="#{auditoriaInterna.staticText3}" id="staticText3"
										text="#{SessionBean1.solicitudUnitaria.CODG_USU_REGISTRO}" /></td>
									<td height="35"><ui:staticText
										binding="#{auditoriaInterna.staticText2}"
										converter="#{auditoriaInterna.dateTimeConverter1}"
										id="staticText2"
										text="#{SessionBean1.solicitudUnitaria.FECH_DIGIT_SOLIC}" /></td>
										<td ></td>
								</tr>
								<tr style="font-weight: bold;background-color: #ededed">
									<td height="23">Último Usuario que Modificó: </td>
									<td height="23">Última Fecha  de modificación: </td>
									<td ></td>
								</tr>
								<tr>
									<td height="42"><ui:staticText
										binding="#{auditoriaInterna.staticText4}" id="staticText4"
										text="#{SessionBean1.solicitudUnitaria.CODG_USU_ULT_MODI}" /></td>
									<td height="42"><ui:staticText
										binding="#{auditoriaInterna.staticText10}" id="staticText10"
										converter="#{auditoriaInterna.dateTimeConverter1}"
										text="#{SessionBean1.solicitudUnitaria.FECH_ULT_MODI}" /></td>
										<td ></td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td><ui:staticText binding="#{auditoriaInterna.staticText8}"
										escape="false" id="staticText8"
										style="height: 24px; width: 234px"
										text="&lt;b&gt;FORMATO:&lt;/b&gt;&lt;br/&gt;&#xa;Fecha y hora, usuario, Estado&lt;br/&gt;&lt;br/&gt;&#xa;&lt;b&gt;LEYENDA:&lt;br/&gt;&#xa;REG&lt;/b&gt;: Registrado&lt;br/&gt;&#xa;&lt;b&gt;AUT&lt;/b&gt;: Autorizado para impresión&lt;br/&gt;&#xa;&lt;b&gt;DES&lt;/b&gt;: Descarte realizado&lt;br/&gt;&#xa;&lt;b&gt;IMP&lt;/b&gt;: Impreso&#xa;  &lt;br/&gt;&#xa;&lt;b&gt;CCC&lt;/b&gt;: Con Control de Calidad&#xa;" /></td>
								</tr>
							</table>
							</td>
						</tr>

					</table>
				</ui:form>
			</ui:body>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
