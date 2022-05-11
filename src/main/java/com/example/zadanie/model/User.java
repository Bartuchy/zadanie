package com.example.zadanie.model;

import com.example.zadanie.dto.AddUserDto;
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

    public User(AddUserDto addUserDto) {
        this.name = addUserDto.getName();
        this.surname = addUserDto.getSurname();
        this.position = addUserDto.getPosition();
        this.email = addUserDto.getEmail();
        this.salary = addUserDto.getSalary();;
        this.dob = addUserDto.getDob();
    }
}
