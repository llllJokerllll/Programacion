/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Fig. 7.3: InicArreglo.java
// Inicialización de los elementos de un arreglo con un inicializador de arreglo.

public class Array7_2_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // la lista de inicializadora especifica el valor para cada elemento
        int[] arreglo = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        
        System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas
        
        // imprime el valor del elemento de cada arreglo
        for ( int contador = 0; contador < arreglo.length; contador++ )
            System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );


    } // fin de main
    
} // fin de la clase Array7_2_JoseManuelSabaris

