package cpjlaboratoriofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int opcion = -1;
	private static final String nombreArchivo = "c:\\Cursos\\CatalogoPeliculas.txt";
	private static CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
	
	public static void main(String[] args) {
		
		do {
			opcion = CPJLaboratorioFinal.menu();
			opcionEscogida(opcion);
		} while (opcion != 0);

	}
	
	public static int menu() {
		try {
			System.out.print("Elige opción:\n1.- Iniciar catalogo peliculas\n2.- Agregar pelicula\n3.- Listar Peliculas\n4.- Buscar Pelicula\n0.- Salir\n");
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Opción no válida");
			return 5;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opción");
			return 5;
		}
	}
	
	public static void opcionEscogida(int opcion) {
		
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
			buscarPelicula();
			break;
		case 0:
			System.out.println("Hasta otra!");
			break;
		default:
			System.out.println("ERROR, opción no válida");
	}

}
