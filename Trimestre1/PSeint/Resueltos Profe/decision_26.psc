Algoritmo bisiesto_
	
	Definir dia, mes, ano Como Entero;
	Definir diaSiguiente, mesSiguiente, anoSiguiente como Entero;
	Definir bisiesto Como Logico;
	
	
	//Pedimos datos
	Escribir Sin Saltar "Día: ";
	Leer dia;
	Escribir Sin Saltar "Mes: ";
	Leer mes;
	Escribir Sin Saltar "Ano: ";
	Leer ano;
	
	//Efectúo os cálculos
	Si ( ano MOD 4 == 0 & ano MOD 100 <> 0 ) | ( ano MOD 400 == 0) Entonces
		bisiesto = Verdadero;
	SiNo
		bisiesto = Falso;
	FinSi
	
	mesSiguiente <- mes;
	anoSiguiente <- ano;
	diaSiguiente <- dia + 1;
	
	Si ( dia == 31 & (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 ))| ( dia == 30 & (mes == 4 | mes == 6 | mes == 9 | mes == 11))|( dia == 28 & mes = 2 & ~bisiesto)|( dia == 29 & mes = 2 & bisiesto)Entonces
		diaSiguiente <- 1;
		mesSiguiente <- mes + 1;
	SiNo
		Si mes == 12 & dia == 31 Entonces
			diaSiguiente <- 1;
			mesSiguiente <- 1;
			anoSiguiente <- ano + 1;
		FinSi
	FinSi
	Escribir "O día seguinte é: ", diaSiguiente, "-", mesSiguiente "-", anoSiguiente;
	
	
FinAlgoritmo





