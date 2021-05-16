package OJogo;

import java.util.Random;
//importa pacote random

abstract class Orc extends Personagem implements Comparable<Object> {
//a classe Orc herda a classe Personagem e implementa a interface Comparable
	
	protected int Forca;
	protected int Habilidade;
	protected int Agilidade;
	//adicionando seus atributos
	
	Orc(int f, int h, int a){
		Forca = f;
		Habilidade = h;
		Agilidade = a;
	}
	//criando construtor
	
	abstract int getForca();

	abstract int getHabilidade();

	abstract int getAgilidade();
	//metodos abstratos

	public int compareTo(Object humano) { 
		// compara com um dos três atributos de personagem Orc
		
		Humano human = (Humano) humano; 
		// personagem human é a personagem de time Humano
		
		Random valor = new Random();
		//cria objeto da classe Random
		
		int opcao;
		
		opcao = valor.nextInt(3) + 1;
		//variavel opcao recebe valor atráves do método nextInt()
		
		if (opcao == 1) {
			//se o valor de opcao for 1, então será o par entre inteligencia vs força
		
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			System.out.println("\t\t       INTELIGENCIA:" + ((Humano) human).getInteligencia() + " || VS || FORCA: " + this.Forca);
			//imprime seus atributos de cada personagem humano vs orc
		
			if (Forca > ((Humano) human).getInteligencia()) { 
				// compara se o atributo de personagem Orc é maior que o de personagem humano
				return 1; 
				// retorna 1
		
			} else if (Forca < ((Humano) human).getInteligencia()) { 
				// se atributo de personagem Orc é menor que o de Humano
				return -1; 
				// retorna -1
			
			} else { 
				// se não (empate)
				return 0; // retorna 0
			}
		} else if (opcao == 2) {
			//se o valor de opcao for 2, então será o par entre velocidade vs habilidade
		
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			System.out.println("\t\t\tVELOCIDADE:" + ((Humano) human).getVelocidade() + "  || VS ||   HABILIDADE: " + this.Habilidade);
			//imprime seus atributos de cada personagem humano vs orc
		
			if (Habilidade > ((Humano) human).getVelocidade()) { 
				return 1; 
				// retorna 1
		
			} else if (Habilidade < ((Humano) human).getVelocidade()) {
				return -1; 
				// retorna -1
		
			} else { 
				// se não (empate)
				return 0; 
				// retorna 0
			}
		} else {
			//se o valor de opcao não seja 1 nem 2, então será o par entre equipamentos vs agilidade
			
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			 System.out.println("\t  \t     EQUIPAMENTOS: " + ((Humano) human).getEquipamentos() +  "  || VS || AGILIDADE: " + this.Agilidade);
				//imprime seus atributos de cada personagem humano vs orc
		
			if (Agilidade > ((Humano) human).getEquipamentos()) { 
				return 1; 
				// retorna 1
		
			} else if (Agilidade < ((Humano) human).getEquipamentos()) { 
				return -1; 
				// retorna -1
		
				
			} else { 
				// se não (empate)
				return 0;
				// retorna 0
			}
		}
	}
}
