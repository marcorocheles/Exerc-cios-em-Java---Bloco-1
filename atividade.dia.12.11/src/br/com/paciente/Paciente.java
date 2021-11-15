package br.com.paciente;

public class Paciente {

	private String nome;
	private String problema;
	private int id;
	
	void cadastro () {
		System.out.println("O paciente " + nome + " está cadastrado sob o ID nº " + id + ".");
	}
	void estado () {
		System.out.println("O paciente " + nome + " encontra-se no setor de " + problema + 
			            	". Dirija-se até o setor para o encontrar.");
	}
	void saida() {
		System.out.println("O paciente " + nome + " sob o ID nº " + id + " está recebendo alta.");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
