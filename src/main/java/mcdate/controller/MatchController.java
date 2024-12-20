package mcdate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/matches")
@RequiredArgsConstructor
public class MatchController {

    @GetMapping("/potential")
    public ResponseEntity<?> getPotentialMatches() {
        // TODO: Implement AI matching logic to find potential matches
        return ResponseEntity.ok("Potential matches retrieved");
    }

    @PostMapping("/like/{targetUserId}")
    public ResponseEntity<?> likeProfile(@PathVariable String targetUserId) {
        // TODO: Handle like logic and check for mutual matches
        return ResponseEntity.ok("Like processed");
    }

    @GetMapping("/mutual")
    public ResponseEntity<?> getMutualMatches() {
        // TODO: Get all mutual matches
        return ResponseEntity.ok("Mutual matches retrieved");
    }

    @DeleteMapping("/{matchId}")
    public ResponseEntity<?> unmatch(@PathVariable String matchId) {
        // TODO: Handle unmatch logic
        return ResponseEntity.ok("Unmatched successfully");
    }
}