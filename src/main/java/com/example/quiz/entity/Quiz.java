package com.example.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Quiz {
    @Id
    private Integer id;
    private String question;
    private Boolean answer;
    private String author;
}
