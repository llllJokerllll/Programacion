package ventas;

/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

public class Ventas {

    public static void main(String[] args) {

        // Crear varios objetos de tipo Producto
        Producto producto1 = new Producto( "Camisa", 50 );
        Producto producto2 = new Producto( "Pantalon", 100 );
        
        // Creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        // Agregamos los productos a la orden
        orden1.agregarProducto( producto1 );
        orden1.agregarProducto( producto2 );
        
        // Imprimir la orden
        orden1.mostrarOrden();


    } // fin de main
    
} // fin de la clase Ventas



