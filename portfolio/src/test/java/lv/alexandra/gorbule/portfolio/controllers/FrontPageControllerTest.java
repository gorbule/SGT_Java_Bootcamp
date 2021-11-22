package lv.alexandra.gorbule.portfolio.controllers;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(FrontPageController.class)
@AutoConfigureMockMvc
class FrontPageControllerTest {

    //fake browser to test app
    @Autowired
    private MockMvc mvc;

    //to prepare data
    @BeforeEach
    void setUp() {
    }

    //to cean created data after test
    @AfterEach
    void tearDown() {
    }

    @Test
    void getFrontPage() throws Exception {
        mvc.perform(get("/frontpage"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful()) //checking the status
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.containsString("Alexandra Gorbule"))) //checking the content
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.containsString("SheGoesJava 2"))); //checking the content
    }

    @Test
    void getResumePage() {
    }
}