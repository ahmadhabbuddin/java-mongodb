package com.example.java_mongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_mongo.documents.Book;
import com.example.java_mongo.services.BookService;

@RestController
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/books")
  public List<Book> getAllBooks() {
    return bookService.getAllBooks();
  }

}
