package br.edu.univas.vo;

public abstract class Shape {

	private String color;

	public abstract double area(); 
	
	public abstract String toString();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
