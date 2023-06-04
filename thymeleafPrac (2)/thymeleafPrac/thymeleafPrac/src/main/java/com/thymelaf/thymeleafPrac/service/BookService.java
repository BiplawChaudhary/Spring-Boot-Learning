package com.thymelaf.thymeleafPrac.service;

import com.thymelaf.thymeleafPrac.dto.request.BookRequestDto;
import com.thymelaf.thymeleafPrac.dto.response.BookResponseDto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BookService {

    BookResponseDto saveInfo(BookRequestDto brd);

    BookResponseDto getInfoById (Integer id);

    List<BookResponseDto> ShowAll();

    BookResponseDto updateInfo (Integer id, BookRequestDto dto);

    String deleteInfo (Integer id);




}
