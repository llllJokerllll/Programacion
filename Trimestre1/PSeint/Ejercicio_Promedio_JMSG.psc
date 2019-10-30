//Autor: Jose Manuel Sabarís
//Título: Ejercicio secuencial A
Algoritmo promedios
	
	//Aqui vamos a realizar el promedio de 3 numero dados por el usuario.
	//Para hallar dicho promedio sumaremos los 3 numeros y los dividiremos entre 3.
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir promedio Como Real;
	
	Escribir "Hola";
	Escribir "Vamos a realizar el promedio de 3 numeros de su elección";
	Escribir "Por favor, introduzca el primer número"
	Leer a;
	Escribir "Por favor, introduzca el segundo número";
	Leer b;
	Escribir "Por favor, introduzca el tercer número";
	Leer c;
	
	Escribir "Estos son los números que ha escogido para realizar el promedio";
	Escribir "Primer número = ", a;
	Escribir "Segundo número = ", b;
	Escribir "Tercer número = ", c;
	
	promedio <- (a + b + c) / 3;
	Escribir "El promedio de los números que ha escogido es = ", promedio;
	Escribir "Hasta otra"
	
FinAlgoritmo
