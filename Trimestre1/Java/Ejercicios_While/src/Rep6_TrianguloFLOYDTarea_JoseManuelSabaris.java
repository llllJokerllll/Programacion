// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica 6
// Escribir un programa que dibuje el triángulo de FLOYD de 10 líneas.

public class Rep6_TrianguloFLOYDTarea_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables iniciales
        int ancho, alto;
        // Declaración e inicialización de datos de entrada
        int lineas = 10;
        // Declaración e inicializacion de datos de salida
        int numero = 0;
        
        // Iniciamos el proceso y salida de datos
        for ( alto = 1; alto <= lineas; alto++) { // este for es para pintar los numeros del alto del triangulo
            for ( ancho = 1; ancho <= alto; ancho++ ) { // este otro for es para pintar los numeros del ancho del triangulo
                System.out.print( (numero += 1) + "  " ); // se le acumula 1 al valor de numero y se imprime junto a dos espacios
                if ( numero < 10 ) { // con este if añadimos un espacio mas en los nueve primeros numeros para que el formato sea correcto
                    System.out.print( " " );
                }
            }
            System.out.println( "" ); // esto hace un salto de linea
        }
    } // fin de main   
} // fin de la clase Rep6_TrianguloFLOYDTarea_JoseManuelSabaris
