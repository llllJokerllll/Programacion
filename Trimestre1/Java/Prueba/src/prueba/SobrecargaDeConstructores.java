/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 7 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class SobrecargaDeConstructores {

    public static void main( String[] args ) {
                
        // Creación de objetos
        Persona persona1 = new Persona( "Jose", 31 );
        System.out.println( persona1 );
        
        Empleado empleado1 = new Empleado( "Carmen", 28, 4000 );
        System.out.println( empleado1 );
        
    } // fin de main
    
} // fin de la clase SobrecargaDeConstructores

