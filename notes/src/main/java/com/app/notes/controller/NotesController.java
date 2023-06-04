package com.app.notes.controller;


import com.app.notes.dto.request.NotesRequestDto;
import com.app.notes.service.NotesService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class NotesController {
    private final NotesService notesService;

    //Save Notes
    @PostMapping("/save")
    public ResponseEntity<?> saveTheNote(@RequestBody NotesRequestDto dto){
        return new ResponseEntity<>(notesService.saveNote(dto), HttpStatus.CREATED);
    }

    //Get Note by Id
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getNotesById(@PathVariable Integer id){
        return new ResponseEntity<>(notesService.getNoteById(id), HttpStatus.OK);
    }

    //Get all notes
    @GetMapping("/get-all-notes")
    public ResponseEntity<?> getAllNotes(){
        return new ResponseEntity<>(notesService.getAllNotes(), HttpStatus.OK);
    }
    //Update notes

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateNotes(@PathVariable Integer id, @RequestBody NotesRequestDto dto){
        return new ResponseEntity<>(notesService.updateNote(id, dto), HttpStatus.ACCEPTED);
    }

    //Delete notes
    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<?> deleteNotes(@PathVariable Integer id){
        return new ResponseEntity<>(notesService.deleteNote(id), HttpStatus.OK);
    }
}
