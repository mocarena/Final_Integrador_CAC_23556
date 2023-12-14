package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/integrador_cac_moni";
    private static final String USER = "root";
    private static final String PASSWORD = "Martes18";

    // Bloque Estático (static {}):
    // Un bloque estático es una sección de código que se ejecuta solo una vez, cuando la clase es cargada por el ClassLoader de Java.
    // Es útil para inicializar recursos estáticos o realizar acciones de configuración que solo necesitan realizarse una vez durante la vida útil de una aplicación.
    static {
        try {
            // Carga dinámicamente la clase especificada y la inicializa, retornando su objeto Class.
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al cargar el controlador JDBC");
        }
    }

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Connection getConnection() throws SQLException {
        // Proporciona una conexión real en lugar de lanzar una excepción no admitida
        return conectar();
    }
}
