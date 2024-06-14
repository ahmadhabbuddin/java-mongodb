package com.example.java_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class JavaMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMongoApplication.class, args);
	}

}
