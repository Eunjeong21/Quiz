package com.example.quiz.repository;

import com.example.quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    @Query(value = "SELECT id FROM quiz ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Integer getRandomId();
}
