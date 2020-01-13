package com.acarballeira2;

import com.acarballeira.Preso;

public class PresoDriver {

    public static void main(String[] args) {
        
        Preso p1 = new Preso("Pablo","Pableras","P007",69);
        
        Preso p2 = new Preso("Jose","Joker","P009",15);
        
        Preso p3 = new Preso("Oscar","Navaja","P008",32);
        
        Preso p4 = new Preso();
        
        Preso p5 = new Preso("Farlopa", "P010");
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        System.out.println( p4 );
        System.out.println( p5 );

    }

}
