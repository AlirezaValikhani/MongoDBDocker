package com.test.mongodbDocker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "book")
public class Book {
    @Id
    private String id;
    private String name;
    private String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }
}
