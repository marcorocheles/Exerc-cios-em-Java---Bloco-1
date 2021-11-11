package exercicios.lacowhile;

import java.util.Scanner;

public class Exercicio03 {
	
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.
	 */

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int idade, totalVinteUm = 0, totalCinq = 0;
		
		System.out.println("Entre com a idade. Para finalizar entre com -99. ");
		idade = read.nextInt();

		while (idade != -99) {
			
			idade = read.nextInt();
			
			if (idade <= 21) {
				
				totalVinteUm++;
				
			}
			else if (idade >= 50){
				totalCinq++;
			}
			
		}
		
		System.out.println("Dentre os números inseridos há um total de " + totalVinteUm + " pessoas com 21 anos e " +
				totalCinq + " com mais de 50 anos.");
		
		read.close();

	}

}
