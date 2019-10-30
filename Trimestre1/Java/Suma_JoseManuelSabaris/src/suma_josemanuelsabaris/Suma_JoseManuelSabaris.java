package suma_josemanuelsabaris;

//Programa que muestra la suma de dos números
import java.util.Scanner;

public class Suma_JoseManuelSabaris { // el programa usa la clase Scanner

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {
        
        // crea el objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        int numero1, // primer númer a sumar
        numero2; // segundo número a sumar
        //suma; // suma de número1 y número2
        
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); //lee el primer número del usuario
        
        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario
        
        //suma = numero1 + numero2; // suma los números, después almacena el total en suma
        
        System.out.printf("La suma es %d\n", numero1 + numero2); // muestra la suma
    } // fin del método main
    
} // fin de la clase Suma
