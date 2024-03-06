package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizServices;
import java.util.List; // Correct import statement for List
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizServices quizServices;

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizServices.add(quiz);
    }

    //get all quiz
    @GetMapping
    public List<Quiz> get() {
        return quizServices.get();
    }

    //get by id
    @GetMapping("{id}")
    public Quiz get(@PathVariable Long id) {
        return quizServices.get(id);
    }
}
