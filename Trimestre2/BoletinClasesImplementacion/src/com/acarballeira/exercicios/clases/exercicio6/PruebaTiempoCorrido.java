package com.acarballeira.exercicios.clases.exercicio6;

// TODO: Auto-generated Javadoc
/**
 * The Class PruebaTiempoCorrido.
 */
public class PruebaTiempoCorrido {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws InterruptedException the interrupted exception
     */
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
