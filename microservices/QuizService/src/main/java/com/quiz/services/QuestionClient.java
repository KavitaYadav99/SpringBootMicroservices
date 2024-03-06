package com.quiz.services;

import com.quiz.entities.Question;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//this quiz is calling questionservice

//@FeignClient(url = "http://localhost:9091",value = "Question-Client")
@FeignClient(name="QUESTIONSERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);

}
