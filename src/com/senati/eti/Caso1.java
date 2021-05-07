package com.senati.eti;

import java.util.Arrays;

public class Caso1 {

	public static void main(String[] args) {
		//declarar el arreglo(array)
		String [] arrNombre= new String[4];
		//asignar valores
		arrNombre[0] = "Joe Castillo";
		arrNombre[1]="Leonel Messi";
		arrNombre[2]="Felipe Quispe";
		arrNombre[3]="Juan Zeta";
		//impresion de valores
		
		System.out.println("FORMA1");
		System.out.println("------");
		System.out.println(Arrays.toString(arrNombre));
		
		System.out.println("");
		
		System.out.println("FORMA2");
		System.out.println("------");
		for (int x =0; x < arrNombre.length; x++)
			System.out.println("Nombre " + (x+1) + ":"  + arrNombre[x]);
		
		System.out.println("");
		
		System.out.println("FORMA3");
		System.out.println("------");
		int n =1;
		for (String nombre:arrNombre) { 
			System.out.println("Nombre: "+ n + ":"+ nombre);
			n++;
		}

	}

}