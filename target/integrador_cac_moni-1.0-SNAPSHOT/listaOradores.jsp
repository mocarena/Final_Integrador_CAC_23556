<%@ page import="java.util.List" %>
<%@ page import="modelo.Orador" %>
<%@ page import="dao.OradoresDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    OradoresDAO oradoresDAO = new OradoresDAO();
    List<Orador> oradores = oradoresDAO.obtenerTodos();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Oradores</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-3">
        <h2>Lista de Oradores</h2>
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Tema</th>
                    <th>Fecha Alta</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <% for (Orador oradorItem : oradores) { %>
                    <tr>
                        <td><%= oradorItem.getIdOrador() %></td>
                        <td><%= oradorItem.getNombre() %></td>
                        <td><%= oradorItem.getApellido() %></td>
                        <td><%= oradorItem.getTema() %></td>
                        <td><%= oradorItem.getFechaAlta() %></td>
                        <td>
                            <!-- Agregar botones de acción -->
                            
                            
                            <a href="eliminarOrador.jsp?id=<%= oradorItem.getIdOrador() %>" class="btn btn-danger">Eliminar</a>
                           
                            
                            <!-- Puedes agregar más botones según tus necesidades -->
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        <a href="http://localhost:8083/integrador_cac_moni/" class="btn btn-success">Volver</a>
    </div>
</body>
</html>
