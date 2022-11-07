package com.example.psinotes.controller;

import com.example.psinotes.entity.Feedback;
import com.example.psinotes.service.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedback")
@AllArgsConstructor
public class FeedBackController {

    private FeedbackService service;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> saveFeedback(Feedback feedback){
        service.save(feedback);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Feedback> getFeedback(@RequestParam String professionalEmail){
        Feedback feedback = service.findByEmail(professionalEmail);
        return ResponseEntity.ok(feedback);
    }
}
