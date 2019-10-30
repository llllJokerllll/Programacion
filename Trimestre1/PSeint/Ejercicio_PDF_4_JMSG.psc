//Autor: Jose Manuel Sabarís
//Título: Ejercicio 4
Algoritmo calculadora
	
	//Aqui vamos a relizar un programa que calcule segun el signo dado dos números.
	Definir num1, num2 Como Entero;
	Definir simbolo Como Caracter;
	
	Escribir "Hola"
	Escribir "Introduzca 2 números y el signo para realizar una suma(+), resta(-), multiplicación(*) o división(/)";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	Escribir "Por favor, introduzca el segundo número";
	Leer num2;
	Escribir "Por favor, introduzca el signo para realizar el cálculo";
	Leer simbolo;
	
	Si (simbolo = "+") o (simbolo = "-") o (simbolo = "*") o (simbolo = "/") Entonces
		Si (simbolo = "+") o (simbolo = "-") o (simbolo = "*") Entonces
			Si (simbolo = "+") o (simbolo = "-") Entonces
				Si (simbolo = "+") Entonces
					Escribir "El resultado de la suma es: ", num1 + num2;
				SiNo
					Escribir "El resultado de la resta es: ", num1 - num2;
				FinSi
			SiNo 
				Escribir "El resultado de la división es: ", num1 / num2;
			FinSi
		SiNo 
			Escribir "El resultado de la multiplicación es: ", num1 * num2;
		FinSi
	SiNo
		Escribir "Error en símbolo";
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
