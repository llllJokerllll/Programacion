//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 24
Proceso sumaIgualdad
	
	//Aqu� vamos a solicitar 3 n�meros y comprobaremos si con la suma de 2 de ellos dan el mismo valor que el n�mero restante.
	Definir num1, num2, num3 Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 n�meros enteros y le diremos si con la suma de 2 de ellos dan el valor del n�mero restante";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer num2;
	Escribir "Por favor, introduzca el tercer n�mero";
	Leer num3;
	
	Si num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1 Entonces
		Escribir "Iguales";
	SiNo
		Escribir "Distintos";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso
