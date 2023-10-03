package com.example.devFlashCard_back.questioncard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "question_cards")
public class QuestionCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tags;
    private String title;
    private  String question;
    private String answer;
    private String created_by;

    public QuestionCard() {
    }

    // Constructor with all fields for complete initialization
    public QuestionCard(Long id, String tags, String title, String question, String answer, String created_by) {
        this.id = id;
        this.tags = tags;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.created_by = created_by;
    }

    // Constructor without ID for simplified initialization (ID will be auto-generated)
    public QuestionCard(String tags, String title, String question, String answer, String created_by) {
        this.tags = tags;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.created_by = created_by;
    }

    // Override toString() method for better object representation
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