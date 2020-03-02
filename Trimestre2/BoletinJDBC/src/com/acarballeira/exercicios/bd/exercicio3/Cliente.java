/*
 * @Author Jose Manuel Sabar�s Garc�a
 */
package com.acarballeira.exercicios.bd.exercicio3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



// TODO: Auto-generated Javadoc
/**
 * The Class Cliente.
 */
public class Cliente {
    
    /**
     * Obtener num clientes.
     *
     * @return the int
     */
    public static int obtenerNumClientes() {
        int res = 0;
        
        try {
            Connection con = Conexion.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(IdCliente) FROM clientes");
            
            rs.next();
                res = Integer.parseInt(rs.getString(1));

        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        
        return res;
    }
}
    
    

