package io.github.askmate.restService.controller;


import io.github.askmate.restService.model.QuestionDTO;
import io.github.askmate.restService.model.QuestionDao;
import io.github.askmate.restService.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/questions")
public class QuestionController {

    @Autowired
    private QuestionDao questionDao;

   // private QuestionService questionService;

    @GetMapping
    public List<QuestionDTO> getAllQuestions(){
     return questionDao.getAllQuestion();
    }
}

