/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_12
 * @version 1.0
 */
// Crear de forma estática un array que almacene 2 artigos deportivos dunha tenda virtual
// (sneakers, sudaderas, …). Debemos almacenar o nome do produto, categoría e prezo, e
// tamén un número indeterminado de colores e tallas. Todos os valores a almacenar serán Strings.


// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_12_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        String[][][] articulos = {
                                 { 
                                     {"Puma","Zapatillas","55.99"},
                                   {"Azul","Rojo","Amarillo","Negro"},
                                   {"40.0","41.5","42.5","44.5","45.5"} 
                                 },
                                 { 
                                     {"Nike","Sudadera","34.99"},
                                   {"Azul","Rojo","Amarillo","Negro","Violeta"},
                                   {"S","M","L","XL","XXL"} 
                                 },
                                };
        
        // Entrada de datos y resolución del programa
        
        
        // Salida de datos
        for ( String[][] x : articulos ) {
            for ( String[] y : x ) {
                for ( String z : y ) {
                    System.out.printf( "%-12s", z );
                }
            }
            System.out.println( "" );
        }

    } // fin de main
    
} // fin de la clase MaisdeArrays_12_JMS

