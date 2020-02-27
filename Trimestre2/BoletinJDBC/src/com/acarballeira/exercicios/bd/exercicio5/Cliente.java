package com.acarballeira.exercicios.bd.exercicio5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String apellidos;
    
    public Cliente() {
        super();
    }

    public Cliente(String nombre, String apellidos) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellidos() {
        return apellidos;
    }



    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

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
    
    

    @Override
    public String toString() {
        return String.format("%d. %s %s.",getIdCliente(), nombre, apellidos);
    }

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
}
    
    

