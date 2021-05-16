package OJogo;

class Demonio extends Orc {
//A classe Demonio herda a classe abstrata Orc

	Demonio(int f, int h, int a) { 
		super(f, h, a);
	}
	// cria construtor

	int getForca() {
		return this.Forca;
	}
	//retorna o valor da força de demonio

	int getHabilidade() {
		return this.Habilidade;
	}
	//retorna o valor da habilidade de deminio

	int getAgilidade() {
		return this.Agilidade;
	}
	//retorna o valor da agilidade de demonio
	//esses tres metodos foram definidos pela classe abstrata Orc

	String getDem() {
		return "Força " + this.Forca + " | Hab. " + this.Habilidade + " | Agil. " + this.Agilidade;
	}
	// método getDem do tipo String que só retorna String e os dados de demonio

	public String toString() { 
		return "Dêmonio: " + getDem();
	}
	//método que descreve objeto

}