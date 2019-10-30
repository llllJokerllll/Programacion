// Fig. G. 11: OtrasConversiones.java
// Uso de los caracteres de conversión b, B, h, H, % y n.

public class OtrasConversiones5_JoseManuelSabaris {
    
    public static void main(String[] args) {
        
        Object prueba = null;
        System.out.printf( "%b\n", false );
        System.out.printf( "%b\n", true );
        System.out.printf( "%b\n", "Prueba" );
        System.out.printf( "%B\n", prueba );
        System.out.printf( "El codigo hash de \"hola\" es %h\n", "hola" );
        System.out.printf( "El codigo hash de \"Hola\" es %h\n", "Hola" );
        System.out.printf( "El codigo hash de null es %H\n", prueba );
        System.out.printf( "Impresion de un %% es una cadena de formato\n" );
        System.out.printf( "impresion de una nueva linea%nla siguiente linea empieza aqui" );
    } // fin de main
} // fin de la clase OtrasConversiones
