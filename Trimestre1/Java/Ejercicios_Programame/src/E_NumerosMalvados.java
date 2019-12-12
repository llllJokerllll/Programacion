/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 11 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio E_NumerosMalvados
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class E_NumerosMalvados {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, numeros;
        // Salida de datos
        // Operativa
        String operando;
        // Constantes
        final char BINARIO = '1';
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( int i = 0; i < casos; i++ ) {
            numeros = entrada.nextInt();
            operando = Integer.toBinaryString( numeros );
            int aux = 0;
            for ( int j = 0; j < operando.length(); j++ ) {
                if ( operando.charAt( j ) == BINARIO ) {
                    aux++;
                }
            }
            if ( aux % 2 == 0 ) {
                System.out.println( "MALVADO" );
            } else {
                System.out.println( "NO MALVADO" );
            }
        }
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase E_NumerosMalvados

