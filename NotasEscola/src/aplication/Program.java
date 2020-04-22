package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		System.out.println("Digite suas notas: ");
		notas.a = sc.nextDouble();
		notas.b = sc.nextDouble();
		notas.c = sc.nextDouble();
		
		if(notas.soma() > 60) {
			System.out.println("Voce foi aprovado " + notas.soma());
		}else {
			System.out.println("Você foi reprovado " + notas.soma());
			double resultado = 60 - (notas.a + notas.b + notas.c);
			System.out.println("Faltaram " + resultado + "pontos");
		}
		
		sc.close();
		
	}
}