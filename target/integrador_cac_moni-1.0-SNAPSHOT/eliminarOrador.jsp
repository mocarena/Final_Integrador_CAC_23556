<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.OradoresDAO" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Eliminar Orador</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-3">
    <h2>Eliminar Orador</h2>

    <%-- Obtener el ID del orador a eliminar desde la URL --%>
    

    <% 
        String oradorIdStr = request.getParameter("id");
        if (oradorIdStr != null && !oradorIdStr.isEmpty()) {
            int oradorId = Integer.parseInt(oradorIdStr);
            OradoresDAO oradoresDAO = new OradoresDAO();

            // Eliminar el orador
            oradoresDAO.eliminarOrador(oradorId);
            

    %>

            <p>El orador ha sido eliminado correctamente.</p>
            <!-- Botón para volver a la lista de oradores -->
    <a href="http://localhost:8083/integrador_cac_moni/listaOradores.jsp" class="btn btn-success">Volver a la Lista de Oradores</a>

    <%
        } else {
            // Manejar el caso en el que no se proporciona un ID válido
    %>
            <p>No se proporcionó un ID de orador válido.</p>
    <%
        }
    %>

</div>

</body>
</html>