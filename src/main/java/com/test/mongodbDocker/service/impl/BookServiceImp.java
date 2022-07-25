package com.test.mongodbDocker.service.impl;

import com.test.mongodbDocker.model.Book;
import com.test.mongodbDocker.repository.BookRepository;
import com.test.mongodbDocker.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public String delete(Long id) {
        bookRepository.deleteById(id);
        return "Deleted successfully";
    }
}
