package OJogo;

import java.util.Random; 
//importa o pacote Random

import java.util.ArrayList;
//importa o pacote ArrayList

public class OJogo {
	public static void main(String[] args) {
		ArrayList<Humano> humano = new ArrayList<Humano>(100);
		// para armazenar vários humanos no ArrayList chamado humano
		ArrayList<Orc> orc = new ArrayList<Orc>(100);
		// para armazenar vários orcs no ArrayList chamado orc	
		
		int vidaAtualHuman = 100;
		int vidaAtualOrc = 100;
		//vida restante de cada um time

		int pontoFinalHumano = 0;
		int pontoFinalOrc = 0;
		// ponto inicial de cada time Humano e Orc
		
		int i; // contador

		Random gerador = new Random();
		
		int op;
		// Cria uma variável opção a ser servida no switch

		// TIME HUMANO
		for (i = 0; i < 100; i++) {
			// continua selecionando até 100 vida/jogadores ou personagens.
			
			op = gerador.nextInt(3) + 1;
			// recebe um valor sorteado entre 1 a 3 atráves do método nextInt

			switch (op) {
			 // compara o valor de cada caso com o valor da variavel sequencialmente.
			case 1:
				Humano novoArqueiro = new Arqueiro(60, 60, 20);
				//criação de objeto para Humano
				humano.add(novoArqueiro);
				//adidiona novo objeto no array atráves de método add()
				break;
			case 2:
				Humano novoSoldado = new Soldado(20, 80, 40);
				humano.add(novoSoldado);
				break;
			case 3:
				Humano novoRobo = new Robo(80, 20, 60);
				humano.add(novoRobo);
				break;
			default:
				System.out.println("error!");
				break;
			}
		}

		// TIME ORC
		for (i = 0; i < 100; i++) {
			op = gerador.nextInt(3) + 1;
			switch (op) {
			case 1:
				Orc novoOgro = new Ogro(60, 60, 20);
				//criação de objeto para Orc
				orc.add(novoOgro);
				//adiciona novo objeto no array atráves de método add()
				break;
			case 2:
				Orc novoMago = new Mago(20, 80, 40);
				orc.add(novoMago);
				break;
			case 3:
				Orc novoDemonio = new Demonio(80, 20, 60);
				orc.add(novoDemonio);
				break;
			default:
				System.out.println("error!");
				break;
			}
		}

		// impressão completo antes da batalha entre time Humano e time Orc
		System.out.println("======================================================================================");
		System.out.println("\tTime de Humano\t\t       ||    ||\t\tTime de Orc");
		System.out.println("Quantidade de personagem com vida: " + vidaAtualHuman
				+ " ||    || Quantidade de personagem com vida: " + vidaAtualOrc);
		System.out.println("======================================================================================");
		// informa a vida restante de cada um time
		
		//começa a partida de batalha
		for (i = 0; i < humano.size() && i < orc.size(); i++) {
			//humano e orc chaman o método size() que retorna o número de elementos contidos na lista
			int aux;
			int opc = gerador.nextInt(2) + 1; //sortea quem vai comparar/lutar
			if (opc == 1) { 
				//se o valor de opc for um, então, humano vai comparar com orc

				System.out.println(humano.get(i) + " || VS || " + orc.get(i));
				//descreve cada um objeto atráves do uso de toString( )
				System.out.println("--------------------------------------------------------------------------------------");
				
				aux = humano.get(i).compareTo(orc.get(i)); 
				// time humano compara com time orc e recebe um valor aux
				if (aux == 1) { // se for 1

					humano.get(i).setScore(1);
					//imforma indice para método e envia 1 ponto para para uma personagem Humano
					
					vidaAtualOrc -= orc.get(i).perderVida();
					//Time orc sofre a perda de vida restante no time
					System.out.println("\t  Essa personagem do time humano derrotou uma personagem do Time Orc!");
					System.out.println("--------------------------------------------------------------------------------------");

				} else if (aux == -1) { // se for -1
					//humano sofre uma derrota

					orc.get(i).setScore(1);
					// envia 1 ponto para personagem Orc
					
					vidaAtualHuman -= humano.get(i).perderVida();
					//humano sofre uma redução de vida restante no time dele
					
					System.out.println("\t  Essa personagem do time orc derrotou uma personagem do Time Humano!");
					System.out.println("--------------------------------------------------------------------------------------");
				
				} else if (aux == 0) {
					//se forem iguais, ambos morreu, mas ganharam um ponto.

					humano.get(i).setScore(1);
					// envia 1 ponto de abate para time Humano
					
					vidaAtualOrc -= orc.get(i).perderVida();
					//Time Orc sofre uma redução de vida restante no time
					
					orc.get(i).setScore(1);
					// envia 1 ponto para time Orc
					
					vidaAtualHuman -= humano.get(i).perderVida();
					//time humano sogre uma redução de vida restante no time
					
					System.out.println("\t\t\tAmbos morreu, mas ganharam 1 ponto!");
					System.out.println("--------------------------------------------------------------------------------------");
				
				} else {
					//se tiver algum problema...
					System.out.println("Error!");
				}

			} else {
				//se o valor de opc não seja 1, então, orc vai comparar/lutar com humano
				System.out.println(humano.get(i) + " || VS || " + orc.get(i));
				//informa cada objeto atraves do uso toString
				
				System.out.println("--------------------------------------------------------------------------------------");
				aux = orc.get(i).compareTo(humano.get(i)); 
				// Time orc comapara/luta com time humano atraves do método compareTo e aux recebe o resultado
				
				if (aux == 1) { // se for 1

					orc.get(i).setScore(1);
					// envia 1 ponto de abate para time Orc
					
					vidaAtualHuman -= humano.get(i).perderVida();
					
					System.out.println("\t  Essa personagem do time orc derrotou uma personagem do Time Humano! ");
					System.out.println("--------------------------------------------------------------------------------------");

				} else if (aux == -1) { // se for -1

					humano.get(i).setScore(1);
					// envia 1 ponto para time Humano
					
					vidaAtualOrc -= orc.get(i).perderVida();
					//time orc sofre uma redução de vida restante no time Humano
					
					System.out.println("\t  Essa personagem do time humano derrotou uma personagem do Time Orc!");
					System.out.println("--------------------------------------------------------------------------------------");
				
				} else if (aux == 0) {
					orc.get(i).setScore(1); 
					// envia 1 ponto para time Orc
				
					vidaAtualHuman -= humano.get(i).perderVida();
					//time humano sofre uma redução de vida restante
					
					humano.get(i).setScore(1);
					// envia 1 ponto para para time Humano
					
					vidaAtualOrc -= orc.get(i).perderVida();
					//time orc sofre uma redução de vida restante
								
					System.out.println("\t\t\tAmbos morreu, mas ganharam 1 ponto!");
					System.out.println("--------------------------------------------------------------------------------------");
				} else {
					//se tiver algum problema...
					System.out.println("Error!");
				}
			}
		}
		
		// Atualizando os pontos (Somando todos os elementos vencendores)
		for (i = 0; i < humano.size() && i < orc.size(); i++) {
			//humano e orc chamam o método size() que retorna o número de elementos contidos na lista
			
			pontoFinalHumano += humano.get(i).getScore();
			//somando os pontos de time humano para resultar a quantidade de abates totais
			
			pontoFinalOrc += orc.get(i).getScore();
			//somando os pontos de time otc para resultar a quantidade de abates totais
		}
		
		System.out.println();
		System.out.println("======================================================================================");
		System.out.println("\t\t\t\tResultado da partida");
		System.out.println("======================================================================================");
		System.out.println("\t\tTIME HUMANO\t    \t  ||\t \tTIME ORC");
		System.out.println("======================================================================================");

		// imprimindo o resultado final da partida
		System.out.println(" Vida restante no time humano: " + vidaAtualHuman + "\t  || Vida restante no time Orc: " + vidaAtualOrc); 
		// informa a vida restante no time 
		
		System.out.println(" Pontos de abate: " + pontoFinalHumano + "\t\t\t  || Pontos de abate: " + pontoFinalOrc);
		// informa o ponto final de cada time

		// compara o desempenho entre os times
		if (pontoFinalHumano > pontoFinalOrc && vidaAtualHuman > vidaAtualOrc) {
			//human won!
			System.out
					.println("======================================================================================");
			System.out.println("\t\t\t\t--> TIME HUMANO GANHOU! <--");
			System.out.println("======================================================================================");

		} else if (pontoFinalOrc > pontoFinalHumano && vidaAtualOrc > vidaAtualHuman) { 
			// se não, orc won!

			System.out.println("======================================================================================");
			System.out.println("\t\t\t\t--> TIME ORC GANHOU! <--");
			System.out.println("======================================================================================");

		} else {
			System.out.println("======================================================================================");
			System.out.println("\t\t\t\t  --> EM EMPATE <--");
			System.out.println("======================================================================================");
		}
	}
}