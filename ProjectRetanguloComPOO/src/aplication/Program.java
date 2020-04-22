package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		
		x = new Retangulo();
		
		System.out.println("Qual a altura do retangulo? ");
		
		x.a = sc.nextDouble();
		
		System.out.println("Qual a largura do retangulo? ");
		
		x.b = sc.nextDouble();
		
		System.out.println("Area: " + x.area());
		System.out.println("Perimetro: " + x.perimetro());
		System.out.println("Diagonal: " + x.diagonal());
		
		
		sc.close();
		
		
	}
}