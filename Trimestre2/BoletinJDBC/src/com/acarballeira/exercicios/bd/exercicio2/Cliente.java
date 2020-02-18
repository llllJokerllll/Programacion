package com.acarballeira.exercicios.bd.exercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Cliente {

    private final static String HOST = "localhost";
    private final static String PORT = "3306";
    private final static String DB = "bombones";
    private final static String USER = "Joker";
    private final static String PASSWORD = "Pw159159*";
    
    public static int obtenerNumClientes() {
        Connection con = null;
        
        try {
            String cadeaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
            
            con = DriverManager.getConnection(cadeaConexion, USER, PASSWORD);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(IdCliente) FROM clientes");
            
            while(rs.next()) {
                return Integer.parseInt(rs.getString(1));
            }

        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } finally {
            try {
                con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return 0;
    }
}
    
    

