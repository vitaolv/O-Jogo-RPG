package OJogo;

 class Ogro extends Orc {
//A classe Ogro herda a classe abstrata Orc

	Ogro(int f, int h, int a) { 
	
		super(f, h, a);
	}
	// cria construtor
	
	int getForca() {
		return this.Forca;
	}
	//retorna o valor da força

	int getHabilidade() {
		return this.Habilidade;
	}
	//retorna o valor da habilidade

	int getAgilidade() {
		return this.Agilidade;
	}
	//retorna o valor da agilidade
	//esses tres metodos foram definidos pela classe abstrata Orc

	String getOgro() {
		return "Força " + this.Forca + " | Hab. " + this.Habilidade + " | Agil. " + this.Agilidade;
	}
	// método getOgro do tipo String que só retorna String e os dados de Ogro
	
	public String toString() {
		return "Ogro:\t " + getOgro();
	}
	//toString descreve o objeto
}