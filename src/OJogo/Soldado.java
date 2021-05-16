package OJogo;

class Soldado extends Humano {
//A classe Soldado herda a classe abstrata Humano
	
	Soldado(int i, int v, int e) { 
		super(i, v, e);
	}
	//cria construtor
	
	int getInteligencia() {
		return this.Inteligencia;
	}
	//método que retorna o valor de inteligencia de soldado
	
	int getVelocidade() {
		return this.Velocidade;
	}
	//retorna o valor da velocidade de soldado
	
	int getEquipamentos() {
		return this.Equipamentos;
	}
	//retorna o valor de equipamentos de soldado
	//esses tres metodos foram definidos pela classe abstrata Humano
	
	String getSol() {  //método definido por local (classe propria) 
		return "Inte. " + this.Inteligencia + " | Vel. " + this.Velocidade + " | Equi." + this.Equipamentos;
	}
	//retorna strins e seus atributos

	public String toString() { 
		return "Soldado:  " + getSol();
	}
	//descreve o objeto

}
