package com.quiz.services;

import com.quiz.entities.Quiz;
import java.util.List; // Correct import statement for List

public interface QuizServices {
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
