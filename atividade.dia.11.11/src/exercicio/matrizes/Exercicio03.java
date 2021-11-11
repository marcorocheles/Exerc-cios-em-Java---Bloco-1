package exercicio.matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		int l = 0, c = 0;

		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n1[l].length; c++) {

				System.out.println("Digite os valores da matriz N1: ");
				n1[l][c] = read.nextInt();

				System.out.println("Digite os valores da matriz N2: ");
				n2[l][c] = read.nextInt();

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}
		}

		System.out.println("\nSoma das matrizes N1 e N2, a Matriz M1: ");
		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n1[l].length; c++) {
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println();
		}

		System.out.println("\nDiferença das posições das matrizes N1 e N2, a Matriz M2: ");
		for (l = 0; l < n2.length; l++) {
			for (c = 0; c < n2[l].length; c++) {
				System.out.print(m2[l][c] + " | ");
			}
			System.out.println();
		}

		read.close();

	}

}
