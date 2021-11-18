package br.com.heranca;
public class Preguiça extends Animal implements InterfaceAnimal{

	@Override
	public void emitirSom() {
		
		System.out.println("O som que a preguiça emite é um som indefinido: nha.");
		
	}

	@Override
	public void quadrupede() {
		
		System.out.println("A preguiça é capaz de escalar árvores.");
		
	}

	
	
}
