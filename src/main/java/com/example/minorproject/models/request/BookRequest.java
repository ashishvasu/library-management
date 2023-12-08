package com.example.minorproject.models.request;

import com.example.minorproject.models.Author;
import com.example.minorproject.models.Book;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mapping.model.SnakeCaseFieldNamingStrategy;

@Getter
@Setter
@Builder
@ToString
public class BookRequest {
    private String name;
    private Float cost;
    private Author author;
    public Book toBook(BookRequest bookRequest){
        return Book.builder()
                .name(bookRequest.getName())
                .author(bookRequest.getAuthor())
                .cost(bookRequest.getCost())
                .build();
    }
}
