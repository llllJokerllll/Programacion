/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 26 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_123
 * @version 1.0
 */
// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_123 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        String verbo;
        char conjuncion;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        OUTER:
        while ( true ) {
            verbo = entrada.next();
            conjuncion = entrada.next().charAt( 0 );
            if ( conjuncion == 'T') break;
            switch ( conjuncion ) {
                case 'A':
                    imprimirPresente( verbo );
                    break;
                case 'P':
                    imprimirPreterito( verbo );
                    break;
                case 'F':
                    imprimirFuturo( verbo );
                    break;
                default:
                    break;
            }
        }

    } // fin de main

    final static String[] persona = { "yo ", "tu ", "el ", "nosotros ", "vosotros ", "ellos " };

    public static void imprimirPresente( String verbo ) {

        int len = verbo.length();
        String terminacion = verbo.substring( len - 2, len );

        for ( int i = 0; i < 6; i++ ) {
            System.out.print( persona[ i ] );
            if ( i == 0 ) {
                System.out.println( verbo.substring( 0, len - 2 ) + "o" );
            } else if ( i == 1 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "as" );
                } else {
                    System.out.println( verbo.substring( 0, len - 2 ) + "es" );
                }
            } else if ( i == 2 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "a" );
                } else {
                    System.out.println( verbo.substring( 0, len - 2 ) + "e" );
                }
            } else if ( i == 3 ) {
                System.out.println( verbo.substring( 0, len - 1 ) + "mos" );
            } else if ( i == 4 ) {
                if ( terminacion.equals( "ir" ) ) {
                    System.out.println( verbo.substring( 0, len - 1 ) + "s" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "is" );
                }
            } else {
                if ( terminacion.equals( "ir" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "en" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "n" );
                }
            }
        }

    }

    public static void imprimirPreterito( String verbo ) {

        int len = verbo.length();
        String terminacion = verbo.substring( len - 2, len );

        for ( int i = 0; i < 6; i++ ) {
            System.out.print( persona[ i ] );
            if ( i == 0 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "e" );
                } else {
                    System.out.println( verbo.substring( 0, len - 2 ) + "i" );
                }
            } else if ( i == 1 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 1 ) + "ste" );
                } else if ( terminacion.equals( "er" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "iste" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "ste" );
                }
            } else if ( i == 2 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "o" );
                } else if ( terminacion.equals( "er" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "io" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "o" );
                }
            } else if ( i == 3 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 1 ) + "mos" );
                } else if ( terminacion.equals( "er" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "imos" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "mos" );
                }
            } else if ( i == 4 ) {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo.substring( 0, len - 1 ) + "steis" );
                } else if ( terminacion.equals( "er" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "isteis" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "steis" );
                }
            } else {
                if ( terminacion.equals( "ar" ) ) {
                    System.out.println( verbo + "on" );
                } else if ( terminacion.equals( "er" ) ) {
                    System.out.println( verbo.substring( 0, len - 2 ) + "ieron" );
                } else {
                    System.out.println( verbo.substring( 0, len - 1 ) + "eron" );
                }
            }
        }

    }

    public static void imprimirFuturo( String verbo ) {

        final String[] conjunciones = { "e", "as", "a", "emos", "eis", "an" };

        for ( int i = 0; i < 6; i++ ) {
            System.out.println( persona[ i ] + verbo + conjunciones[ i ] );
        }

    }
    
} // fin de la clase AceptaElReto_123

