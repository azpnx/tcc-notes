package com.example.psinotes.repository;

import com.example.psinotes.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotesRepository extends JpaRepository<Nota, Long> {
    List<Nota> findByUserId(Integer userId);

    @Modifying
    @Query("update Nota n set n.body = ?1 where n.id = ?2")
    void updateNote(String body, Long id);
}
