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
			System.out.print("Elige opci�n:\n1.- Iniciar catalogo peliculas\n2.- Agregar pelicula\n3.- Listar Peliculas\n4.- Buscar Pelicula\n0.- Salir\n");
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Opci�n no v�lida");
			return 5;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opci�n");
			return 5;
		}
	}
	
	public static void opcionEscogida(int opcion) {
		
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
			buscarPelicula();
			break;
		case 0:
			System.out.println("Hasta otra!");
			break;
		default:
			System.out.println("ERROR, opci�n no v�lida");
	}

}
