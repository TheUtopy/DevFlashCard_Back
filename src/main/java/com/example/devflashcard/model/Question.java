package com.example.devflashcard.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("questions")
public class Question {
    @Id
    private String id;

    private String tag;
    private String title;
    private String question;
    private String answer;

    public Question(String id, String tag, String title, String question, String answer) {
        super();
        this.id = id;
        this.tag = tag;
        this.title = title;
        this.question = question;
        this.answer = answer;
    }
}
