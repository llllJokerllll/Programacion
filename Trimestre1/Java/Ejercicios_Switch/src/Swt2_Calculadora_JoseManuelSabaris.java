// Autor: Jose Manuel Sabarís
// Título: Ejercicio Switch 2
// Implementar una calculadora que muestre un menú con las operaciones suma, resta, multiplicación y división y realice dicha operación seleccionada.
// Debe tenerse en cuenta la división entre 0. Si el usuario pulsa una opción inexistente el programa debe terminar.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class Swt2_Calculadora_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        double num1, num2;
        int menu;
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número: " ); // indicador
        num1 = entrada.nextDouble(); // lee el primer número del usuario
        
        System.out.print( "Por favor, introduzca el segundo número: " ); // indicador
        num2 = entrada.nextDouble(); // lee el segundo número del usuario
        
        System.out.println( "A continuacón escoja la operación que quiere realizar: \n1- Suma\n2- Resta\n3- Multiplicación\n4- División" );
        menu = entrada.nextInt(); // lee la elección del menú del usuario
        
        // Comprobación y proceso
        if ( menu < 1 || menu > 4 ) {
            System.err.println( "ERROR, no es una opción válida del menú" );
        } else {
            if ( menu == 1 ) {
                System.out.println( "El resultado de la suma es: " + ( num1 + num2 ) );
            } else if ( menu == 2 ) {
                System.out.println( "El resultado de la resta es: " + ( num1 - num2 ) );
            } else if ( menu == 3 ) {
                System.out.println( "El resultado de la multiplicación es: " + ( num1 * num2 ) );
            } else if ( menu == 4 && num2 != 0 ) {
                System.out.println( "El resultado de la división es: " + ( num1 / num2 ) );
            } else {
                System.err.println( "ERROR, no se puede dividir ningún número entre 0" );
            }
        }
        
    } // fin del método main
    
} // fin de la clase Swt2_Calculadora_JoseManuelSabaris
