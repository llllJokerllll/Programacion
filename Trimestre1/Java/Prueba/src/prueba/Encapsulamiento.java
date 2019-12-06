/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 6 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Encapsulamiento {

    public static void main( String[] args ) {
        
        Persona3 persona = new Persona3( "Jose", 5000, false );
        
//        System.out.println( "Nombre persona: " + persona.getNombre() );
//        System.out.println( "Sueldo persona: " + persona.getSueldo() );
//        System.out.println( "persona borrada: " + persona.isEliminado() );
        System.out.println( "Persona: " + persona );
        
        persona.setNombre( "Juan" );
        persona.setSueldo( 3000 );
        persona.setEliminado( true );
        
        System.out.println( "Persona: " + persona );

    } // fin de main
    
} // fin de la clase Encapsulamiento

