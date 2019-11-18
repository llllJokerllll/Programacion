/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_8
 * @version 1.0
 */
// Indica si dos arrays creados por ti son iguales con equals de Arrays. 
// Haz pruebas con distintos tamaños de arrays y datos.

// Importación de librerías
import java.util.Arrays;

public class MaisdeArrays_8_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        int[] vector1 = new int[ 10 ];
        int[] vector2 = new int[ 9 ];
        String[] nombreMes1 = { "No Existe", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] nombreMes2 = { "No Existe", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // Entrada de datos y resolución del programa
        Arrays.fill( vector1, 10 );
        vector2 = Arrays.copyOfRange( vector1, 1, 8 );
        
        // Salida de datos
        System.out.println( "¿Son el mismo objeto? --> " + ( vector1.equals( vector2 ) ) );
        System.out.println( "¿Son el mismo objeto? --> " + ( nombreMes1.equals( nombreMes2 ) ) );
        nombreMes1 = nombreMes2;
        vector1 = vector2;
        System.out.println( "¿Son el mismo objeto? --> " + ( vector1.equals( vector2 ) ) );
        System.out.println( "¿Son el mismo objeto? --> " + ( nombreMes1.equals( nombreMes2 ) ) );
        
    } // fin de main
    
} // fin de la clase MaisdeArrays_8_JMS

