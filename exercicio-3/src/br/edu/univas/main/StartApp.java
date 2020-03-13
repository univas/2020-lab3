package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Bicicleta;
import br.edu.univas.vo.Pneu;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		ArrayList bicicletas = new ArrayList();
		
		do {
			System.out.println(":::Cadastro de Biciletas:::");
			System.out.println("1 - Cadastrar bicileta");
			System.out.println("2 - Listar bicicletas");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				Bicicleta novaBicicleta = cadastraBicicleta(scanner);
				bicicletas.add(novaBicicleta);
				
			} else if (option == 2) {
				listarBicicletas(bicicletas);
				
			} else if (option != 9) {
				System.out.println("Digite a opção correta!");
			}
		} while(option != 9);
	}
	
	private static Bicicleta cadastraBicicleta(Scanner scanner) {
		Bicicleta bicicleta = new Bicicleta();

		Pneu pneuTraseiro = new Pneu();
		System.out.println("Digite a marca do pneu traseiro:");
		pneuTraseiro.setMarca(scanner.nextLine());
		
		System.out.println("Digite a calibragem do pneu traseiro:");
		pneuTraseiro.setCalibragem(scanner.nextInt());
		scanner.nextLine();
		
		Pneu pneuDianteiro = new Pneu();
		System.out.println("Digite a marca do pneu dianteiro:");
		pneuDianteiro.setMarca(scanner.nextLine());
		
		System.out.println("Digite a calibragem do pneu dianteiro:");
		pneuDianteiro.setCalibragem(scanner.nextInt());
		scanner.nextLine();
		
		bicicleta.setPneuDianteiro(pneuDianteiro);
		bicicleta.setPneuTraseiro(pneuTraseiro);
		
		System.out.println("Digite a marca da bicicleta:");
		bicicleta.setMarca(scanner.nextLine());

		System.out.println("Digite a cor da bicicleta:");
		bicicleta.setCor(scanner.nextLine());
		
		System.out.println("Digite p preço da bicicleta:");
		bicicleta.setPreco(scanner.nextFloat());
		
		return bicicleta;
	}

	private static void listarBicicletas(ArrayList bicicletas) {
		for (int i = 0; i < bicicletas.size(); i++) {
			Bicicleta bicicleta = (Bicicleta) bicicletas.get(i);
			
			System.out.println("Marca: " + bicicleta.getMarca());
			System.out.println("Cor: " + bicicleta.getCor());
			System.out.println("Preço: " + bicicleta.getPreco());

			System.out.println("Marca Pneu Traseiro: " 
					+ bicicleta.getPneuTraseiro().getMarca());
			System.out.println("Calibragem Pneu Traseiro: " 
					+ bicicleta.getPneuTraseiro().getCalibragem());
			
			Pneu pneuDianteiro = bicicleta.getPneuDianteiro();
			System.out.println("Marca Pneu Dianteiro: " + pneuDianteiro.getMarca());
			System.out.println("Calibragem Pneu Dianteiro: " 
					+ pneuDianteiro.getCalibragem());
			
			System.out.println("\n\n");
		}
		System.out.println("\n\n");
	}
}
