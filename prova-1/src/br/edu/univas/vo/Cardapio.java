package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

	private String nome;
	private List<String> items = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
}
