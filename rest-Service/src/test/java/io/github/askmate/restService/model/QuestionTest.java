package io.github.askmate.restService.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
public class QuestionTest {


    Question question = new Question("Java", 1);

    @Test
    public void getDescriptionTest(){
        assertEquals("Java", question.getDescription());
    }

}
