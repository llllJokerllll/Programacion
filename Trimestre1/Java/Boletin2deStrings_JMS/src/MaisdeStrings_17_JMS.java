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
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca su texto" );
        texto = entrada.nextLine();
        
        // Resolución del programa
        String[] textoVector = texto.split( " " );
        for ( contador1 = textoVector.length - 1; contador1 <= 0; contador1-- ) {
            textoReves.append( textoVector[ contador1 ] );
        }
        
        // Salida de datos
        System.out.println( "El número de palabras es: " + textoVector.length );
        System.out.println( "La primera palabra es: " + textoVector[ 0 ] );
        System.out.println( "La última palabra es: " + textoVector[ textoVector.length - 1 ] );
        System.out.println( textoReves );
        
        
    } // fin de main
    
} // fin de la clase MaisdeStrings_17_JMS

