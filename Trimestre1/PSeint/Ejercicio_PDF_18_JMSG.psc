//Autor: Jose Manuel Sabarís
//Título: Ejercicio 18
Algoritmo intervalo
	
	//Aquí vamos a realizar la comprobacion de si c esta entre a y b.
	Definir a, b, c Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el valor a comprobar";
	Leer a;
	Escribir "Por favor, introduzca el primer valor del intervalo";
	Leer b;
	Escribir "Por favor, introduzca el segundo valor del intervalo";
	Leer c;
	
	Si (n1 < n2 y n1 > n3) o (n1 < n3 y n1 > n2) Entonces
		Escribir "El valor está en el intervalo establecido";
	SiNo
		Escribir "El valor no está en el intervalo establecido";
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
