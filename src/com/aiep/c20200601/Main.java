package com.aiep.c20200601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		EquipoFutbol Equipo = new EquipoFutbol();
	
		Futbolista futbolista = new Futbolista();
	
		
		System.out.println("ingrese nombre del futbolista:");
		String sNombre = sc.next();
		futbolista.setsNombre(sNombre);
		
		System.out.println("ingrese apellido del futbolista:");
		String sApellido = sc.next();
		futbolista.setsApellidos(sApellido);
		
		System.out.println("ingrese edad del futbolista:");
		int sEdad = sc.nextInt();
		futbolista.setsEdad(sEdad);
		
		
		String Nombre = futbolista.getsNombre();
		String Apellido = futbolista.getsApellidos();
		int Edad = futbolista.getsEdad();
		
		
		System.out.println(Nombre + " " +  Apellido + " " +  Edad);
	}
}
