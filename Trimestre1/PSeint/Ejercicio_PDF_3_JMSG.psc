//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 3
Algoritmo promedios
	
	//Aqui vamos a realizar un promedio de 5 n�meros dados y decir si es mayor o igual a 10.
	Definir a, b, c, d, e Como Entero;
	Definir promedio Como Entero;
	
	Escribir "Hola";
	Escribir "Introduzca 5 n�meros para hallar su promedio";
	Escribir "Introduzca el primero n�mero";
	Leer a;
	Escribir "Introduzca el segundo n�mero";
	Leer b;
	Escribir "Introduzca el tercer n�mero";
	Leer c;
	Escribir "Introduzca el cuarto n�mero";
	Leer d;
	Escribir "Introduzca el quinto n�mero";
	
	promedio <- (a + b + c + d + e) / 5;
	Si promedio >= 10
		Escribir "El promedio de sus n�meros es mayor o igual que 10";
	SiNo
		Escribir "El promedio de sus n�meros no es mayor o igual que 10";
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
