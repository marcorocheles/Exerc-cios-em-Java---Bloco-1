package br.com.heranca;
public class TestaAnimais {

	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguica = new Preguiça();
		
		
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
		System.out.println("O nome do cachorro é " + cachorro.getNome());
		System.out.println("Tem " + cachorro.getIdade() + " anos de idade.");
		System.out.println("Seu som é " + cachorro.getSom());
		cachorro.corre();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Cavalo:");
		System.out.println("O nome do cavalo é " + cavalo.getNome());
		System.out.println("Tem " + cavalo.getIdade() + " anos de idade.");
		System.out.println("Seu som é " + cavalo.getSom());
		cavalo.corre();
		
		System.out.println("\n===================================\n");
		
		System.out.println("Preguiça:");
		System.out.println("O nome do bicho-preguiça é " + cachorro.getNome());
		System.out.println("Tem " + cachorro.getIdade() + " anos de idade.");
		System.out.println("Seu som é " + cachorro.getSom());
		preguica.sobeArvore();

	}

}
