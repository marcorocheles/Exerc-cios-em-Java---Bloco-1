import java.util.Scanner;

public class Exercicio2 {
		
		/*
		 * Marco Rocheles
		 * Exerc�cio 2
		 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		System.out.println("Iremos colocar 3 n�meros em ordem crescente. Insira os numeros.");
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = read.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		numero2 = read.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		numero3 = read.nextInt();
		
		if (numero1 < numero2 && numero1 < numero3) {
			if(numero2 > numero3) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero1 + ", " + numero3 + ", " + numero2 + ".");
			}
			else if(numero2 < numero3) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero1 + ", " + numero2 + ", " + numero3 + ".");
			}
		}
		
		else if (numero2 < numero1 && numero2 < numero3) {
			if(numero1 > numero3) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero2 + ", " + numero3 + ", " + numero1 + ".");
			}
			else if(numero1 < numero3) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero2 + ", " + numero1 + ", " + numero3 + ".");
			}
		}
		
		else if (numero3 < numero1 && numero3 < numero2) {
			if(numero2 > numero1) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero3 + ", " + numero1 + ", " + numero2 + ".");
			}
			else if(numero2 < numero1) {
				System.out.println("A ordem crescente dos n�meros inseridos �: " + numero3 + ", " + numero2 + ", " + numero1 + ".");
			}
		}
		
		read.close();
	
	}

}
