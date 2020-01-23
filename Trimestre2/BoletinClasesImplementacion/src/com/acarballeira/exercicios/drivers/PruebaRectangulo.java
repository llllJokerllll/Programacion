package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio4.*;

public class PruebaRectangulo {

    public static void main(String[] args) {
        
        Rectangulo rect1 = new Rectangulo(10, 5);
        
        
        System.out.println("El area del rectángulo es: " + Rectangulo.calArea(rect1));
        System.out.println("El perímetro del rectángulo es: " + Rectangulo.calPeri(rect1));

    }

}
