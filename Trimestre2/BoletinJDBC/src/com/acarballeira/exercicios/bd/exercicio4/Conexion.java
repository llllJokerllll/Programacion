/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio4;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class Conexion.
 */
public class Conexion {

    /** The host. */
    private static String host;
    
    /** The port. */
    private static String port;
    
    /** The db. */
    private static String db;
    
    /** The user. */
    private static String user;
    
    /** The password. */
    private static String password;
    
    /** The con. */
    private static Connection con = null;
    
    /**
     * Instantiates a new conexion.
     */
    private Conexion() {
        
            cargarPropiedades2();
            String cadeaConexion = "jdbc:mysql://" + host + ":" + port + "/" + db + "?serverTimeZone=Europe/Madrid";
            
            try {                        
                con = DriverManager.getConnection(cadeaConexion, user, password);
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
    
    /**
     * Cargar propiedades.
     */
    private static void cargarPropiedades() {
        
        try {
            String fileName = "/com/acarballeira/recursos/config.inc";
            //InputStream is = ClassLoader.getSystemResourceAsStream("com/acarballeira/recursos/config.inc");
            InputStream is = Conexion.class.getResourceAsStream(fileName);
            Properties props = new Properties();
            props.load(is);
            user = props.getProperty("user");
            password = props.getProperty("password");
            db = props.getProperty("db");
            port = props.getProperty("port");
            host = props.getProperty("host");
        } catch (IOException | NullPointerException e) {
            System.out.println("Non se pode cargar o ficheiro de propiedades" + e.getMessage());
        }
        
        
        
    }
    
    /**
     * Cargar propiedades 2.
     */
    private static void cargarPropiedades2() {
        
        try {
            String fileName = "c:/config.inc";
            FileReader ft = new FileReader(fileName);
            Properties props = new Properties();
            props.load(ft);
            user = props.getProperty("user");
            password = props.getProperty("password");
            db = props.getProperty("db");
            port = props.getProperty("port");
            host = props.getProperty("host");
        } catch (IOException | NullPointerException e) {
            System.out.println("Non se pode cargar o ficheiro de propiedades" + e.getMessage());
        }
        
        
        
    }
}

