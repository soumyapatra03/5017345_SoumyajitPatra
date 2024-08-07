// BookService.java
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceInfo() {
        System.out.println("BookService is working...");
        bookRepository.displayRepositoryInfo(); // Ensure the repository method is called
    }
}
