package atividadeDia08;

import java.util.Scanner;

	/*Quest�o 8
	 * Nome: Marco Rocheles
	 */

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double distribuidor, impostos, precoFabrica, valorConsumidor;
		distribuidor = 1.28;
		impostos = 1.45;
		
		System.out.println("Entre com o custo de f�brica do carro: ");
		precoFabrica = leia.nextDouble();
		
		valorConsumidor = precoFabrica * distribuidor * impostos;
		
		System.out.println("O custo total do carro �: " + valorConsumidor);
		leia.close();
		
	}
}
