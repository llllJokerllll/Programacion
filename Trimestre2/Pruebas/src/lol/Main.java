/**
 * 
 */
package lol;

/**
 * @author dual112
 *
 */
public class Main {
	public static void main(String[] args) {
		Persona alex = new Persona("Alex", 20);
		System.out.println("Hello world");
		alex.getName();
		alex.getAge();
		alex.cumpleanos();
		alex.cobrar();
	}


}

class Persona{
	private String name;
	int age;
	int dinero;

	Persona(String nombre, int edad){
		this.name = nombre;
		this.age = edad;
		dinero = 0;
	}

	public void getName() {
		System.out.println(name);
	}

	public void getAge() {
		System.out.println(age);
	}

	public void cumpleanos() {
		age++;
		System.out.println(name + " cumple " + age + " años");
	}
	
	   public void cobrar() {
	        dinero += 500;
	        System.out.println(name + " tiene ahora " + dinero + " euros");
	    }
}
