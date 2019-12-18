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
    
    public static int fibonacci( int num ) {
        
        if ( num > 1 ) {
            return fibonacci( num - 1 ) + fibonacci( num - 2 );
        } else if ( num == 1 ) {
            return 1;
        } else {
            return 0;
        }
    }
} // fin de la clase Recursividade

