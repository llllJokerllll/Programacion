package mx.com.gm.peliculas.negocio;

import java.util.List;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {

	private final AccesoDatos datos;
	
	public CatalogoPeliculasImpl() {this.datos = new AccesoDatosImpl();}

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		Pelicula pelicula = new Pelicula(nombrePelicula);
		boolean anexar = false;
		try {
			anexar = datos.existe(nombreArchivo);
			datos.escribir(pelicula, nombreArchivo, anexar);			
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceos de datos");
			e.printStackTrace();
		}
		
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace();
        }
		
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		String resultado = null;
		try {
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx e) {
            System.out.println("Error al buscar la pelicula");
            e.printStackTrace();
        }
		System.out.println("Resultado busqueda: " + resultado);
		
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Erro de acceso a datos");
            e.printStackTrace();
        }
		
	}
	
	
}
