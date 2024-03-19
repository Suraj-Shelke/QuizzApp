package com.sp.quizapp.controller;

import com.sp.quizapp.Question;
import com.sp.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }
}
