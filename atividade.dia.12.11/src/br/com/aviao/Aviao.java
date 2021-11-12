package br.com.aviao;

public class Aviao {

	String modelo;
	String voo;
	int passageiros;
	
	void tipoModelo () {
		System.out.println("O modelo do avião é " + modelo + ".");
	}
	
	void voar () {
			System.out.println("O tipo do voo do avião é " + voo);
	}
	
	void comportar() {
		System.out.println("O modelo " + modelo + " comporta " + passageiros + " passageiros.");
	}
}
