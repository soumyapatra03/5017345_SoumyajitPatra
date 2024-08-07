package com.library.service;

import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("Service performed.");
        bookRepository.performRepositoryAction();
    }
}
