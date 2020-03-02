/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio6;

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

    /**
     * Obter.
     *
     * @return the list
     */
    public static List<Cliente> obter() {
        List<Cliente> lista = new ArrayList<>();
        int aux = 0;
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT IdCliente, Nombre, Apellidos FROM clientes");
            
            while (rs.next()) { 
                lista.add(new Cliente(rs.getString(2), rs.getString(3)));
                lista.get(aux).setIdCliente(rs.getInt(1));
                aux++;
            }
            ConexionPool.devolverConexion(con);
            return lista;
            
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        
        return lista;
    }
    
    /**
     * Obter.
     *
     * @param iD the i D
     * @return the cliente
     */
    public static Cliente obter(int iD) {
        Cliente c1 = new Cliente();
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Nombre, Apellidos FROM clientes where idCliente = " + iD + ";");
            
            if(rs.next()) {
                c1.setIdCliente(iD);
                c1.setNombre(rs.getString(1));
                c1.setApellidos(rs.getString(2));
            }
            ConexionPool.devolverConexion(con);
            
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        return c1;
    }
    
    /**
     * Rexistrar.
     *
     * @param cliente the cliente
     * @return true, if successful
     */
    public static boolean rexistrar(Cliente cliente) {
        boolean rs = false;
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            rs = st.execute("INSERT INTO clientes (Nombre, Apellidos) VALUES ('" + cliente.getNombre() + "', '" + cliente.getApellidos() + "');");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        return rs;
    }
    
    /**
     * Eliminar.
     *
     * @param cliente the cliente
     * @return true, if successful
     */
    public static boolean eliminar(Cliente cliente) {
        boolean rs = false;
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            rs = st.execute("DELETE FROM clientes WHERE idCliente = " + cliente.getIdCliente() + ";");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        return rs;
    }
    
    /**
     * Actualizar.
     *
     * @param cliente the cliente
     * @return true, if successful
     */
    public static boolean actualizar(Cliente cliente) {
        boolean rs = false;
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            rs = st.execute("UPDATE clientes SET Nombre = '" + cliente.getNombre() + "', Apellidos = '" + cliente.getApellidos() + "' WHERE idCliente = " + cliente.getIdCliente() + ";");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: " + e.getMessage());
        } 
        return rs;
    }
}
    
    

