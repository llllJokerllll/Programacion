package com.acarballeira.exercicios.clases.exercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	private Diccionario d1 = new Diccionario();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
		App app = new App();
		
		
		do {
			
			opcion = app.menu();
			app.opcionEscollida(opcion);
			  
		} while (opcion != 5);
		
	}
		
	

	public int menu() {
		
		System.out.print("DICCIONARIO\n-----------\n1. Consultar traducci�n\n2. A�adir traducci�n\n3. Vaciar diccionario\n4. A�adir datos de prueba\n5. Salir\nIntroduzca la opcion a usar: ");
		
		try {
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Opci�n no v�lida");
			return 0;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opci�n");
			return 0;
		}
	}
	
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
		System.out.println("Los t�rminos de prueba han sido a�adidos correctamente.");
		
	}

public void opcionEscollida(int opcion) throws IOException {
		
		String esp;
		String ing;
		
		switch(opcion) {
			case 1:
				System.out.print("Introduzca el t�rmino que quiera traducir: ");
				esp = br.readLine();
				System.out.println(d1.traducir(esp));
				break;
			case 2:
				System.out.print("Introduzca el t�rmino: ");
				esp = br.readLine();
				System.out.print("Introduzca la traducci�n: ");
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
				System.out.println("ERROR, opci�n no v�lida");
			
		}
		
	}

}
