package com.example.zadanie.dto;

import com.example.zadanie.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserDetailsDto {
    private String name;
    private String surname;
    private String position;
    private String email;
    private int salary;
    private LocalDate dob;

    public UserDetailsDto(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.position = user.getPosition();
        this.email = user.getEmail();
        this.salary = user.getSalary();
        this.dob = user.getDob();
    }
}
