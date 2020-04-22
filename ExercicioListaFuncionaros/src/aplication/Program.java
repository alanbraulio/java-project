package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Cliente> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("Quantos clientes vão ser registrados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Cliente #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id ja existe, tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Cliente(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Digite o id do cliente que sera aumentado: ");
		int id = sc.nextInt();
		Cliente emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Digite a percentagem: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("Lista de clientes:");
		for (Cliente obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<Cliente> list, int id) {
		Cliente emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

