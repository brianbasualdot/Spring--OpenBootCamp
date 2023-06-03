package com.spring.ejer3spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejer3springApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejer3springApplication.class, args);

		PersonaRepository personaRepository = context.getBean(PersonaRepository.class);
		Persona persona = new Persona(null,"Brian",28,"brianb@gmail.com");
		System.out.println("numero de personas: "+personaRepository.count());
		personaRepository.save(persona);
		System.out.println("numero de personas: "+personaRepository.count());
		System.out.println(persona);
	}
	}


