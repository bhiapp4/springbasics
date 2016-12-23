package com.jnit.tightycoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.jnit.javaconfig.ShapeConfiguration;

//Instead of a class looking/creating for its required dependencies
//All the dependencies are provided to the class

@Component
public class Main {

//	Triangle t = new Triangle();
//	
//	Circle c = new Circle();
	
	//Shape s = new Triangle();

	//Shape s = ShapeFactory.getShape("triangle");
	
	//@Autowired
	//@Qualifier("triangle")
	private Shape shape;//if spring can provide me the shape object I am looking for I will be happy
	
	//@Autowired
	//@Qualifier("circle")
	private Shape shape1;
	
	@Autowired
	private ShapeCreator shapeCreator;
	
//	@Autowired//wire the dependencies for my class(Bean wiring)
//	public Main(@Qualifier("triangle")Shape shape, @Qualifier("circle")Shape shape1){
	public Main(Shape shape, Shape shape1){
		this.shape = shape;
		this.shape1 = shape1;
	}
	
	public Main(){
		
	}
	
//	public void setShape1(Shape shape1) {
//		this.shape1 = shape1;
//	}
//	
//	public void setShape(Shape shape) {
//		this.shape = shape;
//	}
	
	public void test(){
		shape.drawShape();
		shape1.drawShape();
		shapeCreator.createAndTest();
	}
	
	public static void main(String[] args) {
		//Main m = new Main();
		//m.test();
		//Bootstrapping spring in your application
		//ApplicationContext ac = new ClassPathXmlApplicationContext("shape.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(ShapeConfiguration.class);
		Main m = ac.getBean(Main.class);
		m.test();
		//((ClassPathXmlApplicationContext)ac).close();
		((AnnotationConfigApplicationContext)ac).close();
	}

}
