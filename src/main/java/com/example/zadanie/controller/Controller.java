package com.example.zadanie.controller;

import com.example.zadanie.dto.AddUserDto;
import com.example.zadanie.dto.UserDetailsDto;
import com.example.zadanie.dto.UserGeneralDto;
import com.example.zadanie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public ResponseEntity<AddUserDto> addNewUser(@RequestBody AddUserDto addUserDto) {
        userService.addNewUser(addUserDto);
        return new ResponseEntity<>(addUserDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> removeUserById(@PathVariable Long id) {
        userService.removeUserById(id);
        return ResponseEntity.noContent().build();
    }
}
