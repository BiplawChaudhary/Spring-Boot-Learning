package com.app.notes.service;

import com.app.notes.dto.request.NotesRequestDto;
import com.app.notes.dto.response.NotesResponseDto;

import java.util.List;

public interface NotesService {

    //Save the note
    NotesResponseDto saveNote(NotesRequestDto dto);

    //Get note by Id
    NotesResponseDto getNoteById(Integer id);

    //Get all notes
    List<NotesResponseDto> getAllNotes();

    //Update Notes
    NotesResponseDto updateNote(Integer id, NotesRequestDto dto);

    //Delete note
    String deleteNote(Integer id);
}
