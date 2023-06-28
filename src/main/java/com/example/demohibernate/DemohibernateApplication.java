package com.example.demohibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemohibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemohibernateApplication.class, args);
		
		
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		Person p = new Person();
		p.setName("John dubois");
		
		personRepository.save(p);
		
		for(Person person : personRepository.findAll())
			System.out.println(p.getName());
		
	}

}
