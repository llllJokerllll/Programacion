package com.acarballeira.exercicios.bd.exercicio5;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class ConexionPool {

    private static String host;
    private static String port;
    private static String db;
    private static String user;
    private static String password;

    private static ArrayList<Connection> lista = null;
    private static final int NUMCON = 5;
    private static final int NUMCONINC = 5;
    
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
    
    public static void devolverConexion(Connection con) {
        
        lista.add(con);

    }
    
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
