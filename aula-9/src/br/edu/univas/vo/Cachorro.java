package br.edu.univas.vo;

public class Cachorro extends Animal {

	@Override
	public String emiteSom() {
		return "Au au";
	}
	
	public void abanaRabo() {
		System.out.println("ABANOU O RABO");
	}
	
}
