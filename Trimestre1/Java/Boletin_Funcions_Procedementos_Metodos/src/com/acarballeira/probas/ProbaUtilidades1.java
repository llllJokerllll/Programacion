/* 
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira.probas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Funcións/Procedementos/Métodos
 * @version 1.0
 */

// Crea unha clase chamada Utilidades, dentro do paquete chamado com.acarballeira e
// dentro dela implementa os métodos descritos na parte inferior. Para probar estes
// métodos define unha clase chamada ProbaUtilidades1 dentro do paquete
// com.acarballeira.probas.

// Importación de librerías
import static com.acarballeira.Utilidades.*;

public class ProbaUtilidades1 {

    public static void main( String[] args ) {
        
        System.out.println( par( 2 ) );
        System.out.println( bisiesto( 1988 ) );
        tablaMultiplicar( 9 );
        imprimeSerie( 8, 1 );
        System.out.println( signo( -5 ) );
        System.out.println( signoString( 5 ) );
        System.out.println( suma( 4, 5 ) );
        System.out.println( suma( 4, 5, 6 ) );
        System.out.println( max( 9, 5 ) );
        System.out.println( min( 9, 5 ) );
        System.out.println( mcd( 9, 15) );
        System.out.println( mcm( 12, 18 ) );
        System.out.println( diasMes( 9, 1988 ) );
        diasTranscurridos1980( 10, 12, 2019 );
        diasEntreFechas( 1, 1, 1980, 9, 3, 1988 );
        horaASegundos( 15, 15, 15 );
        horaBonita( 9, 9, 9 );
    } // fin de main
    
} // fin de la clase ProbaUtilidades1

