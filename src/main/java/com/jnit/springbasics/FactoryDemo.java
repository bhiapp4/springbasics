package com.jnit.springbasics;

public class FactoryDemo {
	public static void main(String[] args) {
		// Triangle t = new Triangle();
		// Shape s = new Triangle();
		Shape s = ShapeFactory.createShape("Triangle");

	}
}
