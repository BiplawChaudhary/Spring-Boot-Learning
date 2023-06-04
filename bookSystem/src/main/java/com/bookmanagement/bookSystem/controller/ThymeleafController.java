package com.bookmanagement.bookSystem.controller;

import com.bookmanagement.bookSystem.dto.request.BookRequestDto;
import com.bookmanagement.bookSystem.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//108
@Controller
@RequiredArgsConstructor
public class ThymeleafController {

//    Chiya bhanda mitho usko maya
//THimi, chiya ra mah

    private final BooksService booksService;

    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("books", booksService.getAllBooks());
        return "index";

    }

    @GetMapping("/add-books")
    public String addBookForm(Model model){
        model.addAttribute("dto", new BookRequestDto());
        return "addForm";
    }

    @PostMapping("/books/save")
    public String returnAdded(@ModelAttribute BookRequestDto dto){
        booksService.saveBooksToTable(dto);
        return "redirect:/";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteMapping(@PathVariable Integer id){
        booksService.deleteBookById(id);
        return "redirect:/";
    }

    @GetMapping("/books/update/{id}")
    public String updateForm(@PathVariable Integer id, Model model){
        model.addAttribute("dto",booksService.getBookById(id) );
        return "updateForm";
    }

    @PostMapping("/books/update/{id}")
    public String updateFormDone(@PathVariable Integer id, @ModelAttribute BookRequestDto dto){
        booksService.updateBookData(dto, id);
        return "redirect:/";
    }
//

//    @GetMapping("/books")
//    public String listAllStudents(Model model){
//        model.addAttribute("books", booksService.getAllBooks());
//        return "index";
//    }
//
//    @GetMapping("/books/add")
//    public String addNewStudent(Model model){
//        model.addAttribute("booksDto", new BookRequestDto());
//        return "form";
//    }
//
//    @PostMapping("/save-books")
//    public String saveBooks(@ModelAttribute BookRequestDto dto){
//        booksService.saveBooksToTable(dto);
//        return "redirect:/books";
//    }
//
//    @GetMapping("/books/update/{id}")
//    public String updateBookForm(@PathVariable Integer id, Model model){
//        model.addAttribute("book", booksService.getBookById(id));
//        return "updateForm";
//    }
//
//    @PostMapping("/books/update/{id}")
//    public String formUpdate(@PathVariable Integer id, @ModelAttribute BookRequestDto dto){
//        booksService.updateBookData(dto, id);
//        return "redirect:/books";
//    }
}
