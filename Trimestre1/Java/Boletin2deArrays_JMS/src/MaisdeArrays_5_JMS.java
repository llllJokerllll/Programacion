/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 17 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_5
 * @version 1.0
 */
// Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). 
// Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, se añadira a una
// cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_5_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        String resultado;
        // Operativa
        // Constantes
        // Inicialización
        resultado = "";
        num = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        char[] abecedario = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        
        // Entrada de datos y resolución del programa
        while ( num != -1 ) {
            System.out.println( "Por favor, introduzca un número" );
            num = entrada.nextInt();
            if ( num >= 0 && num <= 26 ) {
                resultado += abecedario[ num ];
            }
        }
        
        // Salida de datos
        System.out.println( "La cadena formada es la siguiente" );
        System.out.println( resultado );

    } // fin de main
    
} // fin de la clase MaisdeArrays_5_JMS

