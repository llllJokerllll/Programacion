/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Str3_Encuentra_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Str1_Invertir
 * @version 1.0
 */
// Invertir cadena. Crea un programa en Java que solicite al usuario la introducción de una
// cadena de caracteres y devuelva esta cadena invertida.

// Importación de librerías
import java.util.Scanner;

public class Str1_Invertir_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String cadena1;
        // Salida de datos
        String cadena2;
        // Operativa
        int contador;
        // Constantes
        // Inicialización
        cadena2 = "";
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena1 = entrada.nextLine();
        
        for ( contador = ( cadena1.length() - 1 ); contador >= 0; contador-- ) {
            cadena2 += cadena1.charAt( contador );
        }
        
        // Salida de datos
        System.out.println( cadena2 );

    } // fin de main
    
} // fin de la clase Str1_Invertir_JMS

