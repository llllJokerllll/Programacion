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
        String[] vector1 = new String[ 50 ];
        String[] vector2 = new String[ 50 ];
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
                vector1[ aux ] = codigo.substring( 0, 4 );
                vector2[ aux ] = codigo.substring( 4, 8 );
                aux++;
                codigo = entrada.next();
            }
            resultado = true;
            for ( int j = 0; j < aux - 1 && resultado; j++ ) {
                for ( int l = j + 1; l < aux && resultado; l++ ) {
                    if ( vector1[ j ].equals( vector1[ l ] ) || vector2[ j ].equals( vector2[ l ] ) ) {
                        resultado = false;
                        break;
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

