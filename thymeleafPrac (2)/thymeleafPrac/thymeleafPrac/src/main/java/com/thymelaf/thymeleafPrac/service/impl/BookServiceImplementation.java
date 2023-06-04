package com.thymelaf.thymeleafPrac.service.impl;

import com.thymelaf.thymeleafPrac.dto.request.BookRequestDto;
import com.thymelaf.thymeleafPrac.dto.response.BookResponseDto;
import com.thymelaf.thymeleafPrac.entity.Book;
import com.thymelaf.thymeleafPrac.repo.BookRepo;
import com.thymelaf.thymeleafPrac.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookServiceImplementation implements BookService {


    private final BookRepo bookRepo;

    public BookServiceImplementation(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public BookResponseDto saveInfo(BookRequestDto brd) {
        Book book = new Book();
        book.setName(brd.getName());
        book.setAuthor(brd.getAuthor());
        book.setPrice(brd.getPrice());

        Book SavingInfo = bookRepo.save(book);

        BookResponseDto finalsave = new BookResponseDto(SavingInfo);
        return finalsave;
    }

    @Override
    public BookResponseDto getInfoById(Integer id) {

        Book getInfoById = bookRepo.findById(id).get();

        if (getInfoById == null) {
            System.out.println("The id is not found. ");
        }

        BookResponseDto finalRead = new BookResponseDto(getInfoById);
        return finalRead;
    }

    @Override
    public List<BookResponseDto> ShowAll() {


         List<BookResponseDto> finalShow= new ArrayList<>();

         List<Book> GetAll = new ArrayList<>();
         GetAll= bookRepo.findAll();

         for(Book each: GetAll){
             BookResponseDto addingToFinal = new BookResponseDto(each);
             finalShow.add(addingToFinal);
         }
         return finalShow;
    }

    @Override
    public BookResponseDto updateInfo(Integer id, BookRequestDto dto) {

        //Finding by id
        Book book = bookRepo.findById(id).get();

        //Updating
        book.setName(dto.getName());
        book.setAuthor(dto.getAuthor());
        book.setPrice(dto.getPrice());

        //saving
        Book savingInfo = bookRepo.save(book);

        //converting to responsedto type and returning
        BookResponseDto finalUpdate = new BookResponseDto(savingInfo);
        return finalUpdate;
     }

    @Override
    public String deleteInfo(Integer id) {
         bookRepo.deleteById(id);
         return "The info of id"+ id + "is deleted";

    }


}

