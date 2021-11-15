package br.com.patinete;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete ();
		Patinete patinete2 = new Patinete ();
		Patinete patinete3 = new Patinete ();
		
		patinete1.setDistancia(600);
		patinete1.setCor("Rosa");
		patinete1.setDono("Caie Motinhe");
		
		patinete2.setDistancia(20);
		patinete2.setCor("Roxo");
		patinete2.setDono("Belugue Cardoso");
		
		patinete3.setDistancia(3000);
		patinete3.setCor("Tanque de Guerra");
		patinete3.setDono("Mactravish Pinto");
		
		
		System.out.println("\nCadastro patinete 1: ");
		patinete1.cadastroCorrida();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Cadastro e colocação Patinete 2:");
		patinete2.cadastroCorrida();
		patinete2.corrida();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Compra de novo patinete:");
		patinete3.compra();
		
	}

}
