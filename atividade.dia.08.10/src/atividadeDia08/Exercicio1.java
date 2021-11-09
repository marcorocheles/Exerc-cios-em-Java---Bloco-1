package atividadeDia08;

import java.util.Scanner;

/*
 * Marco Rocheles
 * Atividade 1
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		
		Scanner leia = new Scanner (System.in);
				
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses? ");
		meses = leia.nextInt();
		
		System.out.println("E quantos dias? ");
		dias = leia.nextInt();
		
		int resultado = (anos * 365 ) + (meses * 30 ) + dias;
		
		System.out.println("Transformando sua idade em dias, você tem " + resultado + " dias. :)");
		leia.close();
		
	}

}
