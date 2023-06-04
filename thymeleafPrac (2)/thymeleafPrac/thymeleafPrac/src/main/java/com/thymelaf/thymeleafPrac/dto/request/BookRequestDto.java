package com.thymelaf.thymeleafPrac.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookRequestDto {
    private String name;
    private String author;
    private Long price;
}
