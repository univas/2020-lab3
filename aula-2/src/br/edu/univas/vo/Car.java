package br.edu.univas.vo;

public class Car {

	private String color;
	
	private int currentSpeed;
	
	public void accelerate(int intensity) {
		this.currentSpeed = this.currentSpeed + intensity;
	}
	
	public void breakCar(int intensity) {
		if (intensity <= this.currentSpeed) {			
			this.currentSpeed = this.currentSpeed - intensity;
		} else {
			this.currentSpeed = 0;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed >= 0) {
			this.currentSpeed = currentSpeed;
		}
	}
	
}
