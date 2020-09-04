package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) throws FileNotFoundException {
//		GridFsInitialize gridFsInitialize = new GridFsInitialize();
//		gridFsInitialize.initialize();
		SpringApplication.run(DemoApplication.class, args);
	}


}
