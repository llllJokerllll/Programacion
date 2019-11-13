/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Inicialización de los elementos de un arreglo con valores predeterminados de cero.

public class Array7_1_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        int[] arreglo; // declara un arreglo con el mismo nombre
        
        arreglo = new int[ 10 ]; // crea el objeto arreglo
        
        System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas
        
        // imprime el calor de cada elemento del arreglo
        for ( int contador = 0; contador < arreglo.length; contador++ )
            System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );

    } // fin de main
    
} // fin de la clase Array7_1_JoseManuelSabaris

