Algoritmo omirp
	
	//Entrada de datos
	Definir n como Entero;
	//Saída de datos
	//Operativa
	Definir esPrimo Como Logico;
	Definir i, dividendo, resto, numDixitos, numeroReves Como Entero;
	Definir numeroRevesC Como Caracter;
	//Constante
	
	//Inicialización de variables
	esPrimo <- Verdadero;
	numDixitos <- 0;
	numeroRevesC <- "";
	
	//Entrada de datos
	Escribir Sin Saltar "Introduzca un número: ";
	Leer n;
	
	Para i<-2 Hasta trunc(n/2) Con Paso 1 Hacer
		Si n % i == 0 Entonces
			esPrimo <- falso;
		FinSi
	Fin Para
	//Escribir esPrimo;
	Si esPrimo Entonces
		Escribir "Es primo";
		dividendo <- n;
		Mientras dividendo > 0 Hacer
			resto <- dividendo%10;
			dividendo <- trunc (dividendo/10);
			numeroRevesC <- Concatenar(numeroRevesC,ConvertirATexto(resto));
			//numDixitos <- numDixitos + 1;
		FinMientras
		numeroReves <- ConvertirANumero(numeroRevesC);
		
		Para i<-2 Hasta trunc(numeroReves/2) Con Paso 1 Hacer
			Si numeroReves % i == 0 Entonces
				esPrimo <- falso;
			FinSi
		Fin Para
		Si esPrimo Entonces
			Escribir "Es omirp";
		SiNo
			Escribir "No es omirp";
		FinSi
	SiNo
		Escribir "No es primo";
	FinSi
	
FinAlgoritmo










