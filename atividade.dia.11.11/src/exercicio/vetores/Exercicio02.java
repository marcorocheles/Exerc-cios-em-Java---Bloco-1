package exercicio.vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int[] dado = new int[10];
		int i;
		int maiorPont = 0, soma = 0, ocorrencia = 0;
		double media = 0.0;

		System.out.println("Insira o valor do dado correspondente ao lançamento efetuado: ");

		for (i = 0; i < 10; i++) {

			System.out.println("Insira o " + (i + 1) + "º valor: ");
			dado[i] = read.nextInt();

			soma += dado[i];

			if (dado[i] <= 6) {

				if (dado[i] > maiorPont) {

					maiorPont = dado[i];

				}
			}

			else {

				System.out.println("Insira um valor válido!\n");
				i--;
			}

			if (dado[i] == maiorPont) {
				ocorrencia++;

				if (dado[i] > maiorPont) {
					ocorrencia--;
				}
			}

		}

		media = soma / i;
		System.out.println("A média aritimética dos lançamentos é: " + media);
		System.out.println("O maior número dentre os informados é: " + maiorPont + " e seu total de ocorrências é de "
				+ ocorrencia + " vezes");
		read.close();

	}

}
