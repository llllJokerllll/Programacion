/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 2
 * @version 1.0 
 */
// Hacer un programa que le de valores a una matriz unitaria de orden 10. 
// Una matriz unitaria es aquella en la que todos sus elementos valen 0, exceptuando los de la diagonal principal que valen 1.

// Importación de librerías

public class OB_2_Matriz_Unitaria_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int[][] matrizUnitaria = new int[ 10 ][ 10 ];
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización
        
        
        // Entrada de datos, resolución del programa y salida
        for ( contador1 = 0; contador1 < matrizUnitaria.length; contador1++ ) {
            for ( contador2 = 0; contador2 < matrizUnitaria[ contador1 ].length; contador2++ ) {
                if ( contador1 == contador2 ) {
                    matrizUnitaria[ contador1 ][ contador2 ] = 1;
                }
                System.out.printf( "%d  ", matrizUnitaria[ contador1 ][ contador2 ] );
            }
            System.out.println( "" );
        }
       

    } // fin de main
    
} // fin de la clase OB_2_Matriz_Unitaria_JMS

