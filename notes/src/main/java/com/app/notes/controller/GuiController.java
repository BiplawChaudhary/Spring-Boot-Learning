package com.app.notes.controller;

import com.app.notes.dto.request.NotesRequestDto;
import com.app.notes.service.NotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class GuiController {

    private final NotesService notesService;

    //Get all notes and display it
    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("notes", notesService.getAllNotes());
        return "index";
    }

    //Add a note
    @GetMapping("/new-form")
    public String returnNewForm(Model model){
        model.addAttribute("note", new NotesRequestDto());
        return "addNotes";
    }

    //Save-all-notes
    @PostMapping("/add-new-note")
    public String addNewNote( @ModelAttribute NotesRequestDto dto){
        notesService.saveNote(dto);
        return "redirect:/";
    }

    //Edit-notes
    @GetMapping("/edit-form/{id}")
    public String returnEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("note",notesService.getNoteById(id));
        return "editNotes";
    }

    @PostMapping("/update-note/{id}")
    public String updateNote(@PathVariable Integer id, @ModelAttribute NotesRequestDto dto){
        notesService.updateNote(id, dto);
        return "redirect:/";
    }

    //Delete
    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable Integer id){
        notesService.deleteNote(id);
        return "redirect:/";
    }
}
