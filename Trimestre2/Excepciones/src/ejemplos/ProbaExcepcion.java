package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbaExcepcion {

    public static void fallo(int valor) throws ExcepcionPropia {
        
        if(valor > 100) 
            throw new ExcepcionPropia("Non metas un valor tan alto");
        
    }
    
    public static int calculo() throws IOException {
        
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        
        int c = 0;
        
        try {
            int a = 8;
            int b = 0;
            
            String s = "****43";
            int h = Integer.parseInt(s);
            
            c = a / b;
            
        } catch(ArithmeticException e) {
            c = 0;
            //System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();
        } catch(NumberFormatException e) {
            c = 0;
        } catch(Exception e) {
            c = 0;
        } finally {
            c++;
        }
        return c;
    }
}
