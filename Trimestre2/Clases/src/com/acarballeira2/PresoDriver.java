package com.acarballeira2;

import com.acarballeira.*;

public class PresoDriver {

    public static void main(String[] args) {
        
        Celda c1 = new Celda("A01", true);
        
        Preso p1 = new Preso("Pablo","Pableras","P007",69 , c1);
        
        Preso p2 = new Preso("Jose","Joker","P009",15 , c1);
        
        Preso p3 = new Preso("Oscar","Navaja","P008",32 , c1);
        
        Preso p4 = new Preso();
        
        Preso p5 = new Preso("Farlopa", "P010");
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        System.out.println( p4 );
        System.out.println( p5 );

        Guardia g1 = new Guardia("Manuel", "98765");

        Guardia g2 = new Guardia("Paco", "1235");
        
        Guardia g3 = new Guardia("Pepe", "1654");
        
        System.out.println( g1 );
        System.out.println( g2 );
        System.out.println( g3 );

    }

}
