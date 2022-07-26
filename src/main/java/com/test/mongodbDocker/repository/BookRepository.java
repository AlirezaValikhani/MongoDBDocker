package com.test.mongodbDocker.repository;

import com.test.mongodbDocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,Long> {
    @Query("{name:?0}")
    Book loadByName(String name);
    @Query("{id:?0}")
    Book loadBookById(String id);
}
