package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrcodigo = {"A-123", "A-456", "A-789", "A159"};
		String[] arrnombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides", "Sara Montes"};
		int[] arrnota = {13, 8, 18, 10};
		
		String codigo = "";
		
		System.out.println("------------------------------------");
		System.out.println("COLEGIO SENATI - M�DULO DE BUSQUEDAS");
		System.out.println("------------------------------------");
		
		System.out.print("C�digo a buscar: ");
		codigo = sc.nextLine();
		
		// Realizar la b�squeda del c�digo en el arreglo arrcodigo
		int posicion = -1;
		
		for (int i = 0; i < arrcodigo.length; i++) {
			if (arrcodigo[i].equals(codigo)) {
				posicion = i;
				break;
			}
		}
		
		System.out.println("\nResultados");
		System.out.println("------------------------------------");
		
		if (posicion == arrcodigo.length) {
			// Codigo no se encontro
			System.out.println("\nC�digo no encontrado...");
		} else {
			System.out.println("Datos del Participante");
			System.out.println("----------------------");
			System.out.println("C�digo....: " + arrcodigo[posicion]);
			System.out.println("Nombre....: " + arrnombre[posicion]);
			System.out.println("Nota......: " + arrnota[posicion]);
			// Muestre un estado: Aprobado o desaprobado
			if (arrnota[posicion] >= 11)
				System.out.println("Estado.....: Aprobado");
			else
				System.out.println("Estado.....: Desaprobado");
		}
	}
}
