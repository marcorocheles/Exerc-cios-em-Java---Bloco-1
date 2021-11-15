package br.com.conta.bancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();		
		ContaBancaria conta2 = new ContaBancaria();	
		ContaBancaria conta3 = new ContaBancaria();	
		
		conta1.setDeposito(500);
		conta1.setNome("Augusto Andrazzo");
		conta1.setSaldo(3500);
		
		conta2.setDeposito(2500);
		conta2.setNome("Laura Masamune");
		conta2.setSaldo(1000);
		
		conta3.setDeposito(3000);
		conta3.setNome("Sophie Luz");
		conta3.setSaldo(8200);
		
		System.out.println("\nConferindo o saldo:");
		conta1.conta();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Realizando um depósito");
		conta2.depositar();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Realizar um saque?");
		conta2.saque();
	}

}
