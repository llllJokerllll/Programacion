/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 21 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_14
 * @version 1.0
 */
// Escribe la función “esPalindromo” a la que le pasamos una cadena y nos dice si la cadena es
// un palíndromo (true) o no (false). Un palíndromo es una palabra o frase que se lee igual al
// revés que al derecho.

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_14_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        boolean resultado;
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca el texto" );
        texto = entrada.nextLine();
        
        // Resolución del programa
        resultado = esPalindromo( texto );
        
        // Salida de datos
        if ( resultado ) {
            System.out.println( "El texto introducido es Palíndromo" );
        } else {
            System.out.println( "El texto introducido no es Palíndromo" );
        }

    } // fin de main
    
    public static boolean esPalindromo ( String cadena ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        String textoReves;
        int contador1;
        // Constantes
        // Inicialización    
        textoReves = "";
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        for ( contador1 = cadena.length() - 1; contador1 >= 0; contador1-- ) {
            textoReves += cadena.charAt( contador1 );
        }
        System.out.println( textoReves );
        // Salida de datos
        if ( cadena.equalsIgnoreCase( textoReves ) ) {
            return true;
        } else {
            return false;
        }
        
    } // fin de esPalindromo
    
} // fin de la clase MaisdeStrings_14_JMS

