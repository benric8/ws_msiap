<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:ui="http://www.sun.com/web/ui">
	<jsp:directive.page contentType="text/html;charset=UTF-8"
		pageEncoding="UTF-8" />
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
   		<f:loadBundle basename="resources" var="msg" />
		<head>
		<title><ui:insert name="pageTitle">Page Title</ui:insert></title>
		<style type="text/css">
			body {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 14px;
			}
			.header {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 18px;
			}
			.bottom {
				  font-family: Verdana, Arial, Helvetica, sans-serif;
				  font-size: 9px;
				  text-align: center;
				  vertical-align: middle;
				  color: #8E969D;
			}
		</style>
		</head>

<body bgcolor="#ffffff">
<table style="border:1px solid #CAD6E0"  align="center" cellpadding="0" cellspacing="0" border="0" width="400">
<tbody>

	<tr>
		<td class="header" height="42" align="center" valign="middle" width="100%" bgcolor="#E4EBEB">
			<ui:insert name="pageHeader">Page Header</ui:insert>
		</td>
	</tr>
	<tr>
		<td height="1" width="100%" bgcolor="#CAD6E0"></td>
	</tr>	

	<tr>
		<td width="100%"  colspan="2">
			<table width="100%" style="height:150px" align="left" cellpadding="0" cellspacing="0" border="0">
			<tbody>
				<tr>
					<td align="center" width="100%" valign="middle">
					
					<ui:insert name="body">Page Body</ui:insert>
					
					</td>
				</tr>
			</tbody>
			</table>
		</td>
	</tr>	
	
	<tr>
		<td colspan="2"  valign="bottom" height="1" width="100%" bgcolor="#CAD6E0"></td>
	</tr>
</tbody>
</table>
</body>
		
</html>