package br.com.estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarEstoque {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList <Estoque> produtos = new ArrayList();
		
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
		
		for (Estoque estq : produtos) {
			System.out.println("\n======================\n");
			System.out.println(estq);
		}
		
		read.close();
		
	}
	
}
