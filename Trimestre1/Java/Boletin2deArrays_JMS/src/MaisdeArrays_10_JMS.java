/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_10
 * @version 1.0
 */
// Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países.
// Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número 
// asignado a cada país y el segundo índice el número asignado a cada ciudad.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_10_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        String[] paises = new String[ 4 ];
        String[][] ciudades = new String[ 4 ][ 3 ];
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < ciudades.length; contador1++ ) {
            System.out.println( "Por favor, introduzca el nombre del país" );
            paises[ contador1 ] = entrada.nextLine();
            for ( contador2 = 0; contador2 < ciudades[ contador1 ].length; contador2++ ) {
                System.out.println( "Por favor, introduzca el nombre de la ciudad" );
                ciudades[ contador1 ][ contador2 ] = entrada.nextLine();
            }
        }
        
        // Salida de datos
        for ( contador1 = 0; contador1 < ciudades.length; contador1++ ) {
            System.out.printf( "País: %-15s%s" , paises[ contador1 ], "Ciudades:  " );
            for ( contador2 = 0; contador2 < ciudades[ contador1 ].length; contador2++ ) {
                System.out.printf( "%-11s", ciudades[ contador1 ][ contador2 ] );
            }
            System.out.println( "" );
        }
    } // fin de main
    
} // fin de la clase MaisdeArrays_10_JMS

