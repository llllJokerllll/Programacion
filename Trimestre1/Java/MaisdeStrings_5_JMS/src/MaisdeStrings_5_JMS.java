/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 19 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_5
 * @version 1.0
 */
// Contar el número de veces que aparece un carácter en un texto.

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_5_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto, caracter;
        // Salida de datos
        int contador, aux;
        // Operativa
        // Constantes
        // Inicialización
        aux = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca un texto" );
        texto = entrada.nextLine();
        System.out.println( "Por favor, introduzca un caracter" );
        caracter = entrada.next();
        
        for ( contador = 0; contador < texto.length(); contador++ ) {
            if ( texto.charAt( contador ) == ( caracter.charAt( 0 ) ) ) {
                aux++; 
            }
        }
        
        // Salida de datos
        System.out.println("El caracter " + caracter + " aparece " + aux + " veces");

    } // fin de main
    
} // fin de la clase MaisdeStrings_5_JMS

