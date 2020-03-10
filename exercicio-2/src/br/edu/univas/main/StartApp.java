package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.edu.univas.vo.Item;
import br.edu.univas.vo.Pedido;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		ArrayList pedidos = new ArrayList();
		
		do {
			System.out.println(":::Cadastro de Pedidos:::");
			System.out.println("1 - Cadastrar pedido");
			System.out.println("2 - Listar pedidos");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				Pedido novoPedido = cadastraPedido(scanner);
				pedidos.add(novoPedido);
				
			} else if (option == 2) {
				listarPedidos(pedidos);
				
			} else if (option != 9) {
				System.out.println("Digite a opção correta!");
			}
		} while(option != 9);
	}
	
	private static Pedido cadastraPedido(Scanner scanner) {
		Pedido pedido = new Pedido();

		Item item1 = new Item();
		System.out.println("Digite o nome do 1º produto:");
		item1.setNomeProduto(scanner.nextLine());
		
		System.out.println("Digite a quantidade do 1º produto:");
		item1.setQuantidade(scanner.nextInt());
		scanner.nextLine();
		
		Item item2 = new Item();
		System.out.println("Digite o nome do 2º produto:");
		item2.setNomeProduto(scanner.nextLine());
		
		System.out.println("Digite a quantidade do 2º produto:");
		item2.setQuantidade(scanner.nextInt());
		scanner.nextLine();
		
		pedido.setItem1(item1);
		pedido.setItem2(item2);
		
		System.out.println("Digite a forma de pagamento:");
		pedido.setFormaPagamento(scanner.nextLine());

		Date agora = new Date();
		pedido.setData(agora.toString());
		
		return pedido;
	}

	private static void listarPedidos(ArrayList pedidos) {
		for (int i = 0; i < pedidos.size(); i++) {
			Pedido pedido = (Pedido) pedidos.get(i);
			
			System.out.println("Produto 1: " + pedido.getItem1().getNomeProduto());
			System.out.println("Quantidade do Produto 1: " 
					+ pedido.getItem1().getQuantidade());
			
			Item item = pedido.getItem2();
			System.out.println("Produto 2: " + item.getNomeProduto());
			System.out.println("Quantidade do Produto 2: " 
					+ item.getQuantidade());
			
			System.out.println("Data do pedido: " + pedido.getData());
			System.out.println("Forma de pagamento: " + pedido.getFormaPagamento());
			System.out.println("\n\n");
		}
		System.out.println("\n\n");
	}
}
