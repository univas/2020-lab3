package br.edu.univas.vo;

import java.util.ArrayList;

import br.edu.univas.main.StartApp;

public class AlunoMestrado implements Aluno, Pessoa  {

	private ArrayList<Character> notas = new ArrayList<>();

	@Override
	public boolean isAprovado() {
		
		return false;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Character> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Character> notas) {
		this.notas = notas;
	}


}
