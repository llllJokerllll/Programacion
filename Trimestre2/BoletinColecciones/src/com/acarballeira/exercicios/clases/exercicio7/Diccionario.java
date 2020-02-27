/*
 * @Author Jose Manuel Sabar�s Garc�a
 */
package com.acarballeira.exercicios.clases.exercicio7;

import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * The Class Diccionario.
 */
public class Diccionario {

	/** The termos. */
	private HashMap<String, String> termos;
	
	/**
	 * Instantiates a new diccionario.
	 */
	public Diccionario() {
		super();
		this.termos = new HashMap<String, String>();
	}
	
	/**
	 * Engadir termo.
	 *
	 * @param esp the esp
	 * @param ing the ing
	 */
	public void engadirTermo(String esp, String ing) {
		this.termos.put(esp, ing);
		System.out.println("T�rmino a�adido correctamente.");
	}
	
	/**
	 * Baleirar.
	 */
	public void baleirar() {
		this.termos.clear();
		System.out.println("Todos los t�rminos han sido borrados correctamente.");
	}
	
	/**
	 * Traducir.
	 *
	 * @param esp the esp
	 * @return the string
	 */
	public String traducir(String esp) {
		String traduccion;
		
		if (termos.size() == 0) {
			return ("No hay t�rminos para consultar.");
		}
		else {
			
			if (termos.containsKey(esp)) {
				traduccion = termos.get(esp);
				return ("La traducci�n es: " + traduccion);
			}
			else {
				return ("El t�rmino no se encuentra en este diccionario.");
			}
			
			
		}
	}
}
