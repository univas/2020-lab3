package br.edu.univas.main;

import java.util.ArrayList;

import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.AlunoGraduacao;

public class StartApp {

	public static Integer COUNTER = 0;
	
	public static void main(String[] args) {
		AlunoGraduacao ag = new AlunoGraduacao();
		ArrayList<Integer> notasAlunoG = ag.getNotas();
		if (notasAlunoG == null) {
			notasAlunoG = new ArrayList<>();
			ag.setNotas(notasAlunoG);
		}
		notasAlunoG.add(new Integer(10));
		notasAlunoG.add(Integer.valueOf(10));
		notasAlunoG.add(10);
		
		ag.somaNota();
		
		System.out.println(ag.getNotas().size());
		
		
		//int byte short float long double boolean char
		int nota = 10; //-> Integer
		long notas = 10; //-> Long
		Character s = new Character('A');
		Long b = new Long(123);
		
		
		String nome = new String("Rodrigo");
		String nome2 = "Rodrigo 2";
				
		//não posso dar um "new" em uma interface!
		//Aluno aluno1 = new Aluno();
	
		System.out.println(Aluno.LOGO);
		
		System.out.println(StartApp.COUNTER);
		
		StartApp.COUNTER = 10;
		
		System.out.println(StartApp.COUNTER);
		
		ag.isAprovado();
		
		System.out.println(StartApp.COUNTER);
	}
}
