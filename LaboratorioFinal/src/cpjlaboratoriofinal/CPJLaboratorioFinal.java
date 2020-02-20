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
		    //1. Creamos el objeto que administra el catalogo de personas
            //La creacion del archivo es opcional, de todas maneras se creara 
            //al escribir por primera vez en el archivo
            catalogoPeli.iniciarArchivo(nombreArchivo);
            break;
		case 2:
		    //2. agregar informacion archivo
            System.out.println("Introduce el nombre de una pelicula a agregar:");
            String nombre = "";
            try {
                nombre = br.readLine();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
            catalogoPeli.agregarPelicula(nombre, nombreArchivo);
            break;
		case 3:
		    //3. listar catalogo completo
            catalogoPeli.listarPeliculas(nombreArchivo);
            break;
		case 4:
		    //4. Buscar pelicula
            System.out.println("Introduce el nombre de una pelicula a buscar:");
            String buscar = "";
            try {
                buscar = br.readLine();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
            catalogoPeli.buscarPelicula(nombreArchivo, buscar);
            break;
		case 0:
			System.out.println("Hasta otra!");
			break;
		default:
			System.out.println("ERROR, opción no válida");
		}
		System.out.println("\n");

	}
}
