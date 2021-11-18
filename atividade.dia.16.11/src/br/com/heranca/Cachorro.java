package br.com.heranca;
public class Cachorro extends Animal implements InterfaceAnimal{


	@Override
	public void emitirSom() {
		System.out.println("O som que o cachorro emite é um latido: au au.");
		
	}

	@Override
	public void quadrupede() {
		System.out.println("O cachorro é capaz de correr.");
		
	}
	
}
