package com.acarballeira.exercicios.bd.exercicio4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Cliente {
    
    public static int obtenerNumClientes() {
        int res = 0;
        
        try {
            Connection con = ConexionPool.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(IdCliente) FROM clientes");
            
            rs.next();
            res = Integer.parseInt(rs.getString(1));
            ConexionPool.devolverConexion(con);
            
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        
        return res;
    }
}
    
    

