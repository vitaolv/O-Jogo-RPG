package OJogo;

import java.util.Random;

abstract class Humano extends Personagem implements Comparable<Object> {
//a classe Humano herda a classe Personagem e implementa a interface Comparable
	
	protected int Inteligencia;
	protected int Velocidade;
	protected int Equipamentos;
	//adicionando seus atributos

	Humano(int i, int v, int e) {
		this.Inteligencia = i;
		this.Velocidade = v;
		this.Equipamentos = e;
	}
	//cria construtor

	abstract int getInteligencia();

	abstract int getVelocidade();

	abstract int getEquipamentos();
	//criando os métodos

	public int compareTo(Object orc) { 
	//método que compara com objeto Orc
		
		Orc oc = (Orc) orc; 
		// oc é a personagem do time Orc
		
		Random valor = new Random();
		//cria objeto da classe Randim
		
		int option;
		
		option = valor.nextInt(3) + 1;
		//variável option recebe o valor aleatorio atráves do método nextInt()
		
		if (option == 1) {
			//se o valor de option for 1, então será o par entre inteligencia vs força
			
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			System.out.println("\t\t       INTELIGENCIA:" + this.Inteligencia +  " || VS || FORCA: " + ((Orc)oc).getForca());
			//escreve atributos de cada uma personagem de time diferente
			
			if (Inteligencia > ((Orc)oc).getForca()) { 
			// compara se o atributo da personagem Humana é maior que o da personagem orc
		
				return 1; 
				// retorna 1
		
			} else if (Inteligencia < ((Orc)oc).getForca()) { 
			// se atributo de personagem humana é menor que o da personagem orc
				
				return -1; 
				// retorna -1
			
			} else { 
			// se não (empate)	
				
				return 0; 
				// retorna 0
			}
		
		} else if (option == 2) {
			//se o valor de option for 2, então será o par entre velocidade vs habilidade
			
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			System.out.println("\t\t\tVELOCIDADE:" + this.Velocidade +  "  || VS ||   HABILIDADE: " + ((Orc)oc).getHabilidade());
			//escreve seus atributos de cada um
			
			if (this.Velocidade > ((Orc)oc).getHabilidade()) { 
			// compara se o atributo da personagem humana é maior que o da personagem orc
				
				return 1; 
				// retorna 1
		
			} else if (this.Velocidade < ((Orc)oc).getHabilidade()) { 
			// se atributo da personagem humana é menor que o da personagem orc
				
				return -1; 
				// retorna -1	
			} else { 
			// se não (empate)	
				
				return 0; 
				// retorna 0
			}
		} else {
			//se o valor de opction não seja 1 nem 2, então será o par entre Equipamentos vs Agilidade
			System.out.println("\t\t\t\t\tATRIBUTOS ");
			System.out.println("\t  \t     EQUIPAMENTOS: " + this.Equipamentos +  "  || VS || AGILIDADE: " + ((Orc)oc).getAgilidade());
			//escreve seus atributos de cada um
			
			 if (this.Equipamentos > ((Orc)oc).getAgilidade()) { 
				 // compara se o atributo da personagem humana é maior que o da personagem orc
			 
				 return 1; 
				 // retorna 1
			
			 } else if (this.Equipamentos < ((Orc)oc).getAgilidade()) { 
				 // se atributo de personagem humana é menor que o da personagem orc
				
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