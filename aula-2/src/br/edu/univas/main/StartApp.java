package br.edu.univas.main;

import br.edu.univas.vo.Car;

public class StartApp {

	public static void main(String[] args) {
		Car ferrari = new Car();
		ferrari.setColor("Red");
		ferrari.setCurrentSpeed(-100);
		
		System.out.println("Dados do carro:");
		System.out.println("Cor: " + ferrari.getColor());
		System.out.println("Velocidade atual: " + ferrari.getCurrentSpeed());
		
		ferrari.accelerate(100);
		ferrari.breakCar(10);
		ferrari.accelerate(30);
		System.out.println("Velocidade atual: " + ferrari.getCurrentSpeed());

		
		Car gol = new Car();
		gol.setColor("Gray");
		gol.setCurrentSpeed(50);
		
		System.out.println("Dados do carro:");
		System.out.println("Cor: " + gol.getColor());
		System.out.println("Velocidade atual: " + gol.getCurrentSpeed());
		
		gol.accelerate(45);
		gol.breakCar(15);
		gol.accelerate(25);
		System.out.println("Velocidade atual: " + gol.getCurrentSpeed());
	}
	
}
