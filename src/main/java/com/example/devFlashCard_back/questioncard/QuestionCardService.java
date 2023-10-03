package com.example.devFlashCard_back.questioncard;

import org.springframework.stereotype.Service;
import java.util.List;

// Service Layer
@Service
public class QuestionCardService {
    public List<QuestionCard> getQuestionCards () {
        return List.of(
                new QuestionCard(
                        1L,
                        "tag1",
                        "titre lambda",
                        "question ?",
                        "yes",
                        "admin"
                )
        );
    }
}