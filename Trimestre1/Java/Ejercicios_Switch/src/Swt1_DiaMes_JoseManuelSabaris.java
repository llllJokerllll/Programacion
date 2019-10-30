// Autor: Jose Manuel Sabarís
// Título: Ejercicio Switch 1
// Ingresar un número de mes válido y un año.
// Mostrar la cantidad de días que puede tener el mismo, considerando que el año puede ser bisiesto.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class Swt1_DiaMes_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int mes, ano;
        
        // Declaración de variables intermedias
        boolean bisiesto;
        
        // Declaración de variables de salida
        int dias = 0;
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el mes: " ); // indicador
        mes = entrada.nextInt(); // lee el mes del usuario

        System.out.print( "Por favor, introduzca el año: " ); // indicador
        ano = entrada.nextInt(); // lee el año del usuario
        bisiesto = ( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0;
        
        // Comprobación y proceso
        if ( mes < 1 || mes > 12 ) {
            System.err.println( "ERROR, el mes que ha introducido no es válido" );
        } else {
            if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                dias += 31;
            } else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                dias += 30;
            } else if ( mes == 2 && bisiesto ) {
                dias += 29;
            } else {
                dias += 28;
            }
        // Salida del resultado
        System.out.println( "El mes que ha escogido tiene: " + dias + " días" );
        }
        
    } // fin del método main
    
} // fin de la clase Swt1_DiaMes_JoseManuelSabaris
