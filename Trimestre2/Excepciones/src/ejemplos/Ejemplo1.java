/*
 * 
 */
package ejemplos;

import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Class Ejemplo1.
 */
public class Ejemplo1 {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ExcepcionPropia the excepcion propia
     */
    public static void main(String[] args) throws IOException, ExcepcionPropia {
        
        //int res = ProbaExcepcion.calculo();
        //System.out.println(res);
        
        ProbaExcepcion.fallo(125);
    }
}
