package com.jnit.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@Autowired
	@Qualifier("triangle")
	private Shape shape;
	
	public void test(){
		shape.drawShape();
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Main t = ac.getBean(Main.class);
		t.test();
		((ClassPathXmlApplicationContext)ac).close();

	}

}
