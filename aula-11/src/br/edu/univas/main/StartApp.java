package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o primeiro numero: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Por favor, digite o segundo numero: ");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		if (a == b) {
			System.out.println("Os dois numeros são iguais!");
		} else {
			System.out.println("Os dois numeros são diferentes!");
		}
		
		System.out.println("Por favor, digite o primeiro nome: ");
		String nome1 = scanner.nextLine();
		
		System.out.println("Por favor, digite o segundo nome: ");
		String nome2 = scanner.nextLine();
		
		if (nome1 == nome2) {
			System.out.println("Os dois nomes são iguais!");
		} else {
			System.out.println("Os dois nomes são diferentes!");
		}
		
		String nome3 = new String("maria");
		String nome4 = new String("maria");
		
		if (nome3 == nome4) {
			System.out.println("Os dois nomes são iguais!");
		} else {
			System.out.println("Os dois nomes são diferentes!");
		}
		
		System.out.println("\nUsando EQUALS!!!\n");
		if (nome3.equals(nome4)) {
			System.out.println("Os dois nomes são iguais!");
		} else {
			System.out.println("Os dois nomes são diferentes!");
		}
		
		Aluno aluno1 = new Aluno();
		aluno1.setCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setCpf("123");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Aluno1 é igual a Aluno2");
		}
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(aluno1);
		
		if (alunos.contains(aluno2)) {
			System.out.println("Esse CPF ja ta na lista!");
		}
		
		int aa = 10;
		int bb;
		
		if (aa > 5) {
			bb = 20;
		} else {
			bb = 35;
		}
		
		bb = aa > 5 ? 20 : 35;
		
		scanner.close();
	}
	
}
