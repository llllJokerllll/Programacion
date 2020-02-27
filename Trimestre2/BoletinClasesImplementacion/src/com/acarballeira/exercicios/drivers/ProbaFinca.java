/**
*@title 
*@author Jose Manuel Sabaris Garcia
*@date 24 ene. 2020
*@version 1.0
*/
package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio7.Coordenada;
import com.acarballeira.exercicios.clases.exercicio7.Finca;
import com.acarballeira.exercicios.clases.exercicio7.Parcela;
import com.acarballeira.exercicios.clases.exercicio7.TipoCultivo;

// TODO: Auto-generated Javadoc
/**
 * The Class ProbaFinca.
 */
public class ProbaFinca {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Finca f1 = new Finca(new Parcela(new Coordenada(4,5), new Coordenada(8,9), 500.000), "AS REGADAS", TipoCultivo.CULTIVO, true, 400.000);
        Finca f2 = new Finca(new Parcela(new Coordenada(5,9), new Coordenada(9,4), 900.000), "A REVOLTA", TipoCultivo.VIÑEDO, true, 250.000);
        
        System.out.println(f1);
        System.out.println(f2);

        f1.incrementarSupALimpar(1000);
        f2.decrementarSupALimpar(1000);
        
        System.out.println(f1);
        System.out.println(f2);
    }

}
