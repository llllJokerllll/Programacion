//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 6
Algoritmo maximo_v2
	
	//Aqui vamos a encontrar el maximo entre 3 valores.
	Definir r, s, t Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 n�meros, y hallaremos el m�ximo entre ellos";
	Escribir "Introduzca el primer n�mero";
	Leer r;
	Escribir "Introduzca el segundo n�mero";
	Leer s;
	Escribir "Introduzca el tercer n�mero";
	Leer t;
	
	Si (r >= s) y (r >= t) Entonces
		Escribir "El n�mero m�ximo entre los n�meros es: ", r;
	SiNo Si (s >= t) Entonces
			Escribir "El n�mero m�ximo entre los n�meros es: ", s;
		SiNo
			Escribir "El n�mero m�ximo entre los n�meros es: ", t;
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
