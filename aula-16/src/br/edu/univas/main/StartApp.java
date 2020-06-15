package br.edu.univas.main;

import br.edu.univas.controller.AlunoController;

public class StartApp {

	public static void main(String[] args) {
		AlunoController controller = new AlunoController();
		controller.initialize();
	}
	
}
