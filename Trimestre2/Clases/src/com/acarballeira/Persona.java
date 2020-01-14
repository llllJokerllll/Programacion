package com.acarballeira;

public class Persona {

    protected String nome;
    
    public Persona() {
        
    }
    
    public Persona( String nome ) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: " + getNome());
    }
}
