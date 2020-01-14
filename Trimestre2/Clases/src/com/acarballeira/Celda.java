package com.acarballeira;

public class Celda extends Persona {

    private String nomeCelda;
    private boolean aberta;
    
    public Celda(String nomeCelda, boolean aberta) {
        this.nomeCelda = nomeCelda;
        this.aberta = aberta;
    }
    
    public Celda(String nome, String nomeCelda, boolean aberta) {
        super(nome);
        this.nomeCelda = nomeCelda;
        this.aberta = aberta;
    }

    public String getNomeCelda() {
        return nomeCelda;
    }

    public void setNomeCelda(String nomeCelda) {
        this.nomeCelda = nomeCelda;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    
    
}
