package com.acarballeira.exercicios.clases.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class PersoaDriver {

	public static void main(String[] args) {
		
		ArrayList<Object> vector = new ArrayList<Object>();
		
		vector.add(new Persoa("Luis", 12));
		vector.add(new Persoa("Jose", 13));
		vector.add(new Persoa("Manuel", 14));
		vector.add(new Persoa("María", 15));
		vector.add(new Persoa("Rosa", 16));
		vector.add(new Persoa("Luisa", 17));
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
				
		Iterator<Object> iterador = vector.iterator();		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());			
		}
				
		vector.forEach(lista->System.out.println(lista));
		
	}

}
