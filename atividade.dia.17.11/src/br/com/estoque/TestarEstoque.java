package br.com.estoque;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	
	
 *	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
 */

public class TestarEstoque {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList <Estoque> produtos = new ArrayList();
		
		//menu de lista
		int menu;
		
		System.out.println("Bem vindo ao Estoque.\n");
		
		do {
			
		System.out.println("Qual função você gostaria de realizar?"
				+ "\n1 - Adicionar produto."
				+ "\n2 - Remover"
				+ "\n3 - Atualizar um dado."
				+ "\n4 - Apresentar a lista"
				+ "\n0 - Sair do menu");
		menu = read.nextInt();

		System.out.println("");
		
		
			if (menu == 1) {
				
				System.out.println("Quantos produtos você quer inserir?");
				int totalEstoque = read.nextInt();
				
				for (int i = 0; i < totalEstoque; i++) {
					System.out.println("Digite o nome do produto: ");
					String produto = read.next();
					read.nextLine();
					
					System.out.println("Digite o ID do produto: ");
					int id = read.nextInt();
					
					produtos.add(new Estoque (produto, id));
					
				}
			}
			
			//Remover e Substituir estão errados, não sei fazer
			/*else if (menu == 2) {
				
				System.out.println("Insira o produto que você deseja remover");
				String remover = read.next();
				
				produtos.remove(produtos.indexOf(remover));
					
			}*/
			
			
			else if (menu == 4) {
				
				for (Estoque estq : produtos) {
					System.out.println("\n====================================\n");
					System.out.println(estq);
					System.out.println("\n====================================");
				}
				
			}
			
		}
		while ( menu != 0);
			
		
		for (Estoque estq : produtos) {
			
			System.out.println(estq);
				
			}

		
		}
	}

