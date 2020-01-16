/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. Proyecto Examen1_Trimestre en 16 ene. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías
import java.util.Random;

public class Ejercicio3 {

    static final int MAX = 50;
    static final int MIN = 10;
    
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        double[] vector;
        // Constantes
        int NUM;
        // Inicialización 
        NUM = 5;
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        vector = generaVector( NUM );
        amosaVector( vector );
        System.out.println( tipoOrde( vector ) );
        
        // Salida de datos


    } // fin de main
    
    static double[] generaVector( int tamano ) {
        
        double[] vector = new double[ tamano ];
        Random aleatorio = new Random();
        
        for ( int i = 0; i < tamano; i++ ) {
            vector[ i ] = aleatorio.nextDouble() * ( MAX - MIN ) + MIN;
        }
        return vector;
    }
    
    static void amosaVector( double[] vector ) {
        
        for ( double x : vector ) {
            System.out.println( x + " " );
        }
        System.out.println();
    }
    
    static String tipoOrde( double[] vector ) {
        int numCrecente;
        int numDecrecente;
        
        numCrecente = numDecrecente = 0;
        
        for (int i = 1; i < vector.length; i++ ) {
            if ( vector[ i - 1 ] >= vector[ i ] ) {
                numDecrecente++;
            }
            if ( vector[ i - 1 ] <= vector[ i ] ) {
                numCrecente++;
            }
        }
        
        if ( numCrecente == vector.length - 1 ) {
            return "Crecente";
        } else if (numDecrecente == vector.length - 1) {
            return "Decrecente";
        } else {
            return "Sen orde";
        }
    }
    
} // fin de la clase Ejercicio3

