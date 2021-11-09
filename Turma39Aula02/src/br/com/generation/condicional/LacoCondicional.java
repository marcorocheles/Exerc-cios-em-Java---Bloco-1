package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);		
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0) {
			System.out.println("\nAprovado" + "\nMédia: " + media);	
		}
		else if(media >- 3.0 && media < 6.0) {
			System.out.println("\nRecuperação" + "\nMédia" + media);
		}
			
		else {
			System.out.println("\nReprovado." + "\nMédia: " + media);
		}
		
		leia.close();
		
	}

}
