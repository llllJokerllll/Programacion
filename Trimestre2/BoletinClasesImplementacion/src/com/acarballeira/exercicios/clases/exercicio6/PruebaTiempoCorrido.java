package com.acarballeira.exercicios.clases.exercicio6;

public class PruebaTiempoCorrido {

    public static void main(String[] args) throws InterruptedException {
        
        Tiempo inicio;
        Tiempo fin;
        
        inicio = new Tiempo( 19, 59 );
        fin = new Tiempo( 19, 59, 15 );

        while ( !inicio.equals( fin ) ) {
            System.out.println( inicio );
            inicio.iniTiempo();
            Thread.sleep(1000);
        }
    }

}
