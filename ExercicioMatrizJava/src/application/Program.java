package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		for(int i = 0; i<l; i++) { // For para percorrer as linhas
			for(int j = 0; j<c; j++) { // For para percorrer as colunas
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Qual numero deseja encontrar? ");
		int numero = sc.nextInt();
		
		for(int i = 0; i<l; i++) { // For para percorrer as linhas
			for(int j = 0; j<c; j++) { // For para percorrer as colunas
				if (matriz[i][j] == numero) {
					System.out.println("Position " + i + " , " + j);
					
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
