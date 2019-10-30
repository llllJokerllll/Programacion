//Autor: Jose Manuel Sabarís
//Título: Ejercicio 3
Algoritmo promedios
	
	//Aqui vamos a realizar un promedio de 5 números dados y decir si es mayor o igual a 10.
	Definir a, b, c, d, e Como Entero;
	Definir promedio Como Entero;
	
	Escribir "Hola";
	Escribir "Introduzca 5 números para hallar su promedio";
	Escribir "Introduzca el primero número";
	Leer a;
	Escribir "Introduzca el segundo número";
	Leer b;
	Escribir "Introduzca el tercer número";
	Leer c;
	Escribir "Introduzca el cuarto número";
	Leer d;
	Escribir "Introduzca el quinto número";
	
	promedio <- (a + b + c + d + e) / 5;
	Si promedio >= 10
		Escribir "El promedio de sus números es mayor o igual que 10";
	SiNo
		Escribir "El promedio de sus números no es mayor o igual que 10";
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
