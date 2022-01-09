package lv.alexa.passwordstrength.controllers;

import lv.alexa.passwordstrength.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    @ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping
    public String showForm() {
        return "signup";
    }

    @PostMapping
    public String submitForm(@Valid @ModelAttribute("user") UserDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        return "success";
    }

}
