/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_3
 * @version 1.0
 */
// Contar el número de palabras de una frase.

// Importación de librerías
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaisdeStrings_3_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String frase;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una frase" );
        frase = entrada.nextLine();
        StringTokenizer contador = new StringTokenizer( frase );
        
        // Salida de datos
        System.out.println( "El número de palabras en tu frase es: " + contador.countTokens() );

    } // fin de main
    
} // fin de la clase MaisdeStrings_3_JMS

