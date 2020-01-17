package com.acarballeira;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import sun.jvm.hotspot.gc.cms.LinearAllocBlock;

public class Celda {
    
    String nombre;
    boolean abierta;
    int capacidad;
    Preso[] presos;
    int numPresos = 0;
    
    public Celda() {}
    public Celda(String nombre, boolean abierta, int capacidad) {
        this.nombre = nombre;
        this.abierta = abierta;
        this.capacidad = capacidad;
        presos = new Preso[capacidad];
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isAbierta() {
        return abierta;
    }
    
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    public void abrir( String codigo ) {
        
        String codigoValidoCelda = obtenerCodigoCelda();
        
        if( codigo.equals(codigoValidoCelda)) {
            this.abierta = true;
            System.out.println("Aberta");
        } else {
            System.out.println("Código incorrecto");
        }
        this.abierta = true;
    }
    
    private String obtenerCodigoCelda() {
        
        String linea;
        String nomeCelda;
        String codCelda;
        try {
            
            BufferedReader bf = new BufferedReader(new FileReader("c:/claves.txt"));
            
            while((linea = bf.readLine()) != null ) {
                nomeCelda = linea.substring(0, linea.indexOf(":"));
                if ( nomeCelda.equals(this.nombre)) {
                    codCelda = linea.substring(linea.indexOf(":") + 1);
                }
            }
            
            bf.close();
        } catch ( FileNotFoundException e ) {
            System.out.println("Non se atopa o ficheiro de claves!!!");
        } catch (IOException e) {
            
        }
        
        return "";
    }
    
    public void cerrar( String codigo ) {
        this.abierta = false;
    }
    
    public String toString() {
        return String.format("Nombre: %s\nAbierta: %s\n", nombre, abierta ? "Si" : "No");
    }

    public void engadirPreso(Preso p) {
        for(int i = 0; i < capacidad;i++) {
            if (presos[i] == null) {
                presos[i] = p;
                break;
            } 
            if (i == capacidad - 1) {
                System.out.println("Celda llena");
            }
        }
        

    }
    
    public void quitarPreso(Preso p) {
        for (int i = 0; i < capacidad; i++) {
            if(presos[i] == p) {
                presos[i] = null;
            } else {
                System.out.println();
            }
        }
    }
    
    public String getPresos() {
        String salida = "Celda " + nombre + "\n";
        for (Preso preso : presos) {
            salida += (preso!=null) ? preso.getCodigo() + "\n" : "";

        }
        return salida;
    }
}
