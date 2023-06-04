package com.bookmanagement.bookSystem.controller;


import com.bookmanagement.bookSystem.dto.request.BookRequestDto;
import com.bookmanagement.bookSystem.service.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

//    Saving values
    @PostMapping("/save")
    public ResponseEntity<?> saveAllValues(@RequestBody BookRequestDto dto){
        return new ResponseEntity<>(booksService.saveBooksToTable(dto), HttpStatus.CREATED);
    }

    //Getting value from id
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getByIdValue(@PathVariable Integer id){
        return new ResponseEntity<>(booksService.getBookById(id), HttpStatus.OK);
    }

    //Get Al Values
    @GetMapping("/get-all")
    public ResponseEntity<?> getAllValues(){
        return new ResponseEntity<>(booksService.getAllBooks(), HttpStatus.OK);
    }

    //Updata
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateTable(@PathVariable Integer id, @RequestBody BookRequestDto dto){
        return new ResponseEntity<>(booksService.updateBookData(dto, id), HttpStatus.OK);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteValue(@PathVariable Integer id){
        return new ResponseEntity<>(booksService.deleteBookById(id), HttpStatus.OK);
    }

}
