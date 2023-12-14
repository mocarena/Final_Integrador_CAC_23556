package util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Orador;
import util.ConexionDB;

public class OradorDAO {
    private Connection connection;
    private List<Orador> orador;

    // Métodos existentes para obtener, insertar, actualizar y eliminar oradores

    public List<Orador> obtenerTodosLosOradores() throws SQLException {
        List<Orador> oradores = new ArrayList<>();
        try {
            Connection con = ConexionDB.conectar();
            String sql = "SELECT * FROM Oradores"; // Ajusta esta consulta según tu esquema de base de datos
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int idOrador = rs.getInt("id_orador");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String tema = rs.getString("tema");
                    Date fechaAlta = rs.getDate("fecha_alta");

                    Orador orador = new Orador(idOrador, nombre, apellido, tema, fechaAlta);
                    oradores.add(orador);
                }
            }
           } catch (SQLException e) {
            e.printStackTrace(); // O maneja la excepción de una manera adecuada para tu aplicación
        }
        return oradores;
    }


    public boolean actualizarOrador(Orador orador) {
        String sql = "UPDATE Oradores SET nombre = ?, apellido = ?, tema = ?, fechaAlta = ? WHERE id_orador = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, orador.getNombre());
            statement.setString(2, orador.getApellido());
            statement.setString(3, orador.getTema());
            statement.setDate(4, new java.sql.Date(orador.getFechaAlta().getTime()));
            statement.setInt(5, orador.getIdOrador());

            int filasActualizadas = statement.executeUpdate();
            return filasActualizadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void eliminarOrador(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public void agregarOrador(Orador orador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}