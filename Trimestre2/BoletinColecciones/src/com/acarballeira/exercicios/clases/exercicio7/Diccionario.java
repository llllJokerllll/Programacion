package com.acarballeira.exercicios.clases.exercicio7;

import java.util.HashMap;

public class Diccionario {

	private HashMap<String, String> termos;
	
	public Diccionario() {
		super();
		this.termos = new HashMap<String, String>();
	}
	
	public void engadirTermo(String esp, String ing) {
		this.termos.put(esp, ing);
		System.out.println("T�rmino a�adido correctamente.");
	}
	
	public void baleirar() {
		this.termos.clear();
		System.out.println("Todos los t�rminos han sido borrados correctamente.");
	}
	
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
