package atividadeDia08;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * Marco Rocheles
	 * Exercicio 3
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int segundosTotais, horas, minutos, segundos;
		
		System.out.println("Insira a dura��o do evento em segundos: ");
		segundosTotais = leia.nextInt();
		
		horas = segundosTotais / 3600;
		minutos = (segundosTotais % 3600) / 60;
		segundos = (segundosTotais % 3600) % 60;
		
		System.out.println("O evento durar� " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		leia.close();
				
		

	}

}
