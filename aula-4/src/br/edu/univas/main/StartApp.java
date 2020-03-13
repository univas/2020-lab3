package br.edu.univas.main;

import br.edu.univas.vo.Cachorro;

public class StartApp {

	public static void main(String[] args) {
		Cachorro pitbull = new Cachorro();
		pitbull.setRaca("Pitbull");
		pitbull.setCor("Branco");
		pitbull.setPeso(5.98f);
		
		System.out.println("Raça: " + pitbull.getRaca());
		System.out.println("Cor: " + pitbull.getCor());
		System.out.println("Peso: " + pitbull.getPeso());
		
		pitbull.setRaca("Golden");
		pitbull.setCor("Pardo");
		pitbull.setPeso(10.24f);
		
		System.out.println("Raça: " + pitbull.getRaca());
		System.out.println("Cor: " + pitbull.getCor());
		System.out.println("Peso: " + pitbull.getPeso());
		
		Cachorro xuxa = pitbull;
		
		System.out.println("Raça: " + xuxa.getRaca());
		System.out.println("Cor: " + xuxa.getCor());
		System.out.println("Peso: " + xuxa.getPeso());
		
		xuxa.setRaca("Pastor Alemão");
		xuxa.setCor("Preto");
		xuxa.setPeso(13.24f);
		
		System.out.println("Raça: " + pitbull.getRaca());
		System.out.println("Cor: " + pitbull.getCor());
		System.out.println("Peso: " + pitbull.getPeso());
		
		Cachorro sasha = new Cachorro();
		
		sasha = xuxa;
		System.gc();
		
	}
	
}
