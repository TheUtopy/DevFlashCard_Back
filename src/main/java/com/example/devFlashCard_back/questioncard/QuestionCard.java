package com.example.devFlashCard_back.questioncard;

import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
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
