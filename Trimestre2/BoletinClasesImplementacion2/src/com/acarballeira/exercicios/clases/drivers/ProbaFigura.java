package com.acarballeira.exercicios.clases.drivers;

import com.acarballeira.exercicios.clases.exercicio5.Cilindro;
import com.acarballeira.exercicios.clases.exercicio5.Circulo;
import com.acarballeira.exercicios.clases.exercicio5.Triangulo;
import com.acarballeira.exercicios.clases.exercicio5.Unidades;

// TODO: Auto-generated Javadoc
/**
 * The Class ProbaFigura.
 */
public class ProbaFigura {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo("Triangulo", Unidades.CM, 4, 5);
        
        Circulo c1 = new Circulo("Circulo", Unidades.DM, 9);
        
        Cilindro cil1 = new Cilindro("Cilindro", Unidades.M, 4, 9);
        
        System.out.println(t1);
        
        System.out.println(c1);
        
        System.out.println(cil1);
    }
}
