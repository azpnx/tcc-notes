package com.example.psinotes.repository;

import com.example.psinotes.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    Optional<Feedback> findByProfessionalId(String professionalId);
}
