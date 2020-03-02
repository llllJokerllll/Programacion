/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

// TODO: Auto-generated Javadoc
/**
 * The Class Conexion.
 */
public class Conexion {

    /** The Constant HOST. */
    private final static String HOST = "localhost";
    
    /** The Constant PORT. */
    private final static String PORT = "3306";
    
    /** The Constant DB. */
    private final static String DB = "bombones";
    
    /** The Constant USER. */
    private final static String USER = "root";
    
    /** The Constant PASSWORD. */
    private final static String PASSWORD = "Pws159159*";
    
    /** The con. */
    private static Connection con = null;
    
    /**
     * Instantiates a new conexion.
     */
    private Conexion() {
        
            String cadeaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=" + TimeZone.getDefault().getID();
            
            try {                        
                con = DriverManager.getConnection(cadeaConexion, USER, PASSWORD);
                System.out.println("Conexión creada");
                    
            } catch (SQLException e) {
                System.out.println("ERROR SQL: ");e.printStackTrace();
            }
        }      
        
    
    /**
     * Obter conexion.
     *
     * @return the connection
     */
    public static Connection obterConexion() {
        
        //Connection com = null;
        if (con == null) {
            new Conexion();
        }
        return con;
    }
}

