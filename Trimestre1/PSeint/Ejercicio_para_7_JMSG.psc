//Autor: Jose Manuel Sabarís
//Título: Ejercicios Bucles For 7
Proceso cuadradoDibujar
	
	//Aquí vamos a realizar un algoritmo que pidiendo la longitud del lado de un cuadrado, nos lo muestre dibujado
	Definir lado,alto,ancho Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el valor del lado del cuadrado";
    Leer lado;
	
    Para alto <- 1 Hasta lado Hacer
        Para ancho <- 1 Hasta lado Hacer
            Escribir Sin Saltar "* " ;
        FinPara
        Escribir "";
    FinPara
	
	Escribir "Hasta otra";
	
FinProceso
