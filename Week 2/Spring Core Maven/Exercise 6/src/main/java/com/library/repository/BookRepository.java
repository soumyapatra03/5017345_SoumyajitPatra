package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void performRepositoryAction() {
        System.out.println("Repository action performed.");
    }
}
