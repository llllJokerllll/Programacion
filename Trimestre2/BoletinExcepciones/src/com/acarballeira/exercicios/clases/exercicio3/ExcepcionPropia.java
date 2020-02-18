package com.acarballeira.exercicios.clases.exercicio3;

public class ExcepcionPropia extends Exception {

    private String mensaxe;
    
    public ExcepcionPropia(String mensaxe) {
        super(mensaxe);
        this.mensaxe = mensaxe;
    }

    public String getMensaxe() {
        return mensaxe;
    }
    
    
}
