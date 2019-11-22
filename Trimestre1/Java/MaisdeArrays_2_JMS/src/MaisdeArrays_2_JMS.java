/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 16 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_2
 * @version 1.0
 */
// Crea un programa que pida un número de mes al usuario (por ejemplo, el 4) y el programa conteste cuántos días tiene (por ejemplo, 30) y el nombre del mes.
// Debes usar dos vectores. Para simplificarlo vamos a suponer que febrero tiene 28 días.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_2_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numMes;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        int[] diasMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] nombreMes = { "No Existe", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca el número del mes deseado" );
        numMes = entrada.nextInt();
        
        // Salida de datos
        System.out.println( "El mes seleccionado tiene " + diasMes[ numMes ] + " días y es el mes de " + nombreMes[ numMes ] );


    } // fin de main
    
} // fin de la clase MaisdeArrays_2_JMS

