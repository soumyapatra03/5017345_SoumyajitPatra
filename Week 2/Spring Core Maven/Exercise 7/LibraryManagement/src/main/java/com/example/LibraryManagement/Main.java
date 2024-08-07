package com.example.LibraryManagement;

import com.example.LibraryManagement.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the Spring context
        BookService bookService = (BookService) context.getBean(BookService.class);

        // Test the injection
        if (bookService != null) {
            System.out.println("BookService bean initialized successfully with constructor injection.");
        } else {
            System.out.println("Failed to initialize BookService bean with constructor injection.");
        }
    }
}
