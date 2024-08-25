package com.soumyadeep.bookstore.model;
import javax.persistence.Version;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, message = "Title should not be empty")
    private String title;

    @NotNull
    @Size(min = 1, message = "Author should not be empty")
    private String author;

    @NotNull
    private double price;

    @NotNull
    @Size(min = 1, message = "ISBN should not be empty")
    private String isbn;

    // Getters and setters
}
