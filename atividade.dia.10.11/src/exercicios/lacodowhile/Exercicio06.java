package exercicios.lacodowhile;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int numero, media = 0, multiplos, contador = 0;
		
		
		do {
			
			System.out.println( "Insira um numero para sabermos se � m�ltiplo de 3 e fazermos a m�dia. Para sair digite 0. " ); //aqui o usu�rio insere o n�mero. vamos ler e checar 
			numero = read.nextInt();
			
			multiplos = numero % 3; //apos ler o numero usamos a variavel multiplos para filtrar multiplos de 3 usando a opera��o resto
			
			if (multiplos == 0) { //o n�mero inserido s� ser� multiplo de 3 se o resultado de resto for igual a 0
				
				media += numero; //aqui armazena-se na variavel m�dia o numero inserido + numeros futuros
				contador++; //esse contador servir� para fazer a m�dia, pois ele que dir� quantas vezes essa condi��o foi acessada
				
				if (numero == 0) {
					contador --; // essa condi��o s� � criada para que o 0 que seja usado para sair do loop interfira na m�dia
				}
			}
			
		}
		
		while(numero != 0); //para sair do codigo o 0 funciona como condi��o. qualquer outro numero al�m dele ser� aceito
		
		media = media / contador; //aqui chegamos na conta final. a variavel m�dia que somou todos os numeros aceitos pela condi��o ser� dividida pelo contador que mostra quantas vezes o m�dia foi acessado
		System.out.println("A m�dia dos n�meros inseridos multiplos de 3 �: " + media);
		
		read.close();

	}

}
