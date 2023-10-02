package com.example.devFlashCard_back.questioncard;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionCard {
    private Long id;
    private String tags;
    private String title;
    private  String question;
    private String answer;
    private String created_by;

    public QuestionCard() {
    }

    public QuestionCard(Long id, String tags, String title, String question, String answer, String created_by) {
        this.id = id;
        this.tags = tags;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.created_by = created_by;
    }

    public QuestionCard(String tags, String title, String question, String answer, String created_by) {
        this.tags = tags;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.created_by = created_by;
    }



    @Override
    public String toString() {
        return "QuestionCard{" +
                "id=" + id +
                ", tags='" + tags + '\'' +
                ", title='" + title + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", created_by='" + created_by + '\'' +
                '}';
    }
}
