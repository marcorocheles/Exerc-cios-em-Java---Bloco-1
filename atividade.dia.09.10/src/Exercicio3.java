import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner read = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Ol�, insira sua idade para descobrir em qual categoria voc� se encaixa: ");
		idade = read.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria � a Infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria � a Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria � a Adulta.");
		}
		else {
			System.out.println("Desculpe, mas voc� se encaixa em nenhuma categoria.");
		}
		
		read.close();
	}

}
