package com.example.zadanie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AddUserDto {
    private String name;
    private String surname;
    private String position;
    private String email;
    private int salary;
    private LocalDate dob;
}
