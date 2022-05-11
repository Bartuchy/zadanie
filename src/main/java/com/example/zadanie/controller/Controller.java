package com.example.zadanie.controller;

import com.example.zadanie.dto.UserDetailsDto;
import com.example.zadanie.dto.UserGeneralDto;
import com.example.zadanie.model.User;
import com.example.zadanie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class Controller {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserGeneralDto>> getAllUsers() {
        List<UserGeneralDto> userGeneralDtos = userService.getAllUsers();
        return ResponseEntity.ok(userGeneralDtos);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<UserDetailsDto> getUserDetails(@PathVariable Long id) {
        UserDetailsDto userDetailsDto = userService.getUserDetailsByUserId(id);
        return ResponseEntity.ok(userDetailsDto);
    }


}
