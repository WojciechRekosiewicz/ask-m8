package io.github.askmate.restService.controller;



import io.github.askmate.restService.model.QuestionDTO;
import io.github.askmate.restService.service.QuestionService;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = QuestionController.class)
public class QuestionControllerTest {

    @Autowired
    private MockMvc mockMvc;
//
    @MockBean
    private QuestionService questionService;

    @Test
    public void testGetAllQuestion() throws Exception{
        List<QuestionDTO> questions = createTestData();
        when(questionService.getAllQuestion()).thenReturn(questions);
//        when(questionService.getAllQuestion()).thenReturn(questions);

        JSONArray expectedJSON = new JSONArray(questions);
        mockMvc.perform(
                get("question").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
        ).andExpect(
                content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
        ).andExpect(content().json(expectedJSON.toString()));
    }



    private List<QuestionDTO> createTestData() {
        return List.of(
                new QuestionDTO(1, "foo"),
                new QuestionDTO(2, "bar")
        );

//    List<QuestionDTO> tmp = new ArrayList<>();
//
//        tmp.add(new QuestionDTO(1, "foo"));
//        tmp.add(new QuestionDTO(2, "bar"));
//
//        return tmp;
    }
    }

