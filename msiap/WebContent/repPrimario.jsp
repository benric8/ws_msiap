<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
	<f:view>
		<ui:page binding="#{repPrimario.page1}" id="page1">
			<ui:html binding="#{repPrimario.html1}" id="html1">
			<ui:head binding="#{repPrimario.head1}" id="head1">
				<ui:link binding="#{repPrimario.link1}" id="link1"
					url="/resources/stylesheet.css" />
				<ui:script binding="#{repPrimario.script1}" id="script1">
                            function CheckIsIE()
                            {
                                if (navigator.appName.toUpperCase() == 'MICROSOFT INTERNET EXPLORER') {
                                return true;
                                } else { return false; 
                                }
                            }


                            function PrintThisPage()
                            {

                            if (CheckIsIE() == true)
                            {
                            document.impresion.focus();
                            document.impresion.print();
                            }
                            else
                            {
                            window.frames['impresion'].focus();
                            window.frames['impresion'].print();
                            }

                            }
              </ui:script>
			</ui:head>
			<ui:body binding="#{repPrimario.body1}" id="body1"
				style="-rave-layout: grid">
				<ui:form binding="#{repPrimario.form1}" id="form1">
					<ui:button action="#{repPrimario.btnCerrar_action}"
						binding="#{repPrimario.btnCerrar}" id="btnCerrar"
						style="left: 287px; top: 504px; position: absolute; width: 72px"
						text="Cerrar" />
				</ui:form>
				<ui:textField binding="#{repPrimario.textField1}" id="textField1"
					label="mensaje" rendered="true"
					style="left: 144px; top: 528px; position: absolute"
					text="#{repPrimario.resultado}" />
				<iframe frameborder="0" height="400" id="impresion" marginheight="0"
					marginwidth="0" name="impresion" scrolling="0"
					src="${repPrimario.resultado}" width="100%"></iframe>
			</ui:body>
			<script language="javascript" type="text/javascript">
                        PrintThisPage();
         </script>
			</ui:html>
		</ui:page>
	</f:view>
</jsp:root>
