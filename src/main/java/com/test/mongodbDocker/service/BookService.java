package com.test.mongodbDocker.service;

import com.test.mongodbDocker.dto.BookDto;
import com.test.mongodbDocker.model.Book;
import com.test.mongodbDocker.repository.BookRepository;

import java.util.List;

public interface BookService {
    Book save(BookDto bookDto);
    Book findByName(String name);
    Book findById(String id);
    List<Book> findAll();
    String delete(String id);
}
