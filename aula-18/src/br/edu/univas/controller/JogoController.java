package br.edu.univas.controller;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.exception.GameException;
import br.edu.univas.vo.Jogo;

public class JogoController {

	private Jogo jogoSorteado;
	
	public void initialize() {
		jogoSorteado = new Jogo();
		generateRandomNumbers();
		Jogo jogoUsuario = readUserGame();
		
		if (checkGame(jogoUsuario)) {
			System.out.println("Parabéns!!!!");
			System.out.println("Você ganhou o jogo!!!!");
		} else {
			System.out.println("Não foi dessa vez :( ");
		}
	}
	
	private Jogo readUserGame() {
		Jogo jogo = new Jogo();
		Scanner scanner = new Scanner(System.in);
		
		while (jogo.getNumeros().size() < 5) {
			System.out.println("Por favor digite um número:");
			try {
				readNumero(jogo, scanner);
			} catch (GameException e) {
				System.out.println(e.getMessage());
			}
		}

		scanner.close();
		return jogo;
	}
	
	private void readNumero(Jogo jogo, Scanner scanner) throws GameException {
		try {
			int numero = scanner.nextInt();
			if (numero < 1 || numero > 30) {
				throw new GameException("Por favor, digite um numero entre 1 e 30!");
			}
			
			if (jogo.getNumeros().contains(numero)) {
				throw new GameException("Valor já informado!");
			} else {
				jogo.getNumeros().add(numero);
			}
			
		} catch (InputMismatchException e) {
			scanner.nextLine();
			throw new GameException("Por favor, digite um valor numerico");
		}
	}
	
	private void generateRandomNumbers() {
		Random random = new Random();
		for (int i = 0; i < 5;) {
			
			Integer n = random.nextInt(30) + 1;
			if (!jogoSorteado.getNumeros().contains(n)) {
				jogoSorteado.getNumeros().add(n);
				i++;
			}
		}
	}
	
	private boolean checkGame(Jogo jogoUsuario) {
		int counter = 0;
		for (int i = 0; i < jogoSorteado.getNumeros().size(); i++) {
			int numeroSorteado = jogoSorteado.getNumeros().get(i);
			if (jogoUsuario.getNumeros().contains(numeroSorteado)) {
				counter++;
			}
		}
		
		return counter == 5;
	}
	
}
