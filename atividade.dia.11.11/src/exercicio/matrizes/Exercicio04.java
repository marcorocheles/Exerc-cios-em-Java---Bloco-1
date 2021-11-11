package exercicio.matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int[][] notas = new int[3][3];
		int somaDiagonal = 0, soma = 0;
		int i = 1;

		for (int l = 0; l < notas.length; l++) {
			for (int c = 0; c < notas[l].length; c++) {

				System.out.printf("Insira a " + i++ + "ª nota: ");
				notas[l][c] = read.nextInt();
				soma += notas[l][c];

				if (l == c) {
					somaDiagonal += notas[l][c];
				}
			}
		}

		System.out.println("\nA tabela de notas inseridas é: ");
		for (int l = 0; l < notas.length; l++) {
			for (int c = 0; c < notas[l].length; c++) {
				System.out.print(" | " + notas[l][c] + " | ");
			}
			System.out.println();
		}

		System.out.println("\nA soma dos valores da matriz é: " + soma);
		System.out.println("A soma dos valores em diagonal é: " + somaDiagonal);
		read.close();

	}

}
