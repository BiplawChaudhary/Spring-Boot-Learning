package com.bookmanagement.bookSystem.service;

import com.bookmanagement.bookSystem.dto.request.BookRequestDto;
import com.bookmanagement.bookSystem.dto.response.BookResponseDto;

import java.util.List;

public interface BooksService {

//    Saves the books to table
    BookResponseDto saveBooksToTable(BookRequestDto book);

//    Getting book by id
    BookResponseDto getBookById(Integer id);

    //Get all books
    List<BookResponseDto> getAllBooks();

    //Update Books
    BookResponseDto updateBookData(BookRequestDto book, Integer id);

    //Delete Books
    String deleteBookById(Integer id);
}
