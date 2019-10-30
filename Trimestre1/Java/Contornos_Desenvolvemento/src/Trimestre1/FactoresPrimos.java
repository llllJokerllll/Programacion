package Trimestre1;

/**
 * @author Jose Manuel Sabarís Título: Ejercicio
 * @version 1.0
 */
//
// Importación de librerías
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Descomposición en factores primos.
 *
 * @author chuidiang
 */
public class FactoresPrimos {

    /**
     * Un bucle de 2 a 100 para ir descomponiendo todos esos números en factores
     * primos. Escribe todos ellos con su descomposición por pantalla.
     *
     * @param args
     */
    public static void main( String[] args ) {
        int numero;
        Scanner entrada = new Scanner( System.in );
        numero = entrada.nextInt();
        
            LinkedList<Integer> factores = FactoresPrimos.descomponEnFactoresPrimos( numero );
            System.out.print( numero + "=" );
            factores.stream().map( ( Integer factor ) -> {
                System.out.print( factor );
                // Si no es el último, escribe el signo *
                return factor;
            } ).filter( ( factor ) -> ( !Objects.equals( factor, factores.getLast() ) ) ).forEachOrdered( ( Integer _item ) -> {
                System.out.print( "*" );
            } );
            System.out.println();
        }
    

    /**
     * Se le pasa un valor entero superior a 1 y devuelve una lista de factores
     * primos en los que ha descompuesto el número.
     *
     * @param valor Número de descomponer
     * @return Lista de factores primos.
     */
    public static LinkedList<Integer> descomponEnFactoresPrimos( int valor ) {
        assert valor > 1;

        // Se empieza probando como posible factor primo el 2.
        int factor = 2;
        LinkedList<Integer> factores = new LinkedList<>();

        while ( factor <= valor ) {
            // Mientras es divisible, se añade el factor a la lista de factores primos
            // y se realiza la división.
            while ( valor % factor == 0 ) {
                factores.add( factor );
                valor = valor / factor;
            }

            // Si no es divisible, se pasa al posible siguiente factor.
            factor++;
        }

        return factores;
    }
}
