package com.acarballeira.exercicios.clases.exercicio8;

import java.util.ArrayList;

public class ProgramaAlquileres {

	private static ArrayList<Entregable> videoclub = new ArrayList<Entregable>();
	
	public static void main(String[] args) {
		
		videoclub.add(new Videoxogo("Call of Duty", 15, "Accion", "Activision"));
		videoclub.add(new Videoxogo("Resident Evil", 30, "Terror", "Ubisoft"));
		videoclub.add(new Videoxogo("Max Payne", 20, "Suspense", "Konami"));
		videoclub.add(new Serie("Toy Story 3", 2, "Comedia", "Pixar"));
		videoclub.add(new Serie("Aladdin", 5, "Dibujos", "Disney"));
		
		for (Entregable string : videoclub) {
			System.out.println(string);
		}
		
		videoclub.get(0).entregar();
		videoclub.get(3).entregar();
		
		for (Entregable string : videoclub) {
			System.out.println(string);
		}


	}

}
