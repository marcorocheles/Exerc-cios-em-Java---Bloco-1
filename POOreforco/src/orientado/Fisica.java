package orientado;

public class Fisica extends Dados{
	
	public Fisica () {
		System.out.println("Fisica presente");
	}
	
	private String cpf;
	private int idade;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String dadosCompletos () {
		
		return "O nome é: " + getNome() + " | Idade: " + getIdade() + " |\nE-mail: " + getEmail() + 
				" | CPF: " + getCpf();
		
	}
}
