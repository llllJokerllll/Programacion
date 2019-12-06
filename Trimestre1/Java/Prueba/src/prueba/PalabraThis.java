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

public class PalabraThis {

    public static void main( String[] args ) {
        
            Persona1 persona = new Persona1( "Jose" );


    } // fin de main
    
} // fin de la clase PalabraThis

class Persona1 {
    
    String nombre;
    
    Persona1( String nombre ) {
        
        this.nombre = nombre; // this apunta a un objet de tipo Persona
        
        System.out.println( "Impresion del operador this dentro de la clase Persona: " + this ); // this apunta a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir( this ); // this contiene una referencia al objeto Persona
    }
}

class Imprimir {
    
    public void imprimir( Persona1 p ) {
        
        System.out.println( "Impresión argumento persona: " + p ); // valor del objeto Persona
        System.out.println( "Impresión objeto actual (this) " + this ); // this apunta a un objeto de tipo imprimir
    }
}
