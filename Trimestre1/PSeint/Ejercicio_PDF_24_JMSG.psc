//Autor: Jose Manuel Sabarís
//Título: Ejercicio 24
Proceso sumaIgualdad
	
	//Aquí vamos a solicitar 3 números y comprobaremos si con la suma de 2 de ellos dan el mismo valor que el número restante.
	Definir num1, num2, num3 Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 números enteros y le diremos si con la suma de 2 de ellos dan el valor del número restante";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	Escribir "Por favor, introduzca el segundo número";
	Leer num2;
	Escribir "Por favor, introduzca el tercer número";
	Leer num3;
	
	Si num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1 Entonces
		Escribir "Iguales";
	SiNo
		Escribir "Distintos";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso
