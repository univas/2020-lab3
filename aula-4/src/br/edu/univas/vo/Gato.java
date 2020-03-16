package br.edu.univas.vo;

public class Gato extends Animal {
	
	@Override
	public String emiteSom() {
		return "MIAU MIAU";
	}
	
	@Override
	public String toString() {
		return "Gato " + super.toString();
	}
	
	public String toString(int length) {
		return "OUTRO TOSTRING RAPAZ!".substring(0, length);
	}
	
	public String toString(int length, String prefix) {
		return (prefix + "MAIS UM TOSTRING CARA!").substring(0, length);
	}
}
