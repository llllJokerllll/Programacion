/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio2;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilidades.
 */
public class Utilidades {
    
    /** The txt. */
    static InputStream txt = Utilidades.class.getResourceAsStream( "texto.txt" );
    
    /** The entrada. */
    static Scanner entrada = new Scanner( txt, "ISO-8859-1" );
    
    /**
     * Palabras sen repeticion.
     *
     * @param f the f
     * @return the string[]
     */
    public static String[] palabrasSenRepeticion(File f) {
        
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        String[] textoFinal = null;
        String texto;
        int aux = 0;
        while ( entrada.hasNext() ) {
            texto = entrada.nextLine();
            textoFinal = texto.split(" ");
        }
        
        for (int i = 0;i < textoFinal.length; i++) {
            mapa.put(i, textoFinal[i]);
        }
        
        
        return textoFinal;
    }
}
