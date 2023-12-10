package com.example.minorproject.controllers;

import com.example.minorproject.models.Book;
import com.example.minorproject.models.request.BookRequest;
import com.example.minorproject.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping(value = "/create")
    public Book createBook(@RequestBody BookRequest bookRequest){
        return bookService.createBook(bookRequest);
    }
}
