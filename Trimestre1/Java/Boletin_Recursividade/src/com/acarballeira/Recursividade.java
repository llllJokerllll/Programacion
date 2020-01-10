/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 18 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 */

package com.acarballeira;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías

public class Recursividade {

    public static int factorial( int num ) {
        
        if ( num == 0 ) {
            return 1;
        } else {
            return num * factorial( num - 1 );
        }
    }
    
    public static int cociente( int num1, int num2 ) {
        
        if ( num1 < num2 ) {
            return 0;
        } else {
            return 1 + cociente( num1 - num2, num2 );
        }
    }
    
    public static int elevado2n( int num, int exponente ) {
        
        if ( exponente == 0 ) {
            return 1;
        } else {
            return num * elevado2n( num, exponente - 1 );
        }
    }
    
    public static boolean par( int num ) {
        
        if ( num == 0 ) {
            return true;
        } else if ( num == 1 ) {
            return false;
        } else {
            return par( num - 2 );
        }
    }
    
    public static int fibonacci( int num ) {
        
        if ( num > 1 ) {
            return fibonacci( num - 1 ) + fibonacci( num - 2 );
        } else if ( num == 1 ) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static int multip( int num1, int num2 ) {
        
        if ( num2 == 1 ) {
            return num1;
        } else {
            return num1 + multip( num1 , num2 - 1 );
        }
    }
    
    public static int mcd( int num1, int num2 ) {
        
        if ( num2 == 0 ) {
            return num1;
        } else {
            return mcd( num2, num1 % num2 );
        }
    }
    
    public static int sumaVector( int[] vector, int tamano ) {
        
        if ( tamano == 0 ) {
            return vector[ tamano ];
        } else {
            return vector[ tamano ] + sumaVector( vector, tamano - 1 );
        }
    }
    
} // fin de la clase Recursividade

