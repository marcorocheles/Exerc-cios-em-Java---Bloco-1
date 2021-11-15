package br.com.funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario funcionario1 = new Funcionario ();
		Funcionario funcionario2 = new Funcionario ();
		Funcionario funcionario3 = new Funcionario ();
		
		funcionario1.setId(125);
		funcionario1.setIdade(29);
		funcionario1.setNome("Fernando Hernandez");
		funcionario1.setSetor("Caixa");
		
		funcionario2.setId(250);
		funcionario2.setIdade(35);
		funcionario2.setNome("Maria de Castro");
		funcionario2.setSetor("Padaria");
		
		funcionario3.setId(450);
		funcionario3.setIdade(24);
		funcionario3.setNome("Vinicios Tiabueno");
		funcionario3.setSetor("Marketing");
		
		System.out.println("\nConferindo cadastro do funcionário 1:");
		funcionario1.cadastro();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Conferindo o setor do funcionário 2:");
		funcionario2.funcaoSetor();
		
		System.out.println("\n===========================\n");
		
		System.out.println("O funcionário do mês!");
		funcionario3.funcionarioDoMes();
	}

}
