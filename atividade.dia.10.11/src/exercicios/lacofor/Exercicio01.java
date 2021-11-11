package exercicios.lacofor;

public class Exercicio01 {
	
	/*
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5.
	 */
	
	public static void main(String[] args) {
		
		int resto;
		
		System.out.println("Os seguintes números se divididos por 11 terão um resto igual a 5 como resultado: ");
		
		for (int inicio = 1000; inicio <= 1999; inicio++) {
			
			resto = inicio % 11;
			
			if(resto == 5) {
				
				System.out.println(inicio);
				
			}
			
		}

	}

}
