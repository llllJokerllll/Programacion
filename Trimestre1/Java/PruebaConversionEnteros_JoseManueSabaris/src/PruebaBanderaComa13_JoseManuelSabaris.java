// Fig. G.20: PruebaBanderaComa.java
// Uso de la bandera de coma (,) para mostrar números con el separador de miles.

public class PruebaBanderaComa13_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        System.out.printf( "%,d\n", 58625 );
        System.out.printf( "%,.2f\n", 58625.21 );
        System.out.printf( "%,.2f", 123445678.9 );
    } // fin de main
} // fin de la clase PruebaBanderaComa
