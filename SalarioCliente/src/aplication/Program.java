/*
 * Esse programa pega o nome do cliente, salario bruto e imposto. A partir
 * desses dados ele calcula o salario liquido e retorna. Também retorna o
 * salário liquido do cliente a partir de uma porcentagem acrescida 
 * pelo usuário ao salario bruto.
 */
package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("Nome do cliente: ");
		cliente.nome = sc.nextLine();
		
		System.out.println("Salario Bruto: ");
		cliente.salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto: ");
		cliente.imposto = sc.nextDouble();
		
		System.out.println(cliente);
		
		System.out.println("Qual a porcentagem que vai acrescentar? ");
		double porcentagem = sc.nextDouble();
		
		cliente.acressimoSalario(porcentagem);
		
		System.out.println(cliente);
		
		
		
		sc.close();
	}
	
}
