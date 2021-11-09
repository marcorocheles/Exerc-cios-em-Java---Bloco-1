import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Insira o valor dos 3 números.");
		System.out.println("Entre com o primeiro número: ");
		a = read.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		b = read.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		c = read.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior número inserio é: " + a);
		}
		else if (b > a && b > c) {
			System.out.println("O maior número inserio é: " + b);
		}
		else {
			System.out.println("O maior número inserio é: " + c);
		}
		
		read.close();

	}

}
