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

public class PalabraReturnClases {

    public static void main( String[] args ) {
           
        // Creación de objetos
        Suma s = creaObjetoSuma();
        
        System.out.println( "Resultado de llamar el método sumar: " + s.sumar() );


    } // fin de main
    
    private static Suma creaObjetoSuma() {
        
        return new Suma( 4, 6 );
    }
    
} // fin de la clase PalabraReturnClases

class Suma {
    
    int a;
    int b;
    
    public Suma( int a, int b ) {
        
        this.a = a;
        this.b = b;
    }
    
    public int sumar() {
        
        return this.a + this.b;
    }
}