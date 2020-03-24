package br.edu.univas.main;

import br.edu.univas.vo.Circle;
import br.edu.univas.vo.Rectangle;

public class StartApp {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setColor("Red");
		circle.setRadius(5);
		System.out.println(circle);
		System.out.println("Área: " + circle.area());
		
		Circle circle2 = new Circle();
		circle2.setColor("Blue");
		circle2.setRadius(2.25);
		System.out.println(circle2);
		System.out.println("Área: " + circle2.area());
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setColor("Green");
		rectangle1.setWidth(12.67);
		rectangle1.setLength(46.29);
		System.out.println(rectangle1);
		System.out.println("Área: " + rectangle1.area());
	}
	
}
