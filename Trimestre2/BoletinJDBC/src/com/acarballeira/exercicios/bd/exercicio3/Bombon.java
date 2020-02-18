package com.acarballeira.exercicios.bd.exercicio3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bombon {
    
    public static int obterNumBombons() {
        int res = 0;
        
        try {
            Connection con = Conexion.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(IDBombon) FROM bombones");
            
            rs.next();
                res = Integer.parseInt(rs.getString(1));

        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        }
        return res;
    }
}

