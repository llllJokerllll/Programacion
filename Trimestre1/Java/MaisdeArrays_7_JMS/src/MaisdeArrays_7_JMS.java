/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_7
 * @version 1.0
 */
// Crear dos arrays, rellenar uno con fill teniendo en cuenta que será de tamaño 10 y
// copiarlo al otro usando copyOf de Arrays, obviando la primera y última posiciones. 

// Importación de librerías
import java.util.Arrays;

public class MaisdeArrays_7_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        int[] vector1 = new int[ 10 ];
        int[] vector2 = new int[ 10 ];
        
        // Entrada de datos y resolución del programa
        Arrays.fill( vector1, 10 );
        vector2 = Arrays.copyOfRange( vector1, 1, 9 );
        
        // Salida de datos
        for ( int x : vector1 ) {
            System.out.print( x + " " );
        }
        System.out.println( "" );
        for ( int y : vector2 ) {
            System.out.print( y + " ");
        }
        System.out.println( "" );
        
    } // fin de main
    
} // fin de la clase MaisdeArrays_7_JMS

