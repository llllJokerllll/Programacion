/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. ExameJDBC en 19 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira.exame.exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The Class App.
 * En esta clase tipo "DRIVER" creamos los métodos estáticos y probamos dichos métodos
 */
public class App {

	/** The u 1. */
	private static UsuarioDAO u1 = new UsuarioDAO();
	
	/** The usuarios. */
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
    /**
     * The main method.
     * Aquí invocamos los métodos de prueba
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        crearDatosProba();        
        listarDatosProba();
        System.out.println();
        eliminarDatosProba();
        actualizarDatosProba();
        listarDatosProba();        
    }

	/**
	 * Actualizar datos proba.
	 */
	private static void actualizarDatosProba() {
		usuarios = (ArrayList<Usuario>) u1.getAll();
        for (Usuario elemento : usuarios) {
            if (elemento.getEmail().equals("xulio@yahoo.es")) {
            	elemento.setRol(100);
            	u1.update(elemento);
            }
        }
		
	}

	/**
	 * Eliminar datos proba.
	 */
	private static void eliminarDatosProba() {
		usuarios = (ArrayList<Usuario>) u1.getAll();
        for (Usuario elemento : usuarios) {
            if (elemento.getRol() == 3) {
            	u1.delete(elemento);
            }
        }
		
	}

	/**
	 * Listar datos proba.
	 */
	private static void listarDatosProba() {
        usuarios = (ArrayList<Usuario>) u1.getAll();
        for (Usuario elemento : usuarios) {
            System.out.println(elemento);
        }
		
	}

	/**
	 * Crear datos proba.
	 */
	private static void crearDatosProba() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(App.class.getResourceAsStream("/com/acarballeira/data/datosProba.txt")));
		String texto;
		String[] aux;
		try {
			while ((texto = bf.readLine()) != null) {
				aux = texto.split("###");
				u1.save(new Usuario(aux[0], aux[1], Integer.parseInt(aux[2])));
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

}
