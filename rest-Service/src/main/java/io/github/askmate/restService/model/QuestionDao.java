package io.github.askmate.restService.model;


import io.github.askmate.restService.service.QuestionService;
import lombok.Data;
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
        return productRepo;
    }
}
