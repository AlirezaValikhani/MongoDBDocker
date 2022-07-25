package com.test.mongodbDocker.service;

import com.test.mongodbDocker.model.Book;
import com.test.mongodbDocker.repository.BookRepository;

import java.util.List;

public interface BookService {
    Book save(Book book);
    Book findById(Long id);
    List<Book> findAll();
    String delete(Long id);
}
