package com.acarballeira.exercicios.clases.exercicio7;

import java.util.ArrayList;
import java.util.HashMap;

public class Diccionario {

    private HashMap <String,String> termos;
    
    public Diccionario() {
        this.termos = new HashMap<String,String>();
    }
    
    public void engadirTermo(String termo, String traducion) {
        this.termos.put(termo, traducion);
    }
    
    public void retirarTermo(String termo) {
        this.termos.remove(termo);
    }
    
    public void baleirar() {
        this.termos.clear();
    }
    
    public String traducir(String termo) {
        
        return this.termos.get(termo);
    }
    
    public void ordenarporClave() {
        
        //ArrayList<String> lista = (ArrayList<String>) this.termos.keySet();
        ArrayList<String> lista = new ArrayList<String>(this.termos.keySet());
        lista.addAll(0, this.termos.keySet());
        
    }
    
    
}
