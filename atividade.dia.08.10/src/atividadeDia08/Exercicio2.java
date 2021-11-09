package atividadeDia08;

import java.util.Scanner;

public class Exercicio2 {
	
	/*
	 * Exercício 2
	 * Marco Rocheles
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int diasTotais, anos, meses, dias;
		
		System.out.println("Vamos transformar seus dias de vida em anos, meses e dias. Quantos dias totais de vida você tem?");
		diasTotais = leia.nextInt();
		
		anos = diasTotais / 365;
		meses = (diasTotais % 365) / 30;
		dias = (diasTotais % 365) % 30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias!");
		leia.close();
		
		
		

	}

}
