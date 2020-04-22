package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double media = sum / n;
		
		System.out.println("Media: " + media);
		
		
		sc.close();
			
	}

}