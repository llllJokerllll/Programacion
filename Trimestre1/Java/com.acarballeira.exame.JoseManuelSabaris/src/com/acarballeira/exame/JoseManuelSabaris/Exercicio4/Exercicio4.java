/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 13 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: ?
 */

package com.acarballeira.exame.JoseManuelSabaris.Exercicio4;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Jose Manuel Sabaris Garcia "Josemsabaris@gmail.com"
 * @version 1.0
 */

// Importación de librerias
import java.util.Random;

public class Exercicio4 {
        
    public static void main(String[] args) {
        
        // Definición de variables
        // Variables de entrada
        // Variables de salida
        boolean crecente;
        boolean decrecente;
        String resultado;
        // Variables de operaciones
        // Variables constantes
        // Creacion de objetos
        Random numero = new Random();
        double[] vector = new double[ 5 ];
        // Inicialización de variables
        crecente = true;
        decrecente = true;
        
        // Entrada de datos
        for ( int i = 0; i < vector.length; i++ ) {
            vector[ i ] = numero.nextDouble() * 40 + 10;
        }
        
        // Resolución del problema
        for ( int i = 0; i < vector.length - 1; i++ ) {
            System.out.println( vector[i]);
            if ( vector[ i ] > vector[ i + 1 ] ) {
                decrecente = false;
            } else if ( vector[ i ] < vector[ i + 1 ] ) {
                crecente = false;
            }
        }
        resultado = ( decrecente ) ? "Decrecente" : ( crecente ) ? "Crecente" : "Sen orde";
        
        // Salida de datos 
        System.out.println( resultado );
        
    } // fin de main
    
} // fin de class Ekercicio4
