package br.com.paciente;

public class TestePaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente ();
		Paciente paciente2 = new Paciente ();
		Paciente paciente3 = new Paciente ();
		
		paciente1.setNome("Carlos Nuchakuas");
		paciente1.setProblema("Traumatismo");
		paciente1.setId(24854);
		
		paciente2.setNome("Ryan Esposito");
		paciente2.setProblema("Emergência");
		paciente2.setId(15471);
		
		paciente3.setNome("Owmyr Nephew");
		paciente3.setProblema("Cirurgia");
		paciente3.setId(854541);
		
		System.out.println("\nConferindo o estado do paciente 1");
		paciente1.estado();
		
		System.out.println("\n===========================\n");
		
		System.out.println("Checando o cadastro do paciente 2");
		paciente2.cadastro();
		
		System.out.println("\n===========================\n");

		System.out.println("Dando alta para o paciente 3");
		paciente3.saida();
		

	}

}
