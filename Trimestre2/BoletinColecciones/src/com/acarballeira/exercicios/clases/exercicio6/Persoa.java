/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio6;

import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Persoa.
 */
public class Persoa implements Comparable<Persoa> {
		
		/** The nombre. */
		protected String nombre;
		
		/** The edad. */
		protected int edad;
		
		/**
		 * Instantiates a new persoa.
		 *
		 * @param nombre the nombre
		 * @param edad the edad
		 */
		public Persoa(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
	    }

		/**
		 * Gets the nombre.
		 *
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Sets the nombre.
		 *
		 * @param nombre the new nombre
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * Gets the edad.
		 *
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}

		/**
		 * Sets the edad.
		 *
		 * @param edad the new edad
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}

		/**
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return String.format("Persoa [nombre=%s, edad=%s]", nombre, edad);
		}
		
        /**
         * Hash code.
         *
         * @return the int
         */
        @Override
        public int hashCode() {
            return Objects.hash(edad, nombre);
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
            Persoa other = (Persoa) obj;
            return edad == other.edad && Objects.equals(nombre, other.nombre);
        }


        /**
         * Compare to.
         *
         * @param o the o
         * @return the int
         */
        @Override
        public int compareTo(Persoa o) {
            if (this.nombre.equals(o.nombre)) {
                return o.edad - this.edad;
            } else {
                return this.nombre.compareTo(o.nombre);
            }
        }
		
		
		
}
