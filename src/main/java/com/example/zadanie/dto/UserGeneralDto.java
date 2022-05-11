package com.example.zadanie.dto;

import com.example.zadanie.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserGeneralDto {
    private String name;
    private String surname;
    private String position;

    public UserGeneralDto(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.position = user.getPosition();
    }
}
