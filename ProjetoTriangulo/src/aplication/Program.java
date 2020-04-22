package aplication;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com os valores do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com os valores do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY-yA) * (pY-yB) * (pY-yC));
		
		System.out.println("Area do triangulo X: "+ areaX);
		System.out.println("Area do triangulo Y: "+ areaY);
		
		if(areaX > areaY) {
			System.out.println("O triangulo X é maior");
		}else {
			System.out.println("O triangulo Y é maior");
		}
		
		
		
		
	}

}
