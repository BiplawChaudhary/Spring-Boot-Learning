package com.thymelaf.thymeleafPrac.dto.response;

import com.thymelaf.thymeleafPrac.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookResponseDto {
    private Integer id;
    private String name;
    private String author;
    private Long price;

    public BookResponseDto(Book savingInfo) {
        this.id = savingInfo.getId();
        this.name = savingInfo.getName();
        this.author = savingInfo.getAuthor();
        this.price = savingInfo.getPrice();
    }


}

