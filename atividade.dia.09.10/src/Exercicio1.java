import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Insira o valor dos 3 n�meros.");
		System.out.println("Entre com o primeiro n�mero: ");
		a = read.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		b = read.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		c = read.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior n�mero inserio �: " + a);
		}
		else if (b > a && b > c) {
			System.out.println("O maior n�mero inserio �: " + b);
		}
		else {
			System.out.println("O maior n�mero inserio �: " + c);
		}
		
		read.close();

	}

}
