package com.jnit.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jnit.tightycoupled.Circle;
import com.jnit.tightycoupled.Main;
import com.jnit.tightycoupled.Triangle;

@Configuration
@ComponentScan(basePackages={"com.jnit.tightycoupled","com.jnit.lookup"})
public class ShapeConfiguration {

//	@Bean
//	public Circle getCircle(){
//		return new Circle();
//	}
//	
//	@Bean
//	public Triangle getTriangle(){
//		return new Triangle();
//	}
//
//	@Bean
//	public Main getMain(){
//		return new Main(getTriangle(), getCircle());
//	}

}
