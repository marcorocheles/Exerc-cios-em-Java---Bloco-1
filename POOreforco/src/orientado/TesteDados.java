package orientado;

public class TesteDados {

	public static void main(String[] args) {
		
		//instanciar a classe
		//Classe apelidoDaClasse = new Classe ();
		
		Fisica f = new Fisica();
		
		System.out.println("\n===========================\n");
		
		f.setNome("Zezinho");
		f.setIdade(27);
		f.setCpf("045.487.359.48");
		f.setEmail("zezinho@gmail.com");
		String texto = f.dadosCompletos();
		
		Juridica j = new Juridica();
		j.setNome("O mais doce");
		j.setEmail("contato@omais.com.br");
		j.setCnpj("54.515.247.1745");
		j.setTelefone(1185471245);
		String textoJuridica = j.dadosJuridica();
		
		//==============================================
		
		System.out.println(texto);
		
		System.out.println("\n===========================\n");
		
		System.out.println(textoJuridica);
	
	}

}
