package com.example.devFlashCard_back.questioncard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//API Layer talking to the Service Layer
@RestController
@RequestMapping(path = "api/v1/questioncard")
public class QuestionCardController {

    private final QuestionCardService questionCardService;

    @Autowired
    public QuestionCardController(QuestionCardService questionCardService){
        this.questionCardService = questionCardService;
    }

    // Endpoint to retrieve all question cards
    @GetMapping
    public List<QuestionCard> getQuestionCards () {

        return questionCardService.getQuestionCards();
    }
}