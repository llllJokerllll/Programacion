package com.acarballeira.exercicios.clases.drivers;

import java.util.Scanner;

import com.acarballeira.exercicios.clases.exercicio5.Cilindro;
import com.acarballeira.exercicios.clases.exercicio5.Circulo;
import com.acarballeira.exercicios.clases.exercicio5.Figura;
import com.acarballeira.exercicios.clases.exercicio5.Triangulo;
import com.acarballeira.exercicios.clases.exercicio5.Unidades;

public class ProbaVariasFiguras {

	private static final int MAX_F = 3;
	private static Figura[] f;
	
	public static void main(String[] args) {
			
			f = crearFiguras(MAX_F);
			amosarInfoFiguras(f);
		

	}

	public static Figura[] crearFiguras(int MAX_F) {
	    Scanner entrada = new Scanner(System.in);
	    String datos;
	    Figura[] vector = new Figura[MAX_F];
	    
	    for(int i = 0; i < MAX_F; i++) {
	        do {
	        System.out.println("Por favor, introduzca la figura a crear( Circulo, Cilindro o Triangulo )");
	        datos = entrada.next();
	        switch (datos) {
	        case "Circulo":
	            System.out.println("Por favor, introduzca a continuación el nombre y el tamaño del radio en cm");
	            vector[i] = new Circulo(entrada.next(), Unidades.CM, entrada.nextDouble());
	            break;
	        case "Cilindro":
	            System.out.println("Por favor, introduzca a continuación el nombre, el tamaño del radio y la altura en cm");
                vector[i] = new Cilindro(entrada.next(), Unidades.CM, entrada.nextDouble(), entrada.nextDouble());
                break;
	        case "Triangulo":
	            System.out.println("Por favor, introduzca a continuación el nombre y el tamaño de la base y la altura en cm");
                vector[i] = new Triangulo(entrada.next(), Unidades.CM, entrada.nextDouble(), entrada.nextDouble());
                break;
	        }
	       } while (!datos.equals("Circulo") && !datos.equals("Cilindro") && !datos.equals("Triangulo"));
	    }
	    return vector;
	}
	
	public static void amosarInfoFiguras( Figura[] f ) {
	    for(Figura x : f ) {
	        System.out.println(x);
	    }
	}
}
