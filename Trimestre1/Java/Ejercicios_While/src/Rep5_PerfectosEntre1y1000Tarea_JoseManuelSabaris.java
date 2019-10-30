// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica 5
// Hacer un programa que imprima los números perfectos comprendidos entre 1 y 10000.
// Un número es perfecto si es igual a la suma de todos sus divisores excluyendo de esta suma al propio número.

public class Rep5_PerfectosEntre1y1000Tarea_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables iniciales
        int contador1, contador2; 
        int maxNumero = 10000;
        // Declaración de variables del proceso y salida
        int aux, suma;
        
        // Realizacíon de los procesos y salida de la solución
        System.out.println( "Los números perfectos entre 1 y 10000 son: " );
        for ( contador1 = 1; contador1 != maxNumero; contador1++ ) {
            
            // Inicialización de los valores dentro del bucle para que se reinicien en cada vuelta
            suma = 0; // suma es reiniciado a valor 0 en cada vuelta para poder realizar las operaciones correctamente
            aux = contador1; // aux coge el valor de contador
            
            for ( contador2 = 1; contador2 != aux; contador2++ ) {  // contador2 son los divisores.
                if ( aux % contador2 == 0 ) {
                    suma += contador2;     // si es divisor se suma
                }
            }
            if ( suma == contador1 ) {  // si el numero es igual a la suma de sus divisores es perfecto y lo mandamos a imprimir por pantalla
                System.out.println( contador1 );
            }
        }
    } // fin de main   
} // fin de la clase Rep5_PerfectosEntre1y1000Tarea_JoseManuelSabaris
