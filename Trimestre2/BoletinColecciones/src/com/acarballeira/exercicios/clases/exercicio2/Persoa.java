package com.acarballeira.exercicios.clases.exercicio2;

public class Persoa {
		
		protected String nombre;
		protected int edad;
		
		public Persoa(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return String.format("Persoa [nombre=%s, edad=%s]", nombre, edad);
		}
		
		
		
}
