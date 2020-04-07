package br.edu.univas.vo;

public class Secretaria {

	public void imprimeSituacao(Aluno aluno) {
		if (aluno.estaAprovado()) {
			System.out.println("O aluno está aprovado");
		} else {
			System.out.println("O aluno está reprovado");
		}
	}
	
}
