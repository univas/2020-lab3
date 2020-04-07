package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoGraduacao extends Aluno {

	private ArrayList<Integer> notas = new ArrayList<>(); 
	
	@Override
	public boolean estaAprovado() {
		int soma = somaTotal();
		return soma >= 70;
	}

	public float mediaGeral() {
		int soma = somaTotal();
		return soma / notas.size();
	}
	
	public void addNota(int nota) {
		notas.add(nota);
	}
	
	private int somaTotal() {
		int soma = 0;
		
		for (Integer nota : notas) {
			soma += nota;
		}
		
		return soma;
	}
}
