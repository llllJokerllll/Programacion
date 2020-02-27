/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ProgramaAlquileres.
 */
public class ProgramaAlquileres {

	/** The videoclub. */
	private static ArrayList<Entregable> videoclub = new ArrayList<Entregable>();
	
	/** The series. */
	private static ArrayList<Serie> series = new ArrayList<Serie>();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		videoclub.add(new Videoxogo("Call of Duty", 15, "Accion", "Activision"));
		videoclub.add(new Videoxogo("Resident Evil", 30, "Terror", "Ubisoft"));
		videoclub.add(new Videoxogo("Max Payne", 20, "Suspense", "Konami"));
		videoclub.add(new Serie("Toy Story 3", 2, "Comedia", "Pixar"));
		videoclub.add(new Serie("Aladdin", 5, "Dibujos", "Disney"));
		
		for (Entregable elemento : videoclub) {
			if (elemento instanceof Serie) {
				System.out.println(elemento);
			}
		}
		System.out.println();
		
		videoclub.get(0).entregar();
		videoclub.get(3).entregar();
		
		Iterator<Entregable> it = videoclub.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        
        series.add(new Serie("Toy Story 3", 2, "Comedia", "Pixar"));
        series.add(new Serie("Aladdin", 5, "Dibujos", "Disney"));
        series.add(new Serie("Prison Break", 3, "Acción", "HBO"));
        series.add(new Serie("Lost", 9, "Psicolígica", "FOX"));
        series.add(new Serie("World War Z", 6, "Zombies", "WB"));
        
        series.sort(new ComparadorSerie());
        
        Iterator<Serie> it2 = series.iterator();
        while (it2.hasNext()) {
        	System.out.println(it2.next());
        }
        System.out.println();

        videoclub.sort(new Comparator<Entregable>() {

			@Override
			public int compare(Entregable o1, Entregable o2) {
				if (o1 instanceof Serie && o2 instanceof Videoxogo) {
					return -1;
				} else if (o1 instanceof Videoxogo && o1 instanceof Serie) {
					return 1;
				} else {
					return 0;
				}
			}
        	
        });
        
        for (Entregable elemento : videoclub) {
				System.out.println(elemento);
		}
	}
	
}
