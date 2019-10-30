//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 2
Proceso promedioHastaCero
	
	//Aquí vamos calcular y emitir el promedio de cuatro valores en cada juego hasta que el primer valor valga 0.
	Definir num1, num2, num3, num4 Como Entero;
	Definir promedio Como Real;
	
	Escribir "Hola";
	
	num1 <- 1;
	
	Mientras num1 <> 0 Hacer
		Escribir "Por favor, introduzca 1 juego de 4 valores";
		Leer num1;
		Si num1 <> 0 Entonces
			Leer num2;
			Leer num3;
			Leer num4;
			promedio <- (num1 + num2 + num3 + num4) / 4;
			Escribir "El promedio de su juego es: ", promedio;
			SiNo 
		FinSi
		
	FinMientras
	
	Escribir "Hasta otra";
	
FinProceso