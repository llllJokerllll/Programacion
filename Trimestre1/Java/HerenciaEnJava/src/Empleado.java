/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado( String nombre, double sueldo ) {
        super( nombre );
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo( double sueldo ) {
        this.sueldo = sueldo;
    }
    
    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
} // fin de la clase Empleado

