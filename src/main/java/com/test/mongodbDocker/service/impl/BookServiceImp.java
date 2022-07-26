package com.test.mongodbDocker.service.impl;

import com.test.mongodbDocker.dto.BookDto;
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
    public Book save(BookDto bookDto) {
        Book book = new Book(bookDto.getName(),bookDto.getAuthorName());
        return bookRepository.save(book);
    }

    @Override
    public Book findByName(String name) {
        return bookRepository.loadByName(name);
    }

    @Override
    public Book findById(String id) {
        return bookRepository.loadBookById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public String delete(String id) {
        bookRepository.deleteById(Long.valueOf(id));
        return "Deleted successfully";
    }
}
