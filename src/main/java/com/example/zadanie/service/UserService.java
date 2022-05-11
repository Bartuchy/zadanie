package com.example.zadanie.service;

import com.example.zadanie.dto.UserDetailsDto;
import com.example.zadanie.dto.UserGeneralDto;
import com.example.zadanie.exception.UserNotFoundException;
import com.example.zadanie.model.User;
import com.example.zadanie.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserGeneralDto> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(UserGeneralDto::new)
                .collect(Collectors.toList());
    }

    public UserDetailsDto getUserDetailsByUserId(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);

        return new UserDetailsDto(user);
    }

}
