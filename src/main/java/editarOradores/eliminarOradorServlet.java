
package editarOradores;

import util.OradorDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class eliminarOradorServlet {
@WebServlet("/eliminarOradorServlet")
public class EliminarOradorServlet extends HttpServlet {
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el ID del orador a eliminar
        int id = Integer.parseInt(request.getParameter("id"));

        // Realizar la eliminación del orador en la base de datos)
        OradorDAO oradorDAO = null;
        oradorDAO = new OradorDAO();
        oradorDAO.eliminarOrador(id);

        response.setStatus(HttpServletResponse.SC_OK);
    }
}
}

    

