package br.edu.univas.vo;

public class Lanchonete extends Estabelecimento {

	@Override
	protected void addCardapio(Cardapio cardapio) {
		getCardapio().add(cardapio);
	}

}
