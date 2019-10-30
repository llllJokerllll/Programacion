//Autor: Jose Manuel Sabarís
//Título: Ejercicio 6
Algoritmo maximo_v2
	
	//Aqui vamos a encontrar el maximo entre 3 valores.
	Definir r, s, t Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 números, y hallaremos el máximo entre ellos";
	Escribir "Introduzca el primer número";
	Leer r;
	Escribir "Introduzca el segundo número";
	Leer s;
	Escribir "Introduzca el tercer número";
	Leer t;
	
	Si (r >= s) y (r >= t) Entonces
		Escribir "El número máximo entre los números es: ", r;
	SiNo Si (s >= t) Entonces
			Escribir "El número máximo entre los números es: ", s;
		SiNo
			Escribir "El número máximo entre los números es: ", t;
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
