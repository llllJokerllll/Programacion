//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 8
Algoritmo digitos
	
	//Aqui vamos a indicarle si el n�mero introducido tiene 1 o 2 cifras.
	Definir num1 Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero positivo de 1 o 2 cifras";
	Leer num1;
	
	Si (num1 <= 99) y (num1 >= 1) Entonces
		Si num1 < 10
			Escribir "Su n�mero tiene 1 d�gito";
		SiNo
			Escribir "Su n�mero tiene 2 d�gitos";
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
