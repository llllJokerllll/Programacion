/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.modelo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * The Class ConexionPool.
 *
 * @version 1.0
 */

public class ConexionPool {
	
	/** The host. */
	private static String host;
	
	/** The port. */
	private static String port;
	
	/** The bd. */
	private static String bd;
	
	/** The user. */
	private static String user;
	
	/** The password. */
	private static String password;

	/** The lista. */
	private static ArrayList<Connection> lista = null;
	
	/** The Constant MAXCON. */
	private static final int MAXCON = 5;
	

	/**
	 * Instantiates a new conexion pool.
	 */
	private ConexionPool() {
		
		cargarPropiedades();
		lista = new ArrayList<>();
	    crearConexions(MAXCON);
	    }
	    
	    /**
    	 * Crear conexions.
    	 *
    	 * @param num the num
    	 */
    	private static void crearConexions(int num) {
	        System.out.println("Creando conexións: " + num);
	        String cadeaConexion = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?serverTimeZone=Europe/Madrid";
	        for (int i = 0; i < num; i++) {
	            try {
	                lista.add(DriverManager.getConnection(cadeaConexion, user, password));
	            } catch (SQLException e) {
	                System.out.println("Erro creando conexión: " + e.getMessage());
	            }
	        }
	    }

	/**
	 * Obtener conexion.
	 *
	 * @return the connection
	 */
	public static Connection obtenerConexion() {
		
		if(lista==null) {
			new ConexionPool();
		}
		
		if(lista.size()>0) {
			Connection con = lista.remove(0);
			return con;
		} else {
			String cadenaConexion = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?serverTimeZone=Europe/Madrid";
			for (int i = 0; i < MAXCON; i++) {
				try {
					lista.add(DriverManager.getConnection(cadenaConexion, user, password));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error de conexi�n: " + e.getMessage());
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
			InputStream is = ClassLoader.getSystemResourceAsStream("com/proyecto/javafx/config/config.inc");
			Properties prop = new Properties();
			prop.load(is);
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			bd = prop.getProperty("bd");
			port = prop.getProperty("port");
			host = prop.getProperty("host");
		} catch (IOException | NullPointerException e) {
			System.out.println("No se puede cargar el fichero de propiedades" + e.getMessage());
		}
	}

}
