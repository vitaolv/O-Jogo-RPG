package OJogo;

class Arqueiro extends Humano {
//A classe Arqueiro herda a classe abstrata Humano
	
	Arqueiro(int i, int v, int e) { 
		super(i, v, e);
	}
	// cria construtor

	int getInteligencia() {
		return this.Inteligencia;
	}
	//método que retorna o valor de inteligencia de arqueiro
	
	int getVelocidade() {
		return this.Velocidade;
	}
	//retorna o valor de velocidade de arqueiro
	
	int getEquipamentos() {
		return this.Equipamentos;
	}
	//retorna o valor de equipamentos de arqueiro
	//esses tres metodos foram definidos pela classe abstrata Humano
	
	String getArq() {
		return "Inte. " + this.Inteligencia + " | Vel. " + this.Velocidade + " | Equi." + this.Equipamentos;
	}
	//retorna string e seus atributos

	public String toString() { 						
		return "Arqueiro: " + getArq();
	}
	//método que descreve o objeto
}
