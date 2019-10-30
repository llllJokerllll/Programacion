// Fig G.13: PruebaPrecision.hava
// Uso de la precisión para números de punto flotante y cadenas.
public class PruebaPrecision7_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        double f = 123.94536;
        String s = "Feliz Cumpleanios";
        
        System.out.printf( "Uso de la precision para numeros de punto flotante\n" );
        System.out.printf( "\t%.3f\n\t%.3e\n\t%.3g\n\n", f, f, f );
        
        System.out.printf( "Uso de la precision para las cadenas\n" );
        System.out.printf( "\t%.11s\n", s );
    } // fin de main
} // fin de la clase PruebaPrecision
