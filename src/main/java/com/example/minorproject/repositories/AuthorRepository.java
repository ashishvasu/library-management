package com.example.minorproject.repositories;

import com.example.minorproject.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Query("select a from Author a where a.email = :myEmail")
    Author getAuthorByEmail(String myEmail);
}
