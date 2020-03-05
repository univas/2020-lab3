package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Autor;
import br.edu.univas.vo.Livro;

public class StartApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList livros = new ArrayList();
		
		int option = 0;
		
		do {
			System.out.println(":::Cadastro de Livros:::");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Listar livros");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				//cadastro de livro
				Livro xpto = cadastraLivro(scanner);
				livros.add(xpto);
				
			} else if (option == 2) {
				
				for (int i = 0; i < livros.size(); i++) {
					
					Livro outraVariavelDeLivro = 
							(Livro) livros.get(i);
					Autor outraVariavelDeAutor = 
							outraVariavelDeLivro.getAutor();
					
					System.out.println("%%%%%%%%%%%%%%%");
					System.out.println("Titulo: " + outraVariavelDeLivro.getTitulo());
					System.out.println("Idioma: " + outraVariavelDeLivro.getIdioma());
					System.out.println("Data da Publicação: " + outraVariavelDeLivro.getDataPublicacao());
					System.out.println("Nome do autor: " + outraVariavelDeAutor.getNomeAutor());
					System.out.println("Sobrenome do autor: " + outraVariavelDeAutor.getSobrenomeAutor());
					System.out.println("Site do autor: " + outraVariavelDeAutor.getSite());
					System.out.println("%%%%%%%%%%%%%%%");
				}
				System.out.println("\n\n");
				
			} else if (option != 9) {
				System.out.println("Digite a opção correta!");
			}
			
			
		} while (option != 9);
	}
	
	private static Livro cadastraLivro(Scanner scanner) {
		Livro novoLivro = new Livro();

		System.out.println("Digite o título do livro:");
		novoLivro.setTitulo(scanner.nextLine());
		
		System.out.println("Digite o idioma do livro:");
		novoLivro.setIdioma(scanner.nextLine());
		
		System.out.println("Digite a data da publicação do livro:");
		novoLivro.setDataPublicacao(scanner.nextLine());
		
		Autor novoAutor = new Autor();
		
		System.out.println("Digite o nome do autor do livro:");
		novoAutor.setNomeAutor(scanner.nextLine());
		
		System.out.println("Digite o sobrenome do autor do livro:");
		novoAutor.setSobrenomeAutor(scanner.nextLine());
		
		System.out.println("Digite o site do autor do livro:");
		novoAutor.setSite(scanner.nextLine());
		novoLivro.setAutor(novoAutor);

		return novoLivro;
	}
	
	
}
