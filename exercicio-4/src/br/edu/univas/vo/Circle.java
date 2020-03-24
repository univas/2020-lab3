package br.edu.univas.vo;

public class Circle extends Shape {

	private double radius;
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Eu sou um Circulo!\n" +
				"Cor: " + this.getColor() +
				"\nRadio: " + this.getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
