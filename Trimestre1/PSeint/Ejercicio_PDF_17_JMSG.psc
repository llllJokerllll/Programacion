//Autor: Jose Manuel Sabarís
//Título: Ejercicio 17
Algoritmo triangulo
	
	//Aquí vamos a realizar con 3 valores longitudinales si se puede formar un triangulo, y de ser así, definir su tipo.
	Definir lado1, lado2, lado3 Como Entero;
	Definir comprobación Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 valores longitudinales para formar un triángulo";
	Escribir "Por favor, introduzca el primer valor";
	Leer lado1;
	Escribir "Por favor, introduzca el segundo valor";
	Leer lado2;
	Escribir "Por favor, introduzca el tercer valor";
	Leer lado3;
	
	Si (lado1 > (lado2 + lado3)) o (lado2 > (lado1 + lado3)) o (lado3 > (lado1 + lado2)) Entonces
		Escribir "Lo sentimos, con esos valores es imposible formar un triángulo";
		SiNo Si (lado1 < (lado2 + lado3)) o (lado2 < (lado1 + lado3)) o (lado3 < (lado1 + lado2)) Entonces
			Si (lado1 == lado2 y lado1 == lado3) Entonces
				Escribir "El triángulo formado es equilátero";
					SiNo Si (lado1 == lado2 y lado1 <> lado3) o (lado1 == lado3 y lado1 <> lado2) o (lado2 == lado3 y lado2 <> lado1) Entonces
						Escribir "El triángulo formado es isosceles";
					SiNo
						Escribir "El triángulo formado es escaleno";
				FinSi;			
			FinSi;
		FinSi;	
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
