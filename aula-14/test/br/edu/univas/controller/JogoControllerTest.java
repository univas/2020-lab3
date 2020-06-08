package br.edu.univas.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.univas.vo.Jogo;

public class JogoControllerTest {

	private JogoController controller = new JogoController();
	
	@Test
	public void generateRandomGame_whenExecuted_shouldGenerateOneGameWithSixNumbers() {
		Jogo jogo = controller.generateRandomGame();
		
		assertNotNull(jogo);
		assertEquals(6, jogo.getNumeros().size());
		assertEquals(1, controller.getJogos().size());
	}
	
}
