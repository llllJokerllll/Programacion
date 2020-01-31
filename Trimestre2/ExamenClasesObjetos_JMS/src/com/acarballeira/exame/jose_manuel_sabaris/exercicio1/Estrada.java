package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

public class Estrada extends Via {
  
    private static final double P_MANTEMENTO = 206.03;
    
    private int numCarriles = 2;

    public Estrada() {
        super();
    }

    public Estrada(String codigo, TipoTitularidade titular, double numKm, double numKmDeficientes, int ancho,
            int numCarriles) {
        super(codigo, titular, numKm, numKmDeficientes, ancho);
        
        if ( numCarriles <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.numCarriles = 1;
        } else {
            this.numCarriles = numCarriles;
        }
    }

    public int getNumCarriles() {
        return numCarriles;
    }

    public void setNumCarriles(int numCarriles) {
        if ( numCarriles <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.numCarriles = 1;
        } else {
            this.numCarriles = numCarriles;
        }
    }

    @Override
    public double costeMantemento() {
        return numKm * P_MANTEMENTO;
    }

    @Override
    public String toString() {
        return String.format("%s%nEstrada%nNumero de carriles: %s%nCoste do mantemento: %s%n",super.toString(), numCarriles, costeMantemento());
    }
    


}
