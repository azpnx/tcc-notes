package com.example.psinotes.service;

import com.example.psinotes.entity.Feedback;
import com.example.psinotes.repository.FeedbackRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class FeedbackService {

    private FeedbackRepository repository;

    public void save(Feedback feedback){
        try {
            Feedback feedbackOld = findByEmail(feedback.getProfessionalId());
            feedbackOld.setBody(feedbackOld.getBody());
            repository.save(feedbackOld);
        }catch (Exception e){
            repository.save(feedback);
        }
    }

    public Feedback findByEmail(String email){
        return repository.findByProfessionalId(email).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Feedback não encontrado"));
    }
}
