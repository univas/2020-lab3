package br.edu.univas.vo;

import java.util.ArrayList;

import br.edu.univas.main.StartApp;

public class AlunoGraduacao implements Aluno, Pessoa {

	private ArrayList<Integer> notas = new ArrayList<>();

	public AlunoGraduacao() {
	}
	
	@Override
	public boolean isAprovado() {
		System.out.println(StartApp.COUNTER);
		
		StartApp.COUNTER = 15;
		return false;
	}
		
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Exemplo de metodo "depreciado" 
	 */
	@Deprecated
	public void somaNota() {
	}
	
	public void somaNotaX() {
	}	

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}

}
