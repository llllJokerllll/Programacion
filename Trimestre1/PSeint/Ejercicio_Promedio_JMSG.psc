//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio secuencial A
Algoritmo promedios
	
	//Aqui vamos a realizar el promedio de 3 numero dados por el usuario.
	//Para hallar dicho promedio sumaremos los 3 numeros y los dividiremos entre 3.
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir promedio Como Real;
	
	Escribir "Hola";
	Escribir "Vamos a realizar el promedio de 3 numeros de su elecci�n";
	Escribir "Por favor, introduzca el primer n�mero"
	Leer a;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer b;
	Escribir "Por favor, introduzca el tercer n�mero";
	Leer c;
	
	Escribir "Estos son los n�meros que ha escogido para realizar el promedio";
	Escribir "Primer n�mero = ", a;
	Escribir "Segundo n�mero = ", b;
	Escribir "Tercer n�mero = ", c;
	
	promedio <- (a + b + c) / 3;
	Escribir "El promedio de los n�meros que ha escogido es = ", promedio;
	Escribir "Hasta otra"
	
FinAlgoritmo
