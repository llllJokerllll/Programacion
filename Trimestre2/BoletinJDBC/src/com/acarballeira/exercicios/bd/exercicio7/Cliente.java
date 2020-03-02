/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



// TODO: Auto-generated Javadoc
/**
 * The Class Cliente.
 */
public class Cliente {
    
    /** The id cliente. */
    private int idCliente;
    
    /** The nombre. */
    private String nombre;
    
    /** The apellidos. */
    private String apellidos;
    
    /**
     * Instantiates a new cliente.
     */
    public Cliente() {
        super();
    }

    /**
     * Instantiates a new cliente.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     */
    public Cliente(String nombre, String apellidos) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }



    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    /**
     * Gets the apellidos.
     *
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }



    /**
     * Sets the apellidos.
     *
     * @param apellidos the new apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    /**
     * Gets the id cliente.
     *
     * @return the id cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the id cliente.
     *
     * @param idCliente the new id cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    
    

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("%d. %s %s.",getIdCliente(), nombre, apellidos);
    }

    
}
    
    

