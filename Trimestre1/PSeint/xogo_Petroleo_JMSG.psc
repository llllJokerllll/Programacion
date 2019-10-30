//Autor: Jose Manuel Sabarís
//Título: Xogo do Petróleo
Proceso xogoPetroleo
	
	//Aquí vamos a realizar un juego sobre el precio del petróleo.
	//Definición de variables
	Definir dias, precioDia, contador, rango Como Entero;
	Definir diaMasBarato, precioDiaMasBarato Como Entero;
	Definir sumaPromedio, promedio Como Real;
	
	//Inicialización de variables
	contador <- 1;
	rango <- (150 - 130) + 1;
	precioDiaMasBarato <- 150;
	sumaPromedio <- 0;
	
	//Entrada de datos
	Escribir "Hola";
	Escribir Sin Saltar "Por favor, introduzca la cantidad de días del mes: ";
	Leer dias;
	
	//Comprobación y proceso
	Mientras contador <= dias Hacer
		precioDia <- 130 + Azar(20) + 1;
		Escribir "Precio del día ", contador, " : ", precioDia, "$";
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
	Escribir "El día del menor precio es: ", diaMasBarato;
	Escribir "Hasta otra";
	
FinProceso
