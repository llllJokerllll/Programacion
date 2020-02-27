/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

	/** The d 1. */
	private Diccionario d1 = new Diccionario();
	
	/** The br. */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
		App app = new App();
		
		
		do {
			
			opcion = app.menu();
			app.opcionEscollida(opcion);
			  
		} while (opcion != 5);
		
	}
		
	

	/**
	 * Menu.
	 *
	 * @return the int
	 */
	public int menu() {
		
		System.out.print("DICCIONARIO\n-----------\n1. Consultar traducción\n2. Añadir traducción\n3. Vaciar diccionario\n4. Añadir datos de prueba\n5. Salir\nIntroduzca la opcion a usar: ");
		
		try {
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Opción no válida");
			return 0;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opción");
			return 0;
		}
	}
	
	/**
	 * Crear terminos prueba.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void crearTerminosPrueba() throws IOException {
		
		d1.engadirTermo("Uno", "One");
		d1.engadirTermo("Dos", "Two");
		d1.engadirTermo("Tres", "Three");
		d1.engadirTermo("Cuatro", "Four");
		d1.engadirTermo("Cinco", "Five");
		d1.engadirTermo("Seis", "Six");
		d1.engadirTermo("Siete", "Seven");
		d1.engadirTermo("Ocho", "Eight");
		d1.engadirTermo("Nueve", "Nine");
		d1.engadirTermo("Diez", "Ten");
		System.out.println("Los términos de prueba han sido añadidos correctamente.");
		
	}

/**
 * Opcion escollida.
 *
 * @param opcion the opcion
 * @throws IOException Signals that an I/O exception has occurred.
 */
public void opcionEscollida(int opcion) throws IOException {
		
		String esp;
		String ing;
		
		switch(opcion) {
			case 1:
				System.out.print("Introduzca el término que quiera traducir: ");
				esp = br.readLine();
				System.out.println(d1.traducir(esp));
				break;
			case 2:
				System.out.print("Introduzca el término: ");
				esp = br.readLine();
				System.out.print("Introduzca la traducción: ");
				ing = br.readLine();
				d1.engadirTermo(esp, ing);
				break;
			case 3:
				d1.baleirar();
				break;
			case 4:
				crearTerminosPrueba();
				break;
			case 5:
				System.out.println("Hasta otra!");
				break;
			default:
				System.out.println("ERROR, opción no válida");
			
		}
		
	}

}
