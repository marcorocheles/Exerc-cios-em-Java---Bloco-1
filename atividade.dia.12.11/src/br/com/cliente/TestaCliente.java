package br.com.cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		//Aqui ocorrerá a atribuição de valores aos atributos
		cliente1.nome = "Juarez Sanches";
		cliente1.idade = 40;
		cliente1.cpf = "045.817.264-55";
		
		cliente2.nome = "Maria Nocedo";
		cliente2.idade = 25;
		cliente2.cpf = "487.851.421-35";
		
		cliente3.nome = "Carlos Roberto";
		cliente3.idade = 55;
		cliente3.cpf = "005.521.543";
		
		System.out.println(cliente1.nome);
	    System.out.println(cliente1.idade);
	    System.out.println(cliente1.cpf +"\n");
	    cliente1.cadastro();		
		
	    System.out.println("=================\n");
	    
	    System.out.println(cliente2.nome);
	    System.out.println(cliente2.idade);
	    System.out.println(cliente2.cpf +"\n");
	    cliente2.idade();
	    cliente2.cadastro();
		
	    System.out.println("=================\n");
	    
	    System.out.println(cliente3.nome);
	    System.out.println(cliente3.idade);
	    System.out.println(cliente3.cpf +"\n");
	    cliente3.comprar();
	    cliente3.idade();
	    cliente3.cadastro();
	    
	}

}
