package br.edu.univas.main;

import br.edu.univas.factory.RoupaFactory;
import br.edu.univas.vo.Camiseta;
import br.edu.univas.vo.Roupa;

public class StartApp {

	public static void main(String[] args) {
		StartApp app = new StartApp();
		
		int primeiroNumero = 10;
		int segundoNumero = 20;
		int valorDaSoma = app.soma(primeiroNumero, segundoNumero);
		System.out.println(valorDaSoma);
		
		Roupa roupa = new Roupa();
		roupa.limpar();
		
		Camiseta camiseta1 = new Camiseta();
		camiseta1.limpar();
		
		Roupa roupaQualquer = new Camiseta();
		roupaQualquer.limpar();
		
		int option = 2;
		Roupa r = RoupaFactory.createRoupa(option);
		r.limpar(); //CALCA
		
		option = 1;
		r = RoupaFactory.createRoupa(option);
		r.limpar(); //CAMISETA
		
		option = 10;
		r = RoupaFactory.createRoupa(option);
		r.limpar();//NULL
	}
	
	public int soma(int a, int b) {
		return a + b;
	}
	
}
