//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 22
Proceso mayorRealV2
	
	//Aqu� vamos a pedir 4 n�meros reales y mostrar el de mayor valor.
	Definir num1, num2, num3, num4 Como Real;
	Definir numMayor Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 4 n�meros reales y le mostraremos el de mayor valor";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer num2;
	Escribir "Por favor, introduzca el tercer n�mero";
	Leer num3;
	Escribir "Por favor, introduzca el cuarto n�mero";
	Leer num4;
	
	Si num1 <> num2 && num1 <> num3 && num1 <> num4 && num2 <> num3 && num2 <> num4 && num3 <> num4 Entonces
		Si num1 > num2 && num1 > num3 && num1 > num4 Entonces
			numMayor <- num1;
		SiNo Si num2 > num3 && num2 > num4 Entonces
				numMayor <- num2;
			SiNo Si num3 > num4 Entonces
					numMayor <- num3;
				SiNo
					numMayor <- num4;
				FinSi;
			FinSi;
		FinSi;
		Escribir "El n�mero mayor es: ", numMayor;
	SiNo
		Escribir "Los cuatro n�meros son iguales";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso