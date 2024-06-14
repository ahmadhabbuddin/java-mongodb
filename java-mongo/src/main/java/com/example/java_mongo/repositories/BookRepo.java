package com.example.java_mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.java_mongo.documents.Book;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {
}
