/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.modelo;

import java.util.Objects;

/**
 * The Class Juego.
 */
public class Juego {

	/** The id juego. */
	private int id_juego;
	
	/** The titulo. */
	private String titulo;
	
	/** The genero. */
	private String genero;
	
	/** The plataforma. */
	private String plataforma;
	
	/** The multijugador. */
	private String multijugador;
	
	/**
	 * Instantiates a new juego.
	 */
	public Juego() {
		super();
	}

	/**
	 * Instantiates a new juego.
	 *
	 * @param id_juego the id juego
	 */
	public Juego(int id_juego) {
		super();
		this.id_juego = id_juego;
	}

	/**
	 * Instantiates a new juego.
	 *
	 * @param titulo the titulo
	 * @param genero the genero
	 * @param plataforma the plataforma
	 * @param multijugador the multijugador
	 */
	public Juego(String titulo, String genero, String plataforma, String multijugador) {
		super();
		this.id_juego = getId_juego();
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.multijugador = multijugador;
	}

	/**
	 * Gets the id juego.
	 *
	 * @return the id juego
	 */
	public int getId_juego() {
		return id_juego;
	}
	
	/**
	 * Sets the id juego.
	 *
	 * @param id_juego the new id juego
	 */
	public void setId_juego(int id_juego) {
		this.id_juego = id_juego;
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
	 * Gets the genero.
	 *
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Sets the genero.
	 *
	 * @param genero the new genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Gets the plataforma.
	 *
	 * @return the plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * Sets the plataforma.
	 *
	 * @param plataforma the new plataforma
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * Checks if is multijugador.
	 *
	 * @return the string
	 */
	public String isMultijugador() {
		return multijugador;
	}

	/**
	 * Sets the multijugador.
	 *
	 * @param multijugador the new multijugador
	 */
	public void setMultijugador(String multijugador) {
		this.multijugador = multijugador;
	}



	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(genero, id_juego, multijugador, plataforma, titulo);
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
		Juego other = (Juego) obj;
		return Objects.equals(genero, other.genero) && id_juego == other.id_juego
				&& Objects.equals(multijugador, other.multijugador) && Objects.equals(plataforma, other.plataforma)
				&& Objects.equals(titulo, other.titulo);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return String.format("Juego [id_juego=%s, titulo=%s, genero=%s, plataforma=%s, multijugador=%s]", id_juego,
				titulo, genero, plataforma, multijugador);
	}
	
	
}
