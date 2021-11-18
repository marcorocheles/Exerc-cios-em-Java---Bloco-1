package orientado;

public class Juridica extends Dados{
	
	private String cnpj;
	private int telefone;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String dadosJuridica () {
		
		return "O nome é: " + getNome() + " | CNPJ: " + getCnpj() + " |\nE-mail: " + getEmail() + 
				" | Telefone: " + getTelefone();
		
	}
	
}
