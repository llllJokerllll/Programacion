//Autor: Jose Manuel Sabarís
//Título: Ejercicio 19
Algoritmo alquilerCoche
	
	//Aquí vamos a realizar un algoritmo para determinar cuanto tiene que pagar de alquiler
	Definir distancia, basePrecio, peso, ano, categoria, tarifaReg Como Entero;
	Definir tarifa1, tarifa2, precio Como Real;
	
	basePrecio <- 30;
	tarifa1 <- 0.15;
	tarifa2 <- 0.10;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca la distancia recorrida con el vehículo de alquiler";
	Leer distancia;
	Escribir "Por favor, introduzca el año del vehículo alquilado";
	Leer ano;
	Escribir "Por favor, introduzca el peso del vehíchulo alquilado en libras";
	Leer peso;
	
	Si distancia <= 300 Entonces
		precio <- basePrecio;
	SiNo Si distancia > 300 && distancia <= 1000 Entonces
			precio <- (distancia - 300) * tarifa1 + basePrecio;
		SiNo Si distancia > 1000 Entonces
				precio <- (distancia - 1000) * tarifa2 + basePrecio;
			FinSi;
		FinSi;	
	FinSi;
	
	Si peso < 2700 Entonces
		Si ano <= 1970 Entonces
			categoria <- 1;
			tarifaReg <- 11600;
		SiNo Si ano >= 1971 & ano <= 1979 Entonces
				categoria <- 4;
				tarifaReg <- 13000;
			SiNo Si ano >= 1980 Entonces
					categoria <- 7;
					tarifaReg <- 12000;
				FinSi;
			FinSi;
		FinSi;
	SiNo Si peso >= 2700 && peso < 3500 Entonces
			Si ano <= 1970 Entonces
				categoria <- 2;
				tarifaReg <- 23200;
			SiNo Si ano >= 1971 & ano <= 1979 Entonces
					categoria <- 5;
					tarifaReg <- 26000;
				SiNo Si ano >= 1980 Entonces
						categoria <- 7;
						tarifaReg <- 12000;
					FinSi;
				FinSi;
			FinSi;
		SiNo Si peso >= 3500 && peso < 3800 Entonces
				Si ano <= 1970 Entonces
					categoria <- 2;
					tarifaReg <- 23200;
				SiNo Si ano >= 1971 & ano <= 1979 Entonces
						categoria <- 5;
						tarifaReg <- 26000;
					SiNo Si ano >= 1980 Entonces
							categoria <- 8;
							tarifaReg <- 46000;
						FinSi;
					FinSi;
				FinSi;
			SiNo Si peso >= 3800 Entonces
					Si ano <= 1970 Entonces
						categoria <- 3;
						tarifaReg <- 34800;
					SiNo Si ano >= 1971 & ano <= 1979 Entonces
							categoria <- 6;
							tarifaReg <- 39000;
						SiNo Si ano >= 1980 Entonces
								categoria <- 8;
								tarifaReg <- 46000;
							FinSi;
						FinSi;
					FinSi;
				FinSi;
			FinSi;
		FinSi;
	FinSi;
	
	Escribir "El precio total por el alquiler y distancia recorrida es: ", precio, "$, la categoría del vehículo es: ", categoria, ", la tarifa de registro es: ", tarifaReg, "$";
	Escribir "Hasta otra, buen viaje";
	
FinAlgoritmo
