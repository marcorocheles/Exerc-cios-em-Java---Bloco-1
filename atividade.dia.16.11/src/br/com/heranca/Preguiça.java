package br.com.heranca;
public class Pregui�a extends Animal implements InterfaceAnimal{

	@Override
	public void emitirSom() {
		
		System.out.println("O som que a pregui�a emite � um som indefinido: nha.");
		
	}

	@Override
	public void quadrupede() {
		
		System.out.println("A pregui�a � capaz de escalar �rvores.");
		
	}

	
	
}
