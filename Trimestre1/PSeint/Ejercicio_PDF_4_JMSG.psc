//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 4
Algoritmo calculadora
	
	//Aqui vamos a relizar un programa que calcule segun el signo dado dos n�meros.
	Definir num1, num2 Como Entero;
	Definir simbolo Como Caracter;
	
	Escribir "Hola"
	Escribir "Introduzca 2 n�meros y el signo para realizar una suma(+), resta(-), multiplicaci�n(*) o divisi�n(/)";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer num2;
	Escribir "Por favor, introduzca el signo para realizar el c�lculo";
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
				Escribir "El resultado de la divisi�n es: ", num1 / num2;
			FinSi
		SiNo 
			Escribir "El resultado de la multiplicaci�n es: ", num1 * num2;
		FinSi
	SiNo
		Escribir "Error en s�mbolo";
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
