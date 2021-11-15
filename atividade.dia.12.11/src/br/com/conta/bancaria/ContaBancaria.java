package br.com.conta.bancaria;

public class ContaBancaria {

	private String nome;
	private int saldo;
	private int deposito;
	
	void conta () {
		System.out.println("Olá, " + nome + ". Seu saldo em conta é: R$" + saldo);
	}
	void depositar () {
		System.out.println("Olá, " + nome + ". Insira o valor do depósito na sua conta: " + deposito);
		System.out.println("Seu saldo atual é: R$" + (saldo += deposito));
	}
	void saque () {
		System.out.println("Olá, " + nome + ". Seu saldo em conta é: " + saldo + 
							". Gostaria de fazer um saque?");	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	
}
