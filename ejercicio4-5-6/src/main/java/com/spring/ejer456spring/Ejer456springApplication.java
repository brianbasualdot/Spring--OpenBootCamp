package com.spring.ejer456spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.ejer456spring.entity.laptop;
import com.spring.ejer456spring.repository.LaptopRepository;

@SpringBootApplication
public class Ejer456springApplication {

	public static void main(String[] args) {

		SpringApplication.run(Ejer456springApplication.class, args);

		BeanFactory context;
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		//Base de datos

		laptop laptop1 = new laptop(null,"asus","intel",8);
		laptop laptop2 = new laptop(null,"hp","amd",4);
		laptop laptop3 = new laptop(null,"sonic","intel",16);
		LaptopRepository.save(laptop1);
		LaptopRepository.save(laptop2);
		LaptopRepository.save(laptop3);


	}

}
