package controlador;

import dao.OradoresDAO;
import modelo.Orador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
/*import java.text.SimpleDateFormat;*/

@WebServlet("/registroOrador")
public class RegistroOrador extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener datos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String tema = request.getParameter("tema");

        // Crear un objeto Orador con los datos
        Orador orador = new Orador();
        orador.setNombre(nombre);
        orador.setApellido(apellido);
        orador.setTema(tema);

        // Obtener la fecha actual
        java.util.Date fechaActual = new java.util.Date(); //es una forma de utilizar la clase sin necesitar una declaracion 'import'
        orador.setFechaAlta(new Date(fechaActual.getTime()));

        // Agregar el orador a la base de datos
        OradoresDAO oradoresDAO = new OradoresDAO();
        oradoresDAO.agregarOrador(orador);

        // Redireccionar a la página de visualización de oradores
        response.sendRedirect(request.getContextPath() + "/vistas/verOradores.jsp");
    }
}
