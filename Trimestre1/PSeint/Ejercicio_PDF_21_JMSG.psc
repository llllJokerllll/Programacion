//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 21
Proceso mayorReal
	
	//Aqu� vamos a pedir 2 n�meros reales y mostrar el de mayor valor.
	Definir num1, num2 Como Real;
	Definir numMayor Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero real";
	Leer num1;
	Escribir "Por favor, introduzca otro n�mero real";
	Leer num2;
	
	Si num1 <> num2 Entonces
		Si num1 > num2 Entonces
			numMayor <- num1;
		SiNo
			numMayor <- num2;
		FinSi;
		Escribir "El numero mayor es: ", numMayor;
	SiNo
		Escribir "Los dos n�meros son iguales";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso