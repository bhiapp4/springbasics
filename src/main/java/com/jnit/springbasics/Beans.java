package com.jnit.springbasics;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
//@Import(value={})
//@ImportResource(value={})
public class Beans {

	@Bean
	public Triangle createTriangle(){
		return new Triangle();
	}
	
	@Bean
	public Square createSquare(){
		return new Square();
	}
	
	@Bean(name="rectangle1")
	//@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public Rectangle createRectangle(){
		return new Rectangle();
	}
	
	@Bean(name="rectangle2")
	public Rectangle createRectangle2(){
		return new Rectangle();
	}

	
}
