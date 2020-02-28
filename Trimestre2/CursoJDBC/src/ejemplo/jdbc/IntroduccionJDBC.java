package ejemplo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

public class IntroduccionJDBC {

	public static void main(String[] args) {
		
		//Paso 1. Creamos nuestra cadena de conexion a mysql
		String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=" + TimeZone.getDefault().getID();
		
		//Paso 2. Creamos el objeto de conexión a la base de datos
		try {
			Connection conexion = DriverManager.getConnection(url, "root", "Pws159159*");
		//Paso 3. Creamos un objeto Statement
			Statement instruccion = conexion.createStatement();
		//Paso 4. Creamos el query
			String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
		//Paso 5. Ejecución del query
			ResultSet resultado = instruccion.executeQuery(sql);
		//Paso 6. Procesamos el resultado
			while (resultado.next()) {
				System.out.println("Id Persona: " + resultado.getInt(1) + " Nombre: " + resultado.getString(2) + " Apellido: " + resultado.getString(3) + " Email: " + resultado.getString(4) + " Telefono: " + resultado.getString(5));
			}
		//Paso 7. Cerramos cada objeto que hemos utilizado
			resultado.close();
			instruccion.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
