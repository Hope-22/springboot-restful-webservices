package com.javaproject.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    // @NotEmpty Annotation is used to indicate that the User's firstName should not be null or empty.
    @NotEmpty(message = "User's first name should not be null or empty")
    private String firstName;

    // @NotEmpty Annotation is used to indicate that the User's lastName should not be null or empty.
    @NotEmpty(message = "User's last name should not be null or empty")
    private String lastName;

    // @NotEmpty Annotation is used to indicate that the User's email should not be null or empty.
    //@Email Annotation is used to indicate the Email Address should be valid.
    @NotEmpty(message = "User's email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
