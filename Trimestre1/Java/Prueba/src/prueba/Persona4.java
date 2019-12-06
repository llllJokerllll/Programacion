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

public class Persona4 {

        private int idPersona; // se asocia con un objeto (instancia)
        private String nombre; // se asocia con un objeto (instancia)
        private static int contadorPersonas; // se aoscia con la clase
        
        public Persona4( String nombre ) {
            this.idPersona = ++contadorPersonas;
            this.nombre = nombre;
        }
        
        public int getIdPersona() {
            return this.idPersona;
        }
        
        public String getNombre() {
            return this.nombre;
        }
        
        public void setNombre( String nombre ) {
            this.nombre = nombre;
        }
    
        public static int getContadorPersonas() {
            return contadorPersonas;
        }
        
        @Override
        public String toString() {
            return "idPersona: " + idPersona + ", Nombre: " + nombre + ", contadorPersonas: " + contadorPersonas;
        }
        
} // fin de la clase Persona4

