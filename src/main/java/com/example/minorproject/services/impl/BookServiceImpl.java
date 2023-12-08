package com.example.minorproject.services.impl;

import com.example.minorproject.models.Book;
import com.example.minorproject.models.request.BookRequest;
import com.example.minorproject.services.BookService;
import com.example.minorproject.services.LibraryManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    @Autowired
    private final LibraryManagementRepository libraryManagementRepository;
    @Override
    public Book createBook(BookRequest bookRequest) {
        Book book = bookRequest.toBook(bookRequest);
        return libraryManagementRepository.save(book);
    }
}
