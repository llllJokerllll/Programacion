// Fig G.5: ConversionCadenasChar.java
// Uso de los caracteres de conversió de cadenas y caracteres.
public class ConversionCadenas3_JoseManuelSabaris {
    
    public static void main(String[] args) {
        
        char caracter = 'A'; //inicializa el char
        String cadena = "Esta tambien es una cadena"; // objeto String
        Integer entero = 1234; // inicializa el entero (autoboxing)
        
        System.out.printf("%c\n", caracter);
        System.out.printf("%s\n", "Esta es una cadena");
        System.out.printf("%s\n", cadena);
        System.out.printf("%S\n", cadena);
        System.out.printf("%s\n", entero);
    } // fin de main
} // fin de la clase ConversionCadenasChar
