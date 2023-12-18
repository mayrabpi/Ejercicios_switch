package main;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Seleccione una opcion:" + "\n -Mostrar información " + "\n -Editar perfil" + "\n -Salir");
		
		Scanner entrada= new Scanner(System.in);
		
		String opcion= entrada.nextLine();
		
		switch(opcion) {
		case "Mostrar informacion":
			System.out.println("En este apartado recibira la informacion necesaria");
			break;
			
		case " Editar perfil":
			System.out.println("En este apartado podra editar su perfil");
			break;
			
		case " salir":
			System.out.println("Adios");
			break;
		}
		

	}

}
