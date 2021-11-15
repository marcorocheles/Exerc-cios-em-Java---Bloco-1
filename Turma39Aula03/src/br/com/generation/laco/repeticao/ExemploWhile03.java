package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		int numero = -1;
		
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			
		}
		read.close();
	}

}
