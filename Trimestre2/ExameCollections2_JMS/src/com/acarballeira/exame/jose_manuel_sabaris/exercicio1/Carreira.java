/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class Carreira.
 */
public class Carreira {

    /** The data. */
    private LocalDate data;
    
    /** The nome. */
    private String nome;
    
    /** The quilometros. */
    private double quilometros;
    
    /** The participantes. */
    private ArrayList<Participante> participantes;
    
    /**
     * Instantiates a new carreira.
     *
     * @param data the data
     * @param nome the nome
     * @param quilometros the quilometros
     */
    public Carreira(LocalDate data, String nome, double quilometros) {
        super();
        this.data = data.now();
        this.nome = nome;
        this.quilometros = quilometros;
        this.participantes = new ArrayList<Participante>();
    }

    /**
     * Instantiates a new carreira.
     *
     * @param nome the nome
     * @param quilometros the quilometros
     */
    public Carreira(String nome, double quilometros) {
        super();
        this.nome = nome;
        this.quilometros = quilometros;
        this.data = asignarData();
        this.participantes = new ArrayList<Participante>();
    }

    /**
     * Instantiates a new carreira.
     */
    public Carreira() {
        super();
        this.nome = "Carreira xenérica";
        this.quilometros = 10.0;
        this.data = asignarData();
        this.participantes = new ArrayList<Participante>();
    }
    
    /**
     * Gets the data.
     *
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the quilometros.
     *
     * @return the quilometros
     */
    public double getQuilometros() {
        return quilometros;
    }

    /**
     * Sets the quilometros.
     *
     * @param quilometros the new quilometros
     */
    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    /**
     * Gets the participantes.
     *
     * @return the participantes
     */
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    /**
     * Sets the participantes.
     *
     * @param participantes the new participantes
     */
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    /**
     * Asignar data.
     *
     * @return the local date
     */
    private LocalDate asignarData() {
        data = data.now();
        data = data.plusDays(-7);
        return data;
    }
    
    /**
     * Engadir participante.
     *
     * @param p the p
     * @return true, if successful
     */
    public boolean engadirParticipante(Participante p) {
        if (this.participantes != null) {
            this.participantes.add(p);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Eliminar participante.
     *
     * @param p the p
     * @return true, if successful
     */
    public boolean eliminarParticipante(Participante p) {
        int aux = 0;
        if (this.participantes != null) {
            for (Participante elemento : this.participantes) {
                if (elemento.equals(p)) {
                    this.participantes.remove(aux);
                    return true;
                } else {
                    aux++;
                }
            }
            return false;
        } else {
            return false;
        }
    }
  
    /**
     * Gets the array participantes.
     *
     * @return the array participantes
     */
    public Participante[] getArrayParticipantes() {
        Participante[] parti = new Participante[this.participantes.size()];
            for (int i = 0; i < parti.length; i++) {
                parti[i] = participantes.get(i);
            }
            return parti;
        
    }
    
    /**
     * Gets the string participantes.
     *
     * @return the string participantes
     */
    public String getStringParticipantes() {
        StringBuilder res = new StringBuilder();
        for (Participante elemento : this.participantes) {
            res.append(String.format("%-10s%10d%n", elemento.getNick(), elemento.getDorsal()));
        }
        return res.toString();
    }
    
    /**
     * Ordenar.
     */
    public void ordenar() {
        participantes.sort(new Comparator<Participante>() {
            
             @Override
             public int compare(Participante o1, Participante o2) {
                 if (o1.getNick().equals(o2.getNick())) {
                     return o1.dorsal - o2.getDorsal();
                 } else {
                     return o1.getNick().compareTo(o2.getNick());
                 }
             }
        });
    }
        
    /**
     * Exportar.
     *
     * @param f the f
     * @return true, if successful
     */
    public boolean exportar(File f) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write("Nome da carreira: " + this.getNome() + " de " + this.getQuilometros() + " quilometros. Fecha: " + this.getData());
            bw.write("\nNúmero de corredores: " + this.getParticipantes().size());
            bw.newLine();
            bw.newLine();
            bw.write(String.format("%-40s%-10s%8s%10s%n", "Nome e apelidos", "Nick", "Dorsal", "Categoría"));
            bw.write("===========================================================================\n");
            for (Participante p : participantes) {
                bw.write(String.format("%-40s%-10s%8s%10s%n", p.getNome() + " " + p.getApelidos(), p.getNick(), p.getDorsal(), p.getCategoria()));
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (NullPointerException e) {
                e.printStackTrace(System.out);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }        
        return false;
        
    }
}
