/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio15;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class AceptaElReto464.
 */
public class AceptaElReto464 {
    
    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void main(String[] args) throws IOException {

        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer casos;
        int pos;
        int auxPos;
        String[] tiempo;
        LinkedList<Tiempo> tiempos = new LinkedList<>();
        LinkedList<Tiempo> res = new LinkedList<>();
        Tiempo prev, actual;
        StringBuilder output = new StringBuilder();

        while (true) {

            String n = br.readLine();
            if (n == null) break;
            casos = Integer.parseInt(n);

            for (int i = 0; i < casos; i++) {
                tiempo = br.readLine().split(":");
                int secs = (Integer.parseInt(tiempo[0]) * 3600) + (Integer.parseInt(tiempo[1]) * 60) + Integer.parseInt(tiempo[2]);
                tiempos.add(new Tiempo(i, secs));
            }

            Collections.sort(tiempos);

            auxPos = pos = 1;
            prev = tiempos.get(0);
            res.add(new Tiempo(pos, prev.pos));
            for (int i = 1; i < tiempos.size(); i++) {
                actual = tiempos.get(i);
                ++auxPos;
                if (Math.abs(prev.time - actual.time) > 1) {
                    pos = auxPos;
                }
                prev = actual;
                res.add(new Tiempo(pos, actual.pos));
            }

            Collections.sort(res);

            for (int i = 0; i < casos; i++) {
                output.append(res.get(i).pos);
                if (i < casos - 1) output.append("\n");
            }

            System.out.println(output.toString());

            tiempos.clear();
            res.clear();
            output.delete(0, output.length());

            System.out.println("---");
        }

    }
    
}
    
    class Tiempo implements Comparable<Tiempo> {

        int pos;
        int time;
        public Tiempo(int j, int x) {this.pos = j; this.time = x;}

        @Override
        public int compareTo(Tiempo o) {
            return this.time - o.time;
        }

        @Override
        public String toString() {
            return "Tiempo{" +
                    "tiempo=" + time +
                    '}';
        }
    }

