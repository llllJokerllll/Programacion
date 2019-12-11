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
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( int i = 0; i < casos; i++ ) {
            numeros = entrada.nextInt();
            operando = Integer.toBinaryString( numeros );
        }
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase E_NumerosMalvados

