package exercicios.lacodowhile;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int numero, media = 0, multiplos, contador = 0;
		
		
		do {
			
			System.out.println( "Insira um numero para sabermos se é múltiplo de 3 e fazermos a média. Para sair digite 0. " ); //aqui o usuário insere o número. vamos ler e checar 
			numero = read.nextInt();
			
			multiplos = numero % 3; //apos ler o numero usamos a variavel multiplos para filtrar multiplos de 3 usando a operação resto
			
			if (multiplos == 0) { //o número inserido só será multiplo de 3 se o resultado de resto for igual a 0
				
				media += numero; //aqui armazena-se na variavel média o numero inserido + numeros futuros
				contador++; //esse contador servirá para fazer a média, pois ele que dirá quantas vezes essa condição foi acessada
				
				if (numero == 0) {
					contador --; // essa condição só é criada para que o 0 que seja usado para sair do loop interfira na média
				}
			}
			
		}
		
		while(numero != 0); //para sair do codigo o 0 funciona como condição. qualquer outro numero além dele será aceito
		
		media = media / contador; //aqui chegamos na conta final. a variavel média que somou todos os numeros aceitos pela condição será dividida pelo contador que mostra quantas vezes o média foi acessado
		System.out.println("A média dos números inseridos multiplos de 3 é: " + media);
		
		read.close();

	}

}
