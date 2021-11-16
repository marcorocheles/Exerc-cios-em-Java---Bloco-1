package br.com.heranca;
public class TestaAnimais {

	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a preguica = new Pregui�a();
		
		
		cachorro.setNome("Doguinho");
		cachorro.setIdade(07);
		cachorro.setSom("Bark");
		
		cavalo.setNome("Horseman");
		cavalo.setIdade(12);
		cavalo.setSom("Relinchar");
		
		preguica.setNome("Preguincinha");
		preguica.setIdade(04);
		preguica.setSom("Nha");
		
		
		System.out.println("===================================\n");
		
		System.out.println("Cachorro:");
		System.out.println("O nome do cachorro � " + cachorro.getNome());
		System.out.println("Tem " + cachorro.getIdade() + " anos de idade.");
		System.out.println("Seu som � " + cachorro.getSom());
		cachorro.corre();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Cavalo:");
		System.out.println("O nome do cavalo � " + cavalo.getNome());
		System.out.println("Tem " + cavalo.getIdade() + " anos de idade.");
		System.out.println("Seu som � " + cavalo.getSom());
		cavalo.corre();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Pregui�a:");
		System.out.println("O nome do bicho-pregui�a � " + cachorro.getNome());
		System.out.println("Tem " + cachorro.getIdade() + " anos de idade.");
		System.out.println("Seu som � " + cachorro.getSom());
		preguica.sobeArvore();

	}

}
