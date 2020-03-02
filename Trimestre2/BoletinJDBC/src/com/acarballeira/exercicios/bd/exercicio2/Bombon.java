/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class Bombon.
 */
public class Bombon {

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
     * Obter num bombons.
     *
     * @return the int
     */
    public static int obterNumBombons() {
        Connection con = null;
        
        try {
            String cadeaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
            
            con = DriverManager.getConnection(cadeaConexion, USER, PASSWORD);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(IDBombon) FROM bombones");
            
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

