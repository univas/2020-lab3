package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Bem-vindo 2020!");
		
		Scanner scanner = new Scanner(System.in);
		
//		Aluno aluno1 = new Aluno();
//		System.out.println("Digite o nome do primeiro aluno:");
//		aluno1.name = scanner.nextLine();
//		System.out.println("Digite o RA do aluno:");
//		aluno1.ra = scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println(aluno1.name);
//		System.out.println(aluno1.ra);
//		
//		Aluno aluno2 = new Aluno();
//		System.out.println("Digite o nome do segundo aluno:");
//		aluno2.name = scanner.nextLine();
//		System.out.println("Digite o RA do aluno:");
//		aluno2.ra = scanner.nextInt();
//		
//		System.out.println(aluno2.name);
//		System.out.println(aluno2.ra);
		
		for (int i = 0; i < 3; i++) {
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o nome do aluno:");
			aluno.name = scanner.nextLine();
			System.out.println("Digite o RA do aluno:");
			aluno.ra = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Dados do aluno:");
			System.out.println("Nome: " + aluno.name);
			System.out.println("RA: " + aluno.ra);
		}
	}
	
}
