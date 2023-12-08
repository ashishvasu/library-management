package com.example.minorproject.services;

import com.example.minorproject.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryManagementRepository extends JpaRepository<Object, Integer> {
}
