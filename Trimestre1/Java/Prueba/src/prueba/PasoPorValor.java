/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class PasoPorValor {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int x = 10;
        // Salida de datos
        System.out.println( "x = " + x );
        // Operativa
        cambiarValor( x );
        // Constantes
        // Inicialización        
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        System.out.println( "x = " + x );
        
        // Salida de datos


    } // fin de main
    
    private static void cambiarValor( int arg ) {
        arg = 20;
        System.out.println( "arg = " + arg );
    }
} // fin de la clase PasoPorValor

