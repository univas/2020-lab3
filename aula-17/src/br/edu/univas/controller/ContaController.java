package br.edu.univas.controller;

import java.util.List;

import br.edu.univas.vo.Conta;
import br.edu.univas.vo.Item;

public class ContaController {

	private Conta conta = new Conta();
	
	public void addItem(Item item) {
		conta.addItem(item);
	}
	
	public float getValorTotal() {
		return conta.getValor();
	}
	
	public List<Item> getItems() {
		return conta.getItems();
	}
}
