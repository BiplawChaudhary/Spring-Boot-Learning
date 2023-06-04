package com.bookmanagement.bookSystem.service.impl;


import com.bookmanagement.bookSystem.dto.request.BookRequestDto;
import com.bookmanagement.bookSystem.dto.response.BookResponseDto;
import com.bookmanagement.bookSystem.entity.Books;
import com.bookmanagement.bookSystem.repo.BookRepo;
import com.bookmanagement.bookSystem.service.BooksService;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    private final BookRepo bookRepo;

    public BooksServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    @Override
    public BookResponseDto saveBooksToTable(BookRequestDto book) {
        Books newBook = new Books();

        newBook.setName(book.getName());
        newBook.setAuthor(book.getAuthor());
        newBook.setPrice(book.getPrice());

        Books savedBooks = bookRepo.save(newBook);
        return new BookResponseDto(savedBooks);
    }

    @Override
    public BookResponseDto getBookById(Integer id) {
        Books searchBook = bookRepo.findById(id).get();

        return new BookResponseDto(searchBook);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<BookResponseDto> returnData = new ArrayList<>();

        List<Books> allData = bookRepo.findAll();

        for(Books each: allData){
            returnData.add(new BookResponseDto(each));
        }

        return returnData;
    }

    @Override
    public BookResponseDto updateBookData(BookRequestDto book, Integer id) {

        Books foundBook = bookRepo.findById(id).get();

        foundBook.setName(book.getName());
        foundBook.setAuthor(book.getAuthor());
        foundBook.setPrice(book.getPrice());

        Books savedBook = bookRepo.save(foundBook);
        return new BookResponseDto(savedBook);

    }

    @Override
    public String deleteBookById(Integer id) {
        bookRepo.deleteById(id);
        return "Id " + id + " deleted.";
    }
}
