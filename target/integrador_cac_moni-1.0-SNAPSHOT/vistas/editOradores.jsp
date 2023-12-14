<%@ page import="jsp.vistas.verOradores" %>
<%@ page import="modelo.Orador" %>
<%@ page import="util.ConexionDB" %>
<%@ page import="login.Credenciales" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Oradores</title>
    <!-- Agrega aquí tus enlaces a Bootstrap o cualquier otro estilo que desees utilizar -->
</head>
<body>

<%
    // Verificar si el usuario ha iniciado sesión
    String username = (String) session.getAttribute("username");
    if (username == null || !Credenciales.Username.equals(username)) {
        // Si no ha iniciado sesión, redirigir al formulario de inicio de sesión
        response.sendRedirect("login.jsp");
    } else {
        // Si ha iniciado sesión, mostrar la lista de oradores

        // Obtener la lista de oradores desde la base de datos o donde sea que la tengas
        OradoresDAO oradorDAO = new OradoresDAO();
        List<Orador> oradores = oradorDAO.obtenerTodosLosOradores();
%>
    <div class="container mt-3">
        <h2>Lista de Oradores</h2>
        <table class="table">
            <thead>
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
                <% for (Orador orador : oradores) { %>
                <tr>
                    <td><%= orador.getId() %></td>
                    <td><%= orador.getNombre() %></td>
                    <td><%= orador.getApellido() %></td>
                    <td><%= orador.getTema() %></td>
                    <td><%= orador.getFechaAlta() %></td>
                    <td>
                        <a href="editOradores.jsp?id=<%= orador.getId() %>">Editar</a>
                        <a href="#" class="btn btn-danger" onclick="eliminarOrador(<%= orador.getId() %>)">Eliminar</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
<%
    }
%>

</body>
</html>