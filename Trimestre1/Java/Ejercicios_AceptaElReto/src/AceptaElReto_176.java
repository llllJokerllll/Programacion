/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 25 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElreto_176
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_176 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int alto, ancho;
        // Salida de datos
        int resultado;
        // Operativa
        int contador1, contador2, contador3, contador4;
        int aux;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            ancho = entrada.nextInt();
            alto = entrada.nextInt();
            if ( alto == 0 || ancho == 0 ) {
                break;
            }
            String[][] minas = new String[ alto ][ ancho ];
            resultado = 0;

            for ( contador1 = 0; contador1 < alto; contador1++ ) {
                for ( contador2 = 0; contador2 < ancho; contador2++ ) {
                    minas[ contador1 ][ contador2 ] = entrada.next();
                }
            }

            for ( contador1 = 0; contador1 < alto; contador1++ ) {
                for ( contador2 = 0; contador2 < ancho; contador2++ ) {
                    if ( "_".equals( minas[ contador1 ][ contador2 ] ) ) {
                        aux = 0;
                        if ( contador1 == 0 && contador2 == 0 ) {
                            if ( "*".equals( minas[ 0 ][ 1 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ 1 ][ 0 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ 1 ][ 1 ] ) ) {
                                aux++;
                            }
                        } else if ( contador1 == 0 && contador2 == ancho - 1 ) {
                            if ( "*".equals( minas[ 0 ][ ancho - 2 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ 1 ][ ancho - 1 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ 1 ][ ancho - 2 ] ) ) {
                                aux++;
                            }
                        } else if ( contador1 == alto - 1 && contador2 == 0 ) {
                            if ( "*".equals( minas[ alto - 1 ][ 1 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ alto - 2 ][ 0 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ alto - 2 ][ 1 ] ) ) {
                                aux++;
                            }
                        } else if ( contador1 == alto - 1 && contador2 == ancho - 1 ) {
                            if ( "*".equals( minas[ alto - 1 ][ ancho - 2 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ alto - 2 ][ ancho - 1 ] ) ) {
                                aux++;
                            }
                            if ( "*".equals( minas[ alto - 2 ][ ancho - 2 ] ) ) {
                                aux++;
                            }
                        } else if ( contador1 == 0 && contador2 > 0 && contador2 < ancho - 1 ) {
                            for ( contador3 = 0; contador3 <= 1; contador3++ ) {
                                for ( contador4 = contador2 - 1; contador4 <= contador2 + 1; contador4++ ) {
                                    if ( "*".equals( minas[ contador3 ][ contador4 ] ) ) {
                                        aux++;
                                    }
                                }
                            }
                        } else if ( contador2 == 0 && contador1 > 0 && contador1 < alto - 1 ) {
                            for ( contador3 = 0; contador3 <= 1; contador3++ ) {
                                for ( contador4 = contador1 - 1; contador4 <= contador1 + 1; contador4++ ) {
                                    if ( "*".equals( minas[ contador3 ][ contador4 ] ) ) {
                                        aux++;
                                    }
                                }
                            }
                        } else if ( contador1 == alto - 1 && contador2 > 0 && contador2 < ancho - 1 ) {
                            for ( contador3 = alto - 1; contador3 >= alto - 2; contador3-- ) {
                                for ( contador4 = contador2 - 1; contador4 <= contador2 + 1; contador4++ ) {
                                    if ( "*".equals( minas[ contador3 ][ contador4 ] ) ) {
                                        aux++;
                                    }
                                }
                            }
                        } else if ( contador2 == ancho - 1 && contador1 > 0 && contador1 < alto - 1 ) {
                            for ( contador3 = ancho - 1; contador3 >= ancho - 2; contador3-- ) {
                                for ( contador4 = contador1 - 1; contador4 <= contador1 + 1; contador4++ ) {
                                    if ( "*".equals( minas[ contador3 ][ contador4 ] ) ) {
                                        aux++;
                                    }
                                }
                            }
                        } else {
                            for ( contador3 = contador1 - 1; contador3 <= contador1 + 1; contador3++ ) {
                                for ( contador4 = contador2 - 1; contador4 <= contador2 + 1; contador4++ ) {
                                    if ( "*".equals( minas[ contador3 ][ contador4 ] ) ) {
                                        aux++;
                                    }
                                }
                            }
                        }

                        if ( aux >= 6 ) {
                            resultado++;
                        }
                    }
                }
            }
            System.out.println( resultado );
        }

    } // fin de main

} // fin de la clase AceptaElReto_176

