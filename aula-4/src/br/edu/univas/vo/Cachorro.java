package br.edu.univas.vo;

public class Cachorro extends Animal {

	@Override
	public String emiteSom() {
		return "AU AU";
	}
	
	@Override
	public String toString() {
		return "Cachorro " + super.toString();
	}
	
}
