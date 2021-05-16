package OJogo;

 abstract class Personagem {
	 
	//declara uma variável que reduze um ponto de vida restante
	private int tiraVida = 1;
	
	//declara uma variável ponto
	protected int ponto;      
	
	// O método é chamado se for perder a vida
	protected int perderVida() { 
		return tiraVida; // retorna 1
	}
	
	//recebe um ponto
	void setScore(int p) { 
		this.ponto = p;
	}

	//retorna ponto
	int getScore() {
		return this.ponto;
	}
}