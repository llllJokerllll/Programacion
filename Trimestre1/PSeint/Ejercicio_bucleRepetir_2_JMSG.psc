//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio bucle repetir 2
Algoritmo sumaCero
	
	//Aqu� vamos a realizar la suma de dos n�meros dados, hasta que ambos sean 0.
	Definir num1, num2 Como Entero;
	Definir total Como Entero;
	
	Escribir "Hola";
	
	Repetir
	Escribir "Por favor introduzca un n�mero";
	Leer num1;
	Escribir "Por favor introduzca el segundo n�mero";
	Leer num2;
		Si num1 <> 0 o num2 <> 0 Entonces
			total <- num1 + num2;
			Escribir "El total de sus n�meros es: ", total;
			Leer num1;
			Leer num2;
		FinSi;
	Hasta Que num1 == 0 y num2 == 0;
	
	Escribir "Los dos n�meros son 0";
	Escribir "Hasta otra";
	
FinAlgoritmo
