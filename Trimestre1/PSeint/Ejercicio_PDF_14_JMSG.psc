//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 14
Algoritmo bisiesto
	
	//Aqu� vamos a realizar la comprobaci�n de si un a�o fu�, es o ser� bisiesto.
	Definir anoEntrada Como Entero;
	
	Escribir "Hola";
	Escribir "Escriba un a�o en n�mero y le diremos si fu�, es o ser� bisiesto";
	Leer anoEntrada;
	
	Si ((anoEntrada % 4 == 0 & anoEntrada % 100 <> 0) | anoEntrada % 400 == 0) Entonces
		Escribir "El a�o introducido fu�, es o ser� bisiesto";
	SiNo
		Escribir "El a�o introducido no fu�, no es ni ser� bisiesto";
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
