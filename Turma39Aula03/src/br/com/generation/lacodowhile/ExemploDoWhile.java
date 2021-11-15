package br.com.generation.lacodowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println( i );
			i++;
			Thread.sleep(500);
		}
		while(i <= 10);
		

	}

}
