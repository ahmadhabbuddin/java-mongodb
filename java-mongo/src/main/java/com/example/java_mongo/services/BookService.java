package com.example.java_mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_mongo.documents.Book;
import com.example.java_mongo.repositories.BookRepo;

@Service
public class BookService {
  
  @Autowired
  private BookRepo bookRepo;

  public List<Book> getAllBooks() {
    return bookRepo.findAll();
  }
}
