package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public abstract class Estabelecimento {

	private String nome;
	private List<Cardapio> cardapio = new ArrayList<>();
	
	protected abstract void addCardapio(Cardapio cardapio);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cardapio> getCardapio() {
		return cardapio;
	}

	public void setCardapio(List<Cardapio> cardapio) {
		this.cardapio = cardapio;
	}
}
