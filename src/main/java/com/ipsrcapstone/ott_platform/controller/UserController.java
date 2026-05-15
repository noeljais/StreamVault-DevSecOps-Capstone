package com.ipsrcapstone.ott_platform.controller;

import com.ipsrcapstone.ott_platform.entity.User;
import com.ipsrcapstone.ott_platform.entity.LoginRequest;
import com.ipsrcapstone.ott_platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") 
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        String encodedPassword = passwordEncoder.encode(user.getPasswordHash());
        user.setPasswordHash(encodedPassword);
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        
        // 1. Find user by Email (We map the frontend 'username' to the backend 'email' column)
        Optional<User> userOptional = userRepository.findByEmail(loginRequest.getUsername());

        // Security check: If user doesn't exist, stop immediately.
        if (userOptional.isEmpty()) {
            return ResponseEntity.status(401).body(Map.of("message", "Invalid Credentials", "status", "error"));
        }

        User user = userOptional.get();

        // 2. Password Match 
        if (user.getPasswordHash().equals(loginRequest.getPassword())) {
            // Send back a success JSON object
            return ResponseEntity.ok(Map.of("message", "Login Successful!", "status", "success"));
        } else {
            // Send back a failure JSON object
            return ResponseEntity.status(401).body(Map.of("message", "Invalid Credentials", "status", "error"));
        }
    }
}