//Autor: Jose Manuel Sabarís
//Título: Ejercicios Bucles For 8
Proceso trianguloDeAsteriscos
	
	//Aquí vamos a realizar un algoritmo que pidiendo la longitud del lado de un cuadrado, nos lo muestre dibujado
	Definir base, alto, ancho, estructura Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca como de grande quiere el triángulo";
    Leer base;
	
    Para alto <- 1 Hasta base Con Paso 1 Hacer
        Para ancho <- 1 Hasta base - alto Con Paso 1 Hacer
            Escribir Sin Saltar "  " ;
        FinPara
		Para estructura <- 1 Hasta alto Con Paso 1 Hacer
			Escribir Sin Saltar "  * ";
		FinPara
        Escribir " ";
    FinPara
	
	Escribir "Hasta otra";
	
FinProceso
