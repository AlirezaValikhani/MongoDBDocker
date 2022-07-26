package com.test.mongodbDocker.controller;

import com.test.mongodbDocker.dto.BookDto;
import com.test.mongodbDocker.model.Book;
import com.test.mongodbDocker.service.impl.BookServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookServiceImp bookServiceImp;

    public BookController(BookServiceImp bookServiceImp) {
        this.bookServiceImp = bookServiceImp;
    }

    @PostMapping("/")
    public ResponseEntity<Book> save(@RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookServiceImp.save(bookDto));
    }

    @GetMapping("/{name}")
    public ResponseEntity<Book> findByName(@PathVariable @RequestParam String name) {
        return ResponseEntity.ok(bookServiceImp.findByName(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable @RequestParam String id) {
        return ResponseEntity.ok(bookServiceImp.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Book>> findAll() {
        return ResponseEntity.ok(bookServiceImp.findAll());
    }

    @DeleteMapping("/")
    public ResponseEntity<String> delete(@RequestParam String id) {
        return ResponseEntity.ok(bookServiceImp.delete(id));
    }
}
