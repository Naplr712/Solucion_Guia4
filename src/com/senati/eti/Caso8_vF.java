package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8_vF {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrnombre = new ArrayList<String>();
		ArrayList<Integer> arredad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			System.out.println("REGISTRO N." + nr);
			System.out.println("------------");
			
			System.out.print("Nombre....: ");
			nombre = sc.nextLine();
			System.out.print("Edad......: ");
			edad = sc.nextInt();
			
			// Agregar valores le�dos a cada ArrayList
			arrnombre.add(nombre);
			arredad.add(edad);
			
			sc.nextLine();
			
			System.out.print("�Continua? [S][N]");
			rp = sc.nextLine();	
			
			if (rp.equals("N") || rp.equals("n")) {
				System.out.println("<< GRACIAS POR SU TIEMPO >> ");
				
			} else {
				if (rp.equals("S") || rp.equals("s"));
				
			}
			
			
			
			
			
		}
		
	}
}
