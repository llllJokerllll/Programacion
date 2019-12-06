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

public class EjemploEstatico {

        public static void main( String[] args ) {
        
            Persona4 persona1 = new Persona4( "Jose" );
            System.out.println( persona1 );
            
            Persona4 persona2 = new Persona4( "Carmen" );
            System.out.println( persona2 );

            Persona4 persona3 = new Persona4( "Pepe" );
            System.out.println( persona3 );
            
            System.out.println( "ContadorPersonas: " + Persona4.getContadorPersonas() );

    } // fin de main
    
} // fin de la clase EjemploEstatico

