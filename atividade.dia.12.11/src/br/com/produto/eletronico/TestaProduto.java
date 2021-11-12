package br.com.produto.eletronico;

public class TestaProduto {

	public static void main(String[] args) {
		
		/*
		 * criação dos objetos
		 */
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		/*atribuindo os valores aos atributos declarados do objeto
		 * neste caso o valor está sendo atribuido diretamente. caso queira um valor do scanner
		 * insira entre os () a variavel lida pelo scanner. como a classe é privada, deve-se usar
		 * .set para alterar a variavel global
		 */
		
		produto1.setAnoFabricacao(2020);
		produto1.setCor("Vermelho");
		produto1.setModelo("Xiaomi Redmi Note 9");
		
		produto2.setAnoFabricacao(2020);
		produto2.setCor("Preto");
		produto2.setModelo("iPhone XR");
		
		produto3.setAnoFabricacao(2021);
		produto3.setCor("Azul");
		produto3.setModelo("iPhone 13");
		
		/*
		 * Aqui apresentaremos cada objeto. usando objeto.getVariavel();
		 * trazemos a variavel inserida acima.
		 * depois apresentamos metodos inseridos na classe anterior
		 */
		
		System.out.println(produto1.getModelo());
		System.out.println();
		produto1.registro();
		
		System.out.println("\n\n===========================\n");
		
		System.out.println("Novo produto adquirido.");
		System.out.println();
		produto1.compra();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Checando o modelo do produto.");
		System.out.println();
		produto1.oModelo();
		
	}

}
