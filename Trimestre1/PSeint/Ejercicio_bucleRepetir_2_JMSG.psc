//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucle repetir 2
Algoritmo sumaCero
	
	//Aquí vamos a realizar la suma de dos números dados, hasta que ambos sean 0.
	Definir num1, num2 Como Entero;
	Definir total Como Entero;
	
	Escribir "Hola";
	
	Repetir
	Escribir "Por favor introduzca un número";
	Leer num1;
	Escribir "Por favor introduzca el segundo número";
	Leer num2;
		Si num1 <> 0 o num2 <> 0 Entonces
			total <- num1 + num2;
			Escribir "El total de sus números es: ", total;
			Leer num1;
			Leer num2;
		FinSi;
	Hasta Que num1 == 0 y num2 == 0;
	
	Escribir "Los dos números son 0";
	Escribir "Hasta otra";
	
FinAlgoritmo
