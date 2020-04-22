/* Esse programa le o nome de um produto, o preco e a quantidade e exibe
 * para o usuário o que foi Lido. Além disso possui 2 funções para adicionar
 * e remover quantidades daquele produto do estoque.
 *	
 *
 */

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto product = new Produto();
		System.out.println("Digite os dados do produto:");
		
		System.out.print("Nome: ");
		product.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		product.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.print("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos que você vai adicionar no estoque: ");
		int quantidade = sc.nextInt();
		
		product.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.print("Produto atualizado: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos que você vai remover no estoque: ");
		quantidade = sc.nextInt();
		
		product.removerProduto(quantidade);
		
		System.out.println();
		System.out.print("Produto atualizado: " + product);
		
		
		sc.close();
	}

}
