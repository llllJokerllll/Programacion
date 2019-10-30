//Autor: Jose Manuel Sabarís
//Título: Ejercicio 21
Proceso mayorReal
	
	//Aquí vamos a pedir 2 números reales y mostrar el de mayor valor.
	Definir num1, num2 Como Real;
	Definir numMayor Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número real";
	Leer num1;
	Escribir "Por favor, introduzca otro número real";
	Leer num2;
	
	Si num1 <> num2 Entonces
		Si num1 > num2 Entonces
			numMayor <- num1;
		SiNo
			numMayor <- num2;
		FinSi;
		Escribir "El numero mayor es: ", numMayor;
	SiNo
		Escribir "Los dos números son iguales";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso