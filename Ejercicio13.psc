Algoritmo Ejercicio13
	Definir numero1, numero2 Como Entero
	Definir resultado Como Real
	Repetir
		Escribir "********************************"
		Escribir "***************MENU*************"
		Escribir "********************************"
		Escribir "1. Suma: "
		Escribir "2. División: "
		Escribir "3. Salir: "
		Leer opcion
		Limpiar Pantalla
		Segun opcion Hacer
			1:
				Escribir "Ingrese primer numero: "
				Leer numero1
				Escribir "Ingrese segundo numero"
				Leer numero2
				resultado = numero1 + numero2
				Escribir "El resultado de la suma es = " resultado
				
			2:
				Escribir "Ingrese primer numero: "
				Leer numero1
				Escribir "Ingrese segundo numero"
				Leer numero2
				
				Si numero2 = 0 Entonces
					Escribir "No se puede dividir por cero."
				SiNo
					resultado = numero1 / numero2
					Escribir "El resultado de la división es = " resultado
				Fin Si

			3:
				Escribir "Proceso finalizado"
			De Otro Modo:
				Escribir "Opción no válida"
		Fin Segun
	Hasta Que opcion = 3
FinAlgoritmo
