/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 21 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// . Ler unha cadea de texto e xerar un array coa función split(). Posteriormente, amosar a
// seguinte información: Número de palabras, primeira palabra, última palabra, as palabras
// colocadas en orden inverso, as palabras ordenadas da a á z e as palabras ordenadas da z á a.

// Importación de librerías
import java.util.Scanner;
import java.util.Arrays;

public class MaisdeStrings_17_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        // Operativa
        int contador1;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        StringBuilder textoReves = new StringBuilder();
        StringBuilder textoOrdenado = new StringBuilder();
        StringBuilder textoOrdRev = new StringBuilder();
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca su texto" );
        texto = entrada.nextLine();
        
        // Resolución del programa
        String[] textoVector = texto.split( " " );
        String[] palabrasOrdenadas1 = ( String[] ) textoVector.clone();
        Arrays.sort( palabrasOrdenadas1 );
        for ( contador1 = textoVector.length - 1; contador1 >= 0; contador1-- ) {
            textoReves.append( textoVector[ contador1 ] + " " );
            textoOrdRev.append( palabrasOrdenadas1[ contador1 ] + " " );
            
        }
        for ( String x : palabrasOrdenadas1 ) {
            textoOrdenado.append( x + " " );
        }
        
        // Salida de datos
        System.out.println( "El número de palabras es: " + textoVector.length );
        System.out.println( "La primera palabra es: " + textoVector[ 0 ] );
        System.out.println( "La última palabra es: " + textoVector[ textoVector.length - 1 ] );
        System.out.println( textoReves );
        System.out.println( "Las palabras ordenadas de la a, a la z son: " + textoOrdenado );
        System.out.println( "Las palabras ordenadas de la z, a la a son: " + textoOrdRev );
        
        
    } // fin de main
    
} // fin de la clase MaisdeStrings_17_JMS

