package com.example.minorproject.services.impl;

import com.example.minorproject.models.Author;
import com.example.minorproject.models.Book;
import com.example.minorproject.models.request.BookRequest;
import com.example.minorproject.repositories.AuthorRepository;
import com.example.minorproject.services.BookService;
import com.example.minorproject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Book createBook(BookRequest bookRequest) {
        Book book = bookRequest.toBook(bookRequest);
        Author author = authorRepository.getAuthorByEmail(book.getAuthor().getEmail());
        if(Objects.isNull(author)){
            author = authorRepository.save(bookRequest.getAuthor());
        }
        book.getAuthor().setId(author.getId());
        return bookRepository.save(book);
    }
}
