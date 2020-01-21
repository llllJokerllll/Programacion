package com.acarballeira.clasesyobjetos;

public class Masajista extends Miembro_Staff{

    private String titulacion;

    public Masajista(String nome, String titulacion) {
        super();
        this.nome = nome;
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void darMasaje() {
        System.out.println("Te duele ahí?");
    }
    
    public void entrenar() {
        System.out.println("Leyendo apuntes");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Masajista [" + (titulacion != null ? "titulacion=" + titulacion : "") + "]";
    }
    
    
}
