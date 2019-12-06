/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 6 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Persona3 {

        private String nombre;
        private double sueldo;
        private boolean eliminado;
        
        public Persona3( String nombre, double sueldo, boolean eliminado ) {
            
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.eliminado = eliminado;
        }
        
        public String getNombre() {          
            return this.nombre;
        }
        
        public void setNombre( String nombre ) {   
            this.nombre = nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        public void setSueldo( double sueldo ) {
            this.sueldo = sueldo;
        }

        public boolean isEliminado() {
            return eliminado;
        }

        public void setEliminado( boolean eliminado ) {
            this.eliminado = eliminado;
        }
        
//        public String toString() {
//            return "Nombre: " + nombre + ", sueldo: " + sueldo + ", eliminado?: " + eliminado; 
//        }

        @Override
        public String toString() {
            return "Persona3{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
        }

    
} // fin de la clase Persona3

