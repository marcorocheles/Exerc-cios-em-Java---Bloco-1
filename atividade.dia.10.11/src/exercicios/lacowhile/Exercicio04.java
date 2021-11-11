package exercicios.lacowhile;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opcões
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	
	 o número de pessoas calmas;
	 o número de mulheres nervosas;
	 o número de homens agressivos;
	 o número de outros calmos;
	 o número de pessoas nervosas com mais de 40 anos;
	 o número de pessoas calmas com menos de 18 anos.
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int quantidadePessoas = 2; // a quantidade de pessoas 
		int idade, idadeQuarenta = 0, idadeDezoito = 0; //aqui foi separada variaveis para idade, e contador de idade de 40 e 18 anos
		int humor, genero; //aqui será a variavel q classificará o humor do usuario de acordo com o numero que ele inserir
		int contador = 0; // aqui foi reservado um contado e um valor para limitar o laco 
		int totalMasculino = 0, totalFeminino = 0, totalOutro = 0; //contadores para genero
		int homemCalmo = 0, homemNervoso = 0, homemAgressivo = 0; //contadores para humor de cada genero. irei declarar todos, mesmo que não sejam usados por motivo de treino
		int mulherCalma = 0, mulherNervosa = 0, mulherAgressiva = 0;
		int outroCalmo = 0, outroNervoso = 0, outroAgressivo = 0;
		int pessoasCalmas = 0; //aqui um contador para contar as pessoas calmas do exercicio
		
		while (contador <= quantidadePessoas) {
			
			
			System.out.println("Com qual gênero você se identifica? Insira o número correspondente: "
					+ "\n1 - Masculino; 2 - Feminino; 3 - Outro");
			genero = read.nextInt();  //esse sysout sera o primeiro filtrador. através dele todo o restante será organizado
			
			if (genero >= 1 && genero <= 3) { //aqui um if e aberto para que seja limitado o que pode responder. caso escolha uma opção invalida o usuario retorna aqui
				
				if (genero == 1) { //os if a seguir coletaram a quantidade de vezes que o laco os percorre e armazenara esses dados nos contadores
					
					System.out.println("Como você se sente hoje? Insira o número correspondente ao seu humor: "
							+ "\n 1 - Calma(o/e); 2 - Nervosa(o/e); 3 - Agressiva(o/e)");
					humor = read.nextInt(); //armazena o dado do humor
					
					totalMasculino++; //aqui é para saber quantas vezes o usuario passa pelo genero masculino e entao esse dado é armazenado
					
					if(humor >= 1 && humor <= 3) { // um filtro caso o usuário entre com um numero incorreto
						
						
						
						if (humor == 1) { //primeiro humor e armazenamento
							
							homemCalmo++;
							pessoasCalmas++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade <= 18) { //armazenador de informação de acordo com a idade conforme pedido pelo enunciado
								
								idadeDezoito++;
		
							}
							
						}
						else if (humor == 2) { //segundo humor
							
							homemNervoso++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade >= 40) { //armazenador de informação de acordo com a idade conforme pedido pelo enunciado
								
								idadeQuarenta++;
								
							}
							
						}
						else { //terceiro humor
							
							homemAgressivo++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
						}
						
					}
					
					else {
						System.out.println("Insira um um número válido correspondente ao seu humor"); //mensagem de alerta para o numero correspondente ao humor inválido
					}
					
				}
				
				//a partir daqui será uma repetição da sintaxe acima percorrendo pelos demais generos 
				else if (genero == 2) {
					
					System.out.println("Como você se sente hoje? Insira o número correspondente ao seu humor: "
							+ "\n 1 - Calma(o/e); 2 - Nervosa(o/e); 3 - Agressiva(o/e)");
					humor = read.nextInt();
					
					totalFeminino++;
					
						if(humor >= 1 && humor <= 3) {
						
						if (humor == 1) {
							
							mulherCalma++;
							pessoasCalmas++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade <= 18) {
								
								idadeDezoito++;
		
							}
							
						}
						else if (humor == 2) {
							
							mulherNervosa++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade >= 40) {
								
								idadeQuarenta++;
								
							}
							
						}
						else {
							
							mulherAgressiva++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
						}				
						
					}
					
					else {
						System.out.println("Insira um um número válido correspondente ao seu humor");
						
					}
					
				}
				else {
					
					System.out.println("Como você se sente hoje? Insira o número correspondente ao seu humor: "
							+ "\n 1 - Calma(o/e); 2 - Nervosa(o/e); 3 - Agressiva(o/e)");
					humor = read.nextInt();
					
					totalOutro++;
					
					if(humor >= 1 && humor <= 3) {
						
						if (humor == 1) {
							
							outroCalmo++;
							pessoasCalmas++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade <= 18) {
								
								idadeDezoito++;
		
							}
							
						}
						else if (humor == 2) {
							
							outroNervoso++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
							if (idade >= 40) {
								
								idadeQuarenta++;
								
							}
							
						}
						else {
							
							outroAgressivo++;
							
							System.out.println("Insira sua idade: ");
							idade = read.nextInt();
							
						}
						
					}
					
					//aqui acaba a sintaxe de coleta de dados de humor idade e genero
					
					else {
						System.out.println("Insira um um número válido correspondente ao seu humor"); // mensagem que retornará caso o usuário não inserir um número válido para o humor
					}
				
					
				}
				
				
			}
			
			
			
			else { // esse else é para o primeiro if onde o usuário precisa inserir um numero correto para seu genero. caso o faça errado cairá aqui
			
				System.out.println("Numero invalido. Tente novamente.\n");
				
				if (contador > 0) { //aqui o usuário inseriu um valor inválido e precisamos q o contador não liste o valor errado no numero de tentativas, o elso filtra isso
					contador--;
				}
				
				
			}
			
			contador++; // esse contador indica que o usuário entrou no laco correto e inseriu um numero valido, logo o codigo continuará
			
		} 
		
		//aqui o codigo é finalizado e os dados apresentados
		System.out.println("Coleta finalizada. Exibindo dados coletados: ");
		System.out.println("A quantidade de pessoas calmas na pesquisa é de " + pessoasCalmas + " indivíduos.");
		System.out.println("A quantidade de mulheres nervosas na pesquisa é de " + mulherNervosa + " indivíduos.");
		System.out.println("A quantidade de homens agressivos na pesquisa é de " + homemAgressivo + " indivíduos.");
		System.out.println("A quantidade de outros calmos na pesquisa é de " + outroCalmo + " indivíduos.");
		System.out.println("O número de pessoas nervosas com mais de 40 anos na pesquisa é de " + idadeQuarenta + " indivíduos.");
		System.out.println("O número de pessoas calmas com menos de 18 anos na pesquisa é de " + idadeDezoito + " indivíduos.");
		
		read.close();

	}

}



