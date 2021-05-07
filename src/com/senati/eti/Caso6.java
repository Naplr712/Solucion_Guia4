package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// Declarar y asignar calores en la Matriz 2x3 (2 filas y 3 columnas)
		String[][] mDatos = { {"Joe Castillo", "Rosa Alvarez", "Carlos Santos"},
				              {"Callao", "Comas", "San Miguel"}	};
		
		System.out.println("\nIMPRESIÓN DE VALORES POR FILAS");
		System.out.println("------------------------------");
		for (int f = 0; f < mDatos.length; f++) {
			for (int c = 0; c < mDatos[0].length; c++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		}
		
		System.out.println("\nIMPRESIÓN DE VALORES POR COMUMNAS");
		System.out.println("------------------------------");
		for (int f = 0; f < mDatos.length; f++) {
			for (int c = 0; c < mDatos[0].length; c++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		}
	}
}
