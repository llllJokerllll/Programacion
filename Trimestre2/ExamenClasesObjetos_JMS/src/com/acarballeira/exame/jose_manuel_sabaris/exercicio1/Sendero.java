package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

public class Sendero extends Via {
    
    private static final double MANTEMENTO_PAV = 110.15;
    private static final double MANTEMENTO_SEN = 145.45;
    
    private boolean estaPavimentada = false;
    
    public Sendero() {
        super();
    }

    public Sendero(String codigo, TipoTitularidade titular, double numKm, double numKmDeficientes, int ancho,
            boolean estaPavimentada) {
        super(codigo, titular, numKm, numKmDeficientes, ancho);
        this.estaPavimentada = estaPavimentada;
    }

    public boolean isEstaPavimentada() {
        return estaPavimentada;
    }

    public void setEstaPavimentada(boolean estaPavimentada) {
        this.estaPavimentada = estaPavimentada;
    }

    @Override
    public double costeMantemento() {
        return (estaPavimentada ? numKm * MANTEMENTO_PAV : numKm * MANTEMENTO_SEN );
    }

    @Override
    public String toString() {
        return String.format("%s%nSendero%nPavimentada: %s%nCoste do mantemento: %s%n", super.toString(), estaPavimentada, costeMantemento());
    }
    
    

}
