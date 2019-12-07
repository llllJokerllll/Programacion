/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 7 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Empleado extends Persona{

    private double sueldo;
    
    public Empleado( String nombre, int edad ) {
        super( nombre, edad );
    }
    
    // Constructor sobrecargado
    public Empleado( String nombre, int edad, double sueldo) {
        this( nombre, edad );
        //super( nombre, edad );
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo( double sueldo ) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
    
} // fin de la clase Empleado

