package br.edu.univas.vo;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	@Override
	public double area() {
		return width * length;
	}

	@Override
	public String toString() {
		return "Eu sou um retangulo!\n" +
				"Cor: " + this.getColor() +
				"\nLargura: " + this.getWidth() +
				"\nAltura: " + this.getLength();
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
