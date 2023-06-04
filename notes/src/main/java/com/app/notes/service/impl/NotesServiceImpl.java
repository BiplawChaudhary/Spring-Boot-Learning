package com.app.notes.service.impl;

import com.app.notes.dto.request.NotesRequestDto;
import com.app.notes.dto.response.NotesResponseDto;
import com.app.notes.entity.Notes;
import com.app.notes.repo.NotesRepo;
import com.app.notes.service.NotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotesServiceImpl implements NotesService {

    private final NotesRepo notesRepo;

    //Save notes
    @Override
    public NotesResponseDto saveNote(NotesRequestDto dto) {
        Notes newNote = new Notes();

        newNote.setTitle(dto.getTitle());
        newNote.setAuthor(dto.getAuthor());
        newNote.setNoteText(dto.getNoteText());

        Notes savedNotes = notesRepo.save(newNote);
        return new NotesResponseDto(savedNotes);
    }

//    Get note by id
    @Override
    public NotesResponseDto getNoteById(Integer id) {
        Notes foundNote = notesRepo.findById(id).get();

        return new NotesResponseDto(foundNote);
    }

//    Get all notes
    @Override
    public List<NotesResponseDto> getAllNotes() {
        List<NotesResponseDto> returnData = new ArrayList<>();

        List<Notes> allnotes = notesRepo.findAll();

        for(Notes each: allnotes){
            returnData.add(new NotesResponseDto(each));
        }
        return returnData;
    }

//    Update the notes
    @Override
    public NotesResponseDto updateNote(Integer id, NotesRequestDto dto) {
        Notes foundNote = notesRepo.findById(id).get();

        foundNote.setTitle(dto.getTitle());
        foundNote.setAuthor(dto.getAuthor());
        foundNote.setNoteText(dto.getNoteText());

        Notes savedNote = notesRepo.save(foundNote);

        return new NotesResponseDto(foundNote);
    }

    //Delete notes
    @Override
    public String deleteNote(Integer id) {
        notesRepo.deleteById(id);
        return "Note with id " + id + " deleted.";
    }
}
