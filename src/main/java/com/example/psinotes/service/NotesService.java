package com.example.psinotes.service;

import com.example.psinotes.entity.Nota;
import com.example.psinotes.repository.NotesRepository;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class NotesService {

    private NotesRepository repository;

    public void save(Nota nota){
        try {
            Nota note = findByPacienteEmail(nota.getPacienteEmail());
            note.setBody(nota.getBody());
            repository.save(note);
        }catch (Exception e){
            repository.save(nota);
        }
    }
    public Nota findByPacienteEmail(String email){
        return repository.findByPacienteEmail(email);
    }

    public void deleteById(Long id){
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nota não encontrada!");
        }
    }

    public void updateNote(String body, Long id){
        repository.updateNote(body, id);
    }

}
