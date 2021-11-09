package atividadeDia08;

import java.util.Scanner;

public class Exercicio4 {
	
	
	 /* Questão 4
		Nome: Marco Rocheles
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Insira o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o valor de C:");
		c = leia.nextDouble();
		
		r = (int) Math.pow((a + b), 2.0);
		s = (int) Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão é: " + d);
		leia.close();
		
	}

}
