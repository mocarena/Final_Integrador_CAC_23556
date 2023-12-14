package modelo;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.ConexionDB;


public class Orador {
    private int id_orador;
    private String nombre;
    private String apellido;
    private String tema;
    private Date fecha_alta;

    // Constructores
    public Orador() {
    }

    public Orador(int idOrador, String nombre, String apellido, String tema, Date fechaAlta) {
        this.id_orador = idOrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
        this.fecha_alta = fechaAlta;
    }

    // Getters y Setters

    public int getIdOrador() {
        return id_orador;
    }

    public void setIdOrador(int id) {
        this.id_orador = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaAlta() {
        return fecha_alta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fecha_alta = fechaAlta;
    }

    
}