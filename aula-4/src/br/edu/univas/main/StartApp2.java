package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

public class StartApp2 {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setRaca("Pitbull");
		System.out.println(cachorro1.emiteSom());
		System.out.println(cachorro1);
		
		Gato gato1 = new Gato();
		gato1.setRaca("Siamês");
		System.out.println(gato1.emiteSom());
		System.out.println(gato1);
		System.out.println(gato1.toString(10));
		System.out.println(gato1.toString(10, "TESTANDO-"));
		
		Animal animal = new Animal();
		animal.setRaca("SEM RAÇA");
		System.out.println(animal);
	}
}
