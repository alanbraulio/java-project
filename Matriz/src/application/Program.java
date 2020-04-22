package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // Estamos instanciando a matriz na memoria
		
		for(int i = 0; i<n; i++) { // For para percorrer as linhas
			for(int j = 0; j<n; j++) { // For para percorrer as colunas
				mat[i][j] = sc.nextInt();
			}
		}
		// Ao digitar os numeros a matriz preenche linha por linha horizontal
		
		// Abaixo faremos um for que imprime a diagonal principal
		
		System.out.println("Diagonal principal: ");
		for(int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		// Funcao para imprimir os numeros negativos da matriz
		
		System.out.println();
		
		int count = 0;
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Numeros negativos: " + count);
		
		sc.close();
	}

}
