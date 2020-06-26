package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.vo.Estabelecimento;
import br.edu.univas.vo.Lanchonete;
import br.edu.univas.vo.Pizzaria;
import br.edu.univas.vo.Restaurante;

public class StartApp {

	public static void main(String[] args) {
		List<Estabelecimento> estabelecimentos = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Escolha um tipo de estabelecimento:");
			System.out.println("1 - Pizzaria");
			System.out.println("2 - Restaurante");
			System.out.println("3 - Lanchonete");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			Estabelecimento estabelecimento = null;
			if (opcao == 1) {
				estabelecimento = new Pizzaria();
			} else if (opcao == 2) {
				estabelecimento = new Restaurante(); 
			} else if (opcao == 3) {
				estabelecimento = new Lanchonete();
			}
			
			System.out.println("Digite o nome do estabelecimento:");
			estabelecimento.setNome(scanner.nextLine());
			
			estabelecimentos.add(estabelecimento);
		}
		
		scanner.close();
	}
	
}
