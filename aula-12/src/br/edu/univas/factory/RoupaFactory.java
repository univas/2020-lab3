package br.edu.univas.factory;

import br.edu.univas.vo.Calca;
import br.edu.univas.vo.Camiseta;
import br.edu.univas.vo.Roupa;

public class RoupaFactory {

	public static Roupa createRoupa(int option) {
		if (option == 1) {
			return new Camiseta();
		} else if (option == 2) {
			return new Calca();
		}
		return null;
	}
	
}
