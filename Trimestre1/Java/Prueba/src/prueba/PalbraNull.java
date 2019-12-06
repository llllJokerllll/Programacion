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

public class PalbraNull {

    public static void main( String[] args ) {
        
        Persona2 persona1 = new Persona2( "Jose " );
        System.out.println( "Persona1: " + persona1.obtenerNombre() );

        Persona2 persona2 = persona1;
        System.out.println( "Persona2: " + persona2.obtenerNombre() );
        
        persona1 = null;
        if ( persona1 != null ) {
            System.out.println( "Persona1: " + persona1.obtenerNombre() );
        } else {
            System.out.println( "La variable persona1 no apunta a ningun objeto" );
        }
        
        persona2 = null;
        
        System.gc(); // garbage collector soloplanifica la llamada

    } // fin de main
    
} // fin de la clase PalbraNull

class Persona2{
    
    String nombre;
    
    Persona2( String nombre ) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
}
