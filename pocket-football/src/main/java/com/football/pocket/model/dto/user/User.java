package com.football.pocket.model.dto.user;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class User {

    private UUID id;
    private String username;
    private String email;
    private String phone;
    private int age;
    private String position;
    private int playedMatches;
    private int organizedMatches;
    private int manOfTheMatch;
    private String discipline;
}
