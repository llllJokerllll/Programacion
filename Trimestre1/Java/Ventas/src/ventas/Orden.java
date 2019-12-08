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

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        // Inicializar el arreglo
        productos = new Producto[ MAX_PRODUCTOS ];
    }
    
    public void agregarProducto( Producto producto ) {
        if ( this.contadorProductos < MAX_PRODUCTOS ) {
            productos[ contadorProductos++ ] = producto;
        } else {
            System.out.println( "Se ha superado el máximo de productos" );
        }
    }
    
    public double calcularTotal() {
        
        double total = 0;
        for ( int i = 0; i < contadorProductos; i++ ) {
            Producto producto = this.productos[ i ];
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden() {
        System.out.println( "Orden #: " + this.idOrden );
        System.out.println( "Total de la orden: $" + this.calcularTotal() );
        System.out.println( "Productos de la orden:" );
        for ( int i = 0; i < contadorProductos; i++ ) {
            System.out.println( productos[ i ] );
        }
    }
    
} // fin de la clase Orden

