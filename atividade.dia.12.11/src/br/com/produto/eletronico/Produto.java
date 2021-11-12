package br.com.produto.eletronico;

public class Produto {
	
	private String cor;
	private String modelo;
	private int anoFabricacao;
	
	void oModelo() {
		System.out.println("O modelo deste produto é " + modelo);
	}
	
	void compra() {
		System.out.println("O modelo do produto é " + modelo + " da cor "  + cor + 
							". Parabens pela aquisição.");
	}
	
	void registro() {
		System.out.println("Acessando o registro do produto. ");
		System.out.printf("O produto " + modelo + ". Fabricado no ano " + anoFabricacao + 
							" possui a cor " + cor);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
}
