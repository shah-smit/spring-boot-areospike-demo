package com.example.areospikedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class AreospikeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreospikeDemoApplication.class, args);
	}

}
