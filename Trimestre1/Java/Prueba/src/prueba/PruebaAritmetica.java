/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Práctica Creación de Métodos  
 * @version 1.0
 */

public class PruebaAritmetica {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int operandoA = 6;
        int operandoB = 2;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Aritmetica objeto1 = new Aritmetica( operandoA, operandoB );
        
        // Entrada de datos y resolución del programa
        
        
        // Salida de datos
        System.out.println( "operandoA = " + operandoA );
        System.out.println( "operandoB = " + operandoB );
        System.out.println( "sumar = " + objeto1.sumar() );
        System.out.println( "restar = " + objeto1.restar() );
        System.out.println( "multiplicar = " + objeto1.multiplicar() );
        System.out.println( "dividir = " + objeto1.dividir() );
    } // fin de main
    
} // fin de la clase PruebaAritmetica

