package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

	private List<Integer> numeros = new ArrayList<>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		numeros.forEach(sb::append);		
		return sb.toString();
	}
	
}
