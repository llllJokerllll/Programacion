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
    
    public double calArea() {
        return this.altura * this.base;
    }
    
    public double calPeri() {
        return 2*( this.altura + this.base );
    }
    
    public String pintaRect() {
        String res = "";
        
        for (int i = 0; i <= this.altura; i++ ) {
            for (int j = 0; j < this.base * 2; j++ ) {
                if ( i == 0 ) {
                    if ( j == 0 || j == this.base * 2 - 1 ) {
                        res += " ";
                    } else {
                        res += "_";
                    } 
                } else if ( i == this.altura ) {
                    if ( j == 0 || j == this.base * 2  - 1 ) {
                        res += "|";
                    } else {
                        res += "_";
                    }
                } else {
                    if ( j == 0 || j == this.base * 2  - 1 ) {
                        res += "|";
                    } else {
                        res += " ";
                    }
                }   
            }
            res += "\n";
        }
        return res;
    }

    @Override
    public String toString() {
        return pintaRect();
    }
    
    
    
}
