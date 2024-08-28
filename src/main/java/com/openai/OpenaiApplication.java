package com.openai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenaiApplication {

	public static void main(String[] args) {

		SpringApplication.run(OpenaiApplication.class, args);

		System.out.println("OpenAI API key: " + System.getenv("OPENAI_API_KEY"));
		System.out.println();
	}

}
