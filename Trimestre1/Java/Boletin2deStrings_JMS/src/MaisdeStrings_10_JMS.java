/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 20 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_10
 * @version 1.0
 */
// Crear una función contrasinalForte que reciba la contraseña. Deberá verificar que:
// a. La longitud sea como mínimo de 8.
// b. Deberá tener 2 o más mayúsculas, 1 o más minúscula y más de 5 números.
// c. La función indicará si es o no Fuerte la contraseña evaluada.

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_10_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String contrasinal;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca su contraseña" );
        contrasinal = entrada.next();
        
        // Resolucion del programa y salida de datos
        contrasinalForte( contrasinal );

    } // fin de main
    
    public static void contrasinalForte ( String cadena ) {
        
        // Salida de datos
        int auxMayus, auxMinus, auxNum;
        // Operativa
        int contador1, contador2, contadorNums;
        // Constantes
        final String MAYUS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        final String MINUS = "abcdefghijklmnñopqrstuvwxyz";
        final String NUMS = "0123456789";
        // Inicialización
        auxMayus = auxMinus = auxNum = 0;
        
        // Resolucion del programa y salida de datos
        if ( cadena.length() < 8 ) {
            System.out.println( "Contraseña demasiado corta" );
        } else {
            for ( contador1 = 0; contador1 < cadena.length(); contador1++ ){
                contadorNums = 0;
                for ( contador2 = 0; contador2 < MAYUS.length(); contador2++ ) {
                    if ( cadena.charAt( contador1 ) == MAYUS.charAt( contador2 ) ) {
                        auxMayus++;
                    } else if ( cadena.charAt( contador1 ) == MINUS.charAt( contador2 ) ) {
                        auxMinus++;
                    } else if ( contadorNums < 9 ) {
                        if ( cadena.charAt( contador1 ) == NUMS.charAt( contadorNums ) ) {
                            auxNum++;                           
                        }
                        contadorNums++;
                    }
                }
            }
            if ( auxMayus >= 2 && auxMinus >= 1 && auxNum > 5 ) {
                System.out.println( "Contraseña fuerte" );
            } else {
                System.out.println( "Contraseña débil" );
            }
        }
        
    } // fin de contrasinalForte
    
} // fin de la clase MaisdeStrings_10_JMS

