package prueba;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class App {

    public static void main(String[] args) {
        
        String mysqlUrl = "jdbc:mysql://10.10.33.137/bombones?serverTimeZone=Europe/Madrid";
        String usuario = "root";
        String clave = "Abc123..";
        
        Connection con = null;
        Statement st;
        ResultSet rs;
        
        try {
            con = DriverManager.getConnection(mysqlUrl, usuario, clave);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM bombones");
            while(rs.next()) {
                System.out.println(rs.getString("idBombon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        try {
        con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
