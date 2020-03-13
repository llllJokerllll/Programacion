package test;

import java.util.List;

import datos.UsuarioJDBC;
import domain.Usuario;

public class ManuejoUsuarios {

	public static void main(String[] args) {
		
		UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
		
		//Ejecutando el listado de usuarios
		List<Usuario> usuarios = usuarioJDBC.select();
		for (Usuario usuario : usuarios) {
			System.out.println("Usuario: " + usuario);
		}
		
		//Insertamos un nuevo usuario
		//Usuario usuario = new Usuario("calors.juarez", "123");
		//usuarioJDBC.insert(usuario);
		
		//Modificamos un usuario ya existente
		//Usuario usuario = new Usuario(3, "carlos.juarez", "456");
		//usuarioJDBC.update(usuario);

		//Borramos un usuario
		//usuarioJDBC.delete(new Usuario(3));
	}

}
