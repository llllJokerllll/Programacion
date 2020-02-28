package test;

import java.util.List;

import datos.PersonaJDBC;
import domain.Persona;

public class ManejoPersonas {

	public static void main(String[] args) {
		
		PersonaJDBC personaJDBC = new PersonaJDBC();
		List<Persona> personas = personaJDBC.select();
		
		for(Persona persona : personas) {
			System.out.println("Persona: " + persona);
		}
		
//		Persona persona = new Persona();
//		persona.setNombre("Maria");
//		persona.setApellido("Lara");
//		persona.setEmail("mlara@mail.com");
//		persona.setTelefono("636725089");
//		
//		personaJDBC.insert(persona);
		
//		Persona persona = new Persona();
//		persona.setId_persona(3);
//		persona.setNombre("Mayra");
//		persona.setApellido("Lara");
//		persona.setEmail("mlara@mail.com");
//		persona.setTelefono("636728549");
//		
//		personaJDBC.update(persona);
		
		Persona persona = new Persona();
		persona.setId_persona(3);
		personaJDBC.delete(persona);
	}
}
