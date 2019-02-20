package io.github.askmate.restService.model;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Data
public class QuestionDao {

    private static List<QuestionDTO> productRepo;
    static {
        productRepo = new ArrayList<QuestionDTO>() {
            {
                add(new QuestionDTO(1, "Is marihuana is mad from hemp?"));
                add(new QuestionDTO(2, "Is earth flat?"));
            }
        };
    }


public List<QuestionDTO> getAllQuestions(){
        return null;
}

}
