package com.acarballeira.exercicios.clases.exercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.acarballeira.exercicios.clases.exercicio5.Libro;

public class App {

    private Diccionario d;
    
    public static void main(String[] args) {
        
        int opcion;
        
        App app = new App();
        app.d = new Diccionario();
        //app.crearTermos();
        
        do {
            opcion = app.menu();
            app.procesarOpcion(opcion);
        } while (opcion != 5);
        

    }
    
    private void crearTermos() {
        
        //this.d = new Diccionario();
        this.d.engadirTermo("Hola", "Hi");
        this.d.engadirTermo("Adios", "Good Bye");
        this.d.engadirTermo("Noite", "Night");
        this.d.engadirTermo("Mañana", "Tomorrow");
        this.d.engadirTermo("Arriba", "Up");
    }
    
    
    private int menu() {
        
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String opc;
        
        System.out.println("\n\nDICCIONARIO");
        System.out.println("======================");
        System.out.println("1. Engadir termo");
        System.out.println("2. Consultar termo");
        System.out.println("3. Baleirar diccionario");
        System.out.println("4. Inserir datos de proba");
        System.out.println("5. Saír");
        System.out.print("Introduza unha opción: ");
        try {
            opc = bf.readLine();
            return Integer.parseInt(opc);
        } catch (IOException e) {            
            System.out.println("Opción non válida");
            return 0;
        }catch(NumberFormatException e ) {
            System.out.println("Error indicando opción");
            return 0;
        }
        
        
        

    }
    
    private void procesarOpcion(int opcion) {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String termoEsp, traducion;
                
        switch (opcion) {
            case 1:
                System.out.println("\nENGADINDO TERMO");
                System.out.println("===========");                
                try {
                    System.out.println("Por favor, introduza o termo en español.");                
                    System.out.print("Termo español: ");
                    do {
                        termoEsp = br.readLine();                        
                    } while(termoEsp == "");
                    System.out.println("Por favor, introduza o termo en inglés.");                
                    System.out.print("Termo español: ");
                    do {
                        traducion = br.readLine();                        
                    } while(traducion == "");
                } catch (IOException e) {
                    termoEsp = "";
                    traducion = "";
                }
                if (traducion == "" || termoEsp == "") {
                    System.out.println("Non se poido engadir o termo. Erro de entrada");
                } else {
                    this.d.engadirTermo(termoEsp, traducion);
                }
                break;
              
            case 2:
                System.out.println("\nPROCURANDO TERMO");
                System.out.println("===========");
                System.out.println("Por favor, introduza o termo.");                
                System.out.print("Termo español: ");
                try {
                    termoEsp = br.readLine();
                } catch (IOException e) {
                    termoEsp = "";
                }
                traducion = this.d.traducir(termoEsp);
                String saida = traducion == null ? "Non existe traducion" : traducion;
                System.out.println("Tradución ao inglés: " + saida);
                
                break;
            case 3:
                System.out.println("\nBALEIRANDO DICCIONARIO");                
                System.out.println("===========");
                this.d.baleirar();
                break;
            case 4:
                System.out.println("\nCREANDO DATOS DE PROBA");
                System.out.println("===========");
                this.crearTermos();
                break;
                
        }//switch               
                
    }
    
    

}
