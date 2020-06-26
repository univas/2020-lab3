package br.edu.univas.vo;

public class Pizzaria extends Estabelecimento {

	@Override
	protected void addCardapio(Cardapio cardapio) {
		getCardapio().add(cardapio);
	}

}
