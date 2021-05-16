package OJogo;

class Mago extends Orc {
//A classe Demonio herda a classe abstrata Orc	
	
	Mago(int f, int h, int a) { 
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

	String getMago() {
		return "Força " + this.Forca + " | Hab. " + this.Habilidade + " | Agil. " + this.Agilidade;
	}
	// método getMago do tipo String que só retorna String e os dados de mago

	public String toString() {
		return "Mago:\t " + getMago();
	}
	//método que descreve o objeto
}