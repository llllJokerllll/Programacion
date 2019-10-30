//Autor: Jose Manuel Sabarís
//Título: Ejercicio 8
Algoritmo digitos
	
	//Aqui vamos a indicarle si el número introducido tiene 1 o 2 cifras.
	Definir num1 Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número positivo de 1 o 2 cifras";
	Leer num1;
	
	Si (num1 <= 99) y (num1 >= 1) Entonces
		Si num1 < 10
			Escribir "Su número tiene 1 dígito";
		SiNo
			Escribir "Su número tiene 2 dígitos";
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
