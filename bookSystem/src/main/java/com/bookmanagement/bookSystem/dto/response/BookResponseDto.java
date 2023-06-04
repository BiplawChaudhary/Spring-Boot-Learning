package com.bookmanagement.bookSystem.dto.response;


import com.bookmanagement.bookSystem.entity.Books;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.print.Book;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDto {
    private Integer id;
    private String name;
    private String author;
    private Double price;

    public BookResponseDto(Books b1){
        this.id = b1.getId();
        this.name = b1.getName();
        this.author = b1.getAuthor();
        this.price = b1.getPrice();
    }
}
