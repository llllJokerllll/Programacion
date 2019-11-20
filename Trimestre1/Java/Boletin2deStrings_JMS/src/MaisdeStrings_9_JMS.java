/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 19 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_9
 * @version 1.0
 */
// Función calcularIMC(): calculará si la persona está en su peso ideal.
// La función devolverá según la tabla que se presenta a continuación la categoría donde
// encaja su IMC:

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_9_JMS {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        double peso, altura;
        // Salida de datos
        double resultado;
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos
        System.out.println( "Por favor, introduzca el peso en KG" );
        peso = entrada.nextDouble();
        System.out.println( "Por favor, introduzca la altura en metros" );
        altura = entrada.nextDouble();

        // Resolución del programa y salida
        resultado = iMasaCorporal( peso, altura );
        if ( resultado < 18.5 ) {
            System.out.println( "Por debajo del peso" );
        } else if ( resultado >= 18.5 && resultado <= 24.9 ) {
            System.out.println( "Saludable" );
        } else if ( resultado >= 25.0 && resultado <= 29.9 ) {
            System.out.println( "Con sobrepeso" );
        } else if ( resultado >= 30.0 && resultado <= 39.9 ) {
            System.out.println( "Obeso" );
        } else {
            System.out.println( "Obesidad extrema o alto riesgo" );
        }

    } // fin de main

    public static double iMasaCorporal( double n, double m ) {
        double resultado;
        resultado = n / Math.pow( m, 2 );

        return ( resultado );
    }

} // fin de la clase MaisdeStrings_9_JMS

