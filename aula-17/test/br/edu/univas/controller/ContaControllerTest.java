package br.edu.univas.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Test;

import br.edu.univas.vo.Item;

public class ContaControllerTest {
	
	private ContaController classUnderTest = new ContaController();
	private Item item = new Item("café", 5.0f);
	
	//@Before
	@After
	public void setup() {
		classUnderTest.getItems().clear();
	}
	
	@Test
	public void addItem_whenPassAParameter_shouldAddInAList() {
		int sizeListBeforeAddItem = classUnderTest.getItems().size();
		
		classUnderTest.addItem(item);
		
		Item itemAdicionado = classUnderTest.getItems().get(0);
		assertEquals(0, sizeListBeforeAddItem);
		assertEquals(1, classUnderTest.getItems().size());
		assertEquals("café", itemAdicionado.getNome());
		assertEquals(5.0f, itemAdicionado.getValor());
	}
	
	@Test
	public void getValorTotal_whenHaveTwoItemsWithPriceEquals5_shouldReturn10() {
		classUnderTest.addItem(item);
		classUnderTest.addItem(item);
		
		float valorTotal = classUnderTest.getValorTotal();
		
		assertEquals(10.0f, valorTotal);
	}
	
}
