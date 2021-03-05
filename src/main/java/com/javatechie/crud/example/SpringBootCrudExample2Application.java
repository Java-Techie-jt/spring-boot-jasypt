package com.javatechie.crud.example;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootCrudExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExample2Application.class, args);
	}

}
