<%-- 
    Document   : modificarEstado
    Created on : 28-06-2016, 23:04:04
    Author     : DerKow
--%>
<%
    String resultado = (String) request.getAttribute("resultado");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sistema de Búsqueda de Extraviado</h1>

        <%
            if (resultado.equals("1")) {
        %>
        <p>El cambio de estado del albergue fue hecho con éxito</p>
        <br><br>
        <a href="index.jsp">Volver Atras</a>
        <%
        } else {
        %>
        <p>No se pudo cambiar el estado del albergue</p>
        <br><br>
        <a href="CtrlMostrarAlbergue">Volver a Modificar Estado</a>
        <%
            }
        %>
    </body>
</html>
