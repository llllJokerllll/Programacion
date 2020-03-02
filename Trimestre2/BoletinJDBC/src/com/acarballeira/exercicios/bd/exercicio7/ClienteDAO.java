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
 * The Class ClienteDAO.
 */
public class ClienteDAO {

    /**
     * Obter.
     *
     * @return the list
     */
    public List<Cliente> obter() {
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
    public Cliente obter(int iD) {
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
    public boolean rexistrar(Cliente cliente) {
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
    public boolean eliminar(Cliente cliente) {
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
    public boolean actualizar(Cliente cliente) {
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
