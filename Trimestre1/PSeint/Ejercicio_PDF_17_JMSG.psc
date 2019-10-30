//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 17
Algoritmo triangulo
	
	//Aqu� vamos a realizar con 3 valores longitudinales si se puede formar un triangulo, y de ser as�, definir su tipo.
	Definir lado1, lado2, lado3 Como Entero;
	Definir comprobaci�n Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 valores longitudinales para formar un tri�ngulo";
	Escribir "Por favor, introduzca el primer valor";
	Leer lado1;
	Escribir "Por favor, introduzca el segundo valor";
	Leer lado2;
	Escribir "Por favor, introduzca el tercer valor";
	Leer lado3;
	
	Si (lado1 > (lado2 + lado3)) o (lado2 > (lado1 + lado3)) o (lado3 > (lado1 + lado2)) Entonces
		Escribir "Lo sentimos, con esos valores es imposible formar un tri�ngulo";
		SiNo Si (lado1 < (lado2 + lado3)) o (lado2 < (lado1 + lado3)) o (lado3 < (lado1 + lado2)) Entonces
			Si (lado1 == lado2 y lado1 == lado3) Entonces
				Escribir "El tri�ngulo formado es equil�tero";
					SiNo Si (lado1 == lado2 y lado1 <> lado3) o (lado1 == lado3 y lado1 <> lado2) o (lado2 == lado3 y lado2 <> lado1) Entonces
						Escribir "El tri�ngulo formado es isosceles";
					SiNo
						Escribir "El tri�ngulo formado es escaleno";
				FinSi;			
			FinSi;
		FinSi;	
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
