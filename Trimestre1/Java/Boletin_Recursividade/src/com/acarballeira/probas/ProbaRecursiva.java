/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 18 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 */

package com.acarballeira.probas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio funcións/procedementos/métodos con recursividade
 * @version 1.0
 */

// Crea unha clase chamada Recursividade, dentro do paquete chamado com.acarballeira
// e dentro dela implementa os métodos descritos na parte inferior empregando
// recursividade. Para probar estes métodos define unha clase chamada ProbaRecursiva
// dentro do paquete com.acarballeira.probas.

// Importación de librerías
import static com.acarballeira.Recursividade.*;

public class ProbaRecursiva {

    public static void main( String[] args ) {
        
        int[] vector = { 2, 5, 3, 9 };
        
        System.out.println( factorial( 5 ) );
        System.out.println( cociente( 9, 3 ) );
        System.out.println( elevado2n( 3, 3 ) );
        System.out.println( par( 15 ) );
        System.out.println( fibonacci( 9 ) );
        System.out.println( multip( 3, 5 ) );
        System.out.println( mcd( 9, 15 ) );
        System.out.println( sumaVector( vector, 3 ) );

    } // fin de main
    
} // fin de la clase ProbaRecursiva

