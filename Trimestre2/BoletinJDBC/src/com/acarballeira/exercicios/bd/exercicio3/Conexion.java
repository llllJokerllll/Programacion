package com.acarballeira.exercicios.bd.exercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final static String HOST = "localhost";
    private final static String PORT = "3306";
    private final static String DB = "bombones";
    private final static String USER = "Joker";
    private final static String PASSWORD = "Pw159159*";
    private static Connection con = null;
    
    private Conexion() {
        
            String cadeaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
            
            try {                        
                con = DriverManager.getConnection(cadeaConexion, USER, PASSWORD);
                System.out.println("Conexión creada");
                    
            } catch (SQLException e) {
                System.out.println("ERROR SQL: ");e.printStackTrace();
            }
        }      
        
    
    public static Connection obterConexion() {
        
        //Connection com = null;
        if (con == null) {
            new Conexion();
        }
        return con;
    }
}

