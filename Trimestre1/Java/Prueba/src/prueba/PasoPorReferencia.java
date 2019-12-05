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

public class PasoPorReferencia {

    public static void main( String[] args ) {
        
        // Creación de objeto
        Referencia persona = new Referencia();
        
        persona.cambiarNombre( "Jose" );
        
        System.out.println( "Valor nombre: " + persona.obtenerNombre() );
        
        modificarPerson( persona );

        System.out.println( "Valor nombre modificado: " + persona.obtenerNombre() );

    } // fin de main

    private static void modificarPerson( Referencia personaArg ) {
        personaArg.cambiarNombre( "Christian" );
    }
    
} // fin de la clase PasoPorReferencia

