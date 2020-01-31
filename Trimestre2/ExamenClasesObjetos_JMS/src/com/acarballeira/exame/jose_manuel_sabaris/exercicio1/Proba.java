package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

public class Proba {

    private static final int TAM_ARRAY = 6;
    
    public static void main(String[] args) {
        
        Via[] vector;
        
        vector = crearArray(TAM_ARRAY);
        amosarArray(vector);
        
        

    }
    
    public static Via[] crearArray(int TAM_ARRAY) {
        Via[] vector = new Via[TAM_ARRAY];
        vector[0] = (new Ciclovia("PW00", TipoTitularidade.autonomico, 36.9, 12.5, 2, "#12354"));
        vector[1] = (new Estrada("PW01", TipoTitularidade.local, 105.9, 180.9, 2, 0));
        vector[2] = (new Sendero("PW02", TipoTitularidade.estatal, 49.9, 15.5, 2, true));
        vector[3] = (new Ciclovia("PW03", TipoTitularidade.autonomico, 56.9, 38.5, 2, "#FFFFFF"));
        vector[4] = (new Estrada("PW04", TipoTitularidade.provincial, 200.9, 12.5, 2, 1));
        vector[5] = (new Sendero("PW05", TipoTitularidade.estatal, 36.9, 12.5, 2, false));
        return vector;
    }

    
    public static void amosarArray(Via[] vector) {
        for (Via x : vector ) {
            System.out.println(x);
        }
    }
}
