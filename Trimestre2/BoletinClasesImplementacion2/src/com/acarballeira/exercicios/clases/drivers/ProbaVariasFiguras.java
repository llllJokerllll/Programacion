package com.acarballeira.exercicios.clases.drivers;

import java.util.Scanner;

import com.acarballeira.exercicios.clases.exercicio5.Cilindro;
import com.acarballeira.exercicios.clases.exercicio5.Circulo;
import com.acarballeira.exercicios.clases.exercicio5.Figura;
import com.acarballeira.exercicios.clases.exercicio5.Triangulo;
import com.acarballeira.exercicios.clases.exercicio5.Unidades;

// TODO: Auto-generated Javadoc
/**
 * The Class ProbaVariasFiguras.
 */
public class ProbaVariasFiguras {

	/** The Constant MAX_F. */
	private static final int MAX_F = 3;
	
	/** The f. */
	private static Figura[] f;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
			
			f = crearFiguras(MAX_F);
			amosarInfoFiguras(f);
		

	}

	/**
	 * Crear figuras.
	 *
	 * @param MAX_F the max f
	 * @return the figura[]
	 */
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
	            System.out.println("Por favor, introduzca a continuaci�n el nombre y el tama�o del radio en cm");
	            vector[i] = new Circulo(entrada.next(), Unidades.CM, entrada.nextDouble());
	            break;
	        case "Cilindro":
	            System.out.println("Por favor, introduzca a continuaci�n el nombre, el tama�o del radio y la altura en cm");
                vector[i] = new Cilindro(entrada.next(), Unidades.CM, entrada.nextDouble(), entrada.nextDouble());
                break;
	        case "Triangulo":
	            System.out.println("Por favor, introduzca a continuaci�n el nombre y el tama�o de la base y la altura en cm");
                vector[i] = new Triangulo(entrada.next(), Unidades.CM, entrada.nextDouble(), entrada.nextDouble());
                break;
	        }
	       } while (!datos.equals("Circulo") && !datos.equals("Cilindro") && !datos.equals("Triangulo"));
	    }
	    return vector;
	}
	
	/**
	 * Amosar info figuras.
	 *
	 * @param f the f
	 */
	public static void amosarInfoFiguras( Figura[] f ) {
	    for(Figura x : f ) {
	        System.out.println(x);
	    }
	}
}
