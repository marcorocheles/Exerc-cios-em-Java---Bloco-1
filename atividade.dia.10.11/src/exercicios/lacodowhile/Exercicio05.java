package exercicios.lacodowhile;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int numeroInserido, soma = 0;
		
		do {
			
			System.out.println( "Insira um numero para acrescentar na soma. Para sair digite 0. " );
			numeroInserido = read.nextInt();
			soma += numeroInserido;
			
		}
		
		while(numeroInserido != 0);
		
		System.out.println("A soma dos n�meros inseridos �: " + soma);
		
		read.close();
	}
	

}
