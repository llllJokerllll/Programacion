/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 16 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_1
 * @version 1.0
 */
// Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado.
// Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_1_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos 
        // Salida de datos
        // Operativa
        int contador, aux;
        // Constantes
        // Inicialización
        aux = 4;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        String[] vector1 = new String[ 5 ];
        String[] vector2 = new String[ 5 ];
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector1.length; contador++ ) {
            System.out.println( "Por favor, introduzca una cadena de caracteres" );
            vector1[ contador ] = entrada.nextLine();
        }
        for ( String x : vector1 ) {
            vector2[ aux ] = x;
            aux--;
        }
        
        // Salida de datos
        for ( String x : vector2 ) {
            System.out.print( x + " " );
        }
        System.out.println( "" );
        
    } // fin de main
    
} // fin de la clase MaisdeArrays_1_JMS

