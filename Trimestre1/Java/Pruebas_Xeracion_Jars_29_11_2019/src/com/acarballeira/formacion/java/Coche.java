
package com.acarballeira.formacion.java;


public class Coche {

    public String marca;
    public String modelo;
    public short cabalos;            
    
    @Override
    public String toString(){
        
        return "Marca: " + this.marca + ". Modelo: " + this.modelo + ". CV: " + this.cabalos;
    }
    
}
