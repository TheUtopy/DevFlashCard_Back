package com.example.devFlashCard_back;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevFlashCardBackApplication {

	public static void main(String[] args) {
		// Load environment variables from the .env file
		Dotenv dotenv = Dotenv.load();

		// Retrieve database connection details from environment variables
		String db_hostname = dotenv.get("DB_HOSTNAME");
		String db_username = dotenv.get("DB_USERNAME");
		String db_password = dotenv.get("DB_PASSWORD");

		// Set system properties for Spring Datasource configuration
		System.setProperty("spring.datasource.url", "jdbc:postgresql://" + db_hostname + ":5432/" + db_username);
		System.setProperty("spring.datasource.username", db_username);
		System.setProperty("spring.datasource.password", db_password);

		// Run the Spring Boot application
		SpringApplication.run(DevFlashCardBackApplication.class, args);
	}
}