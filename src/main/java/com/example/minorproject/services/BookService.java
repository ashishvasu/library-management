package com.example.minorproject.services;

import com.example.minorproject.models.Book;
import com.example.minorproject.models.request.BookRequest;

public interface BookService {
    Book createBook(BookRequest bookRequest);
}
