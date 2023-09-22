package com.example.devflashcard.repository;

import com.example.devflashcard.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface QuestionRepository extends MongoRepository<Question, String> {
    @Query("{title: '?0'}")
    Question findQuestionByTitle(String title);


}
