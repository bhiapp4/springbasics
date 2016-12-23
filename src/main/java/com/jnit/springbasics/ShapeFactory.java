package com.jnit.springbasics;

class ShapeFactory {
	public static Shape createShape(String type) {		
		switch (type) {
			case "Triangle":
				return new Triangle();
			case "Square":
				return new Square();
			default:
				return new Rectangle();
		}
	}
}