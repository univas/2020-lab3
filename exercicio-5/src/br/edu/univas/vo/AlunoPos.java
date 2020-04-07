package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoPos extends Aluno implements Pesquisador {

	private ArrayList<Character> conceitos = new ArrayList<>();
	
	public char conceitoGeral() {
		int totalConceitoA = 0;
		int totalConceitoB = 0;

		for (Character conceito : conceitos) {
			if (conceito == 'A') {
				totalConceitoA++;
				
			} else if (conceito == 'B') {
				totalConceitoB++;
			
			} else if (conceito == 'D') {
				return 'D';
			}
		}
		
		if (totalConceitoA == conceitos.size()) {
			return 'A';
		}
		
		if (totalConceitoB >= conceitos.size() / 2) {
			return 'B';
		}
		
		return 'C';
	}

	@Override
	public int calcularConceito() {
		char conceitoFinal = conceitoGeral();
		
//		if (conceitoFinal == 'A') {
//			return 90;
//		} else if (conceitoFinal == 'B') {
//			return 75;
//		} else if (conceitoFinal == 'C') {
//			return 50;
//		} else {
//			return 0;
//		}
		
		//short byte int char String
		switch(conceitoFinal) {
			case 'A' : return 90;
			case 'B' : return 75;
			case 'C' : return 50;
			default  : return 0;
		}
	}

	@Override
	public boolean estaAprovado() {
		char conceitoFinal = conceitoGeral();
		return conceitoFinal == 'A' || conceitoFinal == 'B';
	}
	
	public void addConceito(char conceito) {
		conceitos.add(conceito);
	}
	
}
