package com.example.zadanie.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "This user already exists")
@NoArgsConstructor
public class UserExistsException extends RuntimeException{
}
