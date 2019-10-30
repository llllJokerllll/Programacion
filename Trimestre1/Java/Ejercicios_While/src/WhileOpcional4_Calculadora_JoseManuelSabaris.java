/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio While Opcional 4
 * @version 1.0 
 */
// Diseñar un algoritmo que permita mostrar en pantalla una rutina de selección del siguiente menú: 1.- Suma 2.- Resta 3.- Producto 4.- División S.- Salir.
// El usuario podrá elegir cualquier alternativa, luego ingresar A y B y realizar la operación seleccionada.
// Solamente con “S” podrá Salir. Tener en cuenta que si elige 4.- División deberá ingresar el denominador hasta que ingrese un valor diferente a 0 (cero).
// Si ingresa un número negativo o mayor que 4 deberá informar “Opción no válida”.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class WhileOpcional4_Calculadora_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        double num1, num2;
        String menu;
        // Declaración de variables de salida
        double resultado;
        // Inicialización de variables
        resultado = 0;
        
        // Entrada de datos , comprobación y proceso
        while ( true ) {
            
        System.out.println( "A continuacón escoja la operación que quiere realizar: \n1.- Suma\n2.- Resta\n3.- Multiplicación\n4.- División\nS.- Salir" );
        menu = entrada.next(); // lee la elección del menú del usuario
        
        if ( "S".equals( menu ) || "s".equals( menu ) ) break; // Comprobación para la finalización del programa
        
        switch ( menu ) {
            case "1":
                System.out.print( "Por favor, introduzca el primer número: " ); // indicador
                num1 = entrada.nextDouble(); // lee el primer número del usuario
        
                System.out.print( "Por favor, introduzca el segundo número: " ); // indicador
                num2 = entrada.nextDouble(); // lee el segundo número del usuario
                
                resultado = num1 + num2;
                break;
            case "2":
                System.out.print( "Por favor, introduzca el primer número: " ); // indicador
                num1 = entrada.nextDouble(); // lee el primer número del usuario
        
                System.out.print( "Por favor, introduzca el segundo número: " ); // indicador
                num2 = entrada.nextDouble(); // lee el segundo número del usuario
                
                resultado = num1 - num2;
                break;
            case "3":
                System.out.print( "Por favor, introduzca el primer número: " ); // indicador
                num1 = entrada.nextDouble(); // lee el primer número del usuario
        
                System.out.print( "Por favor, introduzca el segundo número: " ); // indicador
                num2 = entrada.nextDouble(); // lee el segundo número del usuario
                
                resultado = num1 * num2;
                break;
            case "4":
                System.out.print( "Por favor, introduzca el primer número: " ); // indicador
                num1 = entrada.nextFloat(); // lee el primer número del usuario
                do {
                System.out.print( "Por favor, introduzca el segundo número: " ); // indicador
                num2 = entrada.nextFloat(); // lee el segundo número del usuario
                } while ( num2 == 0 );
                resultado = num1 / num2;
                break;
            default:
                System.err.println( "Opción no válida" );
            }
        System.out.printf( "El resultdado es: " + resultado + "\n" );
        }
        
    } // fin del método main
    
} // fin de la clase WhileOpcional4_Calculadora_JoseManuelSabaris
