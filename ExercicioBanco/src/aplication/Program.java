package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;


public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Banco banco;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Tem deposito inicial? (Y/N) "); 
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Digite o valor inicial: ");
			double valorinicial = sc.nextDouble();
			banco = new Banco(numero, titular, valorinicial);
		}else {
			banco = new Banco(numero, titular);
		}
		
		System.out.println();
		System.out.println("Informacoes da conta: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valordodeposito = sc.nextDouble();
		
		banco.depositar(valordodeposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(banco);
		
		
		System.out.println();
		System.out.print("Digite um valor para sacar: ");
		double valordosaque = sc.nextDouble();
		
		banco.retirar(valordosaque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(banco);
		
		sc.close();
	
	}
}
