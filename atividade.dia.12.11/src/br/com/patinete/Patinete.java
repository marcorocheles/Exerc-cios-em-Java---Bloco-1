package br.com.patinete;

public class Patinete {

	private String dono;
	private String cor;
	private int distancia;
	
	
	void corrida() {
		System.out.println(dono + ", seu patinete percorreu " + distancia + 
				           " metros! Isso é impressionante!");
	}
	
	void cadastroCorrida() {
		
		System.out.println("Parabéns, " + dono + " você se inscreveu na corrida de patinetes.");
	}
	
	void compra () {
		System.out.println("Parabéns pela aquisição, " + dono + ". Agora você possui um patinete da cor " + cor 
				           + ".\nEsperamos que goste do seu novo produto!");
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	

	
	
}


