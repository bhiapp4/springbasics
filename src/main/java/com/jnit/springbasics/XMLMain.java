package com.jnit.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Triangle t = ac.getBean(Triangle.class);
		t.drawShape();
		((ClassPathXmlApplicationContext)ac).close();
	}

}
