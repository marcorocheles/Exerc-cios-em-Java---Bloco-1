package atividadeDia08;

import java.util.Scanner;

public class Exercicio6 {
	
	/*Questão 6
	* Nome: Marco Rocheles
	*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		System.out.println("Insira os valores dos primeiros pontos. ");
		System.out.println("Digite o valor do ponto X: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor do ponto Y: ");
		y1 = leia.nextDouble();
	
		
		System.out.println("Insira os valores dos segundos pontos. ");
		System.out.println("Digite o valor do ponto X: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor do ponto Y: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt((p1 + p2));
		
		System.out.println("A distância entre os dois pontos é: " + d);
		leia.close();
		
		

	}

}
