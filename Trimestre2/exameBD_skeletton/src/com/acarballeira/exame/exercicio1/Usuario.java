/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. ExameJDBC en 19 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira.exame.exercicio1;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: ExameJDBC
 * @version 1.0
 */

/**
 * The Class Usuario.
 */
public class Usuario {

	/** The id. */
	private int id;
	
	/** The nome. */
	private String nome;
	
	/** The email. */
	private String email;
	
	/** The rol. */
	private int rol = 0;
	
	/**
	 * Instantiates a new usuario.
	 *
	 * @param nome the nome
	 * @param email the email
	 */
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Instantiates a new usuario.
	 *
	 * @param nome the nome
	 * @param email the email
	 * @param rol the rol
	 */
	public Usuario(String nome, String email, int rol) {
		this(nome, email);
		this.rol = rol;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the rol.
	 *
	 * @return the rol
	 */
	public int getRol() {
		return rol;
	}

	/**
	 * Sets the rol.
	 *
	 * @param rol the new rol
	 */
	public void setRol(int rol) {
		this.rol = rol;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return String.format("Usuario [id= %s, nome= %s, email= %s, rol= %s]", id, nome, email, rol);
	}
	
	
}
