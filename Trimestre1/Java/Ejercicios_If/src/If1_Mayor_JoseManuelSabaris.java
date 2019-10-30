// Autor: Jose Manuel Sabarís
// Título: Ejercicio If 1
// Implementar aplicación que solicite tres números enteros y muestre el mayor de ellos.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class If1_Mayor_JoseManuelSabaris {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero1, // primer número
            numero2, // segundo número
            numero3; // tercer número
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número entero: " ); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.print( "Por favor, introduzca el segundo número entero: " ); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario
        
        System.out.print( "Por favor, introduzca el tercer número entero: " ); // indicador
        numero3 = entrada.nextInt(); // lee el tercer número del usuario
        
        // Comprobación, proceso y salida del resultado
        if ( numero1 > numero2 && numero1 > numero3 ) {
            System.out.println( "El número mayor introducido es: " + numero1 );
        } else if ( numero2 > numero3 ) {
            System.out.println( "El número mayor introducido es: " + numero2 );
        } else {
            System.out.println( "El número mayor introducido es: " + numero3 );
        }
        
    } // fin del método main
} // fin de la clase If1_Mayor_JoseManuelSabaris
