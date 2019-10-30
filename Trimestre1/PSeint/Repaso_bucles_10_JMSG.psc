//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 10
Proceso menuCalculadora
	
	//Aquí vamos a realizar una calculadora con un menú interactivo.
	Definir a, b Como Entero;
	Definir opcion Como Caracter;
	
	opcion <- "";
	
	Escribir "Bienvenido a nuestra calculadora";
	
	Mientras opcion <> "S" Hacer
		Escribir "Seleccione la opción que desee";
		Escribir "1.- Suma";
		Escribir "2.- Resta";
		Escribir "3.- Producto";
		Escribir "4.- División";
		Escribir "S.- Salir";
		Leer opcion;
		opcion <- Mayusculas(opcion);
		
		Si (opcion < "0" || opcion > "4") Entonces
			Escribir "Opción no válida";
		SiNo Si (opcion = "1") Entonces
				Escribir "Por favor, introduzca el valor para A";
				Leer a;
				Escribir "Por favor, introduzca el valor para B";
				Leer b;
				Escribir "El resultado es: ",a + b;
			SiNo Si (opcion = "2") Entonces
					Escribir "Por favor, introduzca el valor para A";
					Leer a;
					Escribir "Por favor, introduzca el valor para B";
					Leer b;
					Escribir "El resultado es: ",a - b;
				SiNo Si (opcion = "3") Entonces
						Escribir "Por favor, introduzca el valor para A";
						Leer a;
						Escribir "Por favor, introduzca el valor para B";
						Leer b;
						Escribir "El resultado es: ",a * b;
					SiNo Si (opcion = "4") Entonces
							Escribir "Por favor, introduzca el valor para A";
							Leer a;
							Escribir "Por favor, introduzca el valor para B";
							Leer b;
							Mientras b == 0 Hacer
								Escribir "Por favor, introduzca un valor diferente a 0";
								Leer b;
							FinMientras
							Escribir "El resultado es: ",a / b;
						FinSi
					FinSi
				FinSi	
			FinSi
		FinSi
		
	FinMientras
	
	
FinProceso
