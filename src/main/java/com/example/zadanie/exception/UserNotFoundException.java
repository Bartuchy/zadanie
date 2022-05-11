package com.example.zadanie.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found")
@NoArgsConstructor
public class UserNotFoundException extends RuntimeException {

}
