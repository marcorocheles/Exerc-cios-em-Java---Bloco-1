package br.com.cliente;

public class Cliente {

	String nome;
	String cpf;
	int idade;
	
	void comprar () {
		System.out.println("Cliente comprar� um caderno");
	}
	
	void cadastro () {
		System.out.println("O cliente " + nome + " est� cadastrado sob o CPF: " + cpf);
	}
	
	void idade () {
		
		if(idade >= 40) {
			System.out.println("O cliente tem mais de 40 anos. Oferecer plano de assinatura 1. ");
		}
		else {
			System.out.println("O cliente tem menos de 40 anos. Ofere�a o plano de assinatura 2.");
		}
		
	}
}
