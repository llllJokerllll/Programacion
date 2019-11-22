/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 19 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_7
 * @version 1.0
 */
// El cálculo de la letra del Documento Nacional de Identidad (DNI) es un proceso matemático
// sencillo que se basa en obtener el resto de la división entera del número de DNI y el número 23. 
// A partir del resto de la división, se obtiene la letra seleccionándola dentro de una cadena
// de letras.
// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_7_JMS {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int numeroDni;
        String letra;
        // Salida de datos
        // Operativa
        int resultado;
        char letraCorrecta;
        // Constantes
        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKET";
        final int DIV_DNI = 23;
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos, resolución del programa y salida
        System.out.println( "Por favor, introduzca el número del DNI sin letra" );
        numeroDni = entrada.nextInt();
        if ( numeroDni < 0 || numeroDni > 99999999 ) {
            System.err.println( "ERROR, el número introducido no es válido" );
        } else {
            System.out.println( "Por favor, introduzca la letra del DNI" );
            letra = entrada.next();
            letra = letra.toUpperCase();

            resultado = numeroDni % DIV_DNI;
            letraCorrecta = LETRAS.charAt( resultado );
            if ( letraCorrecta == letra.charAt( 0 ) ) {
                System.out.println( "Felicidades, el DNI y la letra son VÁLIDOS" );
            } else {
                System.out.println( "Lo sentimos, el DNI y la letra son NO son válidos" );
            }
        }

    } // fin de main

} // fin de la clase MaisdeStrings_7_JMS

