package br.com.aviao;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		
		aviao1.modelo = "Boeing 737";
		aviao1.passageiros = 350;
		aviao1.voo = "Comercial";
		
		aviao2.modelo = "Boeing 157";
		aviao2.passageiros = 200;
		aviao2.voo = "Comercial";
		
		aviao3.modelo = "Airbus A320";
		aviao3.passageiros = 320;
		aviao3.voo = "Internacional";
		
		System.out.println(aviao1.modelo);
	    System.out.println(aviao1.passageiros);
	    System.out.println(aviao1.voo +"\n");
	    aviao1.tipoModelo();
	    aviao1.voar();
	    
	    System.out.println("===========================\n");
	    
	    System.out.println(aviao2.modelo);
	    System.out.println(aviao2.passageiros);
	    System.out.println(aviao2.voo +"\n");
	    aviao2.tipoModelo();
	    aviao2.comportar();
	    aviao2.voar();
	    
	    System.out.println("===========================\n");

	    System.out.println(aviao2.modelo);
	    System.out.println(aviao2.passageiros);
	    System.out.println(aviao2.voo +"\n");
	    aviao3.comportar();
	    aviao2.voar();
		
	}

}
