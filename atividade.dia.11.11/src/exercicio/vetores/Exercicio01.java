package exercicio.vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double[] notas = new double[4];
		double maiorNota = 0.0;
		int i;

		System.out.println("Digite as quatro notas do Aluno: ");

		for (i = 0; i < 4; i++) {

			System.out.println("Insira a " + (i + 1) + "º nota: ");
			notas[i] = read.nextDouble();

			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}

			System.out.println("A nota inserida é: " + notas[i] + "\n");
		}

		System.out.println("A maior nota dentre as apresentadas é: " + maiorNota);
		read.close();
	}

}
