package test;

import static utileria.Archivo.*;

public class ManejoArchivos {

	public static void main(String[] args) {
		
		String nombreArchivo = "c:\\Cursos\\archivoPruebaJava.txt";
		
		crearArchivo(nombreArchivo);

		escribirArchivo(nombreArchivo);
		
		leerArchivo(nombreArchivo);
		
		anexarArchivo(nombreArchivo);
		
		leerArchivo(nombreArchivo);
	}

}
