package com.example.zadanie.repository;

import com.example.zadanie.exception.UserExistsException;
import com.example.zadanie.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>(List.of(
            new User(
                    1L,
                    "Jan",
                    "Kowalski",
                    "employee",
                    "j.kowalski@mail.pl",
                    4000,
                    LocalDate.parse("1990-08-20")),
            new User(
                    2L,
                    "name2",
                    "surname2",
                    "mail2@mail.com",
                    "position12",
                    4000,
                    LocalDate.parse("2001-08-20")),
            new User(
                    3L,
                    "name3",
                    "surname3",
                    "mail3@mail.com",
                    "position3",
                    6000,
                    LocalDate.parse("2002-08-20")),
            new User(
                    4L,
                    "name4",
                    "surname4",
                    "mail4@mail.com",
                    "position4",
                    12000,
                    LocalDate.parse("2004-08-20"))
    ));

    private Long next_id = (long) users.size() + 1;

    public List<User> findAll() {
        return users;
    }

    //TODO sort and binary search
    public Optional<User> findById(Long id) {
        for (User user: users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void save(User user) {
        for (User u: users) {
            if (u.getEmail().equals(user.getEmail())) {
                throw new UserExistsException();
            }
        }

        user.setId(next_id++);
        users.add(user);
    }

    public boolean delete(Long id) {
        for (User user: users) {
            if (user.getId().equals(id)) {
                return users.remove(user);
            }
        }
        return false;
    }

}
