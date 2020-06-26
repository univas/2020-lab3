package br.edu.univas.vo;

public class Restaurante extends Estabelecimento {

	@Override
	protected void addCardapio(Cardapio cardapio) {
		getCardapio().add(cardapio);
	}

}
