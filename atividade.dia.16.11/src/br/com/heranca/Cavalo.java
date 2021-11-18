package br.com.heranca;
public class Cavalo extends Animal implements InterfaceAnimal {

	@Override
	public void emitirSom() {
		System.out.println("O som que o cavalo emite � um relincho: inhuru.");	
	}

	@Override
	public void quadrupede() {	
		System.out.println("O cavalo � capaz de correr.");
	}
	
}
