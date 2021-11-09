package atividadeDia08;

import java.util.Scanner;

public class Exercicio5 {
	
	/*Questão 5
	 * Nome: Marco Rocheles
	*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double nota1, nota2, nota3, notaFinal;
		
		System.out.println("Insira a nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Insira a nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Insira a nota 3: ");
		nota3 = leia.nextDouble();
		
		notaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 + 5)) / ( 2 + 3 + 5);
		System.out.println("Sua média é: " + notaFinal);
		
		leia.close();
		
		
		

	}

}
