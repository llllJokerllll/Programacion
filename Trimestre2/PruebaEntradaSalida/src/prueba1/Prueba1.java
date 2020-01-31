package prueba1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Properties;

public class Prueba1 {

    final static String archivo = "C:/lectura.txt";
    
    public static void main(String[] args) {
        
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
     
//        BufferedReader entrada = new BufferedReader(new FileReader(archivo));
//        
//        String linha;
//        
//        while ((linha = entrada.readLine()) != null) {
//            System.out.println(linha);
//        }
//        
//        entrada.close();
        
//          FileWriter fw = new FileWriter("c:/users/wadmin/documents/prueba1.txt",Charset.forName("UTF-8"));
//          
//          fw.write("Jose\n");
//          fw.write("Manuel\n");
//          fw.write("Sabaris\n");
//          fw.write("Garcia");
//          fw.close();
          
//          BufferedWriter bw = new BufferedWriter(new FileWriter("c:/users/wadmin/documents/prueba1.txt",Charset.forName("UTF-8")));
//          
//          bw.write("Hola que tal estas Loko");
//          bw.close();
        
//        FileWriter fw = new FileWriter("c:/users/wadmin/documents/prueba1.txt",true);
//        PrintWriter pw = new PrintWriter(fw);
//        
//        pw.printf("%10s", "s");
//        pw.close();
        
//        File f = new File("c:/users/wadmin/documents/prueba1.txt");
//        FileInputStream is = new FileInputStream(f);
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
//          Properties propiedades = new Properties();
//          
//          FileReader fr = new FileReader("c:/users/wadmin/documents/propiedades.prop");
//          propiedades.load(fr);
//          System.out.println(propiedades.getProperty("usuario"));
        
//          String s = System.getenv("userprofile");
//          System.out.println(s);
        
        File f = new File("c:/users/wadmin/documents/prueba1.txt");
        
        try {
            FileInputStream fi = new FileInputStream(f);
            int i = 0;
            
            int res = 8/0;
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo non atopado " + e.getMessage());
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        } catch (ArithmeticException e ) {
            System.out.println("Error matemático " + e.getMessage());
        } catch (Exception e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
