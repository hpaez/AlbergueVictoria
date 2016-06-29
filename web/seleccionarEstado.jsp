<%-- 
    Document   : modificarEstado
    Created on : 22-06-2016, 12:14:39
    Author     : DerKow
--%>
<%@page import="Datos.AlbergueVO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%
    ArrayList<AlbergueVO> lista = (ArrayList<AlbergueVO>) request.getAttribute("lista");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seleccionar Albergue - Sistema de Búsqueda de Extraviado</title>
    </head>
    <body>
        <h1>Sistema de Búsqueda de Extraviado</h1>
        <form action="CtrlModificarEstado" method="post">
            <legend>Seleccionar Albergue</legend>
            Albergue:
            <select id="albergue" name="albergue">
                <option value="0">Seleccionar Albergue</option>
                <%  for (int i = 0; i < lista.size(); i++) {
                        int option = lista.get(i).getIdAlbergue();
                        String option2 = lista.get(i).getNombre();
                %>
                <option value="<%= option%>"><%= option2%></option>
                <%
                    }
                %>
            </select>
            <br><br/>
            <input type="submit" name="btEntrar" value="Modificar Estado">
        </form>
    </body>
</html>
