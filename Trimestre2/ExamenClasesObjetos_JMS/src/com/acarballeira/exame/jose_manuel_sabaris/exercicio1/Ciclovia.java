package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;



public class Ciclovia extends Via {
    
    private static final double P_MANTEMENTO = 308.15;
    
    private String color = "#000000";
    
    public Ciclovia() {
        super();
    }

    public Ciclovia(String codigo, TipoTitularidade titular, double numKm, double numKmDeficientes, int ancho,
            String color) {
        super(codigo, titular, numKm, numKmDeficientes, ancho);
        if (!color.matches("^\\#[0-F]{6}") ) {
            System.out.println("Dato introducido no válido");
            this.color = "#000000";
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.matches("^\\#[0-F]{6}") ) {
            System.out.println("Dato introducido no válido");
            this.color = "#000000";
        } else {
            this.color = color;
        }
    }

    @Override
    public double costeMantemento() {
        return numKm * P_MANTEMENTO ;
    }

    @Override
    public String toString() {
        return String.format("%s%nCiclovia%nColor: %s%nCoste do Mantemento: %s%n",super.toString(), color, costeMantemento());
    }
    
    
 
}
