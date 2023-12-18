package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese una cantidad de dinero en dolares o euros ");
		
		Scanner entrada= new Scanner(System.in);
		
		double dinero = entrada.nextDouble();
		
		System.out.println("Elija a si desea cambiar la moneda a Dolares o  Euros ");
		
		char cambio= entrada.next().charAt(0);
		double resultado;
		switch(cambio) {
		
		case 'D':
		case 'd':
			resultado = dinero*1.80;
			 System.out.println(dinero + "$ al cambio en euros es " + resultado + "€");
			 break;
		case 'E':
		case 'e':
			resultado = dinero*0.80;
			System.out.println(dinero + "€ al cambio en dolares es " + resultado + "$");
			break;
		
		}
		

	}

}
