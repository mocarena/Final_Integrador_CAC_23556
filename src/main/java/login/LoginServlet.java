package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author monic
 */
@WebServlet(name = "LoginServlet", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Aquí deberías validar el usuario y la contraseña (puedes consultar una base de datos, un servicio, etc.)
        if (Credenciales.Username.equals(username) && Credenciales.Password.equals(password)) {
            // Si las credenciales son válidas, redirige a una página de éxito
            response.sendRedirect("success.jsp");
        } else {
            // Si las credenciales no son válidas, redirige a una página de error
            response.sendRedirect("error.jsp");
        }
    }
}
