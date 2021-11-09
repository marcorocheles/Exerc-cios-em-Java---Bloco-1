package br.com.generation.condicional;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
				
		double imc;
		double pesoQuilogramas = 0.0;
		double alturaMetros = 0.0;
		
		System.out.println("Digite o peso: ");
		pesoQuilogramas = read.nextDouble();
		
		System.out.println("Digite a altura");
		alturaMetros = read.nextDouble();
		
		imc = pesoQuilogramas / (alturaMetros * alturaMetros);
		
		System.out.println("\nValores do IMC");
		
		System.out.println("Abaixo do Peso: menos que 18,5.");
		System.out.println("Normal: entre 18,5 e 24,9.");
		System.out.println("Sobrepeso: entre 25,0 e 29,9");
		System.out.println("Obeso: acima de 30,0.");
		System.out.println("\nSeu IMC é: " + imc);
		
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Você está no peso normal!");
		}
		if(imc >= 25.0 && imc <=29.9) {
			System.out.println("Você está com sobrepeso!");
		}
		else {
			System.out.println("Você está obeso!");
		}
		
		read.close();
		

	}

}
