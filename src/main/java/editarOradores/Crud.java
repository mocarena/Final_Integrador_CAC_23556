package editarOradores;

import java.util.List;
import modelo.Orador;

public interface Crud {
    List<Orador> listarOradores();
    Orador verOrador(int id);
    boolean agregarOrador(Orador orador);
    boolean editarOrador(Orador orador);
    boolean eliminarOrador(int id);
}