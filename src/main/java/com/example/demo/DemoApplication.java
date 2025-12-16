package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PizzaRepository repository) {
		return (args) -> {
			Pizza p = new Pizza();
			p.setName("Pepperoni Feast");
			p.setPrice(15.50);

			repository.save(p);

			System.out.println("🍕 Pizza saved to the database!");
		};
	}
}
