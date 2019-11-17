/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 17 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// Construir un programa que rellene de forma automática dos vectores de números reales
// vector1 y vector2, y que construya un nuevo vector del resultado de "concatenar" los vectores v1 y v2. 
// Es decir, colocar los elementos de v2 a continuación de los de v1 y, finalmente, mostrar el resultado de la concatenación por pantalla.
// Las dimensiones de v1 y v2 son 8 y 12 respectivamente. 
// Los números reales generados deben ser 1=< n <= 99.

// Importación de librerías
import java.util.Random;

public class MaisdeArrays_6_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Random numAleatorio = new Random();
        int[] vector1 = new int[ 8 ];
        int[] vector2 = new int[ 12 ];
        String[] vector3 = new String[ 12 ];
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector2.length; contador++ ) {
            vector2[ contador ] = numAleatorio.nextInt( 99 ) + 1;
            if ( contador < vector1.length ) {
                vector1[ contador ] = numAleatorio.nextInt( 99 ) + 1;
            }
            if ( contador < vector1.length ) {
                vector3[ contador ] = Integer.toString( vector1[ contador ] ) + Integer.toString( vector2[ contador ] );
            } else { 
                vector3[ contador ] = Integer.toString( vector2[ contador ] );
            }
        }
        
        // Salida de datos
        for ( String x : vector3 ) {
            System.out.print( x + " " );
        }

    } // fin de main
    
} // fin de la clase MaisdeArrays_6_JMS

