package com.example.devFlashCard_back;

import com.example.devFlashCard_back.questioncard.QuestionCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class DevFlashCardBackApplication {

	public static void main(String[] args) {

		SpringApplication.run(DevFlashCardBackApplication.class, args);
	}
}
