package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.CLT;
import br.edu.univas.vo.Estagiario;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Vendedor;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		int option = 0;
		
		do {
			System.out.println("::::Cadastro de Funcionário::::");
			System.out.println("1 – Cadastrar Novo Funcionário");
			System.out.println("2 – Listar todos os Funcionários");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			
			if (option == 1) {
				int cadastroOptional = 0; 
				do {
					System.out.println("1 – CLT");
					System.out.println("2 – Estagiário");
					System.out.println("3 – Vendedor");
					System.out.println("9 – Voltar");
					
					cadastroOptional = scanner.nextInt();
					
					if (cadastroOptional == 1) {
						System.out.println("Digite o salário base: ");
						float salarioBase = scanner.nextFloat();
						CLT clt = new CLT(salarioBase);
						funcionarios.add(clt);
						
					} else if (cadastroOptional == 2) {
						System.out.println("Digite o salário base: ");
						float salarioBase = scanner.nextFloat();
						
						System.out.println("Digite o valor hora: ");
						float valorHora = scanner.nextFloat();
						
						Estagiario estagiario = new Estagiario(salarioBase, valorHora);
						funcionarios.add(estagiario);
						
					} else if (cadastroOptional == 3) {
						System.out.println("Digite o salário base: ");
						float salarioBase = scanner.nextFloat();
						
						System.out.println("Digite o valor da comissão: ");
						float valorComissao = scanner.nextFloat();
						
						Vendedor vendedor = new Vendedor(salarioBase, valorComissao);
						funcionarios.add(vendedor);
						
					} else if (cadastroOptional != 9) {
						System.out.println("Opção inválida!");		
					}
					
				} while (cadastroOptional != 9);
				
				
			} else if (option == 2) {
				System.out.println("\nFuncionários cadastrados:\n");
				
				for (Funcionario funcionario : funcionarios) {
					System.out.println(funcionario);
					System.out.println("Salario calculado: " + funcionario.calculaSalario());
				}
				
			} else if (option != 9) {
				System.out.println("Opção inválida!");
			}
			
		} while (option != 9);
		
		scanner.close();
	}
}
