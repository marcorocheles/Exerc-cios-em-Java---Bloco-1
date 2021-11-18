package br.com.estoque;

public class Estoque {

	private String produto;
	private int id;
	
	public Estoque(String produto, int id) {
		super();
		this.produto = produto;
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Produto [Nome = " + produto + ", ID = " + id + "]";
	}
	
	
}
