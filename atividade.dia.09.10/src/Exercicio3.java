import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner read = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Olá, insira sua idade para descobrir em qual categoria você se encaixa: ");
		idade = read.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é a Infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é a Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria é a Adulta.");
		}
		else {
			System.out.println("Desculpe, mas você se encaixa em nenhuma categoria.");
		}
		
		read.close();
	}

}
