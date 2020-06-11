package br.edu.univas.view;

import java.util.List;

import br.edu.univas.vo.CreditCard;

public class UserView {

	public void showRegisterUser() {
		System.out.println("\nCADASTRO DE USUÁRIO\n");
	}
	
	public void showRegisterUserName() {
		System.out.print("\nDigite seu nome:");
	}
	
	public void showRegisterUserCellphone() {
		System.out.print("\nDigite seu celular:");
	}
	
	public void showRegisterSuccessful() {
		System.out.println("\nUsuário cadastrado com sucesso!\n");
	}

	public void showAddNewCreditCard() {
		System.out.println("\nCADASTRO DE CARTÃO DE CRÉDITO\n");
	}
	
	public void showRegisterCreditCardBrand() {
		System.out.print("\nDigite a bandeira do cartão:");
	}
	
	public void showRegisterCreditCardLimit() {
		System.out.print("\nDigite o limite total do cartão:");
	}
	
	public void showRegisterCrediCardSuccesful() {
		System.out.println("\nCartão de crédito cadastrado com sucesso!\n");
	}
	
	public void showAddNewPurchase() {
		System.out.println("\nLANÇAMENTO DE COMPRAS\n");
	}
	
	public void showCreditCardsFromUser(List<CreditCard> cards) {
		System.out.print("\nAbaixo a lista de cartões:");
		for (int i = 0; i < cards.size(); i++) {
			System.out.println((i + 1) + " - " + cards.get(i).getBrand());
		}
	}
	
	public void showSelectCreditCard() {
		System.out.print("\nPor favor, digite uma opção válida:");
	}
	
	public void showRegisterPurchaseValue() {
		System.out.print("\nDigite o valor da compra:");
	}
	
	public void showRegisterPurchaseDate() {
		System.out.print("\nDigite a data da compra:");
	}
	
	public void showRegisterPurchaseQuotes() {
		System.out.print("\nDigite a quantidade de parcelas:");
	}
	
	public void showRegisterPurchaseSuccesful() {
		System.out.println("\nCompra cadastrada com sucesso!\n");
	}
	
}
