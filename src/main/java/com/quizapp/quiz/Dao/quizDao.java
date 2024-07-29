package com.quizapp.quiz.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.quiz.model.Quiz;

public interface quizDao extends JpaRepository<Quiz,Integer> {
}
