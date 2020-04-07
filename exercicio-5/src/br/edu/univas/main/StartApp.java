package br.edu.univas.main;

import java.util.ArrayList;

public class StartApp {

	public static void main(String[] args) {
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(10);
		notas.add(15);
		notas.add(20);
		notas.add(6);
		notas.add(2);
		
		for (Integer nota : notas) {
			System.out.println("Nota atual: " + nota);
		}
	}
}
