//Autor: Jose Manuel Sabar�s
//T�tulo: Xogo do Petr�leo
Proceso xogoPetroleo
	
	//Aqu� vamos a realizar un juego sobre el precio del petr�leo.
	//Definici�n de variables
	Definir dias, precioDia, contador, rango Como Entero;
	Definir diaMasBarato, precioDiaMasBarato Como Entero;
	Definir sumaPromedio, promedio Como Real;
	
	//Inicializaci�n de variables
	contador <- 1;
	rango <- (150 - 130) + 1;
	precioDiaMasBarato <- 150;
	sumaPromedio <- 0;
	
	//Entrada de datos
	Escribir "Hola";
	Escribir Sin Saltar "Por favor, introduzca la cantidad de d�as del mes: ";
	Leer dias;
	
	//Comprobaci�n y proceso
	Mientras contador <= dias Hacer
		precioDia <- 130 + Azar(20) + 1;
		Escribir "Precio del d�a ", contador, " : ", precioDia, "$";
		Si precioDia < precioDiaMasBarato Entonces
			precioDiaMasBarato <- precioDia;
			diaMasBarato <- contador;
		FinSi
		sumaPromedio <- sumaPromedio + precioDia;
		contador <- contador + 1;
	FinMientras
	
	promedio <- sumaPromedio / dias;
	
	//Salida Resultado
	Escribir "El promedio mensual es: ", promedio, "$";
	Escribir "El menor precio del mes es: ", precioDiaMasBarato, "$";
	Escribir "El d�a del menor precio es: ", diaMasBarato;
	Escribir "Hasta otra";
	
FinProceso
