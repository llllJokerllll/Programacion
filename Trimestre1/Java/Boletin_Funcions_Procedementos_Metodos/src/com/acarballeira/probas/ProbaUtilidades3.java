/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos en 10 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package com.acarballeira.probas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Funcións/Procedementos/Métodos
 * @version 1.0
 */

// Crea unha clase chamada Mates, dentro do paquete chamado com.acarballeira e dentro
// dela implementa os métodos descritos na parte inferior. Para probar estes métodos
// define unha clase chamada ProbaUtilidades3 dentro do paquete
// com.acarballeira.probas.

// Importación de librerías
import static com.acarballeira.Mates.*;

public class ProbaUtilidades3 {

    public static void main( String[] args ) {
        
        System.out.println( esPrimo( 3 ) );
        System.out.println( siguientePrimo( 3 ) );
        System.out.println( digitos( 6969 ) );
        voltea( 9031988 );
        System.out.println( posicionDeDigito( 9, 845168964 ) );
        quitaPorDetras( 2, 5646153 );
        quitaPorDelante( 2, 5646153 );
        System.out.println( pegaPorDelante( 9, 159 ) );
        System.out.println("Pi es " + Math.PI);     
        System.out.println("E es " + Math.E);


    } // fin de main
    
} // fin de la clase ProbaUtilidades3

