package main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese una calificación del 1 al 5 le diré y esta aprovado o suspenso");
		
		Scanner entrada = new Scanner(System.in);
		
		int calificacion= entrada.nextInt();
		
		switch(calificacion) {
		
		case 1:
		case 2:
			System.out.println("Suspenso");
			break;
		
		case 3:
			System.out.println("Aprovado");
			break;
			
		case 4:
			System.out.println("Notable");
			break;
			
		case 5:
			System.out.println("Sobresaliente");
			break;
			
		}
		
		

	}

}
