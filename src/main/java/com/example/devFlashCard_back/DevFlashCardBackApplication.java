package com.example.devFlashCard_back;

import com.example.devFlashCard_back.questioncard.QuestionCard;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class DevFlashCardBackApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		String db_hostname = dotenv.get("DB_HOSTNAME");
		String db_username = dotenv.get("DB_USERNAME");
		String db_password = dotenv.get("DB_PASSWORD");

		System.setProperty("spring.datasource.url", "jdbc:postgresql://" + db_hostname + ":5432/" + db_username);
		System.setProperty("spring.datasource.username", db_username);
		System.setProperty("spring.datasource.password", db_password);

		SpringApplication.run(DevFlashCardBackApplication.class, args);
	}
}
