/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio8;

import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Videoxogo.
 */
public class Videoxogo implements Entregable, Comparable<Videoxogo> {

	/** The titulo. */
	private String titulo;
	
	/** The horas estimadas. */
	private int horasEstimadas = 10;
	
	/** The entregado. */
	private boolean entregado = false;
	
	/** The xenero. */
	private String xenero;
	
	/** The compania. */
	private String compania;
	
	/**
	 * Instantiates a new videoxogo.
	 */
	public Videoxogo() {
		super();
	}
	
	/**
	 * Instantiates a new videoxogo.
	 *
	 * @param titulo the titulo
	 * @param horasEstimadas the horas estimadas
	 */
	public Videoxogo(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * Instantiates a new videoxogo.
	 *
	 * @param titulo the titulo
	 * @param horasEstimadas the horas estimadas
	 * @param xenero the xenero
	 * @param compania the compania
	 */
	public Videoxogo(String titulo, int horasEstimadas, String xenero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.xenero = xenero;
		this.compania = compania;
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
	 * Gets the horas estimadas.
	 *
	 * @return the horas estimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * Sets the horas estimadas.
	 *
	 * @param horasEstimadas the new horas estimadas
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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
	 * Gets the compania.
	 *
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * Sets the compania.
	 *
	 * @param compania the new compania
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(compania, entregado, horasEstimadas, titulo, xenero);
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
		Videoxogo other = (Videoxogo) obj;
		return Objects.equals(compania, other.compania) && entregado == other.entregado
				&& horasEstimadas == other.horasEstimadas && Objects.equals(titulo, other.titulo)
				&& Objects.equals(xenero, other.xenero);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return String.format("Videoxogo [titulo=%s, horasEstimadas=%s, entregado=%s, xenero=%s, compania=%s]", titulo,
				horasEstimadas, this.entregado, xenero, compania);
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
	public int compareTo(Videoxogo o) {
		return this.horasEstimadas - o.horasEstimadas;
	}
}
