package org.serratec.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport
@SpringBootApplication
public class WorkshopSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopSpringDataApplication.class, args);
	}

}
