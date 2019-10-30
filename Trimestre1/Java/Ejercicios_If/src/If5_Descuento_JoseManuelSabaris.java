// Autor: Jose Manuel Sabarís
// Título: Ejercicio If 5
// Un almacén rebaja 10% del precio de un producto si se adquieren más de 20 unidades y 5% si adquieren entre 10 y 20 unidades (inclusive), 
// no hay descuento para cantidades menores o iguales a 10 unidades.
// Con el precio unitario del producto y la cantidad adquirida, realice un algoritmo para mostrar el valor a pagar.


import java.util.Scanner; // el programa utiliza la clase Scanner

public class If5_Descuento_JoseManuelSabaris {
    
    public static void main( String[] args ) {
    
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        float precio; 
        int cantidad;
        
        // Declaración de variables constantes
        float primerDescuento = 0.05f, segundoDescuento = 0.10f;
        
        // Declaración de variables de salida
        float precioFinal = 0f;
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el precio del producto: " ); // indicador
        precio = entrada.nextFloat(); // lee el precio del usuario

        System.out.print( "Por favor, introduzca la cantidad: " ); // indicador
        cantidad = entrada.nextInt(); // lee la cantidad del usuario
        
        // Comprobación y proceso
        if ( cantidad < 10 ) {
            precioFinal = precio * cantidad;
        } else if ( cantidad >= 10 && cantidad <= 20  ) {
            precioFinal = ( precio * cantidad ) - ( ( precio * cantidad ) * primerDescuento );
        } else if ( cantidad > 20 ) {
            precioFinal = ( precio * cantidad ) - ( ( precio * cantidad ) * segundoDescuento );
        }
        
        // Salida resultado
        System.out.printf( "El precio final es: %.2f", precioFinal );
        
    } // fin del método main
} // fin de la clase If4_Descuento_JoseManuelSabaris
