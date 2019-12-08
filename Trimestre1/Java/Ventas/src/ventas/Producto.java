/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ventas en 8 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package ventas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    // Constructor vacío
    private Producto() {
        this.idProducto = ++contadorProductos;
    }
    
    // Constructor sobrecargado de 2 argumentos
    public Producto ( String nombre, double precio ) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio( double precio ) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
} // fin de la clase Producto

