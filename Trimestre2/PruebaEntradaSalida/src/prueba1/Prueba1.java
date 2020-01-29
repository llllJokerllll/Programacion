package prueba1;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Prueba1 {

    final static String archivo = "C:/lectura.txt";
    
    public static void main(String[] args) throws IOException {
        
//        InputStream entrada = new FileInputStream(archivo);
//
//        int data;
//        
//        while ((data = entrada.read())!= -1 ) {
//            System.out.print((char)data);
//        }
//        
//        
//        entrada.close();
        
//        FileReader entrada = new FileReader(archivo);
//
//        int data;
//        
//        while ((data = entrada.read())!= -1 ) {
//            System.out.print((char)data);
//        }
//        
//        
//        entrada.close();
     
        BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        
        String linha;
        
        while ((linha = entrada.readLine()) != null) {
            System.out.println(linha);
        }
    }

}
