package com.soumyadeep.bookstore.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class BookResource extends RepresentationModel<BookResource> {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String isbn;

    // Getters and setters

    public BookResource(Long id, String title, String author, double price, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;

        // Add self-link
        this.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(id)).withSelfRel());
    }
}
