/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Caja {

    // Atributos de la clase
    int a;
    int b;
    int c;
    
    // Constructor vacio
    public Caja() {   
    }
    
    // Constructor con 3 argumentos
    public Caja( int a, int b, int c ) {
       
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Métodos de la clase
    public int volumen() {
        
        return a * b * c;
    }
    
} // fin de la clase Caja

