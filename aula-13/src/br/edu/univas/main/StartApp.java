package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.factory.ClienteFactory;
import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.ClientePF;
import br.edu.univas.vo.ClientePJ;

public class StartApp {

	public static void main(String[] args) {
		ClientePF cliente1 = new ClientePF();
		cliente1.setNome("João");
		cliente1.setCpf(938394);
		cliente1.setEmail("joao_silva@gmail.com");
		System.out.println(cliente1.comprimentar());
		
		ClientePF cliente2 = new ClientePF();
		cliente2.setNome("José");
		cliente2.setCpf(938333);
		cliente2.setEmail("jose_silva@gmail.com");
		System.out.println(cliente2.comprimentar());
		
		ClientePJ cliente3 = new ClientePJ();
		cliente3.setNome("Univas");
		cliente3.setCnpj(922222);
		cliente3.setEmail("univas@gmail.com");
		System.out.println(cliente3.comprimentar());
		
		ClientePJ cliente4 = new ClientePJ();
		cliente4.setNome("Inatel");
		cliente4.setCnpj(2234324);
		cliente4.setEmail("inatel@gmail.com");
		System.out.println(cliente4.comprimentar());
		
		
		Cliente cliente5 = new ClientePF(); //objeto ABCD
		Cliente cliente6 = new ClientePJ(); //objeto XYZ
//		ClientePF cliente7 = new Cliente(); -> não pode
//		ClientePJ cliente8 = new Cliente(); -> não pode
		
		if (cliente4.autentica("inatel@gmail.com.br")) {
			System.out.println("Autenticado!");
		} else {
			System.out.println("E-mail inválido!");
		}
		
		cliente5 = cliente6;
		//cliente5 agora aponta pro objeto XYZ
		cliente6 = new ClientePF(); // objeto MNOP
		
		System.gc();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 PF");
		System.out.println("2 PJ");
		System.out.println("Digite a opção: ");
		int opcao = scanner.nextInt();
		
		
		//ClienteFactory factory = new ClienteFactory();
		//Cliente cliente = factory.getCliente(opcao);
		
		Cliente cliente = ClienteFactory.getCliente(opcao);
		if (cliente == null) {
			System.out.println("Opção invalida!");
		}
		
//		if (opcao == 1) {
//			cliente = new ClientePF();
//		} else if (opcao == 2) {
//			cliente = new ClientePJ();
//		}
		
		//setar os dados do cliente
		
	}
	
}
