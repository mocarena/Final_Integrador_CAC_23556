package util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Orador;

@WebServlet("/mostrarListaOradores")
public class MostrarListaOradoresServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para obtener la lista de oradores desde tu base de datos o donde sea que los estés almacenando
        List<Orador> oradores = null;
        try {
            oradores = obtenerListaDeOradores();
        } catch (SQLException ex) {
            Logger.getLogger(MostrarListaOradoresServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Establecer la lista de oradores en el alcance de la solicitud
        request.setAttribute("oradores", oradores);

        // Reenviar a la página de lista de oradores
        RequestDispatcher dispatcher = request.getRequestDispatcher("listaOradores.jsp");
        dispatcher.forward(request, response);
    }

    // Tu lógica para obtener la lista de oradores (puede variar según tu implementación)
    private List<Orador> obtenerListaDeOradores() throws SQLException {
        // Aquí deberías conectar con tu base de datos u obtener la lista de alguna manera
        // Esto es solo un ejemplo, debes adaptarlo a tu aplicación
        OradorDAO oradorDAO = new OradorDAO();
        return oradorDAO.obtenerTodosLosOradores();
    }
}

