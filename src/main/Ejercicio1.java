package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero del 1 al 7 le diré que dia de la semana corresponde");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		
		String diaSemana;
		
		switch (numero) {
		case 1:
			diaSemana = "Domingo";
			System.out.println(diaSemana);
			break;
		case 2:
			diaSemana = "Lunes";
			System.out.println(diaSemana);
			break;
		case 3:
			diaSemana = "Martes";
			System.out.println(diaSemana);
			break;
		case 4:
			diaSemana = " Miercoles";
			System.out.println(diaSemana);
			break;
		case 5:
			diaSemana= " Jueves";
			System.out.println(diaSemana);
			break;
		case 6:
			diaSemana= "Viernes";
			System.out.println(diaSemana);
			break;
		case 7 :
			diaSemana= "Sabado";
			System.out.println(diaSemana);
			break;
		default:
			diaSemana = "número no valido";
			System.out.println(diaSemana);
			break;
	
			
		}
		
		
	}

}
