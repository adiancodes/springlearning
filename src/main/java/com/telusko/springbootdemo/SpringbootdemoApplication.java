package com.telusko.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args); //run method returns ApplicationCOntext
		System.out.println("Hello World");
		Alien alien = context.getBean(Alien.class);
		alien.code();
		//laptop object
		Laptop lap = context.getBean(Laptop.class);
		lap.coding();
	}
	//any object created/managed by spring is called beans , dependency injection
	//we are not creating an object , the spring is doing it for us as we are using @Conponent

	//this is how dependency injection is happining, spring is injecting objects itself we didnt have to use new keyword we can create multiple objects
	//
 	//what if this alien object is dependent on another object
	//lets say before calling code
	//we have another object called laptop

}
