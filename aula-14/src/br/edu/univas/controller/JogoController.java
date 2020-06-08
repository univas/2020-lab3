package br.edu.univas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.edu.univas.vo.Jogo;

public class JogoController {
	
	private List<Jogo> jogos = new ArrayList<>();

	public Jogo generateRandomGame() {
		Jogo jogo = new Jogo();
		
		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			jogo.getNumeros().add(random.nextInt());
		}
		
		jogos.add(jogo);
		return jogo;
	}
	
	public Jogo generateRandomGame(int maxNumeros) {
		if (maxNumeros <= 0) {
			return null;
		}
		
		Jogo jogo = new Jogo();
		
		for (int i = 0; i < maxNumeros; i++) {
			Random random = new Random();
			jogo.getNumeros().add(random.nextInt());
		}
		
		jogos.add(jogo);
		return jogo;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}
	
}
