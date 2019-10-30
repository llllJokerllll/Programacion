// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica 4
// Escribir un programa que imprima todos aquellos números de 3 cifras que sean iguales
// a la suma de los cubos de las tres cifras. Por ejemplo 153 = 1^3 + 5^3 + 3^3

public class Rep4_3CifrasIgualesSumaCubosTarea_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables iniciales
        int contador;
        int maxNumero = 999;
        // Declaración de variables del proceso y salida
        int aux, sumaDigito;

        // Realizacíon de los procesos y salida de la solución
        System.out.println( "Los números de 3 cifras que son iguales a la suma de los cubos de sus cifras son: " );
        for ( contador = 100; contador != maxNumero; contador++ ) {
            
            // Inicialización de variables necesarias para la realización del bucle
            aux = contador; // aux coge el valor de contador
            sumaDigito = 0; // sumaDigito es reiniciado a valor 0 en cada vuelta para poder realizar las operaciones correctamente
            
            while ( aux != 0 ) {
                sumaDigito += Math.pow( ( aux % 10 ), 3 ); // sacamos el primer dígito, lo elevamos al cubo y sumamos el valor a sumaDigito
                aux = aux / 10; // quitamos el dígito que ya realizao el proceso anterior
            }
            if ( contador == sumaDigito ) { // imprimimos por pantalla solamente los números que den la solución correcta.
                System.out.print( sumaDigito + " " );
            }
        }
    } // fin de main   
} // fin de la clase Rep4_3CifrasIgualesSumaCubosTarea_JoseManuelSabaris
