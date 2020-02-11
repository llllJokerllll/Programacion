package com.acarballeira.exercicios.clases.exercicio1;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> alumnos = new ArrayList<String>();
		alumnos.add("Anxo");
		alumnos.add("Pablo");
		alumnos.add("Ivan");
		alumnos.add("Alex");
		alumnos.add("Dorado");
		alumnos.add("Pacetti");
		alumnos.add("Daniel");
		alumnos.add("Aaron");
		alumnos.add("Brais");
		
		for(String x : alumnos ) {
			System.out.println(x);
		}

	}

}
