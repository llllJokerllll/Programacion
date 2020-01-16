package com.acarballeira.exame.jose_manuel_sabaris.exercicio2;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 2
 * @version 1.0
 */
// Importación de librerías
import java.io.InputStream;
import java.util.Scanner;
import static com.acarballeira.exame.Utilidades.dniCorrecto;

public class Exercicio2 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // StringBuilder textoCompilado = new StringBuilder( "" );
        // Operativa
        String texto;
        String[] aux;
        String simbolo;
        String patron1;
        String patron2;
        String patron3;
        // Constantes
        // Inicialización
        patron1 = "[0123456789]";
        patron2 = "\\s+";
        patron3 = "[\\.\\,\\:\\;]";
        // Creación de objetos
        InputStream txt = Exercicio2.class.getResourceAsStream( "texto.txt" );
        Scanner entrada = new Scanner( txt, "ISO-8859-1" );

        // Entrada de datos y resolución del programa
        while ( entrada.hasNext() ) {
            //textoCompilado.append( entrada.nextLine() );
            texto = entrada.nextLine();
            aux = texto.split( patron2 );
            for ( String x : aux ) {
                if ( String.valueOf( x.charAt( 0 ) ).matches( patron1 ) ) {
                    if ( String.valueOf( x.charAt( x.length() - 1 ) ).matches( patron3 ) ) {
                        simbolo = String.valueOf( x.charAt( x.length() - 1 ) );
                        x = x.substring( 0, x.length() - 1 );
                        if ( !dniCorrecto( Integer.parseInt( x.substring( 0, x.length() - 1 ) ), x.charAt( x.length() - 1 ) ) ) {
                            if ( simbolo.length() > 0 ) {
                                x = "*" + x + "*" + simbolo;
                            } else {
                                x = "*" + x + "*";
                            }
                        } 
                    }
                }
                System.out.print( x + " " );
            }
            System.out.println( "" );
        } // fin de while

    } // fin de main

} // fin de la clase Exercicio2

