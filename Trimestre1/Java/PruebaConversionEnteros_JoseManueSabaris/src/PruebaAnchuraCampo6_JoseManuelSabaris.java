// Fig. G.12: PruebaAnchuraCampo.java
// Justificación a la derecha de enteros en campos.

public class PruebaAnchuraCampo6_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        System.out.printf( "%4d\n", 1 );
        System.out.printf( "%4d\n", 12 );
        System.out.printf( "%4d\n", 123 );
        System.out.printf( "%4d\n", 1234 );
        System.out.printf( "%4d\n\n", 12345 ); // datos demasiado extensos
        
        System.out.printf( "%4d\n", -1 );
        System.out.printf( "%4d\n", -12 );
        System.out.printf( "%4d\n", -123 );
        System.out.printf( "%4d\n", -1234 ); // datos demasiado extensos
        System.out.printf( "%4d\n", -12345 ); // datos demasiado extensos
    } // fin del main
     // fin de la clase PruebaAnchuraCampo
}
