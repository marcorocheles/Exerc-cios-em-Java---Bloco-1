package exercicios.lacofor;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int sobra, numero, numerosPar = 0, numerosImpar = 0;
		
		for (int iniciador = 1; iniciador <= 10; iniciador++) {
			
			System.out.println("Insira o " + iniciador + "� n�mero: ");
			numero = read.nextInt();
			
			sobra = numero % 2;
			
			if (sobra == 0) {
				
				numerosPar++;
				
			}
			else {
				
				numerosImpar++;
				
			}
			
		}
		
		System.out.println("A quantidade de n�meros pares � " + numerosPar + " e de impares � " + numerosImpar);
		
		read.close();
	}
	
}
