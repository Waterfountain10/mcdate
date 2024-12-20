package mcdate.controller;

import mcdate.dto.ProfileDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {

    @PostMapping
    public ResponseEntity<?> createProfile(@RequestBody ProfileDTO profileDTO) {
        // TODO: Create user profile
        return ResponseEntity.ok("Profile created successfully");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getProfile(@PathVariable String userId) {
        // TODO: Retrieve user profile
        return ResponseEntity.ok("Profile retrieved");
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateProfile(
            @PathVariable String userId,
            @RequestBody ProfileDTO profileDTO) {
        // TODO: Update user profile
        return ResponseEntity.ok("Profile updated successfully");
    }

    @PostMapping("/{userId}/photos")
    public ResponseEntity<?> uploadPhoto(
            @PathVariable String userId,
            @RequestParam("file") MultipartFile file) {
        // TODO: Handle photo upload
        return ResponseEntity.ok("Photo uploaded successfully");
    }
}