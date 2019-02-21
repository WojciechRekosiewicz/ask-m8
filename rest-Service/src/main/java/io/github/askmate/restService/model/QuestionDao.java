package io.github.askmate.restService.model;


import io.github.askmate.restService.service.QuestionService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Data
public class QuestionDao implements QuestionService {

    private static List<QuestionDTO> productRepo;
    static {
        productRepo = new ArrayList<QuestionDTO>() {
            {
                add(new QuestionDTO(1, "Is marihuana is mad from hemp?"));
                add(new QuestionDTO(2, "Is earth flat?"));
            }
        };
    }


    @Override
    public List<QuestionDTO> getAllQuestion() {
        System.out.println(productRepo.get(1));
        return productRepo;
    }

    public QuestionDTO getQuestionById(int id){
        return productRepo.get(id);
    }
}
