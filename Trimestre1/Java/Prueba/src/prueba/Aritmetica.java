/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Práctica Creación de Métodos 
 * @version 1.0
 */

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;
    
    public Aritmetica() {
        
        System.out.println( "Ejecutando constructor vacio" );
    }
    
    public Aritmetica( int a, int b ) {
        this.a = a;
        this.b = b;
        System.out.println( "Ejecutando constructor con 2 argumentos" );
    }
    
    public int sumar() {
        
        return a + b;
    }
    
    public int restar() {
        
        return a - b;
    }
    
    public int multiplicar() {
        
        return a * b;
    }
    
    public int dividir() {
        
        return a / b;
    }
    
} // fin de la clase Aritmetica

