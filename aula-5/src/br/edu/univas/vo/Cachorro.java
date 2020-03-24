package br.edu.univas.vo;

public class Cachorro extends Mamifero {

	public Cachorro() {
		super(); // chamando o construtor da classe mãe
	}
	
	// construtor da classe cachorro
	public Cachorro(String raca) {
		this.setRaca(raca);
	}
	
	public Cachorro(String raca, float peso) {
		this.setRaca(raca);
		this.setPeso(peso);
	}
	
	@Override
	public String emiteSom() {
		return "AU AU";
	}

}
