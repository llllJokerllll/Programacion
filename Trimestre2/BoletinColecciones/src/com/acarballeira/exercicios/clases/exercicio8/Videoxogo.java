package com.acarballeira.exercicios.clases.exercicio8;

import java.util.Objects;

public class Videoxogo implements Entregable, Comparable<Videoxogo> {

	private String titulo;
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String xenero;
	private String compania;
	
	public Videoxogo() {
		super();
	}
	
	public Videoxogo(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videoxogo(String titulo, int horasEstimadas, String xenero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.xenero = xenero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getXenero() {
		return xenero;
	}

	public void setXenero(String xenero) {
		this.xenero = xenero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compania, entregado, horasEstimadas, titulo, xenero);
	}

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

	@Override
	public String toString() {
		return String.format("Videoxogo [titulo=%s, horasEstimadas=%s, entregado=%s, xenero=%s, compania=%s]", titulo,
				horasEstimadas, this.entregado, xenero, compania);
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Videoxogo o) {
		return this.horasEstimadas - o.horasEstimadas;
	}
}
