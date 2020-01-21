package com.acarballeira.clasesyobjetos;

public abstract class Miembro_Staff {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void concentrarse() {
        System.out.println("El partido de mañana es muy importante");
    }
    
    public void viajar() {
        System.out.println("Viajando para el siguiente partido");
    }
    
    public void entrenar() {
        System.out.println("Te duele ahí?");
    }
    
    @Override
    public String toString() {
        return "Miembro_Staff [" + (nome != null ? "nome=" + nome : "") + "]";
    }
    
    
}
