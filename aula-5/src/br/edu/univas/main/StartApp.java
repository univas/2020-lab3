package br.edu.univas.main;

import java.util.ArrayList;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

public class StartApp {

	public static void main(String[] args) {
		ArrayList<Cachorro> listaCachorro = new ArrayList<>();
		ArrayList<Gato> listaGato = new ArrayList<>();
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		
		Cachorro c = new Cachorro();
		System.out.println(c.emiteSom());
		c.comer();
		listaCachorro.add(c);
		listaAnimais.add(c);
		
		Gato g = new Gato();
		System.out.println(g.emiteSom());
		g.comer();
		listaGato.add(g);
		listaAnimais.add(g);
		
		Cachorro dog = listaCachorro.get(0);
		Gato cat = listaGato.get(0);
	}
	
}
