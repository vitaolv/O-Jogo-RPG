package OJogo;

 class Robo extends Humano{
	//A classe Robo herda a classe abstrata Humano
	 
	Robo(int i, int v, int e) { 
		super(i, v, e);
	}
	//cria construtor

	int getInteligencia() {
		return this.Inteligencia;
	}
	//método que retorna o valor de inteligencia de robo

	int getVelocidade() {
		return this.Velocidade;
	}
	//retorna o valor de velocidade

	int getEquipamentos() {
		return this.Equipamentos;
	}
	//retorna o valor de equipamentos
	//esses tres metodos foram definidos pela classe abstrata Humano

	String getRob() {
		return "Inte. " + this.Inteligencia + " | Vel. " + this.Velocidade + " | Equi." + this.Equipamentos;
	}
	//retorna string e seus atributos

	public String toString() { 
		return "Robo:\t  " + getRob();
	}
	//método que descreve o objeto
}