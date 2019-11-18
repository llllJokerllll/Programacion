/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Str4_Maiusculas_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Str4_Maiusculas
 * @version 1.0
 */
// Subcadena mayúscula. Crea un programa en Java que solicite al usuario dos cadenas de
// caracteres y que devuelva la primera cadena, pero transformando en mayúsculas la
// parte que coincide con la segunda cadena introducida. Por ejemplo, si se introducen las
// cadenas “Este es mi amigo Juan” y “amigo”, devolverá “Este es mi AMIGO Juan”.

// Importación de librerías
import java.util.Scanner;

public class Str4_Maiusculas_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String cadena1, cadena2;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena1 = entrada.nextLine();
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena2 = entrada.nextLine();
        
        // Salida de datos
        System.out.println( cadena1.replace( cadena2, cadena2.toUpperCase()) );

    } // fin de main
    
} // fin de la clase Str4_Maiusculas_JMS

