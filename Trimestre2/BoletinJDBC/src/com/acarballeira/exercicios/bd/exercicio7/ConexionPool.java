/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio7;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class ConexionPool.
 */
public class ConexionPool {

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

    /** The lista. */
    private static ArrayList<Connection> lista = null;
    
    /** The Constant NUMCON. */
    private static final int NUMCON = 5;
    
    /** The Constant NUMCONINC. */
    private static final int NUMCONINC = 5;
    
    /**
     * Instantiates a new conexion pool.
     */
    private ConexionPool() {
        
            cargarPropiedades();
            String cadeaConexion = "jdbc:mysql://" + host + ":" + port + "/" + db + "?serverTimeZone=Europe/Madrid";
            lista = new ArrayList<Connection>();
            for (int i = 0; i < NUMCON; i++) {
                try {
                    lista.add(DriverManager.getConnection(cadeaConexion, user, password));
                } catch (SQLException e) {
                    System.out.println("Error en la conexión " + e.getMessage());
                }
            }
        }      
        
    
    /**
     * Obter conexion.
     *
     * @return the connection
     */
    public static Connection obterConexion() {
        
        if (lista == null) {
            new ConexionPool();
        }
        
        if (lista.size() > 0) {
            Connection con = lista.remove(0);
            return con; 
        } else {
            String cadeaConexion = "jdbc:mysql://" + host + ":" + port + "/" + db + "?serverTimeZone=Europe/Madrid";
            lista = new ArrayList<Connection>();
            for (int i = 0; i < NUMCONINC; i++) {
                try {
                    lista.add(DriverManager.getConnection(cadeaConexion, user, password));
                } catch (SQLException e) {
                    System.out.println("Error en la conexión " + e.getMessage());
                }
            }
            Connection con = lista.remove(0);
            return con;
        }
        
    }
    
    /**
     * Devolver conexion.
     *
     * @param con the con
     */
    public static void devolverConexion(Connection con) {
        
        lista.add(con);

    }
    
    /**
     * Cargar propiedades.
     */
    private static void cargarPropiedades() {
        
        try {
            String fileName = "/com/acarballeira/recursos/config.inc";
            //InputStream is = ClassLoader.getSystemResourceAsStream("com/acarballeira/recursos/config.inc");
            InputStream is = ConexionPool.class.getResourceAsStream(fileName);
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
    
    
    
}
