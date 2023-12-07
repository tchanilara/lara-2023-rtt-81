package org.perscholas.sprintboot.formbean;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class RegisterUserFormBean {

    Integer id;

    @Email(message = "Email must be a valid address")
    @NotEmpty(message = "Email cannot  be empty")
    String email;

    @Length(min = 8, message = "Password must be at least 8 characters")
    String password;

    @NotEmpty(message = "Confirm Password cannot be empty")
    String password1;
}
