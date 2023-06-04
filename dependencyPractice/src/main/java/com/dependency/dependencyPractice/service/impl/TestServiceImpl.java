package com.dependency.dependencyPractice.service.impl;

import com.dependency.dependencyPractice.pojo.Books;
import com.dependency.dependencyPractice.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String bookDetailsView(Books b1) {
        return "Book Name: " + b1.getName() + ", Book Price: " + b1.getPrice();
    }
}
