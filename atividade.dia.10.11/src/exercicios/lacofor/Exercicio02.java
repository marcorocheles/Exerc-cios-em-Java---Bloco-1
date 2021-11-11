package exercicios.lacofor;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int sobra, numero, numerosPar = 0, numerosImpar = 0;
		
		for (int iniciador = 1; iniciador <= 10; iniciador++) {
			
			System.out.println("Insira o " + iniciador + "º número: ");
			numero = read.nextInt();
			
			sobra = numero % 2;
			
			if (sobra == 0) {
				
				numerosPar++;
				
			}
			else {
				
				numerosImpar++;
				
			}
			
		}
		
		System.out.println("A quantidade de números pares é " + numerosPar + " e de impares é " + numerosImpar);
		
		read.close();
	}
	
}
