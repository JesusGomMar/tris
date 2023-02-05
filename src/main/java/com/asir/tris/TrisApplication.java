package com.asir.tris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.asir.tris")
public class TrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrisApplication.class, args);
	}

}
