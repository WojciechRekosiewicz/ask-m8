package io.github.askmate.restService.controller;


import io.github.askmate.restService.model.QuestionDTO;
import io.github.askmate.restService.model.QuestionDao;
import io.github.askmate.restService.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
//@RequestMapping(value = "/questions")
public class QuestionController {

    @Autowired
    private QuestionDao questionDao;

   // private QuestionService questionService;

    @GetMapping(value = "/questions")
    public List<QuestionDTO> getAllQuestions(){
     return questionDao.getAllQuestion();
    }

    @GetMapping(value = "/questions/{id}")
    public QuestionDTO getQuestionById(@PathVariable("id") int id){
        return questionDao.getQuestionById(id - 1);
    }
}

