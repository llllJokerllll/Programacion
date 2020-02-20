package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements AccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		File archivo = new File(nombreArchivo);
		List<Pelicula> peliculas = new ArrayList();
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			while (linea != null) {
				Pelicula pelicula = new Pelicula(linea);
				peliculas.add(pelicula);
				linea = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String nombreArchivo) throws AccesoDatosEx {
		// TODO Auto-generated method stub
		
	}
}
