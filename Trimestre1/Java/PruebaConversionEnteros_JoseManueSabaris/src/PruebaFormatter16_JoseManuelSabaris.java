// Fig. G.24: PruebaFormatter.java
// Aplicar formato a la salida con la clase Formatter
import java.util.Formatter;
import javax.swing.JOptionPane;

public class PruebaFormatter16_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        // crea un objeto Formatter y aplica formato a la salida
        Formatter formatter = new Formatter();
        formatter.format( "%d = %#o = %#X", 10, 10, 10 );
        
        // muestra la salida en el componente JOptionPane
        JOptionPane.showMessageDialog( null, formatter.toString() );
    } // fin de main
} // fin de la clase PruebaFormatter
