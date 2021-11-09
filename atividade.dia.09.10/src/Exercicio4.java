import java.util.Scanner;

public class Exercicio4 {

	/*
	 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.
	 */
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double numero, parImpar, raiz, quadrado;
		
		System.out.println("Insira o n�mero desejado: ");
		numero = read.nextInt();
		
		parImpar = numero % 2;
		
		if(parImpar == 0) {
			
			raiz =  Math.sqrt(numero);
			System.out.println("O n�mero " + numero + " � par e sua raiz �: " + raiz);
			
		}
		else {
			
			quadrado = Math.pow(numero, 2);
			System.out.println("O n�mero " + numero + " � impar e sua pot�ncia ao quadrado �: " + quadrado);
			
		}
		
		read.close();
	}

}
