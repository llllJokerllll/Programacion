/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Practica Creación de Objetos en Java
 * @version 1.0
 */
//

// Importación de librerías

public class PruebaPersonas {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.nombre = "Jose Manuel";
        p1.apellidos = "Sabarís García";
        p2.nombre = "Carmen María";
        p2.apellidos = "Iglesias Rodríguez";
        
        // Entrada de datos y resolución del programa
        p1.desplegarNombres();
        System.out.println( "" );
        p2.desplegarNombres();
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase PruebaPersonas

