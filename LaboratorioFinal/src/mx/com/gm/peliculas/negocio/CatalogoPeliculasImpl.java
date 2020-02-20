package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	};
	
	
}
