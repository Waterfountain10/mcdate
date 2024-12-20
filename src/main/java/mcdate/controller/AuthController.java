package mcdate.controller;

import mcdate.dto.LoginDTO;
import mcdate.dto.UserRegistrationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO registrationDTO) {
        // Verify McGill email
        if (!registrationDTO.getEmail().endsWith("@mail.mcgill.ca")) {
            return ResponseEntity.badRequest().body("Please use a McGill email address");
        }

        // TODO: Implement user registration logic
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        // TODO: Implement login logic and return JWT token
        return ResponseEntity.ok("Login successful");
    }

    @PostMapping("/verify-email")
    public ResponseEntity<?> verifyEmail(@RequestParam String token) {
        // TODO: Implement email verification logic
        return ResponseEntity.ok("Email verified successfully");
    }
}
