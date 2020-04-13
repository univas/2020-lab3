package br.edu.univas.main;

import java.util.ArrayList;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Ferrari;
import br.edu.univas.vo.Gato;

public class StartApp {

	public static final String NOME = "ANIMAL";
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.emiteSom());
		
		//isso aqui não é possível! Pois a variavel
		//animal está apontando para um objeto do tipo "Animal"
		//Cachorro ca1 = (Cachorro) animal;
		
		Gato gato = new Gato();
		System.out.println(gato.emiteSom());
		
		Cachorro cachorro = new Cachorro();
		System.out.println(cachorro.emiteSom());
		cachorro.abanaRabo();
		
		Animal meuAnimal = new Gato();
		if (meuAnimal instanceof Gato) {
			Gato g77 = (Gato) meuAnimal;
		}
		System.out.println(meuAnimal.emiteSom());
		
		Animal meuAnimal2 = new Cachorro();
		System.out.println(meuAnimal2.emiteSom());
		Cachorro cachorro2 = (Cachorro) meuAnimal2;
		cachorro2.abanaRabo();
		
		//Animal meuAnimal3 = new Ferrari(); não funciona!
		System.out.println("************\n\n");
		
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(cachorro);
		animais.add(gato);
		animais.add(animal);
		animais.add(meuAnimal);
		animais.add(meuAnimal2);
		
		for (Animal a : animais) {
			System.out.println(a.emiteSom());
			if (a instanceof Cachorro) { //retorna true ou false
				Cachorro c44 = (Cachorro) a;
				c44.abanaRabo();
			}
		}
		
		//Cachorro c = new Animal(); isso não é possível!
	}
	
}
