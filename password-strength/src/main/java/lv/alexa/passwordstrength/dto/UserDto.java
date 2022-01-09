package lv.alexa.passwordstrength.dto;

import com.sun.istack.NotNull;
import lv.alexa.passwordstrength.validation.ValidPassword;

public class UserDto {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @ValidPassword
    private String password;
}