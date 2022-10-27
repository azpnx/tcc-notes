package com.example.psinotes.controller;

import com.example.psinotes.entity.Nota;
import com.example.psinotes.service.NotesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class NotesController {

    private NotesService notesService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> saveNote(@RequestBody Nota nota){
        notesService.save(nota);
        return ResponseEntity.ok("ok");
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Nota> findByUser(@RequestParam String email){
        return ResponseEntity.ok(notesService.findByPacienteEmail(email));
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteById(@RequestParam Long id){
        notesService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> updateById(@RequestParam Long id, @RequestBody Nota nota){
        notesService.updateNote(nota.getBody(), id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
