package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeInstituicao = "Univás";
		
		System.out.println("Bem vindo à " + nomeInstituicao);
		
		System.out.println("Por favor, digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Olá " + nome + "! Aqui na " + nomeInstituicao + " você será muito bem vindo");
		
		NameUtils x = new NameUtils();
		//acessando atributo
		System.out.println(x.NOME_INSTITUICAO);
		
		//acessando metodo
		x.fazNada();
		
		//acessando atributo static
		System.out.println(NameUtils.NOME_INSTITUICAO);
		
		//acessando metodo static
		NameUtils.fazNada();
		
		
		
		System.out.println(Mes.JANEIRO);
		System.out.println(Mes.JUNHO.getNumero());
		
		Mes mesMeuAniversario = Mes.AGOSTO;
		System.out.println(mesMeuAniversario);
		
		for(Mes mes : Mes.values()) {
			System.out.println(mes);
		}
	}
	
}
