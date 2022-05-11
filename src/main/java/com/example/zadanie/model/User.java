package com.example.zadanie.model;

import com.example.zadanie.dto.UserGeneralDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String surname;
    private String position;
    private String email;
    private int salary;
    private LocalDate dob;
}
