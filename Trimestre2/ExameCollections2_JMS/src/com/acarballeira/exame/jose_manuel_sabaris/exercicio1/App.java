/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

    /** The bf. */
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    /** The c 1. */
    static Carreira c1 = new Carreira();
    
    /** The opcion. */
    static char opcion = 'z';
    
    /** The archivo. */
    static File archivo = new File("c:/cursos/exportar.doc");
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        try {
            do {
                procesaOpcion(menu());
                
            } while (opcion != 'g');
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }

    }

    /**
     * Crear datos proba.
     */
    private static void crearDatosProba() {
        c1.getParticipantes().add(new Participante("Jose Manuel", "Sabarís García", "Joker", 31));
        c1.getParticipantes().add(new Participante("Jose Luis", "Moreno Moreno", "Coco", 14));
        c1.getParticipantes().add(new Participante("Maria Jose", "Estevez Loca", "Mari", 45));
        c1.getParticipantes().add(new Participante("Carmen", "Iglesias Rodriguez", "Carilero", 18));
        c1.getParticipantes().add(new Intolerante("Tony", "Montana", "Ogro", 12, "Lactosa"));
        c1.getParticipantes().add(new Discapacitado("Felisina", "Ortega Cano", "Felisa", 9, "Ciega"));
        System.out.println("\nCarrera creada y datos introducidos correctamente\n");
    }
    
    /**
     * Menu.
     *
     * @return the char
     */
    private static char menu() {
        String aux;
        try {
            System.out.println("a. Crear carreira e datos de proba");
            System.out.println("b. Amosar corredores");
            System.out.println("c. Ordenar Carreira");
            System.out.println("d. Engadir corredor (nome, apelidos, nick e idade");
            System.out.println("e. Eliminar corredor");
            System.out.println("f. Exportar carreira");
            System.out.println("g. Saír");
            System.out.print("Por favor, escolla unha opción: ");
            aux = bf.readLine();
            opcion = (aux.charAt(0));
            return opcion;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return opcion;
    }
    
    /**
     * Procesa opcion.
     *
     * @param opcion the opcion
     */
    private static void procesaOpcion(char opcion) {
        switch (opcion) {
            case 'a':
                crearDatosProba();
                break;
            case 'b':
                System.out.println("\nOs corredores que participan son os seguintes: ");
                System.out.printf("%-10s%10s%n", "NICK", "DORSAL");
                System.out.println("====================");
                System.out.println(c1.getStringParticipantes());
                break;
            case 'c':
                c1.ordenar();
                System.out.println("\nCarrera ordenada correctamente\n");
                break;
            case 'd':
                String nome;
                String apelidos;
                String nick;
                int idade;
                try {
                    System.out.print("\nPor favor, introduzca os datos a continuación.\nNome: ");
                    nome = bf.readLine();
                    System.out.print("Apelidos: ");
                    apelidos = bf.readLine();
                    System.out.print("Nick: ");
                    nick = bf.readLine();
                    System.out.print("Idade: ");
                    idade = Integer.parseInt(bf.readLine());
                    c1.engadirParticipante(new Participante(nome, apelidos, nick, idade));
                    if (c1.engadirParticipante(new Participante(nome, apelidos, nick, idade))) {
                        System.out.println("\nParticipante añadido correctamente\n");
                    } else {
                        System.out.println("\nParticipante no añadido\n");
                    }
                    
                } catch (NumberFormatException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
                break;
            case 'e':
                try {
                    System.out.print("\nPor favor, introduzca os datos a continuación.\nNome: ");
                    nome = bf.readLine();
                    System.out.print("Apelidos: ");
                    apelidos = bf.readLine();
                    System.out.print("Nick: ");
                    nick = bf.readLine();
                    c1.eliminarParticipante(new Participante(nome, apelidos, nick));
                    if (c1.eliminarParticipante(new Participante(nome, apelidos, nick))) {
                        System.out.println("\nParticipante eliminado correctamente\n");
                    } else {
                        System.out.println("\nParticipante no encontrado\n");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }     
                break;
            case 'f':
                c1.exportar(archivo);
                if (c1.exportar(archivo)) {
                    System.out.println("\nArchivo exportado");
                } else {
                    System.out.println("\nArchivo no exportado");
                }
                break;
            case 'g':
                System.out.println("\nHasta otra, gracias por confiar en nosotros");
                break;
            default:
                System.out.println("\nOpción escollida incorrecta");
                break;
                
        }
    }
}
