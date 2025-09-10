package com.vicente.auth.controller;

import com.vicente.auth.dto.JwtResponse;
import com.vicente.auth.dto.LoginRequest;
import com.vicente.auth.dto.RegisterRequest;
import com.vicente.auth.entity.User;
import com.vicente.auth.repository.UserRepository;
import com.vicente.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<JwtResponse> register(@Valid @RequestBody RegisterRequest request) {
        String token = authService.register(request);
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new RuntimeException("User not found after registration"));
        
        return ResponseEntity.ok(new JwtResponse(token, user.getId(), user.getEmail(), user.getName()));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtResponse> login(@Valid @RequestBody LoginRequest request) {
        String token = authService.login(request);
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new RuntimeException("User not found"));
        
        return ResponseEntity.ok(new JwtResponse(token, user.getId(), user.getEmail(), user.getName()));
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Auth service is healthy!");
    }
}
