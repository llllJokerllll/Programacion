/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class PersoaDriver.
 */
public class PersoaDriver {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		ArrayList<Persoa> vector = new ArrayList<Persoa>();
		
		vector.add(new Persoa("Luis", 12));
		vector.add(new Persoa("Jose", 13));
		vector.add(new Persoa("Manuel", 14));
		vector.add(new Persoa("María", 15));
		vector.add(new Persoa("Rosa", 16));
		vector.add(new Persoa("Luis", 17));
		vector.add(new Persoa("Marcos", 18));
		vector.add(new Persoa("Ivan", 19));
		vector.add(new Persoa("Roberto", 20));
		vector.add(new Persoa("Diego", 21));
		
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
				
		for (Object object : vector) {
			System.out.println(object);
		}
				
		Iterator<Persoa> iterador = vector.iterator();		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());			
		}
		
		Collections.sort((List<Persoa>) vector);
		
		vector.forEach(lista->System.out.println(lista));
		
	}

}
