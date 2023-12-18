package main;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese 2 números ");
		
		Scanner entrada= new Scanner(System.in);
		
		int numero1= entrada.nextInt();
		int numero2= entrada.nextInt();
		
		System.out.println("Ingrese un operador(+,-,*,/)");
		
		char operador= entrada.next().charAt(0);
		int resultado=0;
		
		switch (operador) {
		case '+':
			resultado= numero1+numero2;
			System.out.println("la suma de " + numero1 +" +  "+ numero2 + " es "+ resultado);
			break;
		case '-':
			resultado= numero1-numero2;
			System.out.println("la resta de " + numero1 +" -  "+ numero2 + " es "+ resultado);
			break;
		case '*':
			resultado= numero1*numero2;
			System.out.println("la multiplicación de " + numero1 +" x "+ numero2 + " es "+ resultado);
			break;
		case '/':
			resultado= numero1/numero2;
			System.out.println("la divición  de " + numero1 +" / "+ numero2 + " es "+ resultado);
			break;	
		
			
		}

	}

}
