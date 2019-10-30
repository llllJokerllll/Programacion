//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucles 3
Algoritmo numerosazar
	
	//Aqui vamos a dar 2 numeros al azar y el usuario tiene que realizar su suma e introducirla correctamente
	Definir n1, n2 Como Entero;
	Definir resultado Como Entero;
	
	n1 <- azar(101);
	n2 <- azar(101);
	
	Escribir "Hola";
	Escribir "Por favor, sume los siguientes 2 números e introduzca el resultado correcto";
	Escribir n1, "+", n2;
	Escribir "Introduzca el resultado de la suma";
	Leer resultado;
	
	Mientras resultado <> (n1 + n2) Hacer
		Escribir "El resultado es incorrecto, por favor introdúzcalo correctamente";
		Leer resultado;
	FinMientras;
	
	Escribir "Felicidades, es usted un hacha";
	Escribir "Hasta otra";
	
FinAlgoritmo
