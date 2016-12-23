package com.jnit.tightycoupled;
//Produces shapes
//have ur object instantiation logic at one place
public class ShapeFactory {

	//the triangle and circle are effectively singleton in nature
	private static Triangle t = new Triangle();
	private static Circle c = new Circle();
	
	public static Shape getShape(String shape){
		if(shape.equals("Triangle")){
			return t;
		}
		else if(shape.equals("Cirlce")){
			return c;
		}
		else{
			return null;
		}
	}
}
