package com.acarballeira.exercicios.clases.exercicio6;

import java.util.Objects;

public class Persoa implements Comparable<Persoa> {
		
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
		
        @Override
        public int hashCode() {
            return Objects.hash(edad, nombre);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Persoa other = (Persoa) obj;
            return edad == other.edad && Objects.equals(nombre, other.nombre);
        }


        @Override
        public int compareTo(Persoa o) {
            if (this.nombre.equals(o.nombre)) {
                return o.edad - this.edad;
            } else {
                return this.nombre.compareTo(o.nombre);
            }
        }
		
		
		
}
