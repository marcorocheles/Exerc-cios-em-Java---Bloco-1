package br.com.generation.laco.repeticao;

public class ExemploWhile2 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 10;
		
		while(contador >= 0) {
			System.out.println("Repeti��o n�mero " + contador);
			contador--;
			Thread.sleep(100);
		}

	}

}
