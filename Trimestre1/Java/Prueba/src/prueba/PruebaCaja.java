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
//

// Importación de librerías

public class PruebaCaja {
        
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Caja caja = new Caja( ancho, alto, profundo );
        
        // Entrada de datos y resolución del programa
        System.out.println( "El volumen de la caja es: " + caja.volumen() );
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase PruebaCaja

