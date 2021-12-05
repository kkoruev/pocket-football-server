package com.football.pocket.controller;

import java.security.Principal;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.football.pocket.model.dto.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@CrossOrigin
@RestController
public class UserController {

    @GetMapping("/user-details")
    public ResponseEntity<User> getUser(Principal principal) {
        User user = User.builder()
                .id(UUID.randomUUID())
                .username(principal.getName())
                .email(principal.getName() + "@abv.bg")
                .phone("0899651572")
                .age(15)
                .position("GK")
                .playedMatches(1)
                .organizedMatches(1)
                .manOfTheMatch(0)
                .discipline("poor")
                .build();
        return ResponseEntity.ok(user);
    }
}
