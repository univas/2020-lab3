package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private List<Item> items = new ArrayList<>();
	private float valor;

	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}

	public float getValor() {
		float f = 0.0f;
		
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			f += item.getValor();
		}
		
		valor = f;
		return valor;
	}
}
