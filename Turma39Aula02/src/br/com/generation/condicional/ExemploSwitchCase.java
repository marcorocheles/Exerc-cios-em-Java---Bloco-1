package br.com.generation.condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Escreva uma letra a e d: ");
		String letra = read.next();
		
		switch(letra) {
		case "a":
			System.out.println("Anny");
		break;
		case "b":
			System.out.println("Bruno");
		break;
		case "c":
			System.out.println("Camila");
		break;
		case "d":
			System.out.println("Danilo");
		break;
		default:
			System.out.println("Opção inválida!");
		break;
		}
		
		read.close();
	}

}
