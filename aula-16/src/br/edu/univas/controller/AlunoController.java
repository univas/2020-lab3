package br.edu.univas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.univas.vo.Aluno;

public class AlunoController {

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome:");
		aluno.setNome(scanner.nextLine());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		do {
			System.out.println("Digite a data de nascimento:");
			String dataNascimento = scanner.nextLine();
			
			try {
				Date data = sdf.parse(dataNascimento);
				aluno.setDataNascimento(data);
				
				System.out.println("Digite o telefone:");
				aluno.setTelefone(scanner.nextInt());
				
				break;
			} catch (ParseException e) {
				System.out.println("Formato da data incorreto! Por favor, digite algo no formato: dd/MM/yyyy");
			} catch (InputMismatchException e) {
				System.out.println("Formato da telefone incorreto! Por favor, digite somente numeros!");
			}
		} while(true);
		
		
	}
	
}
