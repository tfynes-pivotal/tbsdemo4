package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tbsdemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tbsdemo4Application.class, args);
	}

	
	@RequestMapping("/")
	public String index() {
		System.out.println("hello gary");
		return "hello gary\n";
	}
}
