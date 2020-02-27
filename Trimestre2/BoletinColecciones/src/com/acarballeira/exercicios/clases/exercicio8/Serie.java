/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio8;

import java.util.Comparator;
import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Serie.
 */
public class Serie implements Entregable, Comparable<Serie> {

	/** The titulo. */
	private String titulo;
	
	/** The num temp. */
	private int numTemp = 3;
	
	/** The entregado. */
	private boolean entregado = false;
	
	/** The xenero. */
	private String xenero;
	
	/** The creador. */
	private String creador;
	
	/**
	 * Instantiates a new serie.
	 */
	public Serie() {
		super();
	}

	/**
	 * Instantiates a new serie.
	 *
	 * @param titulo the titulo
	 * @param numTemp the num temp
	 * @param xenero the xenero
	 * @param creador the creador
	 */
	public Serie(String titulo, int numTemp, String xenero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.xenero = xenero;
		this.creador = creador;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the num temp.
	 *
	 * @return the num temp
	 */
	public int getNumTemp() {
		return numTemp;
	}

	/**
	 * Sets the num temp.
	 *
	 * @param numTemp the new num temp
	 */
	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	/**
	 * Gets the xenero.
	 *
	 * @return the xenero
	 */
	public String getXenero() {
		return xenero;
	}

	/**
	 * Sets the xenero.
	 *
	 * @param xenero the new xenero
	 */
	public void setXenero(String xenero) {
		this.xenero = xenero;
	}

	/**
	 * Gets the creador.
	 *
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * Sets the creador.
	 *
	 * @param creador the new creador
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(creador, entregado, numTemp, titulo, xenero);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(creador, other.creador) && entregado == other.entregado && numTemp == other.numTemp
				&& Objects.equals(titulo, other.titulo) && Objects.equals(xenero, other.xenero);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return String.format("Serie [titulo=%s, numTemp=%s, entregado=%s, xenero=%s, creador=%s]", titulo, numTemp,
				this.entregado, xenero, creador);
	}
	
	/**
	 * Entregar.
	 */
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	/**
	 * Devolver.
	 */
	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	/**
	 * Checks if is entregado.
	 *
	 * @return true, if is entregado
	 */
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(Serie o) {
		return this.numTemp - o.numTemp;
	}
}

class ComparadorSerie implements Comparator<Serie> {

	@Override
	public int compare(Serie o1, Serie o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}
	
}