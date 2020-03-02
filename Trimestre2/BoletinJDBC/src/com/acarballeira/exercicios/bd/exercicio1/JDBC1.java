/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class JDBC1.
 */
public class JDBC1 {

    /** The Constant HOST. */
    private final static String HOST = "localhost";
    
    /** The Constant PORT. */
    private final static String PORT = "3306";
    
    /** The Constant DB. */
    private final static String DB = "bombones";
    
    /** The Constant USER. */
    private final static String USER = "Joker";
    
    /** The Constant PASSWORD. */
    private final static String PASSWORD = "Pw159159*";
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
            
            String mysqlUrl = "jdbc:mysql://localhost/bombones?serverTimeZone=Europe/Madrid";
            
            Connection con = null;
            Statement st;
            ResultSet rs;
            
            try {
                Class.forName("com.mysql.jdbc.Driver"); //Ya no es obligatorio poner este driver, se carga solo en las ultimas versiones...
                
                String cadeaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
                
                con = DriverManager.getConnection(cadeaConexion, USER, PASSWORD);
                st = con.createStatement();
                System.out.println("Conexión creada");
                rs = st.executeQuery("SELECT Nombre, Apellidos, Ciudad, Telefono FROM clientes ORDER By Apellidos, Nombre");
                
                while(rs.next()) {
                    System.out.printf("%-20s%-20s%20s%20s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("ERROR SQL: ");e.printStackTrace();
            } finally {
                try {
                    con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
            
            
        }

    }

