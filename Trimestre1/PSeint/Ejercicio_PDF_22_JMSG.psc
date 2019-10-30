//Autor: Jose Manuel Sabarís
//Título: Ejercicio 22
Proceso mayorRealV2
	
	//Aquí vamos a pedir 4 números reales y mostrar el de mayor valor.
	Definir num1, num2, num3, num4 Como Real;
	Definir numMayor Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 4 números reales y le mostraremos el de mayor valor";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	Escribir "Por favor, introduzca el segundo número";
	Leer num2;
	Escribir "Por favor, introduzca el tercer número";
	Leer num3;
	Escribir "Por favor, introduzca el cuarto número";
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
		Escribir "El número mayor es: ", numMayor;
	SiNo
		Escribir "Los cuatro números son iguales";
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso