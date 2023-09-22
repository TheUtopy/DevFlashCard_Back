package com.example.devflashcard.controller;

import com.example.devflashcard.model.Question;
import com.example.devflashcard.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

     @PostMapping
    public ResponseEntity<String> createQuestion(@RequestBody Question question) {
         questionRepository.save(question);
         return ResponseEntity.status(HttpStatus.CREATED).body("Question created successfully");
     }
}
