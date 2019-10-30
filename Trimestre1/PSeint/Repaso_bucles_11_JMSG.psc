//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 11
Proceso descubreOmirp
	
	//Aqu� vamos a realizar la comprobaci�on de si un numero es Primo y su reverso Omirp.
	//Definici�n de variables
	Definir num1,i,dividendo,resto,digitos,reves Como Entero;
	Definir esPrimo Como Logico;
	Definir revescaracter,revesresto Como Caracter;
	
	//Inicializaci�n de variables
	esPrimo <- Verdadero;
	digitos <- 0;
	revescaracter <- "";
	
	//Entrada de datos
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero";
	Leer num1;
	
	//Comprobaci�n y proceso
	Para i <- 2 Hasta trunc(num1 / 2) Con Paso 1 Hacer
		Si num1 % i == 0 Entonces
			esPrimo <- Falso;
		FinSi
	FinPara
	
	Si esPrimo Entonces
		Escribir "Es un n�mero primo";
		dividendo <- num1;
		Mientras dividendo > 0 Hacer
			resto <- dividendo % 10;
			dividendo <- trunc(dividendo / 10);
			revesresto <- ConvertirATexto(resto);
			revescaracter <- Concatenar(revescaracter, revesresto);
			digitos <- digitos + 1;
		FinMientras
		reves <- ConvertirANumero(revescaracter);
		Escribir reves;
		Para i <- 2 Hasta trunc(reves / 2) Con Paso 1 Hacer
			Si reves % i == 0 Entonces
				esPrimo <- Falso;
			FinSi
		FinPara
		Si esPrimo Entonces
			Escribir "Es omirp";
		SiNo
			Escribir "No es omirp";
		FinSi
	SiNo
		Escribir "No es un n�mero primo";
	FinSi
	
	Escribir "Hasta otra";
	
FinProceso
