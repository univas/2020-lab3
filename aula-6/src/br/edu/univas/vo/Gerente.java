package br.edu.univas.vo;

import java.util.ArrayList;

public class Gerente {

	private ArrayList<Conta> contas = new ArrayList<>();
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
}
