package br.com.funcionario;

import java.util.Random;

public class Funcionario {
	Random random = new Random ();
	
	
	private String nome;
	private int idade;
	private String setor;
	private int id = random.nextInt(100);
	
	void cadastro() {
		System.out.println("O funcion�rio " + nome + " tem " + idade + " anos. � oper�rio do setor de " 
							+ setor + " est� cadastrado sob o ID: " + id);
	}
	
	void funcaoSetor () {
		System.out.println("O funcion�rio " + nome + ", trabalha no setor da " + setor + ".");
	}
	
	void funcionarioDoMes () {
		
		System.out.println("Parab�ns, " + nome + " voc� � o novo funcion�rio do m�s!\n"
							+ "Passe no setor de Recursos Humanos para receber seus benef�cios.");
	}
	
	
	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	
}
