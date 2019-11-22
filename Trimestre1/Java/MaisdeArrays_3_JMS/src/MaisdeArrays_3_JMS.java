/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 17 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_3
 * @version 1.0
 */
// Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada uno, pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2.
// Debes mostrar el vector3 por pantalla.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_3_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        int[] vector1 = new int[ 5 ];
        int[] vector2 = new int[ 5 ];
        int[] vector3 = new int[ 5 ];
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector1.length; contador++ ) {
            System.out.println( "Por favor, introduzca un valor para el vector1" );
            vector1[ contador ] = entrada.nextInt();
            System.out.println( "Por favor, introduzca un valor para el vector2" );
            vector2[ contador ] = entrada.nextInt();
        }
        
        // Salida de datos
        for ( contador = 0; contador < vector3.length; contador++ ) {
            vector3[ contador ] = vector1[ contador ] + vector2[ contador ];
            System.out.print( vector3[ contador ] + " " );
        }

    } // fin de main
    
} // fin de la clase MaisdeArrays_3_JMS

