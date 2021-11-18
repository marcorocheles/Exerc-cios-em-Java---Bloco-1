package br.com.heranca;
public class TestaAnimais {

	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a preguica = new Pregui�a();
		
		
		cachorro.setNome("Doguinho");
		cachorro.setIdade(07);
		
		cavalo.setNome("Horseman");
		cavalo.setIdade(12);
		
		preguica.setNome("Preguincinha");
		preguica.setIdade(04);
		
		System.out.println("===================================\n");
		
		System.out.println("Cachorro:");
		System.out.println("O nome do cachorro � " + cachorro.getNome());
		System.out.println("Tem " + cachorro.getIdade() + " anos de idade.");
		cachorro.emitirSom();
		cachorro.quadrupede();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Cavalo:");
		System.out.println("O nome do cavalo � " + cavalo.getNome());
		System.out.println("Tem " + cavalo.getIdade() + " anos de idade.");
		cavalo.emitirSom();
		cavalo.quadrupede();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Pregui�a:");
		System.out.println("O nome do bicho-pregui�a � " + preguica.getNome());
		System.out.println("Tem " + preguica.getIdade() + " anos de idade.");
		preguica.emitirSom();
		preguica.quadrupede();

	}

}
