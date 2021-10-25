package lv.alexandra.testproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String getTest() {
        return "This is TEST!";
    }

    @PostMapping(value = "/test")
    public String getAnotherString() {
        System.out.println("Something is created!");
        return "This is a response for POST request!";
    }
}