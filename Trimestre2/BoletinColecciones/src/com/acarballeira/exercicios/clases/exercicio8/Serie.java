package com.acarballeira.exercicios.clases.exercicio8;

import java.util.Objects;

public class Serie implements Entregable, Comparable<Serie> {

	private String titulo;
	private int numTemp = 3;
	private boolean entregado = false;
	private String xenero;
	private String creador;
	
	public Serie() {
		super();
	}

	public Serie(String titulo, int numTemp, String xenero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.xenero = xenero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public String getXenero() {
		return xenero;
	}

	public void setXenero(String xenero) {
		this.xenero = xenero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(creador, entregado, numTemp, titulo, xenero);
	}

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

	@Override
	public String toString() {
		return String.format("Serie [titulo=%s, numTemp=%s, entregado=%s, xenero=%s, creador=%s]", titulo, numTemp,
				this.entregado, xenero, creador);
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
	public int compareTo(Serie o) {
		return this.numTemp - o.numTemp;
	}
}
