package com.acarballeira.exercicios.clases.exercicio4;

public class Rectangulo {

    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public static double calArea( Rectangulo r ) {
        return r.altura * r.base;
    }
    
    public static double calPeri( Rectangulo r ) {
        return 2*( r.altura + r.base );
    }
    
    
}
