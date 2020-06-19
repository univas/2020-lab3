package br.edu.univas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.univas.exception.TelefoneException;
import br.edu.univas.vo.Aluno;

public class AlunoController {

	private Scanner scanner = new Scanner(System.in);

	public void initialize() {
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome:");
		aluno.setNome(scanner.nextLine());

//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		do {
			System.out.println("Digite a data de nascimento:");
//			String dataNascimento = scanner.nextLine();
			
			try {
//				Date data = sdf.parse(dataNascimento);
//				aluno.setDataNascimento(data);
				aluno.setDataNascimento(readDataNascimento());
				
				System.out.println("Digite o telefone:");
				aluno.setTelefone(readTelefone());
				
				break;
			} catch (ParseException e) {
				System.out.println("Formato da data incorreto! Por favor, digite algo no formato: dd/MM/yyyy");
			} catch (InputMismatchException e) {
				System.out.println("Formato da telefone incorreto! Por favor, digite somente numeros!");
			} catch (TelefoneException e) {
				System.out.println(e.getMessage());
			}
		} while(true);
	}
	
	private Date readDataNascimento() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataNascimento = scanner.nextLine();
		
		Date data = sdf.parse(dataNascimento);
		
		return data;
	}
	
	private int readTelefone() {
		int telefone = scanner.nextInt();
		
		String tel = String.valueOf(telefone);
		
		if (!tel.startsWith("99")) {
			throw new TelefoneException("O telefone deve começar com 99");
		}
		
		return telefone;
	}
	
}
