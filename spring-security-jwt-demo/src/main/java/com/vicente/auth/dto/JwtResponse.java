package com.vicente.auth.dto;

public record JwtResponse(String token, String type, Long id, String email, String name) {
    public JwtResponse(String token, Long id, String email, String name) {
        this(token, "Bearer", id, email, name);
    }
}
