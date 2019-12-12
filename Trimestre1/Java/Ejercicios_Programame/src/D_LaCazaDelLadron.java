/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 12 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio D_LaCazaDelLadron
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class D_LaCazaDelLadron {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int ventaja, ladron, policia;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        while ( true ) {
            ventaja = entrada.nextInt();
            ladron = entrada.nextInt();
            policia = entrada.nextInt();
            if ( ventaja == 0 && ladron == 0 && policia == 0 ) break;
            
            if ( ventaja > 0 && ladron >= policia || ventaja == 0 && ladron > policia ) {
                System.out.println( "Fugado" );
            } else {
                int aux = 0;
                int contador = 0;
                while ( aux < ventaja ) {
                    ventaja += ladron;
                    aux += policia;
                    contador++;
                }
                System.out.println( contador );
            }
            
        }


    } // fin de main
    
} // fin de la clase D_LaCazaDelLadron

