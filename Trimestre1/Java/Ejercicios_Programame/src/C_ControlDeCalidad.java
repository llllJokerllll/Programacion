/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 11 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio C_ControlDeCalidad
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class C_ControlDeCalidad {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos;
        String codigo;
        // Salida de datos
        boolean resultado;
        // Operativa
        String[] vector = new String[ 50 ];
        int aux;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( int i = 0; i < casos; i++ ) {
            codigo = entrada.next();
            aux = 0;
            while ( !"00000000".equals( codigo ) ) {
                vector[ aux ] = codigo.substring( 0, 4 );
                aux++;
                codigo = entrada.next();
            }
            resultado = true;
            for ( int j = 0; j < aux - 1 && resultado; j++ ) {
                for ( int k = 0; k < 4 && resultado; k++ ) {
                    for ( int l = 1; l < aux && resultado; l++ ) {
                        if ( vector[ j ].charAt( k ) == vector[ l ].charAt( k ) ) {
                            resultado = false;
                            break;
                        }
                    }
                }
            }
            if ( resultado ) {
                System.out.println( "APPROVED" );
            } else {
                System.out.println( "REJECTED" );
            }
        }

    } // fin de main
    
} // fin de la clase C_ControlDeCalidad

